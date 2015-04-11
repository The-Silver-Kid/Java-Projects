import java.util.*;

public class DateAndTyme {
	public static void main(String args[]) {
		int d = 0, m = 0, y = 0, tm = 0, td = 0;
		double	aY = 0, aM = 0, aD = 0, dy = 0, dd = 0, dm = 0, aN = 0, aS = 0, aH = 0;
		GregorianCalendar gcalendar = new GregorianCalendar();
		Date date = new Date();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("");
		System.out.println("Input a month.");
		m = keyboard.nextInt();
		System.out.println("Input a day.");
		d = keyboard.nextInt();
		System.out.println("Input a year. (4 numbers)");
		y = keyboard.nextInt();
		keyboard.close();
		System.out.println("");
		System.out.println("Imputed date: " + d + "/" + m + "/" + y);
		System.out.println("Current date: " + date.toString());
		
		dy = gcalendar.get(Calendar.YEAR);
		dm = gcalendar.get(Calendar.MONTH) + 1;
		dd = gcalendar.get(Calendar.DATE);
		
		td = (int) dd - d;
		if (td < 0){
			switch(gcalendar.get(Calendar.MONTH)+1) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					dd = dd + 31;
					dd = (int) dd - d;
					dm = dm - 1;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					dd = dd + 30;
					dd = (int) dd - d;
					dm = dm - 1;
					break;
				case 2:
					dd = dd + 28;
					dd = (int) dd - d;
					dm = dm - 1;
					break;
			}
			
		}
		tm = (int) dm - m;
		if (tm < 0) {
			dm = 12 + dm;
			dm = (int) dm - m;
			dy = dy - 1;
		} else {
			dm = tm;
		}
		dy = (int) dy - y;
		
		System.out.println("");
		System.out.println("Age: " + dy + " Years, " + dm + " Months, " + dd + " Days.");
		System.out.println("");
		
		aY = dy + (dm / 12) + (dy / 365);
		System.out.println("Age in Years: " + aY);
		aM = aY * 12;
		System.out.println("Age in Months: " + aM);
		aD = aY * 365;
		System.out.println("Age in Days: " + aD);
		aH = aD * 24;
		System.out.println("Age in Hours: " + aH);
		aN = aH * 60;
		System.out.println("Age in Minutes: " + aN);
		aS = aN * 60;
		System.out.println("Age in Seconds: " + aS);
	}
}