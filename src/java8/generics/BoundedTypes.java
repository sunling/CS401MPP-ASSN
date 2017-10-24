package java8.generics;

import java.io.Serializable;

public class BoundedTypes <T>{

    private T value;

    public void  setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("U :" +u.getClass().getName());
        System.out.println("T :" +value.getClass().getName());
    }

    public static void main(String[] args) {
        BoundedTypes<Integer> integerBox = new BoundedTypes<>();
        integerBox.setValue(new Integer(10));
        integerBox.inspect(12); // error: this is still String!
    }

    public static<T extends Comparable<T>> int getCount(T [] arrays, T item){
        int count = 0;
        for (T e: arrays) {
            if (e.compareTo(item) > 0){
                count++;
            }
        }

        return count;

    }
}
