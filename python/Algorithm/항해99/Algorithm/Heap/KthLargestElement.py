import collections
import heapq
from typing import List


def topKFrequent(nums: List[int]):
    freqs = collections.Counter(nums)
    freqs_heap = []


    print(freqs)
    for f in freqs:
        # heappush는 첫번째 인자 값을 통해 자료구조를 가져오고, 두번째 인자값을 push한다.
        heapq.heappush(freqs_heap, (-freqs[f],f))
    print(freqs_heap)

    topk = list()
    k = 2
    for _ in range(2):
        topk.append(heapq.heappop(freqs_heap)[1])

    print(topk)


nums = [1, 1, 1, 1, 1,2, 2, 2, 2, 3, 3, 3, 3,3]
topKFrequent(nums)