// This will implement the BagInterface using a linked node implementation

public class LinkedBag<T> implements BagInterface<T> {
	private Node head;
	private int numOfEntries;

	public LinkedBag(){
		head = null;
		numOfEntries = 0;
	}

	public boolean add(T Entry) {
		boolean status = false;
		if(Entry != null) {
			if(!isFull()) {
				Node newNode = new Node(Entry);
				newNode.next = this.head;
				this.head = newNode;
				this.numOfEntries ++;
				status = true;
			}
		}
		return status;
	}

	public int getCurrentSize() {
		return this.numOfEntries;
	}

	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return this.numOfEntries == 0;
	}

	public T remove() {
		//TODO
		return null;
	}

	public T remove (T anEntry) {
		//TODO
		return null;
	}
	public void clear() {
		//TODO
	}

	public int getFrequencyOf(T anEntry) {
		int freq = 0;
		int index = 0;
		Node currNode = head;
		while((index < this.numOfEntries) && (currNode != null)) {
			if(anEntry.equals(currNode)) {
				freq ++;
			}
			index ++;
			currNode = currNode.next;
		}
		return freq;
	}

	public boolean contains(T anEntry) {
		return false;
		//TODO
	}

	public T[] toArray() {
		@SuppressWarnings("unchecked")
		T[] result = (T[])new Object[numOfEntries];

		int index = 0;
		Node currentNode = head;
		while((index < numOfEntries) && (currentNode != null)) {
			result[index] = currentNode.data;
			index++;
			currentNode = currentNode.next;
		}
		return result;
	}

	private class Node {
		private T data; //entry in bag
		private Node next; //link to next node

		private Node(T dataPortion) {
			this(dataPortion,null);
		}

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		}
	}//end Node         
}