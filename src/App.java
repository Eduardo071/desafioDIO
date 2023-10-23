import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int xp;
        String nome;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome: ");
        nome = scan.next();
        System.out.println("Quanto você tem de XP: ");
        xp = scan.nextInt();
        if (xp >= 0 && xp <= 1000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Ferro");
        } else if (xp >= 1001 && xp <= 2000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Bronze");
        } else if (xp >= 2001 && xp <= 5000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Prata");
        } else if (xp >= 6001 && xp <= 7000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Ouro");
        } else if (xp >= 7001 && xp <= 8000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Platina");
        } else if (xp >= 8001 && xp <= 9000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Ascendente");
        } else if (xp >= 9001 && xp <= 10000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Imortal");
        } else if(xp >= 9001 && xp <= 10000) {
            System.out.println("O Herói de nome " + nome + " está no nível de Radiante");
        }
        scan.close();

    }
}
