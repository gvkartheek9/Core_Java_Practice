import java.util.Scanner;

class Total_Number_Of_Notes_In_Given_Amount{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int notes[]={500,200,100,50,10,1};
        System.out.println("Enter the amount");
        int amount=sc.nextInt();
        for(int i=0;i<notes.length;i++){
            if(amount>notes[i]){
                int noOfNotes=amount/notes[i];
                amount-=notes[i]*noOfNotes;
                System.out.println(notes[i]+" : "+noOfNotes);
            }
        }
    }
}