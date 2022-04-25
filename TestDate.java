import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

class TestDate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int day;
        do{
			System.out.println("Please fill a day (1-31) :");
			day= sc.nextInt();
		}
        while (day<1 || day > 31);
        int month;
        do
		{
			System.out.println("Please fill a month (1-12) :");
			month = sc.nextInt();
		} while (month <1 || month > 12);
		int year;
		System.out.println("Please fill a year :");
		year = sc.nextInt();
        sc.close();

		Calendar c = Calendar.getInstance();
		int monthCalendar = Integer.valueOf(c.get(Calendar.MONTH));
		c.set(year,monthCalendar,day);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String formatedDate = sdf.format(c.getTime());

		System.out.println("The date is : " + formatedDate );
		System.out.println("The day of week is : " + c.get(Calendar.DAY_OF_WEEK) );
    }
}