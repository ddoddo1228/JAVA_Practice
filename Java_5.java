import java.util.Scanner;

public class Java_5 {

	public static void main(String[] args) {
		System.out.println("한 줄의 영문을 입력하세요.: ");
		 Scanner sc = new Scanner(System.in);
		 String input=sc.nextLine();		 
		 char[] array = input.toCharArray();
		 
		 for(int i=0; i<array.length; ++i){
	            if(97<=array[i] && array[i]<=122){
	                array[i]=(char)(array[i]-32);
	                }
	            }
	            System.out.print(array);
	            sc.close();
	}
	
}