package task5;

public  class Calculator {
    int a;
    int b;
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public  int   add(){
        return this .a  + this .b;
     }
     public int sub(){
         return a - b;
     }
     public int mul (){
         return this.a * this.b;
     }
     public int div()  {
        return this.a / this.b;
     }
}


