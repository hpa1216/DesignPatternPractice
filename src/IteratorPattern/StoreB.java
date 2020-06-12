package IteratorPattern;

import java.util.HashSet;
import java.util.Set;

public class StoreB {
    private Set<String> menu = new HashSet<>();

    public StoreB(){
        menu.add("6");
        menu.add("7");
        menu.add("8");
        menu.add("9");
        menu.add("10");
    }

    public Set getMenu(){
        return menu;
    }
}
