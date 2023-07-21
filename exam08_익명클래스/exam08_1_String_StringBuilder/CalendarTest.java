package exam08_1;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		//날짜 데이터
		//캘린터 클래스는 추상 클래스이기 떄문에 new 불가
		Calendar cal = Calendar.getInstance();
		System.out.println(cal); //cal.toString() 동일
		/*
		 * java.util.GregorianCalendar[time=1689921939455,
		 * areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		 * zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		 * offset=32400000,dstSavings=0,useDaylight=false,transitions=30,
		 * lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,
		 * ERA=1,YEAR=2023,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=4,
		 * DAY_OF_MONTH=21,DAY_OF_YEAR=202,DAY_OF_WEEK=6,
		 * DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,
		 * MINUTE=45,SECOND=39,MILLISECOND=455,ZONE_OFFSET=32400000,
		 * DST_OFFSET=0]
		 */
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //월은 +1 해줘야 함
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("년:"+year);
		System.out.println("월:"+month);
		System.out.println("일:"+day);
		System.out.println("시:"+hour);
		System.out.println("분:"+minute);
		System.out.println("초:"+second);
		
		//특정 날짜 설정
		Calendar cal2 = Calendar.getInstance();
		cal2.set(1997,1,16);
		System.out.println("년:"+cal2.get(Calendar.YEAR));
		System.out.println("월:"+(cal2.get(Calendar.MONTH)+1));
		System.out.println("일:"+cal2.get(Calendar.DAY_OF_MONTH));
	}

}
