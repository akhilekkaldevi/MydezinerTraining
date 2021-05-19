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
    }
}