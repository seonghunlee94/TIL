# 숫자의 거듭제곱 구하기.

def power(x, n):
    
    if n == 0:
        return 1
    
    if n == 1:
        return x

    temp = power(x, n // 2)

    if n % 2 == 0:
        return temp * temp
    else:
        return x * temp * temp

# 테스트 코드
print(power(2, 3))
print(power(5, 0))
print(power(17, 5))
print(power(3, 17))
print(power(4, 18))
