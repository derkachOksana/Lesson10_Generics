package Task10_1_MyList;

/**
 * Created by lion on 07.02.17.
 */
public class Main {
    public static void main(String[] args) {

        Cat c1 = new Cat("Barsik");
        Cat c2 = new Cat("Vaska");
        MyList<Cat> cats = new MyList<>();
        cats.add(c1);
        cats.add(c2);
        cats.getMyList();
        System.out.println(cats.get(0).toString());
        cats.size();

    }
}
