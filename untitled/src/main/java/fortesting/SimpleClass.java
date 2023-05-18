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

}
