def solution(s):
    stack = []
    for c in s:
        if stack and c == stack[-1]:
            stack.pop()
        else:
            stack.append(c)
    
    if not stack:
        return 1
    else:
        return 0
    
print(solution("baabaa"))
print(solution("cdcd"))