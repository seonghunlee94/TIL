const http = require('http');

const express = require('express');

const app = express();

users = ['Tom', 'Andy', 'Jessica', 'Pual'];

app.get('/', (request, response) => {
  response.end(`<h1>Welcome!</h1>`);
});

app.get('/users', (request, response) => {
  response.end(`<h1>${users}</h1>`);
});

app.get('/users/:id', (request, response) => { // ':id' -> 이 자리에 오는 값을 id 속성에 담아라. 
  // console.log(request.params);
  const userName = users[request.params.id - 1];
  response.end(`<h1>${userName}</h1>`)
});

app.get('*', (request, response) => {
  response.end(`<h1>Page Not Available</h1>`);
});

app.listen(3000);