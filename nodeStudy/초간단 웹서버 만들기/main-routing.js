const http = require('http');

users = ['Tom', 'Andy', 'Jessica', 'Pual'];

/* url routing */

/* 1. 
  let server = http.createServer(function (request, response) {
  
  if(request.url == '/') {
    response.end('<h1>Welcome!</h1>');
  }else if(request.url === '/users') {
    response.end('<h1>' + users + '</h1>');
  }else if(request.url.split('/')[1] === 'users'){
    // url : /users/1, /users/2, .. // etc
    let userIdx = request.url.split('/')[2];
    let userName = users[userIdx - 1];

    response.end('<h1>' + userName + '</h1>');
  }else{
    response.end('<h1>Page Not Available</h1>');
  }
  
}); */


//2. 코드 개선해보기.
const server = http.createServer((request, response) => { // Arrow Function, const
  if (request.url === '/') {
    response.end('<h1>Welcome!</h1>');
  } else if (request.url === '/users') {
    response.end(`<h1>${users}/h1>`); // Template String
  } else if (request.url.split('/')[1] === 'users') {
    // url : /users/1, /users/2, .. // etc
    const userIdx = request.url.split('/')[2];
    const userName = users[userIdx - 1]; // etc

    response.end(`<h1>${userName}</h1>`); // Template String
  } else {
    response.end('<h1>Page Not Available</h1>');
  }
});

server.listen(3000);