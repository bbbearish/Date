import java.util.GregorianCalendar;

public class Date {
	private int day, month, year;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public Date(int day, int month, int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}

	public void setDay(int day){
		if(day >=1 && day<=31){
		this.day = day;
		}else{
			System.err.println("day between 1 to 31");
		}
	}
	public void setMonth(int month){
		if(month >=1 && month<=12){
			this.month = month;
		}else{
			System.err.println("month between 1 to 12" );
		}
	}
	
	public void setYear(int year){
		if(year >=1 ){
			this.year = year;
		}else{
			System.err.println("year is more than 1 ");
		}
	}
	@Override
	public String toString(){
		return getDay()+ "/" + getMonth()  + "/" + getYear();
	}
}




