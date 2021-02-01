package academy.belhard;

public class Main {

    public static void main(String[] args) {
        // [создайте 3 объекта типа Box]
        // [каждый раз после создания нового объекта делайте вызов printClassInfo()]
    }

    // метод с аргументами переменной длины
    public void printAll(String... all) {
        for (String item : all) {
            System.out.println(item);
        }
    }
}
