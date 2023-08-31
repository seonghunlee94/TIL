const EventEmitter = require('events'); // 코어 모듈 가져와서 클래스 할당해주기.

const myEmitter = new EventEmitter(); //  클래스로 객체 만들기

/* myEmitter.on('test', () => { // 'test' 객체 이벤트 발생 시 콜백함수 시작.
  console.log('Success!');
}); */

myEmitter.on('multi', () => { // 하나의 이벤트에 여러 가지 콜백 사용 가능
  console.log('1');
});

myEmitter.on('multi', () => { // 하나의 이벤트에 여러 가지 콜백 사용 가능
  console.log('2');
});

myEmitter.on('multi', () => { // 하나의 이벤트에 여러 가지 콜백 사용 가능
  console.log('3');
});

/* myEmitter.emit('test'); // test 이벤트 발생시킴. */

myEmitter.emit('multi'); // multi 이벤트 발생.