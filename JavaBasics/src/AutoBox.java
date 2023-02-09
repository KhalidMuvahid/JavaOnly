import java.util.ArrayList;
import java.util.List;

public class AutoBox {
    public static void main(String[] args) {
        {
            int i;
            byte b;
            short sh;
            long l;
            double d;
            float f;
            boolean bl;
            char ch;

            //wrapping
            Byte bt;
            Short sho;
            Integer in;
            Long lo;
            Boolean bool;
            Double dob;
            Float flo;
            Character cha;

            List<Integer> list = new ArrayList<>();

            Integer integer = Integer.getInteger("5");
            Integer integer0 = 5;
            int integer1 = Integer.parseInt("5");
            Integer integer2 = Integer.valueOf("5");
            short s = integer2.shortValue();
        }
    }
}
