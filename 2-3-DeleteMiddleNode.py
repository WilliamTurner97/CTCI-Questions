# 2.3 Delete Middle Node

import llist


def delete_middle_node(l,m):
    while m.next.next is not None:
        m.value = m.next.value
        m = m.next

    l.remove(m.next)


test = ['abcdefghijklmnop']

for i in range(3,6):
    l = llist.sllist(list(test[0]))
    delete_middle_node(l, l.nodeat(i))
    print(l)
