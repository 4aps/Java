package OOPsInJava;

import java.util.*;

public class ArrayList {
    public static class Arraylist{
        int[] arr = new int[5];
        int index = 0;
        int size = 0;
        public void add(int element){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
            }
            arr[index] = element;
            index++;
            size++;
        }
        public void set(int index, int value){
            arr[index] = value;
        }

    }

    public static void main(String[] args) {
        Arraylist arr =  new Arraylist();
        arr.add(2);
        arr.add(7);
        arr.add(10);
        arr.add(111);

        System.out.println(arr.size);

        arr.set(2, 59);
        
    }
}
