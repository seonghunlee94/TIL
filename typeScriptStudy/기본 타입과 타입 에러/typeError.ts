let product = {
  id: 'c001',
  name: '라이트 윈드 브레이커',
  price: 129000,
  sizes: ['M', 'L', 'XL'],
};

/* Type Error 1 */
// product.price = '139000원';
// const salePrice = product.price * 0.9;
// console.log(`할인 가격: ${salePrice}`);

/* Type Error 2 */
const newProduct = {
  id: 'c002',
  name: '다크 윈드 브레이커',
  price: 139000,
  sizes: [90, 95, 100, 105, 100],
};


product = newProduct;

