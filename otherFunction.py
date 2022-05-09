def fn(x):
    return (((x ** 3) - (x ** 2)) - (13 * x)) + 8

def dxfn(x):
    return ((3 * (x ** 2)) - (2 * x)) - 13

x0 = float(input("Initial estimate: "))
n = 1
x1 = x0 - (fn(x0) / dxfn(x0))
while abs(x1 - x0) >= 0.0000001:
    n += 1
    x0 = x1
    x1 = x0 - (fn(x0) / dxfn(x0))
print("Result: ", x1)
print("Number of iterations: ", n)