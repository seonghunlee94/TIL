// 모듈 내부의 것을 외부에 공개하는 방법?

// 2. 공개하고 싶은 것들을 모아서 하나의 객체로 만들고
// module.exports로 객체를 통째로 공개!
let calculater = {
  PI: 3.14,
  add: (a, b) => a + b,
  subtract: (a, b) => a - b,
  multiply: (a, b) => a * b,
  divide : (a, b) => a / b,
}


// 공개하고 싶은 것들을 모은 객체를 외부에 공개할 때!
// module.
module.exports = calculater; 