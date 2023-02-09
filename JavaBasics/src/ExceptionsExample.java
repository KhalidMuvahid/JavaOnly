import com.sun.tools.javac.Main;

import java.io.File;
import java.io.IOException;

//Exceptions can be checked and unchecked
//ex:             IOException RuntimeException
public class ExceptionsExample {
    public static void main(String[] args) {
        //Throwable
        //Exception
        //Error

//        new ExceptionsExample().showMethod();
        try {
            System.out.println(new ExceptionsExample().getMethod());
        }catch (IOException e){

        }
    }

    void  showMethod(){
        try{
            Object ob= null;
            ob.hashCode();
            //throw new Exception();
        }catch (NullPointerException e){
            System.out.println("Dude you are using null object ");
            e.printStackTrace();
        }finally {
            System.out.println("it`s will be call in any case always");
        }
    }


    String  getMethod() throws IOException{
        //i have to check it or throw to the top of method
        //but it any case i have to check it where was thrown
        //throw new IOException();
        try{
            Object ob= null;
            ob.hashCode();
            return "try";
            //throw new Exception();
        }catch (NullPointerException e){
            //e.printStackTrace();
            return "catch";
        }finally {
            //System.exit(0); exit/stop
            return "finally";
        }
    }

    void method3(){
        File file = new File("");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
