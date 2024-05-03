//Method Overriding


//RULES IN OVERRIDING


//IN Method over-riding co-variant return types can be there  but only for object types
// but not primitive datatypes,  where
//example  if overridden method return type is object
//the overriding method can have the child class return type like String.


//important rule in overriding : We cant reduce the Scope of method in overriding.
//example public -> protected

//Rule: If child class throws only checked exception Compulsory parent method should
//throw same or its parent exception.

//Rule the static methods cannot be overidden if we override static to static itself
//then it becomes runtime polymorphism and method resolution takes place by compiler.

//Rule In method overriding varargs methods can be overidden by vararg methods only.


class Parent{
    public void assests(){
        System.out.println("Gold ,Silver etc");
    }

    public void business(){
        System.out.println("Family business");
    }
}
class Child extends Parent{
    public void business(){
        System.out.println("overriding my business");
    }
}

class MethodOverriding{
    public static void main(String[] args){
        MethodOverloading obj=new MethodOverloading();
        Parent p=new Parent();
        Child c=new Child();
        Parent pc=new Child();
        p.business();  //parent method executed
        c.business();   //Child method executed
        pc.business();  /* here pc is a object where parent class is compile time reference
        and the Child class is Run time object reference so the overriding method resolver
        always done by jvm which prioritised the overriding method in child class*/



    }
}