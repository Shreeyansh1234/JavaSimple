package TestPackage;

public class switchEx {
    public static void main(String[] args) {
       String day = "Sun"; // Example: Day number

        switch (day) {
            case "Monday":
                System.out.println("Monday");
                break;
            case "Tue":
                System.out.println("Tuesday");
                break;
            case "Sun":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}

