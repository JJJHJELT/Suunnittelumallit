import java.util.Iterator;
import java.util.List;

public class StrategyA implements ListConverter {
    @Override
    public void listToString(List<String> list) {
        Iterator<String> iterator = list.iterator();      
        while(iterator.hasNext()) {
        	Object o = iterator.next();       
        	System.out.println(o + "\n");
        }
    }    
}