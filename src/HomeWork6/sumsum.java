package HomeWork6;

public class sumsum extends cal{
    public void sum(String parm, int a, int b) {
        System.out.println(parm + (a - b));
    }
    @Override
    public void minus(int a, int b){
        System.out.println((a*b) + " - решил умножить");
    }
}
