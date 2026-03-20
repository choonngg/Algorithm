## permutations 라이브러리 사용
from itertools import permutations

N = int(input())
data = [input().split() for _ in range(N)]

count = 0
for ans in permutations(range(1,10), 3):
    is_true = True

    for num, st, bl in data:
        strike = ball = 0
        
        for i in range(3):
            if num[i] == str(ans[i]):
                strike += 1
            elif str(ans[i]) in num:
                ball += 1
        
        if strike != int(st) or ball != int(bl):
            is_true = False
            break
    
    if is_true:
        count += 1

print(count)