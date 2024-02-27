//Parameter types - optional, rest, default
function upperCase(fname, lname) {
    if (fname != undefined) {
        console.log(fname.toUpperCase());
    }
    if (lname != undefined) {
        console.log(lname.toUpperCase());
    }
}
upperCase("Kumar");
upperCase("Kumar", "roy");
function addNums() {
    var nums = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        nums[_i] = arguments[_i];
    }
    var s = 0;
    for (var _a = 0, nums_1 = nums; _a < nums_1.length; _a++) {
        var i = nums_1[_a];
        s = (s + i);
    }
    return s;
}
console.log(addNums());
console.log(addNums(12));
console.log(addNums(12, 78));
console.log(addNums(12, 66, 45));
//default parameter
function simpleInterest(princ, time, roi) {
    if (roi === void 0) { roi = 8.7; }
    return (princ * roi * time) / 100;
}
console.log(simpleInterest(1200, 5));
console.log(simpleInterest(1200, 5, 8.9));
