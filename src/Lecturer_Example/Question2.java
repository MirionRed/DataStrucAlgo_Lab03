package Lecturer_Example;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Red King
 */
public class Question2 {
     public static <E extends Comparable<E>> E max(ArrayList<E> numbers){
        E number = numbers.get(0);
        for(int i = 0; i<numbers.size(); i++){
            if(number.compareTo(numbers.get(i)) > 0){
                number = numbers.get(i);
            }
        }
        return number;
    }
    
    public static void main(String[]args){
        ArrayList<MaxClass> list = new ArrayList<MaxClass>();
        
        list.add(new MaxClass(100));
        list.add(new MaxClass(40));
        list.add(new MaxClass(2));
        list.add(new MaxClass(200));
        list.add(new MaxClass(3));
        list.add(new MaxClass(50));
        
        System.out.println(max(list).getNumber());
    }
    
   
}

class MaxClass implements Comparable{
    private int number;
    
    public MaxClass(int number){
        this.number = number;
    }
    
    public int getNumber(){
        return number;
    }
    
    public void setNumber(){
        this.number = number;
    }

    @Override
    public int compareTo(Object o) {
        if (this.getNumber() < ((MaxClass)o).getNumber())
            return 1;
        else if (this.getNumber() > ((MaxClass)o).getNumber())
            return -1;
        else
            return 0;
    }
}