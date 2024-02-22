var num1=parseInt(prompt('Enter any number:'));
var num2=parseInt(prompt('Enter any number:'));

try
{
 if(num1==0 || num2==0)
 {
    throw "num1 and num2 can not be zero!!";
 }
 else
 {

  console.log(num1/num2);
 }
}
catch(err)
{
  console.log(err);
}
finally
{
    console.log("finally block executed");
}