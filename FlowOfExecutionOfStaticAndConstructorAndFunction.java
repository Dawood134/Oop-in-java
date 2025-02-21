 class Test{
    static int a;
    static{
        a = 4;
        System.out.println (a+"   inside static block");
    }
    
    Test() {
        a=10;
        System.out.println (a+"   inside constructor");
        
    }
    
    public static void func(){
        a = a + 1;
        System.out.println (a+"   Inside Function ");
    }
}
    public class FlowOfExecutionOfStaticAndConstructorAndFunction{
    public static void main(String[] args){

        Test obj = new Test();
        obj.func();

    }
    
}

 