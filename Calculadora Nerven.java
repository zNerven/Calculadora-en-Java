import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        int a = 0;
        int first;
        int second;
        double resultatArrel = 0;

        boolean resultat = true;
        int result = 0;
        for (int number = 0; number == a; ) {
            int text;
            Scanner terminal = new Scanner(System.in);
            System.out.println("Calculadora");
            System.out.println("0.Sortir");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicació");
            System.out.println("4.Divisió");
            System.out.println("5.Mòdul");
            System.out.println("6.Arrel quadrada");
            text = terminal.nextInt();
            if (text == 1) {
                if (resultat == true){
                System.out.println("Introdueix numero");
                first = terminal.nextInt();
                System.out.println("Introdueix numero");
                second = terminal.nextInt();
                System.out.println("Resultat");
                result = first + second;
                System.out.println(result);
                resultat = false;
                }
                else{
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println(result + first);
                    resultat = true;
                }
            }
            else if (text == 2) {
                if (resultat == true) {
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println("Introdueix numero");
                    second = terminal.nextInt();
                    System.out.println("Resultat");
                    result = first - second;
                    System.out.println(result);
                    resultat = false;
                }
                else {
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println(result - first);
                    resultat = true;
                }
            }
            else if (text == 3) {
                if (resultat == true) {
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println("Introdueix numero");
                    second = terminal.nextInt();
                    System.out.println("Resultat");
                    result = first * second;
                    System.out.println(result);
                    resultat = false;
                }
                else{
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println(result * first);
                    resultat = true;
                }
            }
            else if (text == 4) {
                if (resultat == true) {
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println("Introdueix numero");
                    second = terminal.nextInt();
                    System.out.println("Resultat");
                    result = first / second;
                    System.out.println(result);
                    resultat = false;
                }
                else{
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println(result / first);
                    resultat = true;
                }

            }
            else if (text == 5) {
                if (resultat == true) {
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println("Introdueix numero");
                    second = terminal.nextInt();
                    System.out.println("Resultat");
                    result = first % second;
                    System.out.println(result);
                    resultat = false;
                }
                else{
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println(result % first);
                    resultat = true;
                }
            }
            else if (text == 6) {
                if (resultat == true) {
                    System.out.println("Introdueix numero");
                    first = terminal.nextInt();
                    System.out.println("Resultat");
                    resultatArrel = Math.sqrt(first);
                    System.out.println("La arrel quadrada de " + first + " és " + resultatArrel);
                    resultat = false;
                }
                else{
                    System.out.println("Introdueix numero");
                    System.out.println("La arrel quadrada de " + resultatArrel + " és " + Math.sqrt(resultatArrel));
                    resultat = true;
                }
            }
        }
    }
}