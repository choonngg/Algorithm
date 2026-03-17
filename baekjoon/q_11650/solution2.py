## solution1 코드를 더 깔끔하게 쓴 방식

N = int(input())
lst = [list(map(int, input().split())) for _ in range(N)]

lst = sorted(lst)

for x, y in lst:
    print(x, y)