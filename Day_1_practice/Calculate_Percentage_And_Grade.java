import java.util.Scanner;

class Calculate_Percentage_And_Grade{
    public static double caluculatePercentage(int[] marks){
        int sum=0;
        double result=0.0;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        result=(sum/500.0)*100;
        System.out.println(sum);
        return result;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int []marks=new int[5];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        double percentage= caluculatePercentage(marks);
//        System.out.println(percantage);

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}