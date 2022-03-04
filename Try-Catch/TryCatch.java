public class TryCatch{  
  
    public static void main(String[] args) { 
 
        try  
        {  
        	int data=50/0; //might throw exception   
        }  
            //handling the exception 
 
        catch(ArithmeticException e)  
        {  
            System.out.println("Arithematic Exception");  
        }  

        System.out.println("Run the code again with proper numeric values");  
    }  
      
}  
