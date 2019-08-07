// basic queue made of lsit nodes

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

	public T max() {
		Queue<T> curr = this.head.next;
		Queue<T> max = this.head;

		while (curr != null) {
			if (curr.data.compareTo(max.data) > 0) {
				max = curr;
			}
			curr = curr.next;
		}
		return max.data;
	}

	public T getFirst() {
		return this.head.data;
	}

	public static void main(String[] args) {
 		Queue<Integer> test = new Queue<>(1, null);
 		test.enqueue(2);
 		test.enqueue(3);
 		System.out.println("get first: " + test.getFirst());
 		System.out.println("max: " + test.max());
 		System.out.println("print of test: " + test);
 		System.out.println("return of dequeue: " + test.dequeue());
 		System.out.println("after dequeue: " + test);
	}

}