//Method Overloading

/*Having same name and different datatypes
IN method overloading method resolution is
always take care by compiler based on reference type.

So overloading is a.k.a Compiler time polymorphism,Static Polymorphism,Early Binding.

 */

//example 4 for reference type or runtime object type

class Animal{

}
class Lion extends Animal{

}


class MethodOverloading{

    //example 4 for the reference type preference or run time object preference
    public void example4(Animal obj){
        System.out.println("Animal reference");
    }

    public void example4(Lion obj){
        System.out.println("Lion reference");
    }
    //

    public void example3(int i){
        System.out.println("example 3");
    }
    public void example3(int...i){
        System.out.println("Example 3 int var method");
    }

    public void example2(Object o){
        System.out.println("Object method");
    }
    public void example2(String S){
        System.out.println("String method");
    }

    public void m1(){
        System.out.println("no args");
    }
    public void m1(int i){
        System.out.println("int args");
    }
    public void m1(float f){
        System.out.println("Float args");
    }

    public static void main(String[] args){
        MethodOverloading m=new MethodOverloading();
        m.m1();//no args method
        m.m1(10);//int args
        m.m1(10.5f);//float args


        m.example2(null);
        /*here example 2 get null value which is both object and string method can accept that
        so the Sting is the child of object that's why string method will be executed.

        if both of them aren't related then compile time error occurs as the method call is
        ambiguous
         */

        //example 3
        m.example3(10);//general method will be given more preference than the normal method.


        //example 4
         Animal obj_a=new Animal();
         m.example4(obj_a);    //Animal Reference
         Lion obj_l=new Lion();
         m.example4(obj_l);    //Lion reference
         Animal obj_r = new Lion();
         m.example4(obj_r);     //Animal Reference

        /* in the line 81 and 82 even though we were given the Animal
        as compile time reference and Lion as Run time object overloading only takes
        what compile time reference . so it is called compile time polymorphism
         */
    }
}