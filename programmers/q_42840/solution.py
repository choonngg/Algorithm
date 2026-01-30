def solution(answers):
    result = []
    peoples = [[1,2,3,4,5],
               [2,1,2,3,2,4,2,5],
               [3,3,1,1,2,2,4,4,5,5]]
    counts = [0, 0, 0]

    for i in range(len(peoples)):
        n = len(peoples[i])
        for j in range(len(answers)):
            if (answers[j] == peoples[i][j%n]):
                counts[i] += 1
    
    max_count = max(counts)
    for i in range(len(counts)):
        if (max_count == counts[i]):
            result.append(i+1)

    return result

answers = [1,3,2,4,2]
print(solution(answers))