const EventEmitter = require('events'); // 코어 모듈 가져와서 클래스 할당해주기.

const myEmitter = new EventEmitter(); //  클래스로 객체 만들기

/* // 'test' 객체 이벤트 발생 시 콜백함수 시작.
myEmitter.on('test', () => { 
  console.log('Success!');
}); */



/* // 하나의 이벤트에 여러 가지 콜백 사용 가능
myEmitter.on('multi', () => { 
  console.log('1');
});

myEmitter.on('multi', () => { 
  console.log('2');
});

myEmitter.on('multi', () => { 
  console.log('3');
}); */

// 1. 콜백에서 추가적인 정보를 받아서 사용하는 법.
myEmitter.on('test', (arg1, arg2, arg3) => { 
  console.log(arg1);
  console.log(arg2);
  console.log(arg3);
});

// 2. 추가적인 정보를 객체로 보내 사용하는 법.
const obj = {type: 'text', data: 'Hello hun', date: '2023-09-01'};

myEmitter.on('testObj', (info) => { 
  console.log(info);
  console.log(info.data);
});

/* myEmitter.emit('test'); // test 이벤트 발생시킴. */

/* myEmitter.emit('multi'); // multi 이벤트 발생. */

myEmitter.emit('test', 'apple', 'banana', 'pear'); // 이벤트에 추가 정보 함께 전달하기.

myEmitter.emit('testObj', obj);