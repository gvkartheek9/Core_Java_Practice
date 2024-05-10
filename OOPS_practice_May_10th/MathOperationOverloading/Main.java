package OopsConceptBankApplication.MathOperationOverloading;

public class Main {
    public static void main(String[] args) {
        MathOperations intOp=new MathOperations();
        MathOperations floatOp=new MathOperations();
        MathOperations doubleOp=new MathOperations();

        System.out.println("The addition of two integers is: "+intOp.addition(2,3));
        System.out.println("The addition of two float numbers is: "+floatOp.addition(3.0f,4.0f));
        System.out.println("The addition of two double numbers is : "+doubleOp.addition(3.0,7.0));
        //subtraction
        System.out.println("-----------------------------------------");
        System.out.println("The subtraction of two integers is: "+intOp.subtraction(2,3));
        System.out.println("The subtraction of two float numbers is: "+floatOp.subtraction(3.0f,4.0f));
        System.out.println("The subtraction of two double numbers is : "+doubleOp.subtraction(3.0,7.0));

    }
}
