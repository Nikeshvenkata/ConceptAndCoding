package BasicsToAdvance;

public class TypesOfVariables {
    int memberVariable;
    static int staticVariable = 7;

    public TypesOfVariables(){
    }

    public TypesOfVariables(int memberVariable) {
        this.memberVariable = memberVariable;
    }

    public void dummyMethod(){
        byte localVariable = 13;
        System.out.println(localVariable);
    }

    public int dummyMethod2(int a, int b){
        return a + b;
    }
}
