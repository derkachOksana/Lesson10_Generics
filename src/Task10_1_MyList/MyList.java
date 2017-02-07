package Task10_1_MyList;

import java.util.*;

/**
 * Created by lion on 07.02.17.
 */
public class MyList<T> {
    private List<T> list;
    public MyList(){
        list = new ArrayList<T>();
    }

   public void add(T e){
        list.add(e);
    }
    public T get(int i){
        return list.get(i);
    }
    public void size(){
        System.out.println(list.size());
    }

// не знаю як переоприділити тут метод toString і що він має вертати T чи String?
    public void getMyList() {
        for(T temp: list){
            System.out.println(temp.toString());
        }

    }
}
