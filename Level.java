public enum Level{

	HIGH,
	MEDIUM,
	LOW
}

class EnumTest {
	
	static Level level1 = Level.LOW;
	static Level level2 = Level.MEDIUM;
	static Level level3 = Level.HIGH;


	public static void main(String...args)
	{
	
		Level level = level1;

		switch (level) {
		    case HIGH   : 
				  System.out.println("Level is High");
				  break;
    		    case MEDIUM :  
				  System.out.println("Level is High");
				  break;
    		    case LOW    :  
				 System.out.println("Level is High"); 
				  break;
  		}

	}
}
