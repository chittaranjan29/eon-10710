//interface implementation using an object
var product1 = {
    id: 1,
    name: "Samsung Galaxy",
    price: 30000,
    calculate: function (qty) {
        return this.price * qty;
    }
};
console.log(product1.id);
console.log(product1.name);
console.log(product1.price);
console.log(product1.calculate(2));
var ProductImplementation = /** @class */ (function () {
    function ProductImplementation(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    ProductImplementation.prototype.calculate = function (qty) {
        return this.price * qty;
    };
    return ProductImplementation;
}());
var product2 = new ProductImplementation(1213, "Samsung Galaxy", 50000);
console.log(product2.id);
console.log(product2.name);
console.log(product2.price);
console.log(product2.calculate(3));
