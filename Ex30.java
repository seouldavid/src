import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Ex30 {
	public static void main(String[] args) {
//		LocalDateTime today = LocalDateTime.now(); 
//		System.out.println(today);
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		System.out.println(today.format(formatter));
//		
//		
//		LocalDateTime today1 = LocalDateTime.now(); 
//		System.out.println(today1);
//		
//		
//		DateTimeFormatter timeFormatter  = DateTimeFormatter.ofPattern("hh:mm:ss");
//		System.out.println(today1.format(timeFormatter));
//		Scanner scan = new Scanner(System.in);
//		System.out.print("시간 입력(hh:mm:ss) :");
//		String dateInput = scan.nextLine();
//		LocalTime timeAnswer = LocalTime.parse(dateInput);
//		System.out.println(timeAnswer.plusHours(1));
//		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		date.minusDays(5);
		date.minusMonths(5);
		date.minusYears(5);
		date.withDayOfMonth(1);
		//해당 월의 첫째 날 구하기
		date.withDayOfMonth(date.lengthOfMonth());
		//해당 월의 마지막 날 구하기
		date.getYear(); //2024
		date.getMonth();//AUGUST
		date.getDayOfWeek();//SATURDAY
		System.out.println(date.getDayOfWeek());
		
		LocalDate start = LocalDate.of(2024, 8, 10);
		LocalDate end = LocalDate.now();
		
		long diffDay = ChronoUnit.DAYS.between(start, end);
		System.out.println(diffDay);
		
		System.out.println(time.withHour(13)); // 13:30
		System.out.println(date.withMonth(1)); // 13:30
		
	}
}
