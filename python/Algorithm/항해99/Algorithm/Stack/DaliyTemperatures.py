from typing import List


class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        # 스택을 초기화합니다. 스택에는 날짜의 인덱스를 저장할 것입니다.
        stack = []
        # 결과를 저장할 리스트를 초기화합니다. 결과 리스트의 초기값은 모두 0으로 설정합니다.
        result = [0] * len(temperatures)
        
        # 각 날짜에 대해 반복합니다.
        for i, temp in enumerate(temperatures):
            # 현재 온도와 스택의 맨 위 온도를 비교합니다.
            while stack and temp > temperatures[stack[-1]]:
                # 현재 온도가 스택의 맨 위 온도보다 높을 때,
                # 스택에서 맨 위 온도의 인덱스를 꺼냅니다.
                idx = stack.pop()
                # 결과 리스트에 현재 날짜와 맨 위 온도의 차이(일 수)를 저장합니다.
                result[idx] = i - idx
            # 현재 온도의 인덱스를 스택에 저장합니다.
            stack.append(i)
        
        # 결과 리스트를 반환합니다.
        return result
                 
      

sol = Solution()

temperatures = [73,74,75,71,69, 73,72,76,73]
# temperatures = [55,38,53,81,61,93,97,32,43,78]
# temperatures = [89,62,70,58,47,47,46,76,100,70]

print(sol.dailyTemperatures(temperatures))