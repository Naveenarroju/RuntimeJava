 class Movie		//3.this is the super class 
{
	public void holly(){				//super class method 1
	System.out.print("Enter the Hollywood movie name:");	
	}
	
	public void bolly(){				//super class method 2
	System.out.print("Enter the Bollywood movie name:");
	}
}

class Hollywood extends Movie			//5.subclass of class Movie 
{
	public void holly(){				//here the holly method in Hollywood subclass is "overridding"	holly method in superclass Movie
	System.out.println("	Wonder Woman");
	}
}

 class Bollywood extends Movie		//7.subclass of class Movie
{
	public void bolly(){			//here the bolly method in Bollywood subclass is "overridding" bolly method in superclass Movie
	System.out.println("	Raabta");
	}
}
public class Runtimepoly  //9.class which has main method 
{
	static {			//1.static block which need not be called 
	System.out.println("\t\t\t========================Hollywood and Bollywood Movie names=====================\n"); 
	}
	public static void main(String[] args) 
	{
		Movie M = new Movie(); //2.Movie class Object is stored in reference variable of type Movie class M
		
		Movie m1 = new Hollywood(); //4.Hollywood class Object is stored in reference variable of type Movie class m1
		
		Movie m2 = new Bollywood();//6.Bollywood class Object is stored in reference variable of type Movie class m1
		
		M.holly(); m1.holly(); //8.As the two classs have the same method compiler can't decide which method to call while compile time 

		M.bolly(); m2.bolly(); //10.so JVM decides which method to call at runtime hence it is called runtime or dynamic polymorphism.
	}
}	
