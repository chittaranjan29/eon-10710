public class MyClass
{
 public static void main(String args[])
 {
   MyStack myStack=new MyStack(5);
   try	
{
   mystck.push(11);
   mystck.push(13);
   mystck.push(16);
   mystck.push(19);
   mystck.push(37);
   mystck.push(78); //overflow will occurr
}
catch(MyStacKException e)
{
System.out.println(e.getMessage());
}
catch(exception e)
{
System.out.println(e.getMessage());
}
 
}

}