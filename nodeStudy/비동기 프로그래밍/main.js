const fs = require('fs');

/* 동기 프로그래밍
console.log('start');

let content = fs.readFileSync('./new', 'utf8'); // 동기 실행 부분
console.log(content);

console.log('Finish'); */


// 비동기 프로그래밍
console.log('start');

/* node.js는 비동기 실행 중심의 실행환경이다. 그래서 일반적인 경우 비동기 함수를 사용해야 한다. ㅡ */

// 비동기 실행
fs.readFile('./new', // 1. readFile 실행되면. 4. 완료되면
  'utf8', 
  (error, data) => {  // 2. 콜백 등록.        5. 콜백 넘어오면 실행.
  console.log(data);
});  

console.log('Finish'); // 3. 코드 실행

