def solution(s):
    l = len(s)
    result = 0
    for i in range(l):
        stack = []
        isTrue = True
        for j in s:
            if (j == '(' or j == '{' or j == '['):
                stack.append(j)
            else:
                if (len(stack) == 0):
                    isTrue = False
                    break

                if (j == ')'):
                    if (stack[len(stack)-1] == '('):
                        stack.pop()
                    else:
                        isTrue = False
                        break
                elif (j == ']'):
                    if (stack[len(stack)-1] == '['):
                        stack.pop()
                    else:
                        isTrue = False
                        break
                elif (j == '}'):
                    if (stack[len(stack)-1] == '{'):
                        stack.pop()
                    else:
                        isTrue = False
                        break
                
        if (len(stack) != 0):
            isTrue = False

        if (isTrue) :
            result += 1
        s = s[1:] + s[0]

    return result

print(solution("}]()[{"))