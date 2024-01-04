# 스택을 활용한 괄호 문자열 판별 함수
def is_valid_parenthesis(parentheses):
    stack = []
    for p in parentheses:
        if p == '(':
            stack.append(p)
        else:  # 닫는 괄호인 경우
            if not stack:  # 스택이 비어있으면 올바르지 않은 괄호 문자열
                return "NO"
        stack.pop()  # 여는 괄호와 매칭되는 닫는 괄호를 스택에서 제거

    if not stack:  # 마지막에 스택이 비어있으면 올바른 괄호 문자열
        return "YES"
    else:  # 스택에 여는 괄호가 남아있으면 올바르지 않은 괄호 문자열
        return "NO"

# # 테스트 데이터 수 입력
# T = int(input())
#
# for _ in range(T):
#     parentheses = input()  # 괄호 문자열 입력
#     result = is_valid_parenthesis(parentheses)
#     print(result)


print(is_valid_parenthesis('7('))
print(is_valid_parenthesis('()'))
print(is_valid_parenthesis('(7)'))
print(is_valid_parenthesis('()()()'))
print(is_valid_parenthesis('(())'))