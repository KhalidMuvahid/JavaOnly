import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GarbageCollector {
    public static void main(String[] args) {
        Runtime runtime  = Runtime.getRuntime();
        System.out.println("total memory before "+runtime.maxMemory());
        System.out.println("free memory before "+runtime.freeMemory());
        //List<Date> list = new ArrayList<>();
        for (int i=0;i<1_000_000_0;i++){
            Date date = new Date();
            date =null;
            //list.add(date);
        }
        System.out.println("total memory after "+runtime.maxMemory());
        System.out.println("free memory after "+runtime.freeMemory());
        //calling garbage collector it`s can free space but not
        //it`s not guaranteed GC decide by itself
        System.gc();
        System.out.println("total memory after gc "+runtime.maxMemory());
        System.out.println("free memory after gc "+runtime.freeMemory());
    }

    /*
    //    Deprecated before we can use it before deleting gc trash
    //    but it`s not guaranteed it`s randomly
    //    before starting gc it call finalize
    @Override
    public void finalize(){

    }*/


}
