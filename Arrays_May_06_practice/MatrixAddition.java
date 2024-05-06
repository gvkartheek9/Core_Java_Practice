package Arrays_May_06_practice;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in a matrix");
        int rows=sc.nextInt();
        System.out.println("Enter the number of column in a matrix");
        int columns=sc.nextInt();
        int[][] matrix1=new int[rows][columns];
        int[][] matrix2=new int[rows][columns];
        System.out.println("Enter the elements of the matrix1");
        getInputMatrix(sc,matrix1,rows,columns);
        System.out.println("Enter the elements of the matrix2");
        getInputMatrix(sc,matrix2,rows,columns);
        System.out.println("The matrix1 elements are: ");
        display(matrix1);
        System.out.println("the matrix2 elements are: ");
        display(matrix2);
        int [][] sumMatrix=addMatrix(matrix1,matrix2,rows,columns);
        System.out.println("The elements after the sum of matrices");
        display(sumMatrix);

    }
    public static void getInputMatrix(Scanner sc,int[][]matrix,int rows,int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Enter element for the "+(i+1)+"row and "+(j+1)+" column");
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    public static int[][]  addMatrix(int[][] matrix1,int[][] matrix2,int rows,int columns){
        int[][] sum=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return sum;
    }
    public static void display(int[][] matrix){
        for(int[] row:matrix){
            for(int ele:row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
