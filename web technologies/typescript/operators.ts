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
