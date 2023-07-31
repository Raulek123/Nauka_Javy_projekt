package ProgramowanieObiektowe2.Rysowanie;

public class Square implements Drawable{
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        String gwiazdka = "*";
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print(gwiazdka + " ");
            }
            System.out.println();
        }
    }
}
