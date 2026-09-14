N, Q = map(int, input().split())
arr = list(map(int, input().split()))

for i in range(Q):
    q = list(map(int, input().split()))
    t = q[0]
    if t == 1:
        a = q[1]
        print(arr[a-1])
    elif t == 2:
        b = q[1]
        if b in arr:
            print(arr.index(b) + 1)
        else :
            print(0)
    elif t == 3:
        s = q[1]
        e = q[2]
        for i in range(s - 1, e):
            print(arr[i], end=' ')
        print()

