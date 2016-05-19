
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printAsterisksHorizontaly(8);
    }
    private void printAsterisksHorizontaly(int numberOfAsterisks) {
        for (int i = 0; i < numberOfAsterisks; i++) {
            this.printOneAsterisk();
        }
    }

    private void printOneAsterisk() {
        System.out.print("*");
    }
}
