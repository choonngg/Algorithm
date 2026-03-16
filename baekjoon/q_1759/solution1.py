## 직접 구현

def combinations(index, level):
    global L, C, arr

    if level == L:
        # 여기서 필터링
        # 모음개수 = 0, L, L-1인 경우 제외
        cnt = 0
        for i in choose:
            if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':
                cnt += 1
        
        if cnt == 0 or cnt == L or cnt == L-1:
            return
        else:
            s = ""
            for i in choose:
                s += i
            print(s)
            return
    
    for i in range(index, C):
        choose.append(arr[i])
        combinations(i+1, level+1)
        choose.pop()


choose = []
line1 = list(map(int, input().split()))
L = line1[0]
C = line1[1]

arr = input().split()
arr.sort()
combinations(0,0)