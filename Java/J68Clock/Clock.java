// 1) Clock class - Gerry Agnew

public class Clock
{
	// 2) Member Variables

    private int hr;  //store hours

    private int min; //store minutes

    private int sec; //store seconds

    String hrSt = "00";
    String minSt = "00";
    String secSt = "00";

	// 3) Class Methods
//===================================================================

// Note NO main - cannot be run directly

//===================================================================

    // 4) Default constructor - Postcondition: hr = 0; min = 0; sec = 0

    public Clock()
    {
  	    setTime(0, 0, 0);

    }// default constructor

    //Constructor with parameters, to set the time
    //The time is set according to the parameters
	//Postcondition: hr = hours; min = minutes; sec = seconds

    public Clock(int hours, int minutes, int seconds)
    {
	    setTime(hours, minutes, seconds);

    }// constructor with parameters

//===================================================================

    //5) Method to set the time
    //The time is set according to the parameters
	//Postcondition: hr = hours; min = minutes; sec = seconds

    public void setTime(int hours, int minutes, int seconds)
    {
	    if (0 <= hours && hours < 24)
	        hr = hours;
	    else
	        hr = 0;

        if (0 <= minutes && minutes < 60)
	        min = minutes;
	    else
	        min = 0;

	    if (0 <= seconds && seconds < 60)
	        sec = seconds;
	    else
	        sec = 0;

    }// setTime()

//===================================================================

    // 6) Method to return the hours
	//Postcondition: The value of hr is returned

    public int getHours()
    {
	    return hr;

    } // getHours

    //Method to return the minutes
	//Postcondition: The value of min is returned

    public int getMinutes()
    {
	    return min;

    } // getMinutes()

    //Method to return the seconds
	//Postcondition: The value of sec is returned

    public int getSeconds()
    {
        return sec;

   } // getSeconds

//===================================================================

    // 7) Method to print the time
 	//Postcondition: Time is printed in the form hh:mm:ss

    public void printTime()
    {
 	    if (hr < 10)
	        System.out.print("0");
        System.out.print(hr + ":");

	    if (min < 10)
	        System.out.print("0");
	    System.out.print(min + ":");

	    if (sec < 10)
	        System.out.print("0");
        System.out.print(sec);

   } // printTime

   	public String toString()
   	{
		//String hrSt = minSt = secSt = "";

		if (hr < 10)
			hrSt = "0" + Integer.toString(hr);

	    if (min < 10)
			minSt = "0" + Integer.toString(min);

	    if (sec < 10)
			secSt = "0" + Integer.toString(sec);
		return (hrSt + ":" + minSt + ":" + secSt);
	}

//===================================================================

   	// 8) Method to increment the time by one second
	//Postcondition: The time is incremented by one second
	//If the before-increment time is 23:59:59, the time
 	//is reset to 00:00:00

    public void incrementSeconds()
    {
        sec++;

	     if (sec > 59)
	     {
	         sec = 0;
	         incrementMinutes(); //increment minutes
	     } // if

   } // incrementSeconds()

//===================================================================

    //Method to increment the time by one minute
    //Postcondition: The time is incremented by one minute.
	//If the before-increment time is 23:59:53, the time
  	//is reset to 00:00:53

    public void incrementMinutes()
    {
	    min++;

	    if (min > 59)
	    {
	        min = 0;
	        incrementHours(); //increment hours
	    } // if

   } // incrementMinutes()

//===================================================================

    //Method to increment the time by one hour
    //Postcondition: The time is incremented by one hour.
	//If the before-increment time is 23:45:53, the time
	//is reset to 00:45:53

    public void incrementHours()
    {
	    hr++;

	    if (hr > 23)
 	       hr = 0;

   } // incrementHOurs

//===================================================================

    // 9) Method to compare the two times
	//Postcondition: Returns true if this time is equal to
	//               otherClock; otherwise returns false

    public boolean equals(Clock otherClock)
    {
		boolean timesEqual =
			(hr == otherClock.hr &&
			min == otherClock.min &&
			sec == otherClock.sec);

		return timesEqual;
   } // equals()

//===================================================================

    // 10) Method to copy the time
	//Postcondition: The instance variables of otherClock are
    //               copied into the corresponding data members of this time.
    //               hr = otherClock.hr; min = otherClock.min; sec = otherClock.sec;

    public void makeCopy(Clock otherClock)
    {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;

   } // makeCopy()

//===================================================================

 	//11) Method to return a copy of the time
	//Postcondition: A copy of the object is created
    //               and a reference of the copy is returned.

    public Clock getCopy()
    {
	    Clock temp = new Clock();

	    temp.hr = hr;
	    temp.min = min;
	    temp.sec = sec;

	    return temp;

    } // getCopy

//===================================================================

} // Clock