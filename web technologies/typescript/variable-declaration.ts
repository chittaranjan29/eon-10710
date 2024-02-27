console.log(a);
var a=10; //Global scope
function test()
{
    let a=20;
    console.log(a);
    {
        console.log(a);
    }
}
console.log(a);
test();

const t="hello world";
//t="hii"; reinitialization not possible