package diamond;
public class Diamond {
    int height;
    public Diamond(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond(3);
        diamond.drawWithName();
    }

    private void drawWithName() {
        drawUpperPart();
        System.out.println("Shilkumar");
        drawLowerPart();
    }

    private void draw() {
        drawUpperPart();
        drawMiddlePart();
        drawLowerPart();
    }

    private void drawMiddlePart() {
        Line line = new Line(2 * (height-1) + 1);
        line.drawHorizontalLine(0);
        System.out.println();
    }

    private void drawLowerPart() {
        for(int i= this.height-2;i>=0;i--){
            Line line = new Line(2 * i + 1);
            line.drawHorizontalLine(this.height-i-1);
            System.out.println();
        }
    }

    private void drawUpperPart() {
        for(int i=0;i<this.height-1;i++){
            Line line = new Line(2 * i + 1);
            line.drawHorizontalLine(this.height-i-1);
            System.out.println();
        }
    }
}
