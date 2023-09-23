package jp.co.yahoo.study.zhang3.d0820.collect;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

    public static void main(String[] args) {
    	
    	//System.out.println(String.format("%05d", 12));
    	
        //List<String> lst = new ArrayList<>();

    	// hash无序
        //Map<String,String> map = new HashMap<>();
    	
    	// Tree 将KEY按照从小到大的顺序排列
        //Map<String,String> map = new TreeMap<>();
        
    	// PUT的先后顺序 队列存放
        Map<String,String> map = new LinkedHashMap<>();

        for(int i = 0; i< 100; i++) {
        	if (i%2==0) {
        		map.put(String.format("%05d", i), "xxx"+i);
			}
        }

        for(int i = 0; i< 100; i++) {
        	if (i%2!=0) {
        		map.put(String.format("%05d", i), "xxx"+i);
			}
        }

        // int a = 2;
        // a=3;
        map.put("00000", "yyyy");
        System.out.println(map.size());
        map.remove("00006");
        
        
        
        // lst :  [hello, world, good, morning]
//    	for(String str : lst) {
//			System.out.println(str);
//		}
        
        // map.entrySet() : {00000=xxx0, 00002=xxx2}
        for(Entry<String, String> entry : map.entrySet()) {
        	System.out.println(entry.getKey()+ ":" + entry.getValue());
        }

    }

}
