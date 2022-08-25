package ATechnical;

/*If a declaration of a type in particular scope has the same name as another declaration in the enclosing scope, then
the declaration shadows the declaration of the enclosing scope.
*/
public class ShadowingClass {

    public int x = 0;

    class FirstLevel{
        public int x = 1;

        void methodInFirstLevel(int x){
            System.out.println("x = " + x); // use x variable to indicate the variable in the parameter
            System.out.println("this.x = " + this.x); // use this.x to indicate the variable in the the inner class
            System.out.println("ShadowTest.this.x = " + ShadowingClass.this.x); // use class.this.variable to indicate the variable that enclosing the inner class
        }
    }

    // main method
    public static void main(String[] args) {
        ShadowingClass sc = new ShadowingClass(); // create an object
        ShadowingClass.FirstLevel f1 = sc.new FirstLevel(); // create an inner object
        f1.methodInFirstLevel(23); // using method
    }
}
