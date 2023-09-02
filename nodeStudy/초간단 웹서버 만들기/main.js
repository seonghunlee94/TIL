const http = require('http');

let server = http.createServer(function (request, response) {
  response.end('<h1>Hello world</h1>');
}); // 서버 역할을 하는 객체 생성

server.listen(3000);