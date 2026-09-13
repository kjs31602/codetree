arr = list(map(int, input().split()))

n = len(arr)

sum_val = 0
for i in range(1, n, 2):
    sum_val += arr[i]
sum_val1 = 0
for j in range(2, n, 3):
    sum_val1 += arr[j]
print(sum_val, f"{sum_val1/3:.1f}")
