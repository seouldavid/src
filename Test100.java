import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Test100{
	
	public static void main(String[] args) {
		
//		Integer[] arr = new Integer[] {1,2,3};
		List<Integer> list = new ArrayList<Integer>(5);
		Iterator<Integer> itr = list.iterator();
		list.add(1);
		list.add(2);
		list.add(3);
		while (itr.hasNext()) {
			Integer in = (Integer)itr.next();
			System.out.println(in);
			
		}
		
		
	}
}
