package Foreign;
import India.Father;
public class Daughter extends Father{
	public Daughter()
	{
		Wish="Happy Diwali";         // differant method
	}
	public static void main(String[] args) {
		Father f = new Father();
		f.name="Daughter";
		//f.spectacles="Lenscart";	
		//f.MoneyINR="5 lacs";
	}

}
