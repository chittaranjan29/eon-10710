interface Product
{
    id:number;
    name:string;
    price:number;
    calculate:(qty:number)=>number;

}
//interface implementation using an object
var product1:Product={
    id:1,
    name:"Samsung Galaxy",
    price:30000,
    calculate(qty:number) {
     return this.price * qty;   
    }
};

console.log(product1.id);
console.log(product1.name);
console.log(product1.price);
console.log(product1.calculate(2));


//implement interfaxe using a xlass
class ProductImplementation implements Product{
   
    id:any;
    name:any;
    price:any;

    constructor(id:any, name:any, price:any)
    {
        this.id=id;
        this.name=name;
        this.price=price;
    }
    calculate(qty:number) 
    {
        return this.price * qty;   
 }   

}
var product2=new ProductImplementation(1213,"Samsung Galaxy",50000);
console.log(product2.id);
console.log(product2.name);
console.log(product2.price);
console.log(product2.calculate(3));

//implement interface using a function
interface DoSomething{
    (price:number, quantity:number):number;
}

let product3:DoSomething;

product3=function(price:any, quantity:any)
{
    return price*quantity;
}

console.log(product3(20000,3));
