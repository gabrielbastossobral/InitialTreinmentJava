package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalStructure02 {
    public static void main(String[] args) {
        byte day = 10;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }

        byte useDay = 3;
        switch (useDay) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 2:
                System.out.println("Use Day");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
