public class Main{
	public static void main(String[] args) {
	Werknemer werknemer1 = new Werknemer("Koen", "Danckers", 1, 15);
	Werknemer werknemer2 = new Werknemer("Bert", "Van Hove", 2, 13);
	Werknemer werknemer3 = new Werknemer("Kevin", "Jansen", 3, 18);
	Werknemer werknemer4 = new Werknemer("Joris", "Sonck", 4, 12);
	
	PartTimeWerknemer partTimeWerknemer1 = new PartTimeWerknemer("Jan", "Jansens", 4, 12, 15);
	PartTimeWerknemer partTimeWerknemer2 = new PartTimeWerknemer("Peter", "Peeters", 4, 12, 12);
	
	StudentWerknemer studentWerknemer1= new StudentWerknemer("Mark", "Markens", 4, 12, 12);
	
	System.out.println(studentWerknemer1.getRSZ());
	}
}