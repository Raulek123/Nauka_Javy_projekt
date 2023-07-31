package ProgramowanieObiektowe2.Rysowanie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "tak";
        while (!line.equals("nic")){
            System.out.println("Co chcesz narysować? (rectangle / square / tree");
            line = sc.nextLine();
            switch (line){
                case "rectangle":
                    System.out.println("Podaj długość pierwszego boku:");
                    int a = sc.nextInt();
                    System.out.println("Podaj długość drugiego boku:");
                    int b = sc.nextInt();
                    sc.nextLine();
                    new Rectangle(a, b).draw();
                    break;
                case "square":
                    System.out.println("Podaj długość boku:");
                    int c = sc.nextInt();
                    sc.nextLine();
                    new Square(c).draw();
                    break;
                case "tree":
                    System.out.println("Podaj wysokość drzewa");
                    int h = sc.nextInt();
                    new Tree(h).draw();
                    break;
                case "nic":
                    System.out.println("Koniec programu!");
                    break;
                default:
                    System.out.println("Podałeś nieistniejącą opcję");
            }
        }
    }
}
