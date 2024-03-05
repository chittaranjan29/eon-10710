var mycar = { make: 'Honda', model: 'Accord', year: 1998 };
console.log('model' in mycar);
console.log('brand' in mycar);
console.log(mycar);
console.log(delete mycar.year);
console.log(mycar);
console.log(typeof mycar);
var Person = /** @class */ (function () {
    function Person() {
        this.name = '';
    }
    return Person;
}());
var person = new Person();
console.log(person instanceof Person);
var isValid = true;
var msg = isValid ? 'valid' : 'Invalid';
console.log(msg);
var a = 10, b = 20, c = 30;
var greaterNum = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
console.log(greaterNum);
