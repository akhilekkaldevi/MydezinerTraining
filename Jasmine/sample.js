sample=function() {};
 
sample.prototype.sum = function(number1, number2) {
        return number1 + number2;
}
 
sample.prototype.isEven = function(n){
    return n % 2 == 0;
}
sample.prototype.isOdd = function(n){
    return Math.abs(n % 2) == 1;
}
sample.prototype.isLowerCase = function(str){
    return str.toLowerCase();
}
sample.prototype.isUpperCase = function(str){
    return str.toUpperCase();
}
