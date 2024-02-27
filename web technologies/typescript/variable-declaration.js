console.log(a);
var a = 10; //Global scope
function test() {
    console.log(a);
}
console.log(a);
test();
