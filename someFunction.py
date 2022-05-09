def fn(x):
    return (((x ** 3) - (x ** 2)) - (13 * x)) + 8

a = float(input("Start of range: "))
b = float(input("End of range: "))
n = 1
c = (a + b) / 2
fc = fn(c)
while (((b - a) / 2) >= 0.0000001) and (fc != 0):
    fa = fn(a)
    if(abs(fc + fa) == (abs(fc) + abs(fa))):
        a = c
    else:
        b = c
    n += 1
    c = (a + b) / 2
    fc = fn(c)
print("Result: ", c)
print("Number of iterations: ", n)