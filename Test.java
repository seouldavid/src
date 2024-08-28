class Test {

	public static void main(String[] args) {
		String name = "이다빛";
		StringBuffer str =new StringBuffer();
		for (int i = name.length()-1; i >= 0 ; i--) {
			str.append(name.charAt(i));
		}
		System.out.println(str);
	}
}