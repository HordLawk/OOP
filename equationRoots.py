import math

def read(field):
    coef = float(input("{}: ".format(field)))
    while math.isnan(coef):
        coef = input("Value must be a number\n{}: ".format(field))
    return coef

a = read("a")
b = read("b")
c = read("c")
delta = (b * b) - (4 * a * c)
if delta < 0:
    print("Root isn't in the set of real numbers")
    exit()
print("x1:", (-b + math.sqrt(delta)) / (2 * a), "\nx2:", (-b - math.sqrt(delta)) / (2 * a))