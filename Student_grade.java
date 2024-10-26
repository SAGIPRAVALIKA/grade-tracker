package student_grade_tracker;

import java.util.Scanner;
public class Student_grade {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of subjects");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the grades of students");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		float sum=0;
		//average
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		float average=sum/n;
		System.out.println("average of the grade is :"+(average));
		//maximum
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("highest grade is :"+max);
		//minimum
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min = a[i];
			}
		}
		System.out.println("lowest grade is :"+min);
	}

}
