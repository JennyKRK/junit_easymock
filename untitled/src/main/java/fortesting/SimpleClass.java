package fortesting;

public class SimpleClass {
    private int a;
    private int b;

    public SimpleClass(int a, int b){
        this.a= a;
        this.b = b;
    }
    public int simpleAddition(){
        return this.a + this.b;
    }

    public int simpleDeduction(){
        return this.a - this.b;
    }

    public int simpleDivision() {
        try {
            return this.a/this.b;
        }
        catch(Exception e) {
            throw new ArithmeticException();
        }
    }

}
