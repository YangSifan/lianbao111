package com.company;

public interface List<E> {
    //list接口下搞一个抽象类abstractlist  具有共性的方法在abstract接口下实现 ？？只实现了接口中的一部分方法，所以修饰符要加abstract
    //将arraylist和linkdedlist中共性的方法进行抽取，保证体系的完整
    int size();
    boolean isEmppty();
    void add(E element);
    E get(int index);
    E set(int index,E element);
    void add(int index,E element);
    E remove(int index);
    int indexOf(E element);
    void clear();
    String toString();
    boolean contains(E element);
}
