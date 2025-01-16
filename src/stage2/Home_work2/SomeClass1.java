package stage2.Home_work2;

@IntensiveComponent
public class SomeClass1 {
/**
 *основной класс для примера с аннотациями и работы с ними
 * */
    @IntensiveComponent
    private Dependency dependency;

    public void run() {
        System.out.println("SomeClass1");
        dependency.DependencyMethod();
    }
}