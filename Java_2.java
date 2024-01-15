import java.util.Scanner;

public class Java_2 {
	public static void main(String[] arg) {
		
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[10];
	
		System.out.println("정수를 10개 입력하세요:");
		for (int i=0; i<10; i++) {
			intArray[i] = scan.nextInt();
		}
		
		for (int i=0; i<intArray.length; i++) {
			int min = intArray[i];
			for (int j=0; j<intArray.length-i-1; j++) {
				if(intArray[j]>intArray[j+1]){
					min = intArray[j+1];
					intArray[j+1] = intArray[j];
					intArray[j] = min;
					
				}
				
			}
			
		}
		
		for (int i=0;i<10;i++) 
			System.out.println(intArray[i]+"");
			
			scan.close();
		
	}
	
}
