class Vehicle
{
    constructor()
    {
        console.log("default constructor invoked");
    }

    move = () => console.log("vehicle is moving");
}

class Bike extends Vehicle
{
    constructor()
    {
        super();
        console.log("bike constructor invoked");
    }

    sideIndicator = (status)=> this.indicator=status;

    display = () => console.log(this.indicator);
} 

var bikeObj=new Bike();
bikeObj.sideIndicator(true);
bikeObj.display();
bikeObj.move();

bikeObj.sideIndicator(false);
bikeObj.display();



