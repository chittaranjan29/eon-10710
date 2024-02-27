
//console.log(a2) //compilation error
let localVar=1000;//Global scope
//let localVar=1000; redeclaration not possible
localVar=1500;//reinitialization is possible
let a1=1000;
var a2=2000;
var a2=3000;//redeclaration and reinitialization both are possible
function someFunction()
{
    if(true)
    {
        let localVar=1000;//block scope
        console.log(localVar)
    }

    console.log(localVar);
    
    
    function test()
    {
        console.log(localVar);  
    }
    {
        console.log(localVar);  
    }
}

console.log(localVar);  
//console.log(window.a1);
console.log(window.a2);

