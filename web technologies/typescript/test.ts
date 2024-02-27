let message:string="welcome to Typescript";
let message1:string="welcome to Javascript";
let message2:string="compile on save";

var a:number=20;
var b:object={a:20,b:30};
var c:boolean=true; 
//var d=BigInt(329);
var e:undefined;
var f:null;
var g:void;
var h:unknown;
h=true;
h="hello";
h=10;
h=[1,2,3,4];
h={a:20,b:30};
h=null;
h=undefined;
h=Symbol("key");

let num:number;
num=10;
num=0xa00d;
num=0b01010;
num=0o633;



var i:never;
var j:any;

console.log(message+"\n"+message1);
console.log(message2);


function doSomething():never
{
  throw new Error("error");
   
}

function sayHello():void
{
    console.log("Hello")
}


var cities:string[]=['Delhi','Mumbai','Chennai','Hyderabad','Kolkata'];
var cities:Array<string>=['Delhi','Mumbai','Chennai','Hyderabad','Kolkata']; 


function add(a:number, b:number):number
{
    return a+b;
}
console.log(add(10,20));

//Anonymous object

var student:{id:number; name:string};
student={id:100,name:"raman"};

//union data type

var id: string | Number;