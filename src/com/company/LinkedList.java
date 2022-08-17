package com.company;

public class LinkedList<E> extends AbstractList<E> {

    private Node first;

    private static class Node<E>{
        Node<E> next;
        E element;

        public Node(Node next,E element){
            this.next=next;
            this.element=element;
        }
    }

    //泛型方法
    private Node<E> node(int index){
        Node x = first;
        for(int i=0;i<index;i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public void add(E element) {
        add(size,element);
    }


    @Override
    public E get(int index) {
        return node(index).element;
    }



    @Override
    public E set(int index, E element) {
        Node<E> node = node(index);
        E oldElement = node.element;
        node.element = element;
        return oldElement;
    }

    @Override
    public void add(int index, E element) {

        if(index == 0){
            first = new Node(first,element);
        }else {
            Node<E> pre = node(index - 1);
            Node<E> next = pre.next;
            pre.next = new Node<>(next, element);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        Node x = first;
        int index = 0;
        if(element==null){
            for(Node i = x; i!= null; i=i.next){
                if(element == i.element){
                    return index;
                }
                index ++;
            }
        }else{
            for (Node i =x;i!=null;i=i.next){
                if(element.equals(i.element)){  //前面那个不能为null（空值）
                    return index;
                }
                index ++;
            }

        }
        return -1;
    }
                               //将链表数据清空
    @Override
    public void clear() {
        size = 0;
        first = null;
    }


    public String toString(){
        if(size == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder().append("[");
        Node x = first ;
        for(Node i = x ;i!= null;i=i.next){
            sb.append(i.element);
            if(i.next == null){
                return sb.append("]").toString();
            }
            sb.append(",");


        }
        return sb.toString();
    }



}
