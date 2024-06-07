public class LeapMonth {
    public static void main(String[] args) {
        int year = 2024; // Example year
        int month = 2; // Example month (February)
        
        boolean isLeapMonth = isLeapMonth(year, month);
        System.out.println("Year: " + year + ", Month: " + month + " -> Leap Month: " + isLeapMonth);
    }
    
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0) || (year % 400 == 0);
        return isLeapMonth && (month == 2); // Typically, only February can be a leap month
    }
}
