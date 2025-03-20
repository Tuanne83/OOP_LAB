import java.util.Scanner;
public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = sc.nextLine();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        switch(month) {
            case "January", "Jan.", "Jan", "1", "March", "Mar.","Mar" ,"3", "May", "5", "July", "7", "Jul","August","Aug.","Aug", "8", "October", "Oct.", "Oct", "10", "December", "Dec.", "Dec", "12":
                {
                    System.out.print("This month has 31 days!");
                    break;
                }
            case "April", "Apr.", "Apr", "4", "June", "Jun.","Jun","6", "September", "Sep.", "Sep", "9", "November", "Nov.", "Nov", "11":
                {
                    System.out.print("This month has 30 days!");
                    break;
                }
            case "February", "Feb.", "Feb","2":
                {
                    if (year % 4 == 0) System.out.print("This month has 29 days!");
                    else System.out.print("This month has 28 days!");
                    break;
                }  
            default: System.out.print("Invalid date!"); 
        }
    }
}