
import java.util.ArrayList;
import java.util.HashMap;
public class Person {
    private String name;
    private int age;
    
    private Car car = new Car("TEST");
    
    private ArrayList<String> array = new ArrayList<String>();
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    
    public Person(String name, int age) {    
        this.name = name;
        this.age = age;
        
        array.add("Card1");
        array.add("Card2");
        array.add("Card3");
        
        map.put("KEY1", 100);
        map.put("KEY2", 200);
        map.put("KEY3", 300);
    }
    public ArrayList<String> getArray() {
		return array;
	}
    public HashMap<String, Integer> getMap() {
		return map;
	}
//    @Override
//    public String toString() {
//        return "[" + name + ", " + age + ", " + array.get(1) + "]";
//    }
}