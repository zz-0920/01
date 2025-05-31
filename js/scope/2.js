var a = 10
console.log(a)  // 在全局查找a

function add(a, b){
    console.log(a + b)  // 在局部查找a
}

function add(b){
    console.log(a + b)  // 首先在局部查找a，然后在全局查找a
}

function foo(b){
    var a = 1
    function bar(){
        console.log(a + b)  // 首先在局部查找a，然后在全局查找a
    }
    bar()
}

add(1, 2)  // 3
add(2)  // 12