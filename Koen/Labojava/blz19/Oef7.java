import java.util.*;

public class Oef7
{	
	public static void main(String[] args) {
		int a[] = {12,34,56,78,123,234,99,88};
		int b[] = new int[8];
		int grootste = 0;
		int teller = 0;
		for(int c = 0; c < b.length;c++){
			for(int i = 0; i<8;i++){
				if(grootste<a[i]){
					grootste = a[i];
					teller=i;
				}
			}
			b[c] = grootste;
			a[teller] = 0;
			grootste = 0;
			teller = 0;
			System.out.println(b[c]);
		}
	}
}