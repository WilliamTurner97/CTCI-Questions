# 1.4 Palindrome Permutation


def palindrome_permutation(ips):

    count = [0] * 128
    odd_found = False

    for cr in ips:
        count[ord(cr)] += 1

    for x in count:
        if x % 2 == 0:
            continue
        if x % 2 == 1 and odd_found:
            return False
        else:
            odd_found = True

    return True


tests = ['abcdcba', 'abcddcba', 'bacabaca', 'xyz', 'abcfgcba']
for t in tests:
    print(palindrome_permutation(t))
