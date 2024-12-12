package stage2.Home_work1;

import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        // int (constructor)
        ArrayList_NameSurname<Integer> integerList = new ArrayList_NameSurname<>();
                                    //add(element)
        integerList.add(100);
        integerList.add(61);
                                    //add(index, element)
        integerList.add(1,39);
                                    //set(index, element)
        integerList.set(1, 38);
                                    //remove
        integerList.remove(1);
                                    //size
        System.out.println(integerList.size());
        Comparator<Integer> integerComparator = Comparator.naturalOrder();
                                    //quickSort
        integerList.quickSort(integerComparator);
        for (int i = 0; i < integerList.size(); i++){
                                    //get
            System.out.println(integerList.get(i));
        }
                                    //isSorted
        if (integerList.isSorted()){
            System.out.println("Лист отсортирован");
        }
        else{
            System.out.println("Лист не отсортирован");
        }
                                    //split
        integerList.split(2);
        for (int i = 0; i < integerList.size(); i++){
            System.out.print(integerList.get(i) + " ");
        }
                                    //clear
        integerList.clear();
        System.out.println("\nРазмер массива: " + integerList.size());
    }
}
