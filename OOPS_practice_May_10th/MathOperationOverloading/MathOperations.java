package OopsConceptBankApplication.MathOperationOverloading;

public class MathOperations {
     int num1,num2;
     float fnum1,fnum2;
     double dnum1,dnum2;

//     MathOperations(int num1,int num2){
//         this.num1=num1;
//         this.num2=num2;
//     }
//    MathOperations(float num1,float num2){
//        this.fnum1=num1;
//        this.fnum2=num2;
//    }
//    MathOperations(double num1,double num2){
//        this.dnum1=num1;
//        this.dnum2=num2;
//    }

    public int addition(int num1,int num2){
         return num1+num2;
    }
    public float addition(float fnum1,float fnum2){
        return fnum1+fnum2;
    }

    public double addition(double dnum1,double dnum2){
         return dnum1+dnum2;
    }

    public int subtraction(int num1,int num2){
        return num1-num2;
    }
    public float subtraction(float fnum1,float fnum2){
        return fnum1-fnum2;
    }

    public double subtraction(double dnum1,double dnum2){
        return dnum1-dnum2;
    }

    public int multiplication(int num1,int num2){
        return num1*num2;
    }
    public float multiplication(float fnum1,float fnum2){
        return fnum1*fnum2;
    }

    public double multiplication(double dnum1,double dnum2){
        return dnum1*dnum2;
    }

}
