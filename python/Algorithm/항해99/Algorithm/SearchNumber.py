
# N의 정수 받아오기
# N의 정수 개수 받아오기

# M의 정수 받아오기
# M의 개수 주어짐

# M개의 줄에 답을 출력. in A - 1. not in A - 0


N = int(input())
number_set = set(map(int, input().split()))
M = int(input())
check_list = map(int, input().split())
print(check_list)

for number in check_list:
    if number in number_set:
        print(1)
    else:
        print(0)



