package oopconcepts;

public class MyTime {
	
	private int hour ;
	private int minute;
	private int second;
	
	public MyTime(int hour, int minute, int second){
		setTime(hour,minute,second);
	}
	
	void setTime(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	void setHour(int hour){
		if(hour>=0 && hour<=23){
			this.hour = hour;
		}else{
			throw new IllegalArgumentException("Invalid Hour !");
			
		}
	}
	
	void setMinute(int minute){
		if(minute>=0 && minute<=59){
			this.minute = minute;
		}else{
			throw new IllegalArgumentException("Invalid Minute !");
			
		}
	}
	
	void setSecond(int second){
		if(second>=0 && second<=59){
			this.second = second;
		}else{
			throw new IllegalArgumentException("invalid Second !");
		}
	}
	
																	//Getters
	
	public int getHour(){
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int  getSecond() {
		return second;
	}
	
	public String toString(){
		return String.format("Hour : %02d  Minute : %02d  Seconds : %02d", hour,minute,second);
	}
	
	public MyTime nextSecond(){
		++second;
		
		if(second == 60){
			second = 0;
			minute++;
		}
		
		if(minute == 60){
			minute = 0;
			hour++;
		}
		
		if(hour == 24){
			hour = 0;
		}
		
		return this;
	}
}
