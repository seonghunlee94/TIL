let itemName: string = '블랙 후드';
let itemPrice: number = 129000;
let membersOnly: boolean = true;
let owner: undefined = undefined;
let seller: null = null;

let num = 2/0; // Infinity
let num2 = 0/0; // NaN

/* Number.is 메소드로 확인하기 */
console.log(Number.isInteger(num));
console.log(Number.isInteger(num2));

