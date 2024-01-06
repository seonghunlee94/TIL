
# 노드 하나씩을 만들어주는 클래스
class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None


# 링크드 리스트 : 노드들을 연결해주는 자료구조 생성.
class LinkedList:
    def __init__(self):
        self.head = None

    def append(self, val):
        print("11")
        if not self.head:
            print("ss")
            self.head = ListNode(val)
            return
        print("33")
        node = self.head
        while node.next:
            node = node.next
        node.next = ListNode(val)


lst = [1, 2, 3]
l1 = LinkedList()
for e in lst:
    l1.append(e)

print(l1)



