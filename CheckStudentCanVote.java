
import java.util.Scanner;
class CheckStudentCanVote{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//creating student array for 10 student
	int [] student = new int[10];
	
	//input student age in array
	for(int i=0;i<10;i++){
		student[i] = sc.nextInt();
	}
	// checking voting eligibility
	for(int i=0;i<10;i++){
		if(student[i]>=18){
			System.out.println("Student "+i+" can vote");
		}
		else{
			System.out.println("Student "+i+" cannot vote");
		}
	}
    }
}
