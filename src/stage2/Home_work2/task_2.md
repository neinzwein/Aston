Задание 2.1. Подготовка к выполнению задания 4.
    Cмотрим Борисова по Spring:
    - https://www.youtube.com/watch?v=BmBr5diz8WA
    - https://www.youtube.com/watch?v=cou_qomYLNU&t=497s
    - https://www.youtube.com/watch?v=yy43NOreJG4
    - https://www.youtube.com/watch?v=nwM7A4TwU3M

Задание 2.2. Мини-Spring :)
    Общие требования:
    - обязательное наличие javadoc.

    Реализовать класс IntensiveContext - "аналог" Spring контекста.

   - коструктор данного класса должен принимать пакет для поиска классов,
     аннотированных @IntensiveComponent (предварительно создать 
     аннотацию @IntensiveComponent).

   - класс должен иметь единственный публичный метод:
	public <T> T getObject(Class<T> type);

   - после создания класса IntensiveContext мы должны иметь возможность
     с помощью метода getObject получить любой класс, имеющий аннотацию 
     @IntensiveComponent, и находящийся в переданном пакете.
   - если запрашиваем интерфейс - получаем реализацию, если нет реализации или
     интерфейс имеет больше одной реализации - эксепшен.

   - классы, аннотированные @IntensiveComponent, не должны создаваться
     и добавляться в IntensiveContext вместе с его созданием, а только
     при вызове метода getObject.
   - если класс аннотированнй @IntensiveComponent имеет поля, которые
     также являются классами, аннотированными данной аннотацией, они должны быть
     также проинициализированны.

   - логику поиска и создания классов выносить по специализированным классам,
     например SearchService, InjectionService, DependencyFactory и т.п., 
     классы должны иметь интерфейсы и реализацию (все по SOLID).

   - в методе main класса продемострировать работу класса IntensiveContext,
     например:
	IntensiveContext context = new IntensiveContext("пакет");
	SomeClass1 class1 = context.getObject(SomeClass1.class);
	class1.run(); // должен, например, вывести сообщение в консоль


