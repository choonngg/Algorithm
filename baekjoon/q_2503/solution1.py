N = int(input())
data = []
for _ in range(N):
    data.append(list(map(int,input().split())))

count = 0
answer = 0
for q in range(1, 10):
    answer += q * 100
    for w in range(1, 10):
        if q == w: continue
        answer += w * 10
        for e in range(1, 10):
            if q == e or w == e: continue
            answer += e
            is_true = True
            for r in range(N):
                dt = data[r][0]
                s1 = data[r][1];    b1 = data[r][2]
                strike = 0;         ball = 0
                
                if dt // 100 == answer // 100:
                    strike += 1
                if (dt % 100) // 10 == (answer % 100) // 10:
                    strike += 1
                if (dt % 100) % 10 == (answer % 100) % 10:
                    strike += 1
                
                if (str(dt // 100) in str(answer)):
                    ball += 1
                if (str((dt % 100) // 10) in str(answer)):
                    ball += 1
                if (str((dt % 100) % 10) in str(answer)):
                    ball += 1
                ball -= strike
                
                if s1 != strike or  b1 != ball:
                    is_true = False
                    break

            if is_true:
                count += 1
            answer -= e
        answer -= w * 10
    answer -= q * 100

print(count)