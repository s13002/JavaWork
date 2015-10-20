import java.io.*;
import java.util.Scanner;

public class Q0302 {
    
    static int x(int a, int b, int c){
	int Max = 0;
	if(a > b){
	    Max = a;
	}else{
	    Max = b;
	}

	if(c > Max){
	    Max = c;
	}
	return Max;
    }

    public static void main(String[] args)throws IOException {
 	Scanner scanner = new Scanner(System.in);

	System.out.println("整数を入力(1)");
	int a = scanner.nextInt();

	System.out.println("整数を入力(2)");
	int b = scanner.nextInt();

	System.out.println("整数を入力(3)");
	int c = scanner.nextInt();
   
	System.out.println("最大の値は" + x(a,b,c));
    
    };

}
