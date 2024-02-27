"use strict";
var mycar = { make: 'Honda', model: 'Accord', year: 1998 };
console.log('model' in mycar);
console.log('brand' in mycar);
console.log(mycar);
console.log(delete mycar.year);
console.log(mycar);
console.log(typeof mycar);
class Person {
    constructor() {
        this.name = '';
    }
}
let person = new Person();
console.log(person instanceof Person);
