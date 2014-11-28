package com.kevin.algorithm;

class OnelinkNode // 单向链表的结点类
{
	public int data; // 存放结点值
	public OnelinkNode next; // 后继结点的引用

	public OnelinkNode(int k) // 构造值为k的结点
	{
		data = k;
		next = null;
	}

	public OnelinkNode() // 无参数时构造值为0的结点
	{
		this(0);
	}
}

public class Josephus //单向循环链表，解约瑟夫环
{
	private OnelinkNode head;

	Josephus(int n) // 建立n个结点的单向循环链表
	{ // 链表结点值为1到n
		int i = 1;
		OnelinkNode q, rear;
		if (n > 0) {
			head = new OnelinkNode(i);
			head.next = head;
			rear = head;
			while (i < n) {
				i++;
				q = new OnelinkNode(i);
				q.next = head;
				rear.next = q;
				rear = q;
			}
		}
	}

	public void display(int s, int d) // 解约瑟夫环
	{
		int j = 0;
		OnelinkNode p = head;
		while (j < s - 1) // 计数起始点
		{
			j++;
			p = p.next;
		}
		while (p.next != p) // 多于一个结点时循环
		{
			j = 1;
			while (j < d - 1) // 计数
			{
				j++;
				p = p.next;
			}
			delete(p); // 删除p的后继结点
			p = p.next;
			this.output();
		}
	}

	public void delete(OnelinkNode p) // 删除p的后继结点
	{
		OnelinkNode q = p.next; // q是p的后继结点
		System.out.print("delete:  " + q.data + "  ");
		if (q == head) // 欲删除head指向结点时，
			head = q.next; // 要将head向后移动
		p.next = q.next; // 删除q
	}

	public void output() // 输出单向链表的各个结点值
	{
		OnelinkNode p = head;
		System.out.print("data:  ");
		do {
			System.out.print(p.data + " -> ");
			p = p.next;
		} while (p != head);
		System.out.println();
	}

	public static void main(String args[]) {
		int n = 100, s = 5, d = 2;
		Josephus h1 = new Josephus(n);
		h1.output();
		h1.display(s, d);
	}
}
//data:  1 -> 2 -> 3 -> 4 -> 5 -> 
//delete:  2  data:  1 -> 3 -> 4 -> 5 -> 
//delete:  4  data:  1 -> 3 -> 5 -> 
//delete:  1  data:  3 -> 5 -> 
//delete:  5  data:  3 -> 
