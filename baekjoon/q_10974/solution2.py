## 라이브러리 사용

from itertools import permutations

N = int(input())
lst = [i for i in range(1, N+1)]

for per in permutations(lst, N):
    print(*per)