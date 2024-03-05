var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Book = /** @class */ (function () {
    function Book() {
    }
    Book.prototype.getName = function () {
        return this.name;
    };
    Book.prototype.getId = function () {
        return this.id;
    };
    Book.prototype.setId = function (id) {
        this.id = id;
    };
    Book.prototype.setName = function (name) {
        this.name = name;
    };
    Book.prototype.setPubication = function (publication) {
        this.publication = publication;
    };
    return Book;
}());
var book = new Book();
book.id = 43774;
book.name = "test";
//book.publication=43774;
console.log(book.getName());
//console.log(book.getId());
book.setPubication("ABC publication");
var StoryBook = /** @class */ (function (_super) {
    __extends(StoryBook, _super);
    function StoryBook(type, price) {
        var _this = _super.call(this) || this;
        _this.price = price;
        _this.type = type;
        return _this;
    }
    StoryBook.prototype.display = function () {
        console.log(this.type + " " + this.price);
    };
    return StoryBook;
}(Book));
var storyBook = new StoryBook("story", 500);
storyBook.display();
