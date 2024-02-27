"use strict";
var i1 = 1;
var n = 10;
while (i1 <= n) {
    console.log(i1);
    i1 = i1 + 1;
}
i1 = 1;
do {
    console.log(i1);
    i1 = i1 + 1;
} while (i1 <= n);
for (i1 = 1; 1 <= n; i1++) {
    console.log(i1);
}
var numbers = [10, 20, 30, 40, 50];
for (let i in numbers) {
    console.log(i + ":" + numbers[i]);
}
const obj = { name: "Raman", email: "raman@abc.com", phone: "93737763737" };
for (let x in obj) {
    console.log(x + ":" + x);
}
var numbers = [10, 20, 30, 40, 50];
for (let x of numbers) {
    console.log(x);
}
