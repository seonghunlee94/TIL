import sys
N, M = map(int, input().split())
my_dict = {}
input_lines = sys.stdin.readline
for i in range(N):
    site, password = input_lines().rstrip().split()
    my_dict[site] = password

for i in range(M):
    print(my_dict[input().rstrip()])





# N + 2 개부터 알아야 하는 비밀번호.


