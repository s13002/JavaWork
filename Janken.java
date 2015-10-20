import java.util.Scanner;
import java.util.Random;

public class Janken{
    
    static int result(int player, int cpu){
	int result = 0;

	switch(player){
	    case 0:
		if(cpu == 0) result = 0;
		if(cpu == 1) result = 1;
		if(cpu == 2) result = 2;
		break;
	    case 1:
		if(cpu == 0) result = 2;
		if(cpu == 1) result = 0;
		if(cpu == 2) result = 1;
		break;
	    case 2:
		if(cpu == 0) result = 1;
		if(cpu == 1) result = 2;
		if(cpu == 2) result = 0;
		break;
	}
	return result;
    }

    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	System.out.println("自分:");
	int player = scanner.nextInt();
	System.out.println("相手:");
	int cpu = random.nextInt(3);
	System.out.println(cpu);
	
	if(result(player, cpu) == 2){
	    System.out.println("勝");
	}else if(result(player, cpu) == 1){
	    System.out.println("負");
	}else if(result(player, cpu) == 0){
	    System.out.println("あいこ");
	}
	
    }

}
