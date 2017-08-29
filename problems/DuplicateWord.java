package problems;

import java.util.*;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {


    public static void main(String[] args) {


        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
       String [] splitWords = st.split(" ");

       Map<String, Integer> wordMap = new HashMap<>();

       for(String word : splitWords){
           Integer count = wordMap.get(word);
           if(count == null){
               count = 0;
           }
           wordMap.put(word, count+1);
       }

       for(Map.Entry<String, Integer> s : wordMap.entrySet()){
           System.out.println("'" + s.getKey()+ "': "+ s.getValue()+ " time(s)");
       }
    }
}

