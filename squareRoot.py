x = float(input("Value to calculate the square root of: "))
if x < 0:
    print("Root isn't in the set of real numbers")
    exit()
xk = x / 2
xi = x and ((xk + (x / xk)) / 2) or 0
diff = (xk >= xi) and xk - xi or xi - xk
while diff >= 0.00000001:
    xk = xi
    xi = ((xi + (x / xi)) / 2)
    diff = (xk >= xi) and xk - xi or xi - xk
print("Estimated result:", xi)