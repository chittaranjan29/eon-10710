var Customer = /** @class */ (function () {
    function Customer() {
        console.log("default constructor invoked");
    }
    Customer.prototype.getId = function () {
        return this.id;
    };
    Customer.prototype.getfirstName = function () {
        return this.firstName;
    };
    Customer.prototype.getlastName = function () {
        return this.lastName;
    };
    Customer.prototype.setId = function (id) {
        this.id = id;
    };
    Customer.prototype.setfirstName = function (firstname) {
        this.firstName = firstname;
    };
    Customer.prototype.setlastName = function (lastName) {
        this.lastName = lastName;
    };
    Customer.prototype.display = function () {
        console.log(this.id);
        console.log(this.firstName);
        console.log(this.lastName);
    };
    return Customer;
}());
var customer1 = new Customer();
customer1.display();
customer1.id = 37637;
customer1.firstName = "Aman";
customer1.lastName = "Roy";
customer1.display();
var customer2 = new Customer();
customer2.setId(435345);
customer2.setfirstName("Linta");
customer2.setlastName("Joe");
customer2.display();
