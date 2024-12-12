package stage1.Home_work_3;

import java.util.Collection;
import java.util.Objects;

public class ArrayList<T extends Comparable>{
    private T[] elements;
    private int size = 0;
    private final int initial_capacity = 10;

    public ArrayList(){
        elements = (T[]) new Comparable[initial_capacity];
    }
    // *
    public ArrayList(Collection<? extends T> collection){
        elements = (T[]) new Comparable[collection.size()];
        addAll(collection);
    }

    public int size(){
        return size;
    }

    private void more_capacity(int capacity){
        if (capacity > elements.length){
            int c = Math.max(elements.length + 10, capacity);
            T[] newElements = (T[]) new Comparable[c];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }

    public void add(T element){
        more_capacity(size + 1);
        elements[size] = element;
        size++;
    }

    public void IndexError(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Индекс превышает размер массива");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException("Индекс не может быть меньше нуля");
        }
    }

    public T get(int index){
        IndexError(index);
        return elements[index];
    }

    public void remove(int index){
        IndexError(index);
        for (int i = index; i <= size; i++){
            elements[i] = elements[i + 1];
        }
        elements[size] = null;
        size--;
    }

    public void addAll(Collection<? extends T> collection){
        Objects.requireNonNull(collection);
        more_capacity(collection.size() + size);
        for (T element : collection){
            add(element);
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(ArrayList<T> list){
        boolean finish;
        for (int i = 0; i < list.size() - 1; i++){
            finish = false;
            for (int j = 0; j < list.size() - i - 1; j++){
                if (list.elements[j].compareTo(list.elements[j + 1]) > 0){
                    T tmp = list.elements[j];
                    list.elements[j] = list.elements[j + 1];
                    list.elements[j + 1] = tmp;
                    finish = true;
                }
            }
            if (!finish){
                break;
            }
        }
    }
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size ;i++){
            str.append(elements[i]);
            if (i < size - 1){
                str.append(", ");
            }
        }
        str.append("]");
        return str.toString();
    }
    //превращаем другую коллекцию в arraylist<T>
//    public static <E, T> ArrayList<T> transform(ArrayList<E> collection, Function<? super E, ? extends T> transformer){
//        ArrayList<T> transformedCollection = new ArrayList<>();
//        for (int i = 0; i < collection.size(); i++){
//            E element = collection.get(i);
//            T el = transformer.apply(element);
//            transformedCollection.add(el);
//        }
//        return transformedCollection;
//    }
}