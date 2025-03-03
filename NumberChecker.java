import java.util.Scanner;
class NumberChecker{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//input 5 numbers in numbers array
	int [] numbers = new int[5];
	for(int i=0;i<5;i++){
		numbers[i] = sc.nextInt();
	}
	//check if number is positive or negative or zero
	for(int i=0;i<5;i++){
		if(numbers[i]>0){
			if(numbers[i]%2==0){
				System.out.println("Number "+numbers[i]+" is positive and even");
			}
			else{
				System.out.println("Number "+numbers[i]+" is positive and odd");
			}
		}
		else if(numbers[i] ==0){
			System.out.println("Number "+numbers[i]+" is zero");
		}
		else{
			System.out.println("Number "+numbers[i]+" is negative");
		}
	}
	// check first and last number comparison
	if(numbers[0] == numbers[4]){
		System.out.println("Both Are Equal");
	}
	else if(numbers[0] >numbers[4]){
		System.out.println("First number is greater than last number");
	}
	else{
		System.out.println("First number is smaller than last number");
	}
    }
}
