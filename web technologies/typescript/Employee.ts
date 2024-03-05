class Employee
{
    empname:any;
    empage?:any; //optional property

    constructor(empname:string, empage?:number)
    {
        this.empname=empname;

        if(empage!=undefined)
        {
            this.empage=empage;
        }
    }

}

var emp1=new Employee("Mr. Anil");
console.log(emp1.empname);
console.log(emp1.empage); //undifined

var emp2=new Employee("Mr. Rahul",27);
console.log(emp2.empname);
console.log(emp2.empage); 
