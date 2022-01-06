# 1.5 One Away


def one_away(s1, s2):

    i = 0
    j = 0
    stop = False

    while not stop:
        ic = s1[i] == s2[i]
        jc = s1[len(s1) - (j + 1)] == s2[len(s2) - (j + 1)]

        if ic:
            i += 1
        if jc:
            j += 1
        if (not (ic or jc)) or i == len(s1) - 1 or i == len(s2) - 1:
            stop = True

    return (len(s1) + len(s2)) - 2 * (i+j+2) < 2


tests = [['pale','ple'], ['pales', 'pale'], ['pale', 'bale'], ['pale', 'bake']]
for test in tests:
    print(one_away(test[0], test[1]))
