import java.util.ArrayList; 
public class App { 
    public static void main(String[] args) throws Exception {
        ArrayList<String> out = new ArrayList<>(); 
        for(int i = 1; i <= 100; i++){ 
            Boolean isBuzzy = false; 
            if(i % 5 == 0 && i % 3 == 0){out.add("FizzBuzz");isBuzzy=true;} 
            if(i % 5 == 0 && isBuzzy != true){out.add("Buzz");isBuzzy=true;} 
            if(i % 3 == 0 && isBuzzy != true){out.add("Fizz");isBuzzy=true;}
            if(isBuzzy==false){out.add(Integer.toString(i));}
            System.out.println(out.get(i-1)); 
        } 
    } 
}