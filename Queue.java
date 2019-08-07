public class Queue<T extends Comparable<T>> {

	public T data;
	public Queue<T> next = null;
	public Queue<T> head = null;
	public Queue<T> tail = null;

	public Queue(T data, Queue<T> next) {
		this.data = data;
		this.next = next;
		this.head = this;
		this.tail = this;
	}

	public void enqueue(T data) {
		this.tail.next = new Queue<T>(data, null);
		tail = tail.next;
	}

	public Queue<T> dequeue() {
		Queue<T> oldHead = this.head;
		this.head = this.head.next; 
		oldHead.next = null;
		return oldHead;
	}

	public String toString() {
		Queue<T> curr = this.head;
		String str = "[";
		while (curr != null) {
			str += " " + curr.data;
			curr = curr.next;
		}
		str += " ]";
		return str;
	}

	public static void main(String[] args) {
 		Queue<Integer> test = new Queue<>(1, null);
 		test.enqueue(2);
 		test.enqueue(3);
 		System.out.println(test);
 		test.dequeue();
 		System.out.println(test);
	}

}