import math

n = int(input("Number: "))
if n < 2:
    print("Input an integer higher than 1")
    exit()
for i in range(2, math.floor(n / 2) + 1):
    if not (n % i):
        print("Lowest divisor:", i)
        exit()
print("The number is prime")