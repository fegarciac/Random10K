
public class Random10K {
	public static void main(String[] args) {
		PriQueueInterface<Integer> pq = new SortedABPriQ<>();
		PriQueueInterface<Integer> rpq = new SortedABPriQ<>();
		Integer n = 0;
		for (int i = 0; i < 100; i++) {
			n = (int) (Math.random() * 10000) + 1;
			pq.enqueue(n);
			rpq.renqueue(n);
		}
		System.out.println(pq);
		System.out.println();
		System.out.println();
		System.out.println("Priority Queue has " + pq.size() + " elements");
		System.out.println();
		System.out.println();
		System.out.println("Priority Queue in Reverse Order:");
		System.out.println(rpq);
		System.out.println();
		System.out.println("Reversed Priority Queue has " + rpq.size() + " elements");
	}
}
