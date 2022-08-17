package com.company;
//用于实现共性的方法
public abstract class AbstractList<E> implements List<E>{

    protected int size;

    @Override
    public boolean contains(E element) {
        return indexOf(element)!=-1;
    }

    @Override
    public int size() {
        return size;
    }
    //判断当前集合是否有元素
    @Override
    public boolean isEmppty() {
        return size==0;
    }



    //indexOf:寻找对应的元素，如果找到了，返回索引值。如果没有找到，返回一个-1

}
