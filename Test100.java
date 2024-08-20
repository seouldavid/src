class Test100{
	
	public static void main(String[] args) {
		Animal lion = new Lion();
		
		lion.size();
	}
}
interface Animal {
	public void size();
}

class Lion implements Animal{

	@Override
	public void size() {
		System.out.println("중형 사이즈");
		
	}
	
}
class Rabbit implements Animal{
	
	@Override
	public void size() {
		System.out.println("소형 사이즈");
		
	}
}
