/* const fs = require('fs'); // 파일 시스템 모듈  

let fileList = fs.readdirSync('.'); // 특정 디렉토리 안에 있는 파일들을 배열로 리턴.
console.log(fileList); 

fs.writeFileSync('new', 'Hello Node.js!'); // 파일 생성 및 내용 추가 */

const os = require('os'); // 컴퓨터에서 운영체제 관련 정보를 가져올 수 있음

console.log(os.cpus());
