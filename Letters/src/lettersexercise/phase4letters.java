package lettersexercise;
import java.util.ArrayList;
import java.util.Arrays;

public class phase4letters {

    public static void main(String[] args) throws Exception 
    {
		ArrayList<Character> firstName  = new ArrayList<>(Arrays.asList('j','o','y','c','e'));
		ArrayList<Character> lastName  = new ArrayList<>(Arrays.asList('p','e','r','o','n','n','e'));

		firstName.addAll(lastName);   
        
        System.out.println(firstName);
    }
}

