public class Queue<T extends Comparable<T>> {

	public Class<T> data;
	public Queue<T> next = null;
	public Queue<T> head = null;

	public Queue(Class<T> data, Queue<T> next) {
		this.data = data;
		this.next = next;
		this.head.next = this;
	}

	public void enqueue(Class<T> data) {
		this.next = new Queue<T>(data, null);
	}

	public Queue<T> dequeue() {
		Queue<T> oldHead = head;
		head = head.next;
		return oldHead;
	}

	public toString() {
		
	}

	public static void main(String[] args) {

	}

}