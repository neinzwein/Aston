package stage2.Home_work1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @param <E> тип элементов в ArrayList_NameSurname
 */

@SuppressWarnings("unchecked")
public class ArrayList_NameSurname<E> implements IntensiveList<E> {

    private Object[] elements;
    private int size;
    private int capacity = 10;

    /**
     * Конструктор класса. Создаём пустой массив с вместимостью 10
     */
    public  ArrayList_NameSurname(){
        elements = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * {@inheritDoc} - наследует интерфейс #IntensiveList
     * @see IntensiveList#get(int)
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#add(E)
     */
    @Override
    public void add(E element) {
        ensureCapacity(size + 1);
        elements[size++] = element;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#add(int, E)
     * Этот метод использует {@link #checkIndex(int)} для проверки индекса.
     * Этот метод использует {@link #ensureCapacity(int)} для увеличения размерности
     */
    @Override
    public void add(int index, E element) {
        checkIndex(index);
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#get(int) 
     * Этот метод использует {@link #checkIndex(int)} для проверки индекса
     */
    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#set(int, E)
     * Этот метод использует {@link #checkIndex(int)} для проверки индекса
     */
    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldElement = (E) elements[index];
        elements[index] = element;
        return oldElement;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#remove(int)
     * Этот метод использует {@link #checkIndex(int)} для проверки индекса
     */
    @Override
    public E remove(int index) {
        checkIndex(index);
        E chosenToRemove = (E) elements[index];
        for (int i = index; i < size - 1; i++){
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return chosenToRemove;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#clear()
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#quickSort(Comparator)
     * Этот метод использует {@link #partition(int, int, Comparator)}
     */
    @Override
    public void quickSort(Comparator<E> comparator) {
        if (size <= 1){
            return;
        }
        int[] stack = new int[size];
        int top = -1;
        stack[++top] = 0;
        stack[++top] = size - 1;

        while (top >= 0){
            int h = stack[top--];
            int l = stack[top--];
            int p = partition(l, h, comparator);
            if (p - 1 > l){
                stack[++top] = l;
                stack[++top] = p - 1;
            }
            if (p + 1 < h){
                stack[++top] = p + 1;
                stack[++top] = h;
            }
        }

    }
    /**
     Приватный метод для разделения массива на два подмассива
     (вспомогательная функция для {@link #quickSort(Comparator)}
     * @param l - индекс начала подмассива
     * @param h - индекс конца подмассива
     * @param comparator - компаратор
     * @return индекс опорного элемента после разделения массива
     * Использует {@link #swap(int, int)}
     */
    private int partition(int l, int h, Comparator<E> comparator){
        E pivot = (E) elements[h];
        int i = l - 1;
        for (int j = l; j < h; j++){
            if (comparator.compare((E) elements[j], pivot) < 0){
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, h);
        return i + 1;
    }
    /**
     * Приватный метод для обмена элементов местами
     * Используется в {@link #partition(int, int, Comparator)}
     *                  для реализации {@link #quickSort(Comparator)}
     * @param i - индекс первого элемента
     * @param j - индекс второго элемента
     */
    private void swap(int i, int j){
        E tmp = (E) elements[i];
        elements[i] = elements[j];
        elements[j] = tmp;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#isSorted()
     */
    @Override
    public boolean isSorted() {
        for (int i = 1; i < size; i++){
            if (((Comparable<E>) elements[i - 1]).compareTo((E) elements[i]) > 0){
                return false;
            }
        }
        return true;
    }
    /**
     * {@inheritDoc}
     * @see IntensiveList#split(int)
     */
    @Override
    public void split(int size) {
    this.size = size;
    elements = Arrays.copyOf(elements, size);
    }
    /**
     * Приватный метод, отвечающий за проверку передаваемого индекса в списке
     * @param index - позиция на существование индекса в размерности ArrayList
     * @throws IndexOutOfBoundsException, если выбранный индекс не подходит по размеру списка.
     */
    private void checkIndex(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Неправильный индекс: " + index + "\nИндекс должен быть от 0 до " + size);
        }
    }
    /**
     * Приватный метод для увеличения размера массива при необходимости
     * @param c - требуемая capacity (вместимость) массива
     */
    private void ensureCapacity(int c){
        if (c > elements.length){
            int new_c = elements.length * 2;
            elements = Arrays.copyOf(elements, new_c);
        }
    }
}
