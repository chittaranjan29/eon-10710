class Car
{
    id:any;
    readonly brand:any="XYZ";
    readonly model:any="X100";
    color:any;
    price:any;

    constructor()
    {

    }
}

var car1:Car=new Car();
car1.id=345345;
car1.color="Red";
car1.price=700000;


console.log(car1.id);

console.log(car1.brand);

console.log(car1.model);

console.log(car1.color);

console.log(car1.price);
