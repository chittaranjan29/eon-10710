//Parameter types - optional, rest, default

function upperCase(fname:string, lname?:string)//optional parameter
{
    if(fname!=undefined)
    {
        console.log(fname.toUpperCase())
    }

    if(lname!=undefined)
    {
        console.log(lname.toUpperCase())
    }
}

upperCase("Kumar");
upperCase("Kumar","roy");


function addNums(...nums:number[]):number //rest parameters
{
 let s:number=0;
 for(let i of nums)
 {
    s=(s+i);  
 }
 return s;
}


console.log(addNums());
console.log(addNums(12));
console.log(addNums(12,78));
console.log(addNums(12,66,45));

//default parameter
function simpleInterest(princ:number, time:number, roi:number=8.7):number
{
    return (princ*roi*time)/100;
} 

console.log(simpleInterest(1200,5));
console.log(simpleInterest(1200,5,8.9));