public class AssertionsExample {
    public static void main(String[] args) {
        new AssertionsExample().meth(-5);
    }

    void meth(int a){
        //throw error
        //it`s `only for coders
        //we can see it if in vm options we set enable assertion(-ea)
        assert (a<0);
    }
}
