import java.util.*;
class Shop
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    
}
class Test<T>
{
    T obj;
    Test(T obj) 
    {  
        this.obj = obj;  
    } 
    public T getObject()  
    { 
        return this.obj;
    }
}
class Main
{
    public static void main (String[] args)
    {
        Test <Integer> integerObj = new Test<Integer>(15);
        System.out.println(integerObj.getObject());
        Test <String> stringObj =
                          new Test<String>("Saiteja");
        System.out.println(stringObj.getObject());
        Shop sh=new Shop();
        Test <Shop> shopping= new Test<Shop>(sh);
        
        System.out.println(shopping.getClass());
        
    }
}