import java.util.ArrayList;

public class FCFS {
	public static int print(int start, ArrayList<Integer> queue) {

		if(queue.isEmpty())
		{
			return 0;
		}
		else
		{
			System.out.println(start + " => " + queue.get(0));
			int newstart = queue.get(0);
			queue.remove(0);
			return Math.abs(start - newstart) + print(newstart, queue);
		}
		
	}
}
