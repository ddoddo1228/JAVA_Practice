import java.util.Scanner;

interface StackInf {
	int length();
	String pop();
	boolean push(String word);
}

class StringStack implements StackInf {
	private int i =0;
	String [] Stack = new String [5];
	public int length() {
		return i+1;
	}
	public String pop() {
		return Stack [--i];
	}
	
	public boolean push(String word) {
		if (i == 5) {
			return false;
		}
		else {
			 Stack[i] = word;
			 i++;
			 return true;
		}
	}
}

public class Java_6 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 StringStack Stack = new StringStack();
		 
		 System.out.print(">> ");
		 for(int a = 0; a < 5; a++) {
				Stack.push(sc.next());
			}
			
			for(int a = 0; a < 5; a++) {
				System.out.print(Stack.pop() + " ");
			}
		 
	 }


}
