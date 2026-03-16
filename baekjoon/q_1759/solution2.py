## 라이브러리 사용

from itertools import combinations

line1 = list(map(int, input().split()))
L = line1[0]
C = line1[1]

arr = input().split()
arr.sort()

for i in combinations(arr, L):
    cnt = 0
    for j in i:
        if j == 'a' or j == 'e' or j == 'i' or j == 'o' or j == 'u':
            cnt += 1
    
    if cnt == 0 or cnt == L or cnt == L-1:
        continue
    else:
        s = ""
        for j in i:
            s += j
        print(s)