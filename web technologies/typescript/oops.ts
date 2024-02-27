class Customer
{
    id:any;
    firstName:any;
    lastName:any;
    
    constructor()
    {
        console.log("default constructor invoked")
    }
    
    getId():any
    {
        return this.id;
    }

    getfirstName():any
    {
        return this.firstName;
    }

    getlastName():any
    {
        return this.lastName;
    }

    setId(id:any):void
    {
        this.id=id;
    }
    setfirstName(firstname:any):void
    {
        this.firstName=firstname;
    }
    setlastName(lastName:any):void
    {
        this.lastName=lastName;
    }

    display()
    {
        console.log(this.id);
        console.log(this.firstName);
        console.log(this.lastName);
    }
}

var customer1=new Customer();

customer1.display();

customer1.id=37637;
customer1.firstName="Aman";
customer1.lastName="Roy";

customer1.display();

var customer2=new Customer();
customer2.setId(435345);
customer2.setfirstName("Linta");
customer2.setlastName("Joe");
customer2.display();