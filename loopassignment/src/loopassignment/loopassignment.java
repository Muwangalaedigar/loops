package loopassignment;
import java.util.Scanner;
public class loopassignment {

	public static void main(String[] args) {
		//telling the grade obtained in OOP.
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your marks scored:");
		int marks_scored = scanner.nextInt();
		int grade = 1;
		int[] marks = {5,4,3,2,1};
		for(int y= 0;y<marks.length;y++) {
			if(marks_scored>=90) {
				grade*=marks[0];
				System.out.println("the grade in oop is:"+grade);
				break;
			}else if(marks_scored>=80) {
				grade*=marks[1];
				System.out.println("the grade in oop is:"+grade);
				break;
			}else if(marks_scored>=70) {
				grade*=marks[2];
				System.out.println("the grade in oop is:"+grade);
				break;
			}else if(marks_scored>=60) {
				grade*=marks[3];
				System.out.println("the grade in oop is:"+grade);
				break;
			}else if(marks_scored>=50) {
				grade*=marks[4];
				System.out.println("the grade in oop is:"+grade);
				break;
			}else {
				System.out.println("you have a retake");
				break;
			}
			
			
		}
		
		
		
		
		
		
	}

}
