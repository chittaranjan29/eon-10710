class Animal
{
    name:any;
    eat()
    {
        console.log("Eating....")
    }

    sleep()
    {
        console.log("Sleeping..")
    }
}

class Dog extends Animal
{
    breed:any;
    bark()
    {
        console.log("Dog is barking...");
    }
}

class Horse extends Animal
{
    color:any;
    run()
    {
        console.log("Horse is running...");
    }
}

var dog=new Dog();
dog.name="Tommy";
dog.breed="Doberman";

dog.eat();
dog.sleep();
dog.bark();