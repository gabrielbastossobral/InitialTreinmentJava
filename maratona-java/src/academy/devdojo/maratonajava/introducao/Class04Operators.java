package academy.devdojo.maratonajava.introducao;

public class Class04Operators {
    public static void main(String[] args) {
        // o valor da operação entre dois números inteiros sempre será inteiro

        //% sempre mostra o resto de uma divisão, bom operador para decidir se é par ou ímpar

        //operadores booleanos

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte = " + isDezIgualVinte);
        System.out.println("isDezIgualDez = " + isDezIgualDez);
        System.out.println("isDezDiferentelDez = " + isDezDiferenteDez);

        //&& (AND) || (OR)

        int ageForSalary = 35;
        double salary = 3500F;
        boolean isIntoLaw = ageForSalary > 30 && salary > 4600;

        System.out.println("isIntoLaw " + isIntoLaw);

        double currentAccount = 900;
        double savingAccount = 6000;
        float xboxValue = 4000;
        boolean isXboxPurchasable = currentAccount > xboxValue || savingAccount > xboxValue;

        System.out.println("isXboxPurchasable " + isXboxPurchasable);

        // = += -= *= /= %=
        double bonus = 2000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);
    }
}
