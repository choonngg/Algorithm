from itertools import combinations

line1 = list(map(int, input().split()))
N = line1[0]
S = line1[1]

numbers = list(map(int, input().split()))

ans = 0
for i in range(1, N+1):
    for com in combinations(numbers, i):
        if sum(com) == S:
            ans += 1

print(ans)