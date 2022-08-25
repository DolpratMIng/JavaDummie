package ATechnical;
/*
@Override annotation - used when we override a method in sub class

Why we should use @Override annotation
1) It would help programmer to notify them when they any mistake as method name, wrong parameter
-if this annotation has been used, it would behave as a new method

2)It improve the readability of the code
-eg. if there the programmer want to change any code in the signature code of the subclass
 */
public class OverrideAnnotation {

}

class ParentClass{
    public void displayMethod(String msg){
        System.out.println(msg);
    }
}

class SubClass extends ParentClass{
    @Override
    public void displayMethod(String msg){
        System.out.println("Message is: " + msg);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.displayMethod("Hey!!");
    }

}
