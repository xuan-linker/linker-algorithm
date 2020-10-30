package com.xlccc.interview;

import java.util.LinkedList;

/**
 * @author Linker
 * @date 2020/7/21 9:48
 * @Description:LRU算法
 */
public class LRUAlgorithm {
    /**
     * LRU缓存机制
     *
     * 缓存文件置换机制是电脑处理缓存存储器的一种机制。
     * 电脑存储器空间的大小固定，无法容纳服务器上所有的文件，所以当有新的文件要被置换入缓存时，必须根据一定的原则来取代掉适当的文件。此原则即所谓缓存文件置换机制。
     * 缓存文件置换方法有：
     * 先进先出算法（FIFO）：最先进入的内容作为替换对象
     * 最近最少使用算法（LFU）：最近最少使用的内容作为替换对象
     * 最久未使用算法（LRU）：最久没有访问的内容作为替换对象
     * 非最近使用算法（NMRU）：在最近没有使用的内容中随机选择一个作为替换对象
     * Belady's Min
     */


    /**
     * LinkedHashMap
     * <p>
     * 1. get(key)
     * 获取并将数据提取到队列头
     * if(cache.get(demo)){
     * 如果不存在则返回-1
     * return -1;
     * }
     * <p>
     * <p>
     * 2. put(key,value)
     * 插入队列头；
     * 如果超过缓存容量，则删除久未使用的队列尾元素，再插入队列头
     * 如果存在则替换原数据
     */

    LinkedList<Integer> linkedList = new LinkedList<>();

    /**
     * 添加缓存
     * 查询缓存
     * 删除多余缓存
     *
     *
     * @param number
     */
    public static void add(int number) {


    }
}
