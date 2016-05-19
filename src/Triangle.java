
public class Triangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printAsterisksVertically(3);
    }

    private void printAsterisksVertically(int numberOfAsterisks) {
        for(int i=0; i<numberOfAsterisks;i++){
            this.printOneAsterisk();
            System.out.println();
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
}
