class Calculator {
    public void add(int a,int b){
        int c=a+b;
        System.out.println("The sum of Two Number is :"+c);
    }
    public void add(int a,int b,int d){
        int c=a+b+d;
        System.out.println("The sum of Two Number is :"+c);
    }
    public void add(int a,float b){
        float c=a+b;
        System.out.println("The sum of Two Number is :"+c);
    }

}
public  class PolymorphismMethodOverloading{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(12,5);
        calculator.add(12,5,54);
        calculator.add(12,5.03F);

    }
}