import heapq

# import heap.structures import BinaryMaxHeap
#
# def test_maxheap_we_made(lst, k):
#     maxheap = BinaryMaxHeap()
#
#     for elem in lst:
#         maxheap.insert(elem)
#
#     return [maxheap.extract() for _ in range(k)][k - 1]

def test_maxheap_heapq(lst, k):
    # https://docs.python.org/ko/3/library/heapq.html
    return heapq.nlargest(k, lst)[-1]

# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   1) == 6
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   2) == 5
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   3) == 5
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   4) == 4
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   5) == 3
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   6) == 3
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   7) == 2
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   8) == 2
# assert test_maxheap_we_made([3, 2, 3, 1, 2, 4, 5, 5, 6],   9) == 1


assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   1) == 6
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   2) == 5
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   3) == 5
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   4) == 4
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   5) == 3
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   6) == 3
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   7) == 2
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   8) == 2
assert test_maxheap_heapq([3, 2, 3, 1, 2, 4, 5, 5, 6],   9) == 1