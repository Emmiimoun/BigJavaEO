package ch09;

/**
 * P9.1
 *
 */

public class Clock {

    private String currentDateTime;

    private int alarmHours;
    private int alarmMinutes;

    // main method for testing
    public static void main(String[] args) {

	// try different classes of java.time
	System.out.println(java.time.LocalDateTime.now().toString());
	System.out.println(java.time.Instant.now().toString());
	System.out.println(java.time.LocalDate.now().toString());
	System.out.println(java.time.LocalTime.now().toString());
	System.out.println(new java.util.Date().toString());
	System.out.println();

	// test methods of clock
	Clock c1 = new Clock();
	System.out.println(c1.getHours());
	System.out.println(c1.getMinutes());
	System.out.println(c1.getTime());
	c1.setAlarm(17, 42);
	System.out.println(c1.getTime());
    }

    // return hours from java.time.instant
    public String getHours() {
	currentDateTime = java.time.Instant.now().toString();
	String[] currentDateTimeArray = currentDateTime.split("T", 2);
	String time = currentDateTimeArray[1];
	String[] timeArray = time.split(":", 2);
	String hours = timeArray[0];
	return hours;
    }

    // return minutes from java.time.instant
    public String getMinutes() {
	currentDateTime = java.time.Instant.now().toString();
	String[] currentDateTimeArray = currentDateTime.split("T", 2);
	String time = currentDateTimeArray[1];
	String[] timeArray = time.split(":");
	String minutes = timeArray[1];
	return minutes;
    }

    public String getTime() {
	String hours = getHours();
	String minutes = getMinutes();
	int currentHours = Integer.parseInt(hours);
	int currentMinutes = Integer.parseInt(minutes);
	if (currentHours == alarmHours && currentMinutes >= alarmMinutes) {
	    return hours + ":" + minutes + " \u23F0";
	} else {
	    return hours + ":" + minutes;
	}
    }

    public void setAlarm(int hours, int minutes) {
	alarmHours = hours;
	alarmMinutes = minutes;
    }
}
