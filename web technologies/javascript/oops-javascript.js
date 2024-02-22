class Employee
{
    
    constructor(name,salary)
    {
        this.name=name;
        this.salary=salary;
    }
    display()
    {
        console.log(this.name + ":"+this.salary);
    }

}


const emp=new Employee("Mr. Aman roy",40000);
emp.display();
console.log(emp.name);
console.log(emp.salary);