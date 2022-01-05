# 1.1 Is Unique

def is_unique(ls):

    if len(ls) > 128:
        return False

    present = [False] * 128
    for i in range(len(ls)):
        if present[ord(ls[i])]:
            return False
        else:
            present[ord(ls[i])] = True

    return True


tests = ['abcdafg', 'abcdefg', 'bcdefb']
for s in tests:
    print(is_unique(s))
