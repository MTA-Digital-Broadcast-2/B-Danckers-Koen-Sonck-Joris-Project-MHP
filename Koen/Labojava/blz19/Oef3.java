import java.util.*;

public class Oef3
{	
	public static void main(String[] args) {
	double tussenHaken = 1;
	int a = 0;
		for(double i = 3; i<40000; i+=4){
			tussenHaken = tussenHaken - (1/i) + (1/(i+2));
		}
		System.out.println((4*tussenHaken));
	}
}