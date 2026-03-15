def fibo(n):
    global arr

    if arr[n] != -1:
        return arr[n]
    
    arr[n] = fibo(n-1) + fibo(n-2)
    return arr[n]
    
n = int(input())
arr = [-1] * (n + 2)
arr[0] = 0
arr[1] = 1

print(fibo(n))