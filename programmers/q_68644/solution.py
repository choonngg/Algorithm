def solution(numbers):
    answer = []
    n = len(numbers)
    for i in range(n):
        for j in range(n):
            if i == j: continue
            if i > j: continue
            answer.append(numbers[i] + numbers[j]) 
    
    # answer = list(set(answer))
    # answer.sort()
    answer = sorted(set(answer))    # set의 sorted는 리스트를 반환
    return answer

arr = [5,0,2,7]
print(solution(arr))