package com.kevin.algorithm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * LRU介绍：<br>

LRU是Least Recently Used的缩写，即最少使用页面置换算法，是为虚拟页式存储管理服务的。<br>

思路介绍：<br>

可以使用两个标准的数据结构来实现，Map和Queue。因为需要支持多线程，需要使用实现了java.utili.concurrent.*的Map和Queue。<br>

主要思路是使用一个Queue来维护FIFO和Map来对数据进行排序，当向缓存添加新的元素时，共有以下三种可能：<br>

1. 如果该元素已经在Cache中存在（Map），我们会从queue中删除改元素并将其添加到queue的第一个位置。<br>

2. 如果缓存已满无法新增新的元素，我们会从queue和Map中删除最后面的那个元素并把新元素添加进来。<br>

3. 同时在Map和Queue中增加新的元素<br>
 * 
 * @author Kai.Zhao
 * @date Jan. 8th, 2015
 * @since 1.0
 */
public class LRUCache {

	// LRU缓存的最大容量
	private int capacity;
	// 用来保存最近使用的元素的key
	private ConcurrentLinkedQueue<Integer> queue;
	private ConcurrentHashMap<Integer, Integer> map;

	/**
	 * 初始化LRU缓存
	 * @param capacity
	 */
	public LRUCache(final int capacity) {
		this.capacity = capacity;
		queue = new ConcurrentLinkedQueue<Integer>();
		map = new ConcurrentHashMap<Integer, Integer>(capacity);
	}

	/**
	 * 检查元素释放在缓存中存在，如果不存在则返回Null
	 * 
	 * @param key
	 * @return
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public Integer get(final Integer key) {
		return map.get(key);
	}

	/**
	 * 将元素添加到LRU缓存。如果Key已存在，则将其放到缓存的第一位置
	 * 
	 * @param key
	 * @param value
	 * @author Kai.Zhao
	 * @since 1.0
	 */
	public synchronized void put(final Integer key, final Integer value) {
		if (key == null || value == null) {
			throw new NullPointerException();
		}
		if (map.contains(key)) {
			queue.remove(key);
		}
		while (queue.size() >= capacity) {
			Integer expiredKey = queue.poll();
			if (expiredKey != null) {
				map.remove(expiredKey);
			}
		}
		queue.add(key);
		map.put(key, value);
	}

}
