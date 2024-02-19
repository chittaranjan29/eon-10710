public class MyStack
{
  int stackSize;
  int stackArr[];
  int TOS=-1;	
  public MyStack()
 {
 
 }
 
  public MyStack(int stackSize)
 {
   this.stackSize=stackSize;	
   stackArr[]=new int[stackSize];
 }


 public void push(int element)
 {
   if(this.TOS<stackSize)
   {
    this.stackArr[++this.TOS]=element;
   }  
   else
   {
    throw new MyStackException("overflow occurred");
   }
 }
 
 public int pop(int element)
 {
	int temp=0;
   if(this.TOS==-1)
   {
     throw new MyStackException("underflow occurred");
   }
   else
  {
    temp=his.stackArr[this.TOS];
    --this.TOS;
    return temp;
  }
 }
  
 
}