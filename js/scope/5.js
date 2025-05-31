function foo(str){
    eval(str)  // 
    console.log(a, b)
}
var b = 2
foo('var a = 10')