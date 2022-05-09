import math

n = int(input("Number: "))
for i in range(n - 1, 1, -1):
    for k in range(2, math.floor(i / 2) + 1):
        if not (i % k):
            break
    else:
        print("First prime number lower than", n, ":", i)
        exit()
print("No prime number found")