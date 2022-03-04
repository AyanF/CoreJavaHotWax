import java.io.InputStreamReader;
import java.io.BufferedReader;

//version 1.7 

public class TryResource{  
  
    public static void main(String[] args) { 
 
        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in)))  
        {  
		String stringOne = br.readLine();
        	System.out.println(stringOne);
        }  
            
 
        catch(Exception e)  
        {  
            System.out.println(" Exception");  
        }  

	
        //finally not needed
    }  
      
}  


