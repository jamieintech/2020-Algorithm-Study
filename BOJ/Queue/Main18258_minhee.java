package Day09_Queue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main18258_2{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		TestQueue2 tq = new TestQueue2();
		
		int n = Integer.parseInt(str);
		for(int i =0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String test = st.nextToken();
			if(test.contains("push")) {
				tq.insert(Integer.parseInt(st.nextToken()));
			}else if (test.equals("pop")) {
				if(tq.empty()) {
					bw.write("-1\n");
					//System.out.println("-1");
				}else {
					bw.write(tq.remove()+"\n");
				}
			}else if (test.equals("empty")) {
				if(tq.empty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}else if(test.equals("front")) {
				if(tq.empty()) {
					bw.write("-1\n");
				}else {
					bw.write(tq.peek()+"\n");
				}
			}else if(test.equals("back")) {
				if(tq.empty()) {
					bw.write("-1\n");
				}else {
					bw.write(tq.back()+"\n");
				}
			}else if (test.equals("size")) {
				bw.write(tq.size+"\n");
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}
}

class TestQueue2 {
	private class Node{
		private int data;
		private Node nextNode;
		
		Node(int data){
			this.data = data;
			this.nextNode = null;
		}
	}
	private Node front;
	private Node rear;
	int size;
	
	public TestQueue2() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean empty() {
		return (front==null);
	}
	
	public void insert(int item) {
		Node node = new Node(item);
		node.nextNode = null;
		++size;
		if(empty()){
			rear = node;
			front = node;
		}else {
			rear.nextNode = node;
			rear = node;
		}
	}
	
	public int peek() {
		if(empty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return front.data;
	}
	
	public int remove() {
		int item = peek();
		front = front.nextNode;
		--size;
		if(front == null) {
			rear = null;
		}
		
		return item;
	}
	
	public int back() {
		if(empty()) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return rear.data;
	}
	
}
