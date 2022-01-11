# 1.3 URLify

def urlify(sl):

    i = len(sl) - 1
    j = len(sl) - 2

    while j >= 0:
        if sl[j] == None:
            j -= 1
            continue
        if sl[j] != ' ':
            sl [i] = sl[j]
            i -= 1
            j -= 1
        else:
            sl[i-2:i+1] = ['%', '2', '0']
            i -= 3
            j -= 1

    return sl


print(urlify(['a', 'b', ' ', 'c', 'd', 'e', ' ', 'e', None, None, None, None]))
