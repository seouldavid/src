package homework;

import java.util.HashSet;

public class LottoGenerator {

	public static void main(String[] args) {
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		while(lottoSet.size() < 7) {
			int number = (int)(Math.random()*45)+1;
			lottoSet.add(number);
		}
//		int pop = lottoSet.pop();

	}

}
