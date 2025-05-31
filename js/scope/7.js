// if (true) {
//     var a = 1
// }
// console.log(a)  // 1

// if (true) {
//     let a = 1
//     var b = 1
// }
// console.log(a)  // 报错
// console.log(b)  // 1

// let a = 1
// if (true) {
//     let a = 2
//     console.log(a) // 2
// }

let a = 1
if (true) {
    console.log(a) // 出不去 暂时性死区
    let a = 2
}