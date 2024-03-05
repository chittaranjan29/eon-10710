var mycar:{make?:string, model?:string, year?:number}={make:'Honda',model:'Accord',year:1998};
console.log('model' in mycar);
console.log('brand' in mycar);


console.log(mycar)
console.log(delete mycar.year);
console.log(mycar)

console.log(typeof mycar )

class Person
{
    [x: string]: any;
    name:String='';
}

let person=new Person();
console.log(person instanceof Person);

const isValid=true;

const msg=isValid?'valid':'Invalid';
console.log(msg);


var a=10,b=20,c=30;

var greaterNum=(a>b)?((a>c)?a:c):((b>c)?b:c);
console.log(greaterNum);