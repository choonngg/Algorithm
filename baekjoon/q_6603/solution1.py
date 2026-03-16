## 직접 함수 구현

def combination(index, level):
    global k, choose, s

    if level == 6:
        print(*choose)
        return
    
    for i in range(index, k):
        choose.append(s[i])
        combination(i+1, level+1)
        choose.pop()

while True:
    data = list(map(int, input().split()))
    k = data[0]
    s = data[1:]
    choose = []

    if k == 0:
        break
    
    combination(0,0)
    print()