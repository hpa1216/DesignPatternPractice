package IteratorPattern;

import java.util.HashMap;
import java.util.Map;

public class StoreC {
    private Map<String, String> menu = new HashMap<>();

    public StoreC(){
        menu.put("A", "11");
        menu.put("B", "12");
        menu.put("C", "13");
        menu.put("D", "14");
        menu.put("E", "15");
    }

    public Map getMenu(){
        return menu;
    }
}
