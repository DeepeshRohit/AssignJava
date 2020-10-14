package Collection1;
import java.util.*;
public class GeneralTreeSet<T> {
    TreeSet<T> tree =  new TreeSet<T>();
    public void addObject(T object) {
        tree.add(object);
    }
    public TreeSet<T> getObject(){
        return this.tree;
    }
}