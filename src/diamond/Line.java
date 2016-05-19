package diamond;

public class Line {
    int length;

    public Line(int length) {
        this.length = length;
    }

    public void drawHorizontalLine(int startingPoint) {
        for (int i = 0; i < startingPoint; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
    }
}
