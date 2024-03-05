var Car = /** @class */ (function () {
    function Car() {
        this.brand = "XYZ";
        this.model = "X100";
    }
    return Car;
}());
var car1 = new Car();
car1.id = 345345;
car1.color = "Red";
car1.price = 700000;
console.log(car1.id);
console.log(car1.brand);
console.log(car1.model);
console.log(car1.color);
console.log(car1.price);
