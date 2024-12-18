Задание 1.

1) Реализовать свой динамический список (аналог ArrayList, не потокобезопасный)
Требования:
- создать интерфейс IntensiveList и класс ArrayList_NameSurname, имплементирующий данный интерфейс:

	public interface IntensiveList<E> {
		int size();
    		void add(E element);
    		void add(int index, E element);
    		E get(int index);
    		E set(int index, E element);
    		E remove(int index);
    		void clear();//удаляем все элементы, capacity приводим к дефолтному
		void quickSort(Comparator<E> comparator);//реализуем быструю сортировку, дефолт по возрастанию
		boolean isSorted();
		void split(int size);//обрезаем список до указанного размера
	}
- реализовать методы интерфейса.
- код должен быть задокументирован на уровне класса и публичных методов (javadoc).

                                                     РЕАЛИЗАЦИЯ
  [Интерфейс(ТЫК)](/Aston/src/stage2/Home_work1/IntensiveList.java) - задокументированный IntensiveList
  
  [Динамический список(ТЫК)](/Aston/src/stage2/Home_work1/ArrayList_NameSurname.java) - реализация ArrayList
  
  [test(ТЫК)](/Aston/src/stage2/Home_work1/test.java) - пример реализации
