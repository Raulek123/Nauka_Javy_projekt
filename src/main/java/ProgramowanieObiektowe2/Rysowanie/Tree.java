package ProgramowanieObiektowe2.Rysowanie;

public class Tree implements Drawable {
    private int h;

    public Tree(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void draw() {
        String gwiazdka = "*";
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < h * 2; j++) {
                if (j < (h - i) || j > (h + i)) {
                    System.out.print(" ");
                } else {
                    System.out.print(gwiazdka);
                }
            }
            System.out.println();
        }
    }
}
