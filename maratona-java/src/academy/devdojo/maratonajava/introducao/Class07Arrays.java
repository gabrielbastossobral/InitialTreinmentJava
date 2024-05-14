package academy.devdojo.maratonajava.introducao;

public class Class07Arrays {
    public static void main(String[] args) {
        int [] ages = new int[3];
        ages[0] = 20;
        ages[1] = 18;
        ages[2] = 30;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        String [] positions = new String[3];
        positions[0] = "Captain";
        positions[1] = "Immediate";
        positions[2] = "Navigator";

        for (int i = 0; i < positions.length; i++) {
            System.out.println(positions[i]);
        }

        String [] names = new String[]{"Gabriel", "Gustavo", "Guilherme", "Gael", "Giovanni"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
