package academy.devdojo.maratonajava.introducao;

public class Class06RepetitionStructure {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 10) {
            System.out.println(++counter);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }

        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number: " + i);
            }
        }

        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i > 25){
                break;
            }
            System.out.println("i: " + i);
        }

        int car = 64000;
        for (int portion = 1; portion <= car; portion++) {
            double portionValue = car / portion;
            if (portionValue < 1000) {
                break;
            }
            System.out.println("Portion "+ portion +": $" + portionValue);
        }


    }
}
