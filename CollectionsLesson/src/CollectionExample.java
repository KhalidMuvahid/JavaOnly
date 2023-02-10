import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //Collections;
        //Arrays arrays = new Arrays();

        //--------------------Collection------------------
        System.out.println("Collection");
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.remove(1);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        for (Object v : collection){
            System.out.print(v+" ");
        }
        System.out.println("\n");

        //--------------------List------------------
        System.out.println("List");
        List listCollection = new ArrayList();
        listCollection.add(1);
        listCollection.add(2);
        listCollection.add(3);
        listCollection.set(2,0);
        for (Object cl : listCollection){
            System.out.print(cl+" ");
        }
        System.out.println("\n"+listCollection.get(2)+"\n");

        //--------------------Queue------------------
        System.out.println("Queue");
        Queue queueCollection = new PriorityQueue();
        queueCollection.add(1);
        queueCollection.add(2);
        queueCollection.offer(3);
        queueCollection.offer(4);
        queueCollection.offer(5);
        Iterator iterator1 = queueCollection.iterator();
        while (iterator1.hasNext()){
            //queue.peek() ->take elements but not remove it
            System.out.print(queueCollection.poll()+" ");
        }
        System.out.println("\n"+queueCollection.size()+"\n");

        //--------------------Set------------------
        //unique object
        System.out.println("Set");
        Set setCollection = new HashSet();
        setCollection.add(1);
        setCollection.add(2);
        setCollection.add(3);
        setCollection.add(1);
        for (Object cs:setCollection){
            System.out.print(cs+" ");
        }

        //Map is collection but not inherited from collection interface
        Map map = new HashMap();



    }


}
