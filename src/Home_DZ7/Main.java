package Home_DZ7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {

        TestArray testArray = new TestArray("Test");
        Class<?> classTest = Class.forName("Home_DZ7.TestArray");

        start(classTest, testArray);

    }

    private static void start(Class<?> classTest, TestArray testArray) throws InvocationTargetException, IllegalAccessException {

        Method[] methods = classTest.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                method.setAccessible(true);
                method.invoke(testArray);
            } else if (method.isAnnotationPresent(Test.class)) {
                method.setAccessible(true);
                method.invoke(testArray);
            } else if (method.isAnnotationPresent(AfterSuite.class)){
                method.setAccessible(true);
                method.invoke(testArray);
            }
        }
    }
}
