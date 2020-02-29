package queueAndDeque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node5 {
	private int num;
	private Node5 past;
	private Node5 next;

	public Node5() {
		this.past = null;
		this.next = null;
	}

	public Node5(int num) {
		this.num = num;
		this.past = null;
		this.next = null;
	}

	public Node5(int num, Node5 past, Node5 next) {
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

	public Node5 getPast() {
		return past;
	}

	public void setPast(Node5 past) {
		this.past = past;
	}

	public Node5 getNext() {
		return next;
	}

	public void setNext(Node5 next) {
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
		Node5 other = (Node5) obj;
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

class AC {
	private Node5 front;
	private Node5 rear;
	private int size;

	public AC() {
		this.front = null;
		this.rear = null;
	}

	public AC(Node5 front, Node5 rear, int size) {
		super();
		this.front = front;
		this.rear = rear;
		this.size = size;
	}

	public Node5 getFront() {
		return front;
	}

	public void setFront(Node5 front) {
		this.front = front;
	}

	public Node5 getRear() {
		return rear;
	}

	public void setRear(Node5 rear) {
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
		AC other = (AC) obj;
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
		Node5 node = new Node5(num);
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
		Node5 node = new Node5(num);
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
		Node5 node = front;
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
		Node5 node = rear;
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

public class Main5430_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t;
		try {
			t = Integer.parseInt(br.readLine());
			for (int i = 0; i < t; i++) {
				String order = br.readLine();
				int n = Integer.parseInt(br.readLine());
				AC ac = new AC();
				String arr = br.readLine();
				arr = arr.substring(1, arr.length() - 1);
				StringTokenizer st = new StringTokenizer(arr, ",");
				for (int j = 0; j < n; j++) {
					ac.push_back(Integer.parseInt(st.nextToken()));
				}
				boolean flag = true;
				boolean reverse = false;
				for (int j = 0; j < order.length(); j++) {
					char ch = order.charAt(j);
					if (ch == 'R') {
						reverse = !reverse;
					} else {
						int num;
						if (reverse)
							num = ac.pop_back();
						else
							num = ac.pop_front();
						if (num == -1) {
							flag = false;
							break;
						}
					}
				}
				if (flag) {
					StringBuilder sb = new StringBuilder();
					sb.append("[");
					if (reverse) {
						while (!ac.isEmpty()) {
							sb.append(ac.pop_back());
							sb.append(",");
						}
					} else {
						while (!ac.isEmpty()) {
							sb.append(ac.pop_front());
							sb.append(",");
						}
					}
					if(sb.length()!=1)sb.deleteCharAt(sb.length() - 1);
					sb.append("]");
					System.out.println(sb.toString());
				} else
					System.out.println("error");

			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
