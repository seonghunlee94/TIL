// 모듈 내부의 것을 외부에 공개하는 방법?

// 1. 공개하고 싶은 것들을 하나씩 exports로 공개!
let m = require('./math-tool-object.js');

console.log(m.PI);
console.log(m.add(2, 4));
console.log(m.subtract(1, 2));
console.log(m.multiply(1, 2));
console.log(m.divide(1, 2));

