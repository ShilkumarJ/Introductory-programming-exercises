package diamond;
public class IsoscelesTriangle {
    private int base;
    private int height;

    public IsoscelesTriangle(int height) {
        this.height = height;
        this.base = 2 * height - 1;
    }

    public static void main(String[] args) {
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(5);
        isoscelesTriangle.draw();
    }

    private void draw() {
        for(int i=0;i<height;i++){
            Line line = new Line(2 * i + 1);
            line.drawHorizontalLine(height-i);
            System.out.println();
        }
    }
}
