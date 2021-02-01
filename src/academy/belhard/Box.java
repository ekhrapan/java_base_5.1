package academy.belhard;

public class Box {
    // этим полям можно присвоить значение только 1 раз
    private final double height;
    private final double width;
    private final double depth;

    // статическое поле
    public static int boxCreatedCount = 0;

    // количество углов у коробки всегда постоянное
    public static final int CORNERS_COUNT = 8;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;

        boxCreatedCount++;
    }

    // геттеры

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // [Напишите геттер для поля depth]

    // статический метод
    static void printClassInfo() {
        System.out.println("Полное название класса: " + Box.class.getName());
        System.out.println("Экземпляров создано: " + boxCreatedCount);
    }
}
