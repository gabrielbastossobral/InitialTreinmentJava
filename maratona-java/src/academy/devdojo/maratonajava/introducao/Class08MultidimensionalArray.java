package academy.devdojo.maratonajava.introducao;

public class Class08MultidimensionalArray {
    public static void main(String[] args) {
        int [][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 5;
        days[0][2] = 10;

        days[1][0] = 15;
        days[1][1] = 20;
        days[1][2] = 25;

        days[2][0] = 27;
        days[2][1] = 29;
        days[2][2] = 31;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j] + " day");
            }
        }

        System.out.println("Another form to do: ");

        for (int [] arrBase : days) {
            for (int arrDay : arrBase) {
                System.out.println(arrDay);
            }
        }

        //Another form to initial an array multidimensional
        System.out.println("---------------------");

        int [][] weights = {{50, 55, 60},{70, 72, 78},{80, 90, 100}};
        for (int [] arrBase : weights){
            for (int arrUnits : arrBase){
                System.out.println(arrUnits);
            }
        }
    }
}
