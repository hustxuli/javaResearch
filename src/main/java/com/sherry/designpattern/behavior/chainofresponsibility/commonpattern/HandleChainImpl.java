package com.sherry.designpattern.behavior.chainofresponsibility.commonpattern;

import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.HandleChain;
import com.sherry.designpattern.behavior.chainofresponsibility.commonpattern.HandleNode;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: Sherry
 * @Date: 2019/9/14 下午7:09
 */
public class HandleChainImpl<T extends ParamContext> implements HandleChain<T> {
    private ReadWriteLock lock;

    private HandleNode<T> head;

    private HandleNode<T> tail;

    public HandleChainImpl() {
        lock = new ReentrantReadWriteLock();
    }

    @Override
    public void start(T paramContext) {
        lock.readLock().lock();

        HandleNode<T> node = head;
        while (null != node){
            node.getHandler().process(paramContext);
            node = node.getNext();
        }
        lock.readLock().unlock();
    }

    /**
     * 加在尾部
     * @param handler
     */
    @Override
    public void addHandler(Handler handler) {
        lock.writeLock().lock();
        HandleNode<T> node = new HandleNode<>();
        node.setHandler(handler);
        node.setNext(null);
        if(null == head){//说明此时尾部也是null
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            tail = node;
        }

        lock.writeLock().unlock();

    }

    @Override
    public void removeHandler(Handler handler) {
        lock.writeLock().lock();
        if(null != head){//否则什么都不处理
            //考虑待删除的节点 位于头部、中部、尾部 && 不位于任何地方
            HandleNode<T> node = head;
            if(node.getHandler().equals(handler)){//删除头部
                head = node.getNext();
                if(node.equals(tail)){//如果头部 也是最后1个节点
                    tail = head;
                }
            }else{
                HandleNode<T> preNode = node;//记录前一个节点，方便删除时衔接
                node = node.getNext();
                while(null != node){
                    if(node.getHandler().equals(handler)){
                        preNode.setNext(node.getNext());
                        if(node.equals(tail)){//如果待删除节点 也是最后1个节点
                            tail = preNode;
                        }
                        break;
                    }else{
                        preNode = node;
                        node = node.getNext();
                    }
                }
            }
        }
        lock.writeLock().unlock();
    }
}
