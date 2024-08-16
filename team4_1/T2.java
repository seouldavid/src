package team4_1;

import java.util.Scanner;

public class T2 {

	Scanner scan = new Scanner(System.in);

	private int[] user = new int[3]; // 유저의 수 배열로 선언
	
	public T2() {
		play01();
		}

	public int[] getUser() { // user getter
		return user;
	}

	public void setUser(int[] user) { // user setter
		this.user = user;
	}

	public void play01() { // 유저의 수 입력받고 비교하는 메서드
		for (int i = 0; i < user.length; i++) {
			System.out.println((i + 1) + " 번 숫자 입력 : ");
			user[i] = scan.nextInt();
			if (user[i] > 9 || user[i] == 0) {
				System.out.println("1 ~ 9 까지의 수만 입력하세요.");
				--i;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (user[i] == user[j]) {
					System.out.println("중복된 숫자입니다. 다시 입력하세요.");
					--i;
					break;
				}
			}
		}
	}
}
