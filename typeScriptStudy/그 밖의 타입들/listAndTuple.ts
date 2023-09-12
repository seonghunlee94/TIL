const cart: string[] = [];
cart.push('c001');
cart.push('c001');
// cart.push(3);

const carts: string[][] = [
  ['c001', 'c002'],
  ['c003']
];

/* let mySize: number[] = [167, 28];
mySize = [167, 28, 255];
mySize = [255];
mySize = []; */


// 만약 개수를 정하고 싶으면 튜플을 사용해야 한다.
let mySize: [number, number, string] = [167, 28, 'm'];
mySize = [167, 28, 255];  // 2번 index type error
mySize = [255];           // 요소 개수 부족
mySize = [167, '28inch']; // 요소 개수 부족