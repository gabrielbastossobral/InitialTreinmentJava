package academy.devdojo.maratonajava.introducao;

public class Class05ConditionalStructure {
    public static void main(String[] args) {
        int age = 17;
        boolean isAllowedByParents = false;
        boolean isAllowedToTravel = age > 18 && isAllowedByParents == true;

        if (!isAllowedToTravel) {
            System.out.println("You are not allowed to travel");
        } else {
            System.out.println("You are allowed to travel");
        }

        int playerAge = 15;
        String categoria;

        if (playerAge < 15) {
            categoria = "You are in children's base";
        } else if (playerAge >= 15 && playerAge<= 17) {
            categoria = "You are in juvenile's base";
        } else {
            categoria = "You are in adult's base";
        }
        System.out.println(categoria);

        //ternary operator

        double salary = 5000;
        String donate = salary > 4000 ? "I can donate part of my salary" : "I can't donate part of my salary";
        System.out.println(donate);
    }
}
