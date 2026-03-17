N = int(input())
lst = []
for _ in range(N):
   data = input().split()
   lst.append((int(data[0]), int(data[1])))

lst = sorted(lst)

for srd in lst:
   print(f"{srd[0]} {srd[1]}")