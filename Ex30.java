import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex30 {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);

		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		System.out.println("날짜 : " + date.format(today));
		System.out.println("시간 : " + time.format(today));

	}
}
