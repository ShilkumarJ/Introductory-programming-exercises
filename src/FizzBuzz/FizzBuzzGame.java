package FizzBuzz;

public class FizzBuzzGame {
    int lowerBound;
    int upperBound;

    public FizzBuzzGame(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public static void main(String[] args) {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(1, 100);
        fizzBuzzGame.fizzBuzz();
    }

    private void fizzBuzz() {
        for (int i = lowerBound; i <= upperBound; i++) {
            boolean divisible = false;
            if (isDivisible(i, 3)) {
                System.out.print("Fizz");
                divisible = true;
            }
            if (isDivisible(i, 5)) {
                System.out.print("Buzz");
                divisible = true;
            }
            if(!divisible){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private boolean isDivisible(int number, int divisor) {
        if (number % divisor == 0)
            return true;
        else {
            return false;
        }
    }
}
