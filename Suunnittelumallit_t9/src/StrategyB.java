import java.util.Iterator;
import java.util.List;

public class StrategyB implements ListConverter{
    @Override
    public void listToString(List<String> list) {
        Iterator<String> iterator = list.iterator();
        Integer i = 1;
        while (iterator.hasNext()) {
        	Object o = iterator.next();
            if (i % 2 == 0) {
            	System.out.println(o + "\n");
            }else {
            	System.out.println(o);
            }                
            i++;
        }
    }   
}