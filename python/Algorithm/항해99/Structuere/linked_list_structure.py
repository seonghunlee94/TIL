
# 노드 하나씩을 만들어주는 클래스
class ListNode:
    def __init__(self, val, next):
        self.val = val
        self.next = next


# 링크드 리스트 : 노드들을 연결해주는 자료구조 생성.
class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, val):
        if not self.head:
            self.head = ListNode(val, None)
            return
        node = self.head
        while node.next:
            node = node.next
        node.next = ListNode(val, None)


lst = [1, 2, 3]
l1 = LinkedList()
for e in lst:
    l1.append(e)
print(l1)



