package DesignPatterns.ChainPattern;

/**
 * Created by rahul.sk on 30/08/16.
 */
public class Numbers {
    private int number1;
    private int number2;
    private String calculationWanted;

    public Numbers(int n1,int n2,String calc){
        number1=n1;
        number2=n2;
        calculationWanted=calc;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public String getCalcWanted() {
        return calculationWanted;
    }
}
