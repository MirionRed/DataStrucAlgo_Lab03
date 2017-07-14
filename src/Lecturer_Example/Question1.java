package Lecturer_Example;


import java.util.ArrayList;

public class Question1 {
    public static <E extends Comparable<E>> E min(ArrayList<E> numbers){
        E number = numbers.get(0);
        for(int i = 0; i<numbers.size(); i++){
            if(number.compareTo(numbers.get(i)) > 0){
                number = numbers.get(i);
            }
        }
        return number;
    }
    
    public static void main(String[]args){
        ArrayList<MinClass> list = new ArrayList<MinClass>();
        
        list.add(new MinClass(100));
        list.add(new MinClass(40));
        list.add(new MinClass(2));
        list.add(new MinClass(200));
        list.add(new MinClass(3));
        list.add(new MinClass(50));
        
        System.out.println(min(list).getNumber());
    }
   
}

class MinClass implements Comparable{
    private int number;
    
    public MinClass(int number){
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
        if (this.getNumber() > ((MinClass)o).getNumber())
            return 1;
        else if (this.getNumber() < ((MinClass)o).getNumber())
            return -1;
        else
            return 0;
    }
}