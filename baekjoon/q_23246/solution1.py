n = int(input())
players = [list(map(int, input().split())) for _ in range(n)]
players = sorted(players, key = lambda x:(x[1]*x[2]*x[3], x[1]+x[2]+x[3], x[0]))
print(players[0][0], players[1][0], players[2][0])