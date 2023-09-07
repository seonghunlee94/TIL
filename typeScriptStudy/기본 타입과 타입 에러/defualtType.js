"use strict";
let itemName = '블랙 후드';
let itemPrice = 129000;
let membersOnly = true;
let owner = undefined;
let seller = null;
/* Number.is 메소드로 확인하기 */
let num = 2 / 0; // Infinity
let num2 = 0 / 0; // NaN
console.log(Number.isInteger(num));
console.log(Number.isInteger(num2));
