let productObj: {
  id: string;
  name: string;
  price: number;
  membersOnly?: boolean;
  sizes: string[];
} = {
  id: 'c001',
  name: '코드잇 블랙 후디',
  price: 129000,
  sizes: ['M', 'L', 'XL'],
};

if (productObj.membersOnly) {
  console.log('회원 전용 상품');
} else {
  console.log('일반 상품');
}


let field = 'field name';
let obj = {
  [field]: 'field value',
};

let stock: {
  [id: string]: number;
} = {
  c001: 3,
  c002: 0,
  c003: 'num',
}