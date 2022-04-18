package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        //checkAge(17);

        try{
            //Some stuff
            throw new ArithmeticException("Bad stuff");
        }
        catch(ArithmeticException a){
            System.out.println(a.getMessage());
        }
    }


    public static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("You are too young");
        }
        else{
            System.out.println("You can vote");
        }
    }
}
