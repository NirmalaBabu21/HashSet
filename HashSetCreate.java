import java.util.HashSet;
import java.util.Iterator;
public class HashSetCreate {
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(12);
        set.add(78);
        set.add(78);
        set.add(90);
        set.add(123);
        set.add(45);
        System.out.println(set);
        if(set.contains(90))
        System.out.println("90 is presnt");

        set.remove(90);
        if(!set.contains(90))
        System.out.println("90 is not presnt");

        Iterator it=set.iterator();
        while(it.hasNext())
        System.out.println(it.next());

        
    }
}
