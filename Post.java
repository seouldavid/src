//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.lang.reflect.Type;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;
//
//public class Post {
//	public static void main(String[] args) {
//		URL url;
//		StringBuffer sb = new StringBuffer();
//		BufferedReader in;
//		try {
//			url = new URL("https://ftr.alps.llogis.com:18260/openapi/ftr/getCustmerNviewTracking?param1=313938582543");
//			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
//			conn.setRequestMethod("GET");
//			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			String msg = null;
//			while ((msg =in.readLine())!= null) {
//				
//			}
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ProtocolException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//주소창에 정보가 보이는 방식, 속도가 빠르다.
//		Gson gson = new GsonBuilder().create();
//		Type type = new TypeToken<Logistics>() {}.getType();
//		Logistics logistics = gson.fromJson(jsonString, type);
////		
//		
//		
//	}
//}
