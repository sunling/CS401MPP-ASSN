package lab11.homework.assignment.prob2;

import java.util.ArrayList;
import java.util.List;

public class Capture<T> {

    List<T> list;

    public static void reverse(List<?> list){
        new Capture().helperMethod(list);
    }

    private  void helperMethod(List<T> listItem){

        list = new ArrayList<>();
        for (int i = listItem.size()-1; i>=0 ; i--) {
            list.add(listItem.get(i));
        }
    }

    public List<T> getList(){
        return list;
    }
}
