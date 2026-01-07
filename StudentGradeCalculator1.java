import java.util.Scanner;

public class StudentGradeCalculator1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter no of subject : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter grades of student in each subject : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("The grades are : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }

        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
        }
        System.out.println("\nTotal mark : "+total);
        double average=total/n;
        System.out.println("Average grade : "+average);
        s.close();
        if(average>=90){
            System.out.println("Grade:O");
        }
        else if(average>=80 && average<90){
            System.out.println("Grade:A+");
        }
        else if(average>=70 && average<80){
            System.out.println("Grade:A");
        }
        else if(average>=60 && average<70){
            System.out.println("Grade:B+");
        }
        else if(average>=50 && average<60){
            System.out.println("Grade:B");
        }
        else{
            System.out.println("Grade:U");
        }
        s.close();
        
    }
}
