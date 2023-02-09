public class OverloadingExample {
    public static void main(String[] args) {
        OverloadingExample over = new OverloadingExample();
        byte b = 5;
        over.method(b);
    }

    //first
    // integer ->
    // fractional(double|float) ->
    // wrapper ->
    // Object
    //array
    void method(int i){
        System.out.println("int");
    }
    void method(long i){
        System.out.println("long");
    }
    void method(short i){
        System.out.println("short");
    }
    void method(Integer i){
        System.out.println("Integer");
    }
    void method(byte i){
        System.out.println("byte");
    }

    void method(byte...i){
        System.out.println("byte...");
    }

    void method(Object i){
        System.out.println("Object");
    }
}
