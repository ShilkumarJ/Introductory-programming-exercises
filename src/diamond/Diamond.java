package diamond;
public class Diamond {
    int height;
    public Diamond(int height) {
        this.height = height;
    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond(3);
        diamond.draw();
    }

    private void draw() {
        drawUpperPart();
        drawLowerPart();
    }

    private void drawLowerPart() {
        for(int i= this.height-2;i>=0;i--){
            Line line = new Line(2 * i + 1);
            line.drawHorizontalLine(this.height-i);
            System.out.println();
        }
    }

    private void drawUpperPart() {
        for(int i=0;i<this.height;i++){
            Line line = new Line(2 * i + 1);
            line.drawHorizontalLine(this.height-i);
            System.out.println();
        }
    }
}
