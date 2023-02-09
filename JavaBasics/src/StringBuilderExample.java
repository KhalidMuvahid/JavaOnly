public class StringBuilderExample {
    public static void main(String[] args) {
        String s =new String("abc");
        String s2 = new String("def");
        System.out.println(s);
        System.out.println(s2);

        StringBuilder  stb = new StringBuilder("abc");

        //synchrony  used more for multiple threading
        StringBuffer stbf = new StringBuffer();

        stb.append("def");
        stb.insert(0,"22");
        stb.delete(0,1);
        stb.deleteCharAt(3);
        System.out.println(stb);
        stb.reverse();
        System.out.println(stb);
        stb.replace(0,3,"cha");
        System.out.println(stb);
        stb.deleteCharAt(stb.lastIndexOf(stb.toString()));
        System.out.println(stb);
    }

    
}


