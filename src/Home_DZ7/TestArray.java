package Home_DZ7;

public class TestArray {
    String nameTest;

    public TestArray(String nameTest) {
        this.nameTest = nameTest;
    }

@BeforeSuite(PRIORITY = 1)
    public void testFunctional() {
        System.out.println("Идет функциональное тестирование BeforeSuite");
    }

@Test(PRIORITY = 2)
    public void testCapasity1() {
        System.out.println("Проводится нагрузочное тестирование Test1");
    }

    @Test(PRIORITY = 3)
    public void testCapasity2() {
        System.out.println("Проводится нагрузочное тестирование Test2");
    }

    @Test(PRIORITY = 4)
    public void testCapasity3() {
        System.out.println("Проводится нагрузочное тестирование Test3");
    }

    @Test(PRIORITY = 5)
    public void testCapasity4() {
        System.out.println("Проводится нагрузочное тестирование Test4");
    }

    @Test(PRIORITY = 6)
    public void testCapasity5() {
        System.out.println("Проводится нагрузочное тестирование Test5");
    }

    @Test(PRIORITY = 7)
    public void testCapasity6() {
        System.out.println("Проводится нагрузочное тестирование Test6");
    }

    @Test(PRIORITY = 8)
    public void testCapasity7() {
        System.out.println("Проводится нагрузочное тестирование Test7");
    }

    @Test(PRIORITY = 9)
    public void testCapasity8() {
        System.out.println("Проводится нагрузочное тестирование Test8");
    }

    @AfterSuite(PRIORITY = 10)
    public void testIntegration() {
        System.out.println("Проводится интеграционное тестирование AfterSuite");
    }

}
