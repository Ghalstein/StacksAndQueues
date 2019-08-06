public class Queue<T extends Comparable<T>> {

	public Class<T> data;
	public Queue<T> next = null;
	public Queue<T> head = null;
	public Queue<T> tail = null;

	public Queue(Class<T> data, Queue<T> next) {
		this.data = data;
		this.next = next;
		this.head = this;
		this.tail = this;
	}

	public void enqueue(Class<T> data) {
		this.tail.next = new Queue<T>(data, null);
		tail = tail.next;
	}

	public Queue<T> dequeue() {
		Queue<T> oldHead = head;
		head = head.next;
		return oldHead;
	}

	public String toString() {
		Queue<T> curr = this;
		String str = "[";
		while (curr != null) {
			str += " " + curr.data;
		}
		str += " ]";
		return str;
	}

	public static void main(String[] args) {
 
	}

}