public class ValueObjectMain {
    public static void main(String[] args) {
        ValueObject obj = new ValueObject();
        obj.add();
        obj.add();
        obj.add();
        System.out.println("최종 숫자 = " + obj.value);
    }
}
