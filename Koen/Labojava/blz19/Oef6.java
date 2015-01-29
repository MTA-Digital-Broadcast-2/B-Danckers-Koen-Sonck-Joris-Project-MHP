import java.util.*;

public class Oef6
{	
	public static void main(String[] args) {
		int a[] = {12,34,56,78,123,234,99,88};
		int grootste = 0;
		for(int i = 0; i<8;i++){
			if(grootste<a[i]){
				grootste = a[i];
			}
		}
		System.out.println(grootste);
	}
}