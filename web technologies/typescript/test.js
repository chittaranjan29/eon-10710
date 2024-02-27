"use strict";
let message = "welcome to Typescript";
let message1 = "welcome to Javascript";
let message2 = "compile on save";
var a = 20;
var b = { a: 20, b: 30 };
var c = true;
//var d=BigInt(329);
var e;
var f;
var g;
var h;
h = true;
h = "hello";
h = 10;
h = [1, 2, 3, 4];
h = { a: 20, b: 30 };
h = null;
h = undefined;
h = Symbol("key");
let num;
num = 10;
num = 0xa00d;
num = 0b01010;
num = 0o633;
var i;
var j;
console.log(message + "\n" + message1);
console.log(message2);
function doSomething() {
    throw new Error("error");
}
function sayHello() {
    console.log("Hello");
}
var cities = ['Delhi', 'Mumbai', 'Chennai', 'Hyderabad', 'Kolkata'];
var cities = ['Delhi', 'Mumbai', 'Chennai', 'Hyderabad', 'Kolkata'];
function add(a, b) {
    return a + b;
}
console.log(add(10, 20));
//Anonymous object
var student;
student = { id: 100, name: "raman" };
//union data type
var id;
