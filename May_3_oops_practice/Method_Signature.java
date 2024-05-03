//Method_SIgnature

/*here the compiler is going to maintain a method table for all the method
in which method signature is stored and the
method signature here is "m1(int)"
the  method name and the data type of the method is needed for the compiler to resolve the
errors
 */


class Test{
    public void m1(int i){
        //pass
        System.out.println(i);
    }
    public void m2(String s){
        //pass
        System.out.println(s);
    }
    /*the error produced for this method is:
    method m2(java.lang.String) is already defined in class Test.
     */
//    public String m2(String k){
//        System.out.println(k);
//        return "k";
//    }
}

public class Method_Signature{
    public static void main(String[] args){
        Test t=new Test();
        t.m1(10);
        t.m2("Kartheek");
        //t.m3();   we will get error as method signature not found;
    }
}
