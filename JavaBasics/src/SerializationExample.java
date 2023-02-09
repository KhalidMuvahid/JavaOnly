import java.io.*;

public class SerializationExample {
    public static void main(String[] args) throws Exception {
        Player player =new Player();
        player.liveLevel =33;
        Sword sword = new Sword();
        Shield shield = new Shield();
        shield.level =10;
        sword.level = 5;
        player.sword =sword;
        player.shield = shield;


        FileOutputStream fileOutputStream = new FileOutputStream("tempFile");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(player);
        objectOutputStream.close();

        FileInputStream fileInputStream  = new FileInputStream("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Player p = (Player)objectInputStream.readObject();
        System.out.println(p.liveLevel);
        System.out.println(p.sword.level);
        System.out.println(p.shield);
    }
}

class Player implements Serializable{
    int liveLevel;
    Sword sword;
    transient Shield shield;
}

class Sword implements Serializable{
    int level;
}

class Shield{
    int level;
}
