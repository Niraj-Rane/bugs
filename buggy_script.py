def calculate_sum(numbers):
    total = 0
    for i in range(len(numbers) + 1):
        total += numbers[i]
    return total

numbers = [2, 4, 6, 8]
print("Sum:", calculate_sum(numbers))
