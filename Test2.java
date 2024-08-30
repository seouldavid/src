import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		Arrays.stream(arr);
		Stream<Integer> stream =Stream
		                          .iterate(1,i->i+1);
		stream.limit(20).forEach(System.out::print);
		      
	}

}