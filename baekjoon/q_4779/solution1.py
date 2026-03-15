# 재귀함수 사용
# top-down 방식

def func1(n):
    global arr

    if arr[n] != -1:
        return arr[n]
    
    arr[n] = func1(n-1) + blank(n-1) + func1(n-1)
    return arr[n]
    
def blank(n):
    return " " * 3**n

while(True):
    try:
        n = int(input())
        arr = [-1] * (n+2)
        arr[0] = "-"
        print(func1(n))
    except:
        break
