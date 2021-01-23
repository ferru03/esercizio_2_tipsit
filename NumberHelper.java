/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class NumberHelper {
    private int number;

    public NumberHelper(int n){
        number = n;
    }

    public boolean isEven(){
        if(number%2 == 0){
            return true;
        }
        return false;
    }
    
    public boolean isOdd(){
        if(number%2 == 0){
            return false;
        }
        return true;
    }   

    public int sum(int n){
        int somma = 0;
        somma = number + n;
        return somma;
    }

    public boolean isPrime(){
        for(int i = 0; i < number; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean isDivisibleBy(int n){
        for(int i = 0; i < number; i++){
            if(number%n == 0 && n != 0){
                return true;
            }
        }
        return false;
    }
}
