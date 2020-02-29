package queueAndDeque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Node {
	private int num;
	private Node node;

	public Node() {
	}

	public Node(int num) {
		this.num = num;
		this.node = null;
	}

	public Node(int num, Node node) {
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

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
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
		Node other = (Node) obj;
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

class Queue {
	private Node front;
	private Node rear;

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	public Queue(Node front, Node rear) {
		super();
		this.front = front;
		this.rear = rear;
	}

	void push(int num) {
		Node node = new Node(num);
		if (isEmpty()) {
			this.front = node;
		} else {
			this.rear.setNode(node);
		}
		this.rear = node;
	}

	int pop() {
		if (isEmpty())
			return -1;
		Node node = this.front;
		this.front = node.getNode();
		if(front==null) rear=null;
		return node.getNum();
	}

	int size() {
		if (isEmpty())
			return 0;
		Node index = this.front;
		int size = 1;
		while (index.getNode() != null) {
			index = index.getNode();
			size++;
		}
		return size;
	}

	boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public Node getRear() {
		return rear;
	}

	public void setRear(Node rear) {
		this.rear = rear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((front == null) ? 0 : front.hashCode());
		result = prime * result + ((rear == null) ? 0 : rear.hashCode());
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
		Queue other = (Queue) obj;
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
		return true;
	}
	
}


public class Main18258_sanghee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		Queue queue=new Queue();
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++) {
				String order=br.readLine();
				switch(order) {
				case "pop":
					bw.write(queue.pop()+"\n");
					break;
				case "size":
					bw.write(queue.size()+"\n");
					break;
				case "empty":
					bw.write((queue.isEmpty()?1:0)+"\n");
					break;
				case "front":
					int front=-1;
					Node node=queue.getFront();
					if(node!=null) front=node.getNum();
					bw.write(front+"\n");
					break;
				case "back":
					int back=-1;
					Node node2=queue.getRear();
					if(node2!=null) back=node2.getNum();
					bw.write(back+"\n");
					break;
				default:
					int num=Integer.parseInt(order.substring(5));
					queue.push(num);
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
