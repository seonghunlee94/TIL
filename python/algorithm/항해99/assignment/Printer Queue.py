from collections import deque

# 테스트 케이스 개수 입력
T = int(input())

for _ in range(T):
    # 문서의 개수 N과 몇 번째로 인쇄되었는지 궁금한 문서의 위치 M 입력받기
    N, M = map(int, input().split())

    # 문서의 중요도를 리스트로 입력받기
    priorities  = list(map(int, input().split()))
    # print(priorities )

    # 여기에 문서가 몇 번째로 인쇄되는지 확인하는 코드 작성하기
    # ...
    count = 1

    # a = [i for i in range(10)]
    q = deque([(i, idx) for idx, i in enumerate(priorities)])
    while len(q) > 0:
        if q[0] == max(q, key=lambda x: x[0]):
            if q[0][1] != M:
                count += 1
                q.popleft()
            else:
                print(count)
                break
        else:
            # q.rotate(-1)
            q.append(q.popleft())


# from collections import deque
#
# # 테스트 케이스 개수 입력
# T = int(input())
#
# for _ in range(T):
#     # 문서의 개수 N과 몇 번째로 인쇄되었는지 궁금한 문서의 위치 M 입력받기
#     N, M = map(int, input().split())
#
#     # 문서의 중요도를 리스트로 입력받기
#     priorities = list(map(int, input().split()))
#
#     # 인쇄된 순서를 카운트하는 변수
#     count = 0
#
#     # (문서의 중요도, 순서) 쌍으로 이루어진 deque 생성
#     q = deque([(priority, idx) for idx, priority in enumerate(priorities)])
#
#     while q:
#         # 가장 앞에 있는 문서보다 중요도가 높은 문서가 있는지 확인
#         if q[0][0] < max(q)[0]:
#             q.append(q.popleft())
#         else:
#             # 중요도가 높은 문서가 없는 경우 카운트 증가 및 인쇄
#             count += 1
#             priority, idx = q.popleft()
#             if idx == M:
#                 print(count)
#                 break