import java.util.ArrayList;
import java.util.List;

public class Converter {
    
    private List<String> list; 
    private ListConverter listConverter;
    
    public Converter(ListConverter listConverter) { 
        this.list = new ArrayList<String>(); 
        this.listConverter = listConverter; 
    }
    
    public void addToList(String item) { 
        list.add(item); 
    }    
    
    public void printList() {         
        listConverter.listToString(list);       
    }
    
    public void setStrategy(ListConverter listConverter) { 
        this.listConverter = listConverter; 
    }
}