package V4;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        Iterator iterator = quackers.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            if(count == 0){
                System.out.println("Leader");
                quacker.quack();
                quacker.quack();
                count++;
            }
            quacker.quack();
        }
    }
}
