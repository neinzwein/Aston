package Home_work_3;

import java.util.Collection;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //add
        System.out.println("Метод add");
        for (int i = 10; i > 2; i--){
            arrayList.add(i);
        }

        //get
        System.out.println("Метод get");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        //remove
        System.out.println("Метод remove");
        System.out.println(arrayList.toString());
        arrayList.remove(0);
        System.out.println(arrayList.toString());

        //addAll
        System.out.println("Метод addAll");
        List<Integer> anotherList = List.of(100,101);
        arrayList.addAll(anotherList);
        System.out.println(arrayList);

        //сортировка пузырьком *
        System.out.println("Сортировка пузырьком статическая");
        ArrayList.bubbleSort(arrayList);
        System.out.println(arrayList);

        //ArrayList(collection) *
        System.out.println("Конструктор для элементов из другой коллекции");
        ArrayList<Integer> a = new ArrayList<>(anotherList);
        System.out.println(a);

    }
}
