package chapter02;

/*
        Продемонстрировать применение цикла for.
        Присвоить исходному файлу имя "ForTest.java"
*/

public class ForTest {
    public static void main(String[] args) {

        int x;

        for(x = 0; x<10; x = x+1)
            System.out.println("Значение x = " + x);
    }

}
