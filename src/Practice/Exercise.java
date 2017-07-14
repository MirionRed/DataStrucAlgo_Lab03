/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;

/**
 *
 * @author Red King
 */
public class Exercise {
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E currentItem = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(currentItem.compareTo(list.get(i)) > 0)
                currentItem = list.get(i);
        }
        return currentItem;
    }
    
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E currentItem = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(currentItem.compareTo(list.get(i)) < 0)
                currentItem = list.get(i);
        }
        return currentItem;
    }
    
    public static void main(String[]args){
        ArrayList list = new ArrayList();
        
        list.add(100);
        list.add(40);
        list.add(2);
        list.add(200);
        list.add(3);
        list.add(50);
        
        System.out.println("Minimum = " + min(list));
        System.out.println("Maximum = " + max(list));
    }
}
