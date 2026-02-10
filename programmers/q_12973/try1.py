def solution(s):
    for c in s:
        dup = c + c
        s = s.replace(dup, "")

    if len(s) == 0:
        return 1
    else:
        return 0

### 문제점
##  1. 시간초과
#       - replace()는 O(N)의 시간복잡도를 가짐
#       - 따라서 solution의 시간복잡도는 O(N*N)을 가지게됨
#   => 결국 짝짓기 문제라 스택을 생각할 수 있음