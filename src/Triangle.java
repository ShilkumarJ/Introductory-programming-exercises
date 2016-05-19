
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printRightAngleTriangle(5);
    }

    private void printRightAngleTriangle(int height) {
        int numberOfAsteriskInSingleLine = 1;
        for (int i = 0; i < height; i++) {
            this.printAsterisksHorizontaly(numberOfAsteriskInSingleLine);
            numberOfAsteriskInSingleLine += 2;
            printNewLine();
        }
    }

    private void printAsterisksVertically(int numberOfAsterisks) {
        for (int i = 0; i < numberOfAsterisks; i++) {
            this.printOneAsterisk();
            printNewLine();
        }
    }

    private void printAsterisksHorizontaly(int numberOfAsterisks) {
        for (int i = 0; i < numberOfAsterisks; i++) {
            this.printOneAsterisk();
        }
    }

    private void printOneAsterisk() {
        System.out.print("*");
    }

    private void printNewLine() {
        System.out.println();
    }

}
