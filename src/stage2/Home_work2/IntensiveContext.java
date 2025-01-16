package stage2.Home_work2;

import java.io.File;
import java.lang.reflect.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * аналог конктекста спринга
 */
public class IntensiveContext {
    //https://youtu.be/BmBr5diz8WA?t=1913
    private final Map<Class<?>, Object> context = new HashMap<>();
    private final String packageName;

    /**
     * Конструктор для контекста
     * @param packageName Пакет для сканирования классов.
     */
    public IntensiveContext(String packageName) {
        this.packageName = packageName;
        //Проверяем пакет на наличие классов с аннотацией
        IntensiveEvent();
    }

    /**
     * Возвращает экземпляр компонента.
     * @param type Класс компонента.
     * @return Экземпляр компонента.
     */
    public <T> T getObject(Class<T> type) {
        try {
            T instance = type.getDeclaredConstructor().newInstance();
            Field[] fields = type.getDeclaredFields();
            //https://youtu.be/BmBr5diz8WA?t=873
            for (Field field : fields) {
                if (field.getAnnotation(IntensiveComponent.class) != null) {
                    field.setAccessible(true);
                    Class<?> fieldType = field.getType();
                    Object dependency = getObject(fieldType);
                    field.set(instance, dependency);
                }
            }
            // Сохраняем созданный компонент в контекст
            context.put(type, instance);

            return instance;
        } catch (Exception e) {
            throw new RuntimeException("ЭТО ПРОВАЛ!" + type.getName(), e);
        }
    }
    /**
     * Приватный метод, который сканирует папку и находит классы с аннотацией
     * https://youtu.be/BmBr5diz8WA?t=3589 но
     */
    private void IntensiveEvent() {
        try {
            String path = packageName.replace('.', '/');
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            URL resource = classLoader.getResource(path);

            if (resource == null) {
                throw new RuntimeException("Пакет не найден");
            }

            File directory = new File(resource.toURI());
            for (File file : directory.listFiles()) {
                if (file.getName().endsWith(".class")) {
                    String className = packageName + "." + file.getName().replace(".class", "");
                    Class<?> clas = Class.forName(className);

                    if (clas.getAnnotation(IntensiveComponent.class)!=null) {
                        getObject(clas);
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Не удалось отсканировать пакет");
        }
    }

    public static void main(String[] args) {
        IntensiveContext context = new IntensiveContext("stage2.Home_work2");
        SomeClass1 class1 = context.getObject(SomeClass1.class);
        class1.run();
    }
}
