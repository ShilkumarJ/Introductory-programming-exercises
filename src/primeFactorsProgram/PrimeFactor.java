package primeFactorsProgram;

import java.util.ArrayList;

public class PrimeFactor {
    public static void main(String[] args) {
        PrimeFactor primeFactor = new PrimeFactor();
        System.out.println(primeFactor.generate(1));
    }

    private ArrayList<Integer> generate(int number) {
        ArrayList <Integer> primeFactors = new ArrayList<Integer>();
        if(number <= 2)
            return primeFactors;
        for(int i = 2 ;i<=number ;i++){
            if(number%i == 0){
                primeFactors.add(i);
                number /= i;
                i = 2;
            }
        }
        return primeFactors;
    }
}
