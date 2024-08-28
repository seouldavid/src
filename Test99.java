import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Test99 {
public static void main(String[] args) {
	Gson gson = new GsonBuilder().create();
	String strJSON = "{'name':'Dip2K','age':44,'car':{'name':'TEST'},'array':['Card1','Card2','Card3'],'map':{'KEY2':200,'KEY1':100,'KEY3':300}}";
	
	Person person = gson.fromJson(strJSON, Person.class);
	System.out.println(person.getArray());
	System.out.println(person.getMap());
}
}
