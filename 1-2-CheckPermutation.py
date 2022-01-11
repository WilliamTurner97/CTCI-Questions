# 1.2 Check Permutation

def check_permutation(l1, l2):
    count1 = [0] * 128
    count2 = [0] * 128

    for cr in l1:
        count1[ord(cr)] += 1
    for cr in l2:
        count2[ord(cr)] += 1

    return count1 == count2


tests = ['abcdefg', 'bcfaedg', 'abcdaaa']
print(check_permutation(tests[0], tests[1]))
print(check_permutation(tests[0], tests[2]))
