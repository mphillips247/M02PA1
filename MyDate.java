//class MyDate

class MyDate{
	
	//provide instance variables
	
	int day;
	int month;
	int year;
	
	//create argumented constructor
	
	public MyDate(int day, int month, int year) {
		
		this.day =  day;
		this.month = month;
		this.year =  year;
		
	}
	
	//constructor
	
	public MyDate() {
		
		this.day =  0;
		this.month = 0;
		this.year =  0;
		
	}
	
	//constructor elapsed time
	
	public MyDate(long elapsedTime) {
		
		this.day =  1;
		this.month = 1;
		this.year =  1970;
		
	}
	
	//getters method
	
	public int getDay() {
		
		return day;
		
	}
	
	public int getMonth() {
		
		return month;
		
	}
	

	public int getYear() {
	
	return year;
	
	}

	
	//toString method
	
	public String toString() {
		
		return "\nMyDate : "+day+"/"+month+"/"+year;
		
	}
	
	
}

//end class