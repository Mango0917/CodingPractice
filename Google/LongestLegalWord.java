/*
Given a string of characters, find the longest legal word. A generic method to check word legality is given.
*/


public class SegmentString { 
    Map<String, String> memorized = new HashMap<String, String>(); 
    public String segmentString(String input, Set<String> dictonary){ 
        if(dictonary.contains(input))return input; 
        if(memorized.get(input) != null){ 
            return memorized.get(input); 
        } 
        int length = input.length(); 
        for(int i = 1; i < length; i++){ 
            String prefix = input.substring(0,i); 
            if(dictonary.contains(prefix)){ 
                String suffix = input.substring(i, length); 
                String segmentString = segmentString(suffix, dictonary); 
                if(segmentString!=null){ 
                    memorized.put(input, prefix + " " + segmentString); 
                    return prefix+" "+segmentString; 
                } 
            } 
        } 
        memorized.put(input, null); 
        return null; 
    } 
    
    
    public static void main(String[] args){ 
        SegmentString seg = new SegmentString(); 
        Set<String> dictonary = new HashSet<String>(); 
        dictonary.add("hello"); 
        dictonary.add("ate"); 
        dictonary.add("a"); 
        dictonary.add("an"); 
        dictonary.add("ant"); 
        dictonary.add("i"); 
        System.out.println(seg.segmentString("iateanant", dictonary)); 
        
    } 
}