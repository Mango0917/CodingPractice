/*
"	If you had a list of countries and their population, create a random generator that picks a country but takes into consideration the population. So a country with a higher population has a higher chance of being chosen.  
*/


import java.util.*;

public class HelloWorld{

    public static void getRandom(HashMap<String, Integer> map){
        Random rand = new Random();
        int number = rand.nextInt(99) + 1;
        double totalPopulation = 0;
        HashMap<String, Integer> popList = new HashMap<String, Integer>();
        for(Map.Entry<String, Integer> m: map.entrySet()){
            totalPopulation+=m.getValue();
            
        }
        for(Map.Entry<String, Integer> m: map.entrySet()){
            if((m.getValue()*100/totalPopulation)%1<0.5)
                popList.put(m.getKey(),(int)Math.floor(m.getValue()*100/totalPopulation));
            if((m.getValue()*100/totalPopulation)%1>=0.5)
                popList.put(m.getKey(),(int)Math.ceil(m.getValue()*100/totalPopulation));
            
            //popList.put(m.getKey(),(int)Math.ceil(m.getValue()*100/totalPopulation));
        }
        
        int tot=0;
        for(Map.Entry<String, Integer> m: popList.entrySet()){
            if(number>tot && number <= tot+m.getValue()){
                System.out.println(number+","+m.getKey()+","+m.getValue());
                
            }
            
            System.out.println("Range for : "+m.getKey()+" = "+(tot+1)+" to "+(tot+m.getValue()));
            tot+=m.getValue();
        }
        
        
        
    }

     public static void main(String []args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("India",500000);
        map.put("USA",340000);
        map.put("Tunisia",102040);
        map.put("Namibia",40000);
        map.put("China",670000);
        map.put("Japan",13000);
        map.put("Canada",410000);
        map.put("Trinidad And Tobago",140000);
        HelloWorld.getRandom(map);
     }
}