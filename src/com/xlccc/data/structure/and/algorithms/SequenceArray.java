package com.xlccc.data.structure.and.algorithms;

import java.util.Arrays;

/**
 * @author Linker
 * @date 2020/8/25 21:42
 * @description：顺序表(基于数组实现的顺序表，可以扩容)
 */
public class SequenceArray {

    public static void main(String[] args) {
        SequenceServiceImpl sequence = new SequenceServiceImpl();

        sequence.add(3);
        sequence.add(2);
        sequence.add(3);

        System.out.println(Arrays.toString(sequence.toArray()));
        System.out.println(sequence.contains(2));
        System.out.println("-------");
        System.out.println(sequence.set(0, 1));
        System.out.println(Arrays.toString(sequence.toArray()));

        System.out.println("-------");

        System.out.println(sequence.size());

        System.out.println("-------");

        System.out.println(sequence.remove(2));
        System.out.println(Arrays.toString(sequence.toArray()));

        System.out.println("-------");

        System.out.println(sequence.get(0));
        System.out.println(Arrays.toString(sequence.toArray()));

        System.out.println("-------");
        sequence.clear();
        System.out.println(Arrays.toString(sequence.toArray()));

    }

    public interface SequenceService {
        void add(Object data);

        boolean remove(int index);

        Object set(int index, Object newData);

        Object get(int index);

        boolean contains(Object data);

        int size();

        Object[] toArray();

        void clear();
    }

    public static class SequenceServiceImpl implements SequenceService {
        private static final int DEFAULT_CAPACITY = 2;//默认容量
        private int size;//存放的元素个数
        private Object[] elementData;//真正存放元素的对象数组
        private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;//线性表是有限序列，所以规定其最大容量

        /**
         * 初始化
         */
        public SequenceServiceImpl() {
            this.elementData = new Object[DEFAULT_CAPACITY];
        }

        /**
         * 首先判断添加元素，是否导致数组越界
         * 若超过最大数组上限，则扩容后存储元素
         *
         * @param data 要添加的元素
         */
        @Override
        public void add(Object data) {
            ensureCapacity(size + 1);
            elementData[size++] = data;
        }

        /**
         * 删除某索引的元素
         *
         * @param index
         * @return 成功返回true
         */
        @Override
        public boolean remove(int index) {
            rangCheck(index);
            int moveSteps = size - index - 1;//移动的步数
            if (moveSteps > 0) {
                System.arraycopy(elementData, index + 1, elementData, index, moveSteps);
            }
            //数组最后一个元素
            elementData[--size] = null;
            return true;
        }

        /**
         * 修改某索引下的元素为新元素，并返回原来的元素内容
         *
         * @param index   索引
         * @param newData 新元素
         * @return 被替换的旧元素
         */
        @Override
        public Object set(int index, Object newData) {
            rangCheck(index);
            Object oldData = elementData[index];
            elementData[index] = newData;
            return oldData;
        }

        /**
         * 根据索引获取指定元素
         *
         * @param index 索引
         * @return 指定元素
         */
        @Override
        public Object get(int index) {
            rangCheck(index);
            return elementData[index];
        }

        /**
         * 判断线性表中是否含有指定内容的元素
         *
         * @param data 要查询的元素内容
         * @return
         */
        @Override
        public boolean contains(Object data) {
            //首先查看data是否为空
            if (data == null) {
                for (int i = 0; i < size; i++) {
                    if (elementData[i] == null) {
                        return true;
                    }
                }
            } else {
                //如果data非空，则使用equals方法来判断
                for (int i = 0; i < size; i++) {
                    /**
                     * 如果写成elamentData[i].equals(data),则容易出现空指针异常
                     * 切记 如果输入是否是指定字符串时，一定要把特定字符串写在前面
                     */
                    if (data.equals(elementData[i])) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public int size() {
            return this.size;
        }

        @Override
        public Object[] toArray() {
            return this.elementData;
        }

        @Override
        public void clear() {
            for (int i = 0; i < size; i++) {
                elementData[i] = null;
            }
            size = 0;
        }

        private void ensureCapacity(int minCap) {
            if (minCap - elementData.length > 0) {
                //扩容策略
                grow(minCap);
            }
        }

        private void grow(int minCap) {
            int oldCap = elementData.length;//原来数组的大小
            int newCap = oldCap << 1;//扩容两倍
            if (newCap - minCap < 0) {
                newCap = minCap;
            }
            if (newCap - MAX_ARRAY_SIZE > 0) {
                throw new ArrayIndexOutOfBoundsException("超过数组最大阙值");
            }
            //数组扩容
            elementData = Arrays.copyOf(elementData, newCap);
        }

        /**
         * 判断索引是否合法
         *
         * @param index 索引
         */
        private void rangCheck(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("索引越界");
            }
        }
    }
}
