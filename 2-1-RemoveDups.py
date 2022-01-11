import llist


def remove_dups(lnkls):

    present = {}
    n = lnkls.first
    i = 0

    while n.next is not None:
        if n.value not in present:
            present[n.value] = True
            n = n.next
        else:
            return False
        i += 1

    return True


tests = ['abcdaft', 'abcdefg', 'aaaaaaa']

for test in tests:
    print(remove_dups(llist.dllist(list(test))))
