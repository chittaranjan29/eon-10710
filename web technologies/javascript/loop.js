var i=1;n=10;


while(i<=n)
{
    console.log(i);
    i=i+1;
}


i=1;
do{
    console.log(i);
    i=i+1;
}
while(i<=n);

for(i=1;i<=n;i++)
{
    console.log(i);
}


var numbers=[10,20,30,40,50];
for(i in numbers)
{
    console.log(i+":"+numbers[i]);
}

const obj={name:"Raman", email:"raman@abc.com", phone:"93737763737"};
for(let x in obj)
{
    console.log(x+":"+obj[x]);
}


var numbers=[10,20,30,40,50];
for(let x of numbers)
{
    console.log(x);
}
