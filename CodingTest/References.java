

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 이*** 코테
public class References {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String text = bf.readLine();
		
        // 정규식 패턴을 생성
        Pattern pattern = Pattern.compile("\\[(.*?)\\]");
        Matcher matcher = pattern.matcher(text);

        Map<String, Integer> references = new HashMap<>();
        int count = 1;

        while(matcher.find()) {
        	String matched_text = matcher.group(1);
        	String split_text[] = matched_text.split(",");
        	for(int i=0 ; i<split_text.length ; i++) {        		
        		if(!references.containsKey(split_text[i].trim())) {
            		references.put(split_text[i].trim(), count++);
            	}   
        	}
        	     	
        }
        
        List<Map.Entry<String, Integer>> reference_list = new ArrayList<>(references.entrySet());               
        reference_list.sort(Map.Entry.comparingByValue());
        String output = "";                                      
        // 결과 출력
        for (int i = 0; i < reference_list.size(); i++) {        	
            Map.Entry<String, Integer> entry = reference_list.get(i);
            String key = entry.getKey().trim();
            String value = entry.getValue().toString();
            text = text.replaceAll(key, value);            
            output += "[" + entry.getValue() + "] " + entry.getKey()+"\n";
        }
        
        //숫자 정렬        
        Matcher num_matcher = pattern.matcher(text);
        List<Integer> numbers = new ArrayList<>();        
        while(num_matcher.find()) {
        	String matched_text = num_matcher.group(1);
        	String split_text[] = matched_text.split(",");
        	 
        	System.out.println(split_text.length);
        	for(int i=0 ; i<split_text.length ; i++) {        		
        		int num = Integer.parseInt(split_text[i].trim());        		
        		numbers.add(num);
        	}
        	Collections.sort(numbers);
        	StringBuilder sorted_text = new StringBuilder(" ");
        	
        	for(int i=0 ; i< numbers.size() ; i++) {
        		sorted_text.append(numbers.get(i));
        		if(i < numbers.size() -1) {
        			sorted_text.append(", ");
        		}
        	}        	    
        	sorted_text.append(" ");
        	numbers.clear();
        	text = text.replaceAll(matched_text, sorted_text.toString());
        }
        
        
        System.out.println(text);
        System.out.println(output);
	}	
}
