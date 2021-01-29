package com.example.code;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Map<Integer, String>> projectCommentsMap = new HashMap<>();
        
       // Map<ProjectQualifiedName, Map<BigDecimal, Comment>> projectCommentsMap = new HashMap<>();
        
        Map<Integer, List<String>> map = new HashMap<>();
        
        
        List<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        
        
        str.remove("A");
        str.add("ZZ");
        
        
     //  int index = str.indexOf("A");
     //  str.set(index, "ZZ");
       
       System.out.println(str);
        
        map.put(1,str);
        
        List<String> str1 = new ArrayList<>();
        str1.add("A1");
        str1.add("B1");
        str1.add("C1");
        
        map.put(1,str1);
        
        System.out.println(map);
        
        System.out.println(map.get(1).contains("B"));

        
        Map<Integer, String> projectComment1 = new HashMap<>();
        projectComment1.put(1, "CommentObj1");
        projectComment1.put(2, "CommentObj2");
        projectComment1.put(3, "CommentObj3");

        
        Map<Integer, String> projectComment2 = new HashMap<>();
        projectComment2.put(33, "CommentObj33");
        projectComment2.put(23, "CommentObj23");
        projectComment2.put(223, "CommentObj223");

        
        projectCommentsMap.put("ContiForge", projectComment1);
        projectCommentsMap.put("TestDataWrite", projectComment2);

        
        System.out.println(projectCommentsMap.values());

        
        // To get a comment.
        System.out.println(projectCommentsMap.get("TestDataWrite").get(223));
        
        //I want to get value of 223 without refering to "TestDataWrite" and without iterating.
        // ??????
    }
}
