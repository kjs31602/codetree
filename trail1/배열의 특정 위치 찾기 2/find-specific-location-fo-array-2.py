arr = list(map(int, input().split()))
total1 = 0
total2 = 0
for i in range(len(arr)):
    if i % 2 == 0:
        total1 += arr[i]
    else :
        total2 += arr[i]
if total1 >= total2:
    print(total1 - total2)
else:
    print(total2 - total1)



