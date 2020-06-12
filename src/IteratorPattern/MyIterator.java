package IteratorPattern;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/*
 * 設計一個可適用不同傳入參數的迭代器
 */
public class MyIterator {
    public static void foreach(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void foreach(Map<String, String> map) {
        for (Object key : map.keySet()) {
            System.out.println("Key : " + key.toString() + " Value : " + map.get(key));
        }
    }
}
