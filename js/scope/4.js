var obj = {
    a:1,
    b:2,
    c:3,
}

// obj.a = obj.a +1
// obj.b = obj.b +1
// obj.c = obj.c +1

// with(obj){  // 批量化修改对象属性
//     a = 2
//     b = 3
//     c = 4
// }
// console.log(obj)

var o1 = {
    a: 1
}
var o2 = {
    b: 2
}
function foo(){
    with(obj) {
        a = 2
    }
}
foo(o1)
console.log(obj.a);
