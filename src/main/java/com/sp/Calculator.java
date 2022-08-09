package com.sp;

public class Calculator {
    private int number;

    public void switchOn(){
        number = 0;
    }
    public void add(int a){
       number += a;  // number = number + a;
    }
    public void subtract(int a) {
        number -= a;
    }
    public void multiply(int a) {
        number *= a;
    }
    public int getNumber(){
        return number;
    }


}
