import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Date d = new Date();
		Tache t = new Tache("Papo", d);	
		System.out.println(t.toString());
		
	}

}
