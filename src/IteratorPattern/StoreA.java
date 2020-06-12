package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class StoreA {
    private List<String> menu = new ArrayList<>();

    public StoreA(){
        menu.add("1");
        menu.add("2");
        menu.add("3");
        menu.add("4");
        menu.add("5");
    }

    public List getMenu(){
        return menu;
    }
}
