
# queue 개념
# First In First Out

"""
    먼저 들어온 것을 먼저 꺼낸다.
    front가 무엇인지 알아야 한다.

    node는 item와 next 속성이 필요하다.

    front 값이 꺼내지면
    self.front에 node.next로 교체해줘야 한다.

"""

class Node:
    def __init__(self, item, next):
        self.item = item
        self.next = next


class Queue:
    def __init__(self):
        self.front = None

    def push(self, value):
        if not self.front:
            self.front = Node(value, None)
            return

        node = self.front
        while node.next:
            node = node.next
        node.next = Node(value, None)

    def pop(self):
        if not self.front:
            return None

        delete_node = self.front
        self.front = self.front.next
        return delete_node.item

    def is_empty(self):
        return self.front is None

my_queue = Queue()

my_queue.push(1)
my_queue.push(3)
my_queue.push(5)

print(my_queue.pop())
print(my_queue.pop())
print(my_queue.pop())
print(my_queue.pop())
