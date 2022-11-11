public class QueueRefBased implements Queue {

	private QueueNode front;
	private QueueNode back;
	// no numElements for this implementation

	public QueueRefBased() {
		front = null;
		back = null;
	}

	public int size() {
		int count = 0;
		
		QueueNode cur = front;
		while(cur != null){
			count++;
			cur = cur.next;
		}

		return count;			
	}

	public boolean isEmpty() {
		if(front == null){
			return true;
		} else {
			return false;
		}
	}

	public void enqueue (int value) {

		QueueNode n = new QueueNode(value);

		if(front == null){
			front = n;
			back = n;
		} else {
			back.next = n;
			back = n;
		}
		
	}

	public int dequeue() {

		QueueNode cur = front;

		if(front == back){
			front = null;
			back = null;
		} else {
			front = front.next;
		}

		return cur.data; // so it compiles
	}

	public int peek()  {
		return front.data; // so it compiles
	}

	public void makeEmpty() {
		front = null;
		back = null;

	}
}
