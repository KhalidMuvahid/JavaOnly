import java.io.*;

public class WorkWithFileExample {
    public static void main(String[] args) throws IOException {
        File fileDir = new File("temp");
        File file = new File("temp.txt");

        if (!fileDir.isDirectory()){
            fileDir.mkdir();
        }

        if (fileDir.isDirectory()){
            System.out.println("it`s directory");
            file.createNewFile();
        }
        if (file.isFile()){
            System.out.println("file");
        }

        //we can`t work with file just with file (read,write)
        //we use fileReader and fileWriter
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello wold1\n");
        fileWriter.write("Hello wold2\n");
        fileWriter.flush();
//        fileWriter.close();

        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[26];
//        fileReader.read(chars);
//        System.out.println(chars);
//        fileReader.close();


        //for better experience we use BufferReader and BufferWriter
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Hello world3");
        bufferedWriter.newLine();
        bufferedWriter.write("Hello world4\n");
        bufferedWriter.write("Hello world5");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }


        File fileCoco =new File("D:\\JavaOnly\\JavaBasics");
        fileCoco.createNewFile();
        File secFile = new File(fileCoco,"tempero");
        secFile.mkdir();
        File fileee = new File(secFile,"some.xtx");
        File fileeee = new File(secFile,"som");
        fileee.createNewFile();
        fileeee.createNewFile();
        fileee.delete();
        fileeee.delete();
        secFile.delete();






    }
}
