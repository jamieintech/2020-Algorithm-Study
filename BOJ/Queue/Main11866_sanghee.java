package queueAndDeque;

import java.util.Scanner;

class Node3 {
	private int num;
	private Node3 node;

	public Node3() {
	}

	public Node3(int num) {
		this.num = num;
		this.node = null;
	}

	public Node3(int num, Node3 node) {
		super();
		this.num = num;
		this.node = node;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Node3 getNode() {
		return node;
	}

	public void setNode(Node3 node) {
		this.node = node;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + num;
		result = prime * result + ((node == null) ? 0 : node.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node3 other = (Node3) obj;
		if (num != other.num)
			return false;
		if (node == null) {
			if (other.node != null)
				return false;
		} else if (!node.equals(other.node))
			return false;
		return true;
	}

}

class Josephus {
	private Node3 front;
	private Node3 rear;
	private Node3 k_1th;
	private int size;
	private int k;

	public Josephus() {
		this.front = null;
		this.rear = null;
		this.k_1th = null;
	}

	public Josephus(int k) {
		this.front = null;
		this.rear = null;
		this.k_1th = null;
		this.k = k;
	}

	public Josephus(Node3 front, Node3 rear, Node3 k_1th, int size, int k) {
		super();
		this.front = front;
		this.rear = rear;
		this.k_1th = k_1th;
		this.size = size;
		this.k = k;
	}

	void push(int num) {
		Node3 node = new Node3(num);
		if (isEmpty()) {
			this.front = node;
		} else {
			this.rear.setNode(node);
		}
		this.rear = node;
		this.rear.setNode(front);
		size++;
	}

	int removeKth() {
		if (isEmpty())
			return -1;
		size--;
		Node3 k_1node = this.k_1th;
		Node3 knode;
		if (k_1node == null) {
			k_1node = this.rear;
			for (int i = 0; i < k - 1; i++) {
				k_1node = k_1node.getNode();
			}
		}
		knode = k_1node.getNode();
		if (front == rear) {
			front = null;
			rear = null;
			return k_1node.getNum();
		}
		if (front == knode)
			front = knode.getNode();
		if (rear == knode)
			rear = k_1node;

		k_1node.setNode(knode.getNode());
		int num = knode.getNum();
		for (int i = 0; i < k - 1; i++) {
			k_1node = k_1node.getNode();
		}
		this.k_1th = k_1node;
		return num;
	}

	int size() {
		return this.size;
	}

	boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	public Node3 getFront() {
		return front;
	}

	public void setFront(Node3 front) {
		this.front = front;
	}

	public Node3 getRear() {
		return rear;
	}

	public void setRear(Node3 rear) {
		this.rear = rear;
	}

	public Node3 getK_1th() {
		return k_1th;
	}

	public void setK_1th(Node3 k_1th) {
		this.k_1th = k_1th;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((front == null) ? 0 : front.hashCode());
		result = prime * result + k;
		result = prime * result + ((k_1th == null) ? 0 : k_1th.hashCode());
		result = prime * result + ((rear == null) ? 0 : rear.hashCode());
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Josephus other = (Josephus) obj;
		if (front == null) {
			if (other.front != null)
				return false;
		} else if (!front.equals(other.front))
			return false;
		if (k != other.k)
			return false;
		if (k_1th == null) {
			if (other.k_1th != null)
				return false;
		} else if (!k_1th.equals(other.k_1th))
			return false;
		if (rear == null) {
			if (other.rear != null)
				return false;
		} else if (!rear.equals(other.rear))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

}

public class Main11866_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		Josephus j = new Josephus(k);
		for (int i = 1; i <= n; i++) {
			j.push(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		sb.append(j.removeKth());
		while (!j.isEmpty()) {
			sb.append(", ");
			sb.append(j.removeKth());
		}
		sb.append(">");
		System.out.println(sb.toString());
	}

}
