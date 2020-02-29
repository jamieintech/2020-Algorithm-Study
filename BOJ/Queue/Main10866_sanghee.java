package queueAndDeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Node4 {
	private int num;
	private Node4 past;
	private Node4 next;

	public Node4() {
		this.past = null;
		this.next = null;
	}

	public Node4(int num) {
		this.num = num;
		this.past = null;
		this.next = null;
	}

	public Node4(int num, Node4 past, Node4 next) {
		super();
		this.num = num;
		this.past = past;
		this.next = next;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Node4 getPast() {
		return past;
	}

	public void setPast(Node4 past) {
		this.past = past;
	}

	public Node4 getNext() {
		return next;
	}

	public void setNext(Node4 next) {
		this.next = next;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + num;
		result = prime * result + ((past == null) ? 0 : past.hashCode());
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
		Node4 other = (Node4) obj;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (num != other.num)
			return false;
		if (past == null) {
			if (other.past != null)
				return false;
		} else if (!past.equals(other.past))
			return false;
		return true;
	}

}

class Deque {
	private Node4 front;
	private Node4 rear;
	private int size;

	public Deque() {
		this.front = null;
		this.rear = null;
	}

	public Deque(Node4 front, Node4 rear, int size) {
		super();
		this.front = front;
		this.rear = rear;
		this.size = size;
	}

	public Node4 getFront() {
		return front;
	}

	public void setFront(Node4 front) {
		this.front = front;
	}

	public Node4 getRear() {
		return rear;
	}

	public void setRear(Node4 rear) {
		this.rear = rear;
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
		Deque other = (Deque) obj;
		if (front == null) {
			if (other.front != null)
				return false;
		} else if (!front.equals(other.front))
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

	public void push_front(int num) {
		Node4 node = new Node4(num);
		if (isEmpty()) {
			front = node;
			rear = node;
		} else {
			node.setNext(front);
			front.setPast(node);
			front = node;
		}
		size++;
	}

	public void push_back(int num) {
		Node4 node = new Node4(num);
		if (isEmpty()) {
			front = node;
			rear = node;
		} else {
			node.setPast(rear);
			rear.setNext(node);
			rear = node;
		}
		size++;
	}

	public int pop_front() {
		if (isEmpty())
			return -1;
		size--;
		Node4 node = front;
		front = node.getNext();
		if (front != null)
			front.setPast(null);
		else
			rear = null;
		return node.getNum();
	}

	public int pop_back() {
		if (isEmpty())
			return -1;
		size--;
		Node4 node = rear;
		rear = node.getPast();
		if (rear != null)
			rear.setNext(null);
		else
			front = null;
		return node.getNum();
	}

	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	public int size() {
		return size;
	}

}

public class Main10866_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque deque = new Deque();
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				String order = br.readLine();
				switch (order) {
				case "pop_front":
					bw.write(deque.pop_front() + "\n");
					break;
				case "pop_back":
					bw.write(deque.pop_back() + "\n");
					break;
				case "size":
					bw.write(deque.size() + "\n");
					break;
				case "empty":
					bw.write((deque.isEmpty() ? 1 : 0) + "\n");
					break;
				case "front":
					int front = -1;
					Node4 node = deque.getFront();
					if (node != null)
						front = node.getNum();
					bw.write(front + "\n");
					break;
				case "back":
					int back = -1;
					Node4 node2 = deque.getRear();
					if (node2 != null)
						back = node2.getNum();
					bw.write(back + "\n");
					break;
				default:
					if (order.contains("push_back")) {
						int num = Integer.parseInt(order.substring(10));
						deque.push_back(num);
					} else {
						int num = Integer.parseInt(order.substring(11));
						deque.push_front(num);
					}
				}
			}
			bw.flush();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
