def func1(n):
    if n <= 0: 
        return 0
    if n == 1: 
        return 1
    return func1(n-1) + func1(n-2)

print(func1(int(input())))