package chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equal " + b);
        b = true;
        System.out.println("b equal " + b);

        //значение типа boolean может управлять оператором if

        if(b) System.out.println("Этот код выполняется.");

        b = false;
        if(b) System.out.println("Этот код НЕ выполняется.");

        // результат сравнения - значение типа boolean

        System.out.println("10 > 9 равно " + (10 > 9));

    }
}
