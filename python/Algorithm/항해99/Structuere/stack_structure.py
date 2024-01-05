# 스택의 개념
# First In Last Out
"""
    나중에 들어온 것이 위에 있어서 먼저 꺼낸다.
    즉, top이란 성질을 넣어줘야 한다.

    그리고 스택 안에 들어오는 것을 노드라고 부르고.
    노드에는 자신의 값과 next를 가리키는 속성을 가진다.

    push를 할 때, 값을 넣어주고. self.top 속성을 바꾸어 준다.

"""

class Node:
    def __init__(self, item, next):
        self.item = item
        self.next = next


class stack:
    def __init__(self):
        self.top = None

    # 스택이 비웠는지 확인하는 법 => top이 비웠는지 확인하면 된다.
    def is_empty(self):
        return self.top is None

    # 스택의 self.top이 None인 경우 : Node의 next를 None으로 한 상태에서 노드를 값을 넣어준다.
    # 스택의 self.top이 값이 있는 경우 : 먼저 온 값을 next로 연결한 후 노드를 생성해준다.

    # 그 후 새로운 노드를 self.top으로 지정해준다. => 새로운 노드를 pop 할 수 있는 상태를 만들어주는 것이다.
    def push(self, val):
        self.top = Node(val, self.top)


    # 값을 꺼낼 때는 top의 값이 없으면 값을 꺼내지 않고 있으면 꺼낸다.
    # 만약 값을 꺼냈다면, 스택이 가리키는 top(node)룰 알려줘야 한다. 그러기 위해서 self.top에 noed.next를 넣어준다.
    def pop(self):
        if self.top is None:
            return None
        else:
            node = self.top
            self.top = self.top.next

            return node.item