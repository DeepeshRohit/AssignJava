package Collection1;
import java.util.*;

public class GeneralList<T> {
    List<T> list = new ArrayList<T>();
    public void addObjects(T object) {
        list.add(object);
    }
    public List<T> getObject(){
        return this.list;
    }
}