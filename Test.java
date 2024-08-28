class Test {
	public static int pivo(int n) {
		if (n==1||n ==0) {
			return n;
		}
		return pivo(n-1)+ pivo(n-2);
		
	}
	public static void main(String[] args) {
		System.out.println(pivo(50));
	}
}