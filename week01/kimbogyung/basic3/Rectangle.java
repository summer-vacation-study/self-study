public class Rectangle {
    int width = 5;
    int height = 8;

    int calculateArea() {
        System.out.println("넓이: " +  width * height);
        return width * height;
    }

    int calculatePerimeter() {
        System.out.println("둘레 길이: " +  2 * (width * height));
        return 2 * (width + height);
    }

    boolean isSquare() {
        boolean square = (width == height);
        System.out.println("정사각형 유뮤: " + square);
        return width == height;
    }
}
