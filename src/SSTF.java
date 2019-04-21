import java.util.ArrayList;

public class SSTF {
	
	public static int print(int start, ArrayList<Integer> queue) {
		
		if(queue.isEmpty())
		{
			return 0;
		}
		else
		{
			int min = Integer.MAX_VALUE;
			Integer newstart = new Integer(0);
			for(Integer unit : queue) {
				int temp = Math.abs(start - unit);
				if(temp < min) {
					min = temp;
					newstart = unit;
				}
			}
			System.out.println(start + " => " + newstart);
			queue.remove(newstart);
			return Math.abs(start - newstart) + print(newstart, queue);
		}
		
	}
}
