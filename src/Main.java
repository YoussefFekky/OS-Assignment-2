import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> queue = new ArrayList<Integer>();
		queue.add(98);
		queue.add(183);
		queue.add(37);
		queue.add(122);
		queue.add(14);
		queue.add(124);
		queue.add(65);
		queue.add(67);
		System.out.println(SSTF.print(53, queue));
	}

}
