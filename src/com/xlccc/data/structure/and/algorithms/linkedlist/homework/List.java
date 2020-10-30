package com.xlccc.data.structure.and.algorithms.linkedlist.homework;

/**
 * @author Linker
 * @date 2020/10/28 21:46
 * @description：
 */
public interface List<E> {
    boolean isEmpty();

    int size();

    E get(int index);

    boolean add(E e);

    void add(int index, E element);

    boolean contains(Object o);

    boolean remove(Object o);

    E remove(int index);

    int indexOf(Object o);

//    Object[] toArray();
}
