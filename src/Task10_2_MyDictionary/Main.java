package Task10_2_MyDictionary;

/**
 * Created by lion on 07.02.17.
 */
public class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, Dog> myMap = new MyDictionary<>();
        Dog dog1 = new Dog("Vulkan");
        Dog dog2 = new Dog("Rex");
        Dog dog3 = new Dog("Olimp");

        myMap.put(new Integer(1), new Dog("Vulkan"));
        myMap.put(new Integer(45), dog2);
        myMap.put(new Integer(23), dog3);
        System.out.println(myMap.get(45));
        myMap.getMyDictionary();
        System.out.println(myMap.size());

    }
}
