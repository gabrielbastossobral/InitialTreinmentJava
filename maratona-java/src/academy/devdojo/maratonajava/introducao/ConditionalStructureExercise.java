package academy.devdojo.maratonajava.introducao;

public class ConditionalStructureExercise {
    public static void main(String[] args) {
        double salary = 1600.00;
        String result = "Your taxes for your salary are ";

        if(salary <= 1500){
            salary = (salary * 15) / 100;
        } else if (salary > 1500 && salary <= 5000) {
            salary = (salary * 30) / 100;
        } else {
            salary = (salary * 50) / 100;
        }
        System.out.println(result + salary);
    }
}
