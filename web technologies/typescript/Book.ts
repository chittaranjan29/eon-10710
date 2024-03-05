class Book
{
   public id:any;
   public name:any;
   private publication:any;
   protected price:any;
   constructor()
   {

   }

   public getName()
   {
    return this.name;
   }

   private getId()
   {
    return this.id;
   }
   public setId(id:any)
   {
    this.id=id;
   }
   public setName(name:any)
   {
    this.name=name;
   }
   public setPubication(publication:any)
   {
    this.publication=publication;
   }
}

var book:Book=new Book();
book.id=43774;
book.name="test";
//book.publication=43774;
console.log(book.getName());
//console.log(book.getId());
book.setPubication("ABC publication");


class StoryBook extends Book
{
    type:any;


    constructor(type:any,price:any)
    {
        super();
        this.price=price;
        this.type=type;
    }

    display()
    {
        console.log(this.type+" "+this.price)
    }
}

var storyBook:StoryBook=new StoryBook("story",500);

storyBook.display();