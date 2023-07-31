package ProgramowanieObiektowe1.Cabrio;

public class CabrioMainTest {
    public static void main(String[] args) {
        Cabrio cabrio = new Cabrio("Kabriolet", "Hyundai", "i30", false, true);
        System.out.println(cabrio);
        cabrio.setRoofOpen(false);
        System.out.println(cabrio);
    }
}
