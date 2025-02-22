package stage2.Home_work1;

import java.util.Comparator;

/**
 * @param <E> тип данных интерфейса массива
 */
public interface IntensiveList<E> {
    /**
     * Метод, который возвращает текущий размер массива.
     * @return size - переменную, равную количеству элементов в массиве
     */
    int size();
    /**
     * Метод добавляет переданный элемент в конец списка
     * @param element передаётся в метод,
     *                увеличивается размерность списка и добавляется элемент
     */
    void add(E element);
    /**
     * Метод добавляет переданный элемент в список по позиции индекса
     * @param index - позиция, на которую мы хотим поставить элемент
     * @param element - элемент, который мы добавляем
     * */
    void add(int index, E element);
    /**
     * Метод, который возвращает элемент по индексу
     * @param index - передаваемый в метод индекс искомого элемента
     * @return элемент по индексу
     */
    E get(int index);
    /**
     * Метод, который вставляет элемент по индексу
     * @param index - индекс элемента
     * @param element - сам элемент
     * @return элемент, который убрали
     */
    E set(int index, E element);
    /**
     * Метод, который убирает элемент по индексу
     * @param index - индекс элемента, который собираемся убрать
     * @return убранный элемент
     * */
    E remove(int index);
    /**
     * Метод, который удаляет все элементы,
     * capacity приводится к дефолтному
     */
    void clear();
    /**
     * реализуем быструю сортировку, дефолт по возрастанию
     * @param comparator - компаратор для массива
     */
    void quickSort(Comparator<E> comparator);
    /**
     * Метод возвращает boolean значение,
     * если метод отсортирован(true), если нет (false)
     * @return boolean (true || false)
     */
    boolean isSorted();
    /**
     * обрезаем список до указанного размера
     * @param size - передаваемый в метод аргумент,
     *             обозначающих до какого элемента по размерности ArrayList нужно обрезать
    */
    void split(int size);
}