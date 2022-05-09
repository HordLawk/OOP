x = float(input())
if not x:
    print("No input")
    exit()
lowest = highest = x
x = float(input())
while x:
    if x < lowest:
        lowest = x
    elif x > highest:
        highest = x
    x = float(input())
print("Lowest: ", lowest)
print("Highest: ", highest)