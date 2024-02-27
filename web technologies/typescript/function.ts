function test(a:number,b:number):void 
{
 console.log(a+b);
}

function test1(a:number,b:number):number
{
  
    console.log(test1.fname);
     return a+b;
}

//attach property to a function
test1.fname="Raman";
test1.lname="Sharma";
test(10,20);
var result:number=test1(20,50);
console.log(result);
console.log(test1.fname + " "+test1.lname);

//store function in a variable
var output=function add(a:number, b:number)
{
    return a+b;
}

console.log(output(5,9));

//anonymous function
var sample=(function(st:string){
    console.log(st.toUpperCase())
});

sample("hello");

//pass function as arguments to another function

function addNum(a:number, b:number):number
{
    return a+b;
}
function multiplyNum(a:number, b:number):number
{
    return a*b;
}

function operate(func:any, a:number, b:number)
{
    return func(a,b);
}

var res=operate(addNum,10,10);
console.log(res);//20

var res=operate(multiplyNum,10,10);
console.log(res);//100

// functions as object methods

var myobj={
 name:"Raman",
 email:"raman@test.com",
 salaryCalculation:function(basicSalary:number){
    console.log(basicSalary + basicSalary*0.10 + basicSalary*0.20);
 }
};

console.log(myobj.name);
console.log(myobj.email);
myobj.salaryCalculation(20000);







