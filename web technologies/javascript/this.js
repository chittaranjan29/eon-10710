
const person={
    firstName:"Aman",
    lastName:"Sharma",
    id:1234,
    fullName:function()
    {
       return this.firstName+" "+this.lastName; 
    }
};

console.log(person.fullName());
let a=this;
console.log(typeof(a));
