def numbers = [2, 4, 6, 8]
def sum = 0

for (int i = 0; i <= numbers.size(); i++) {
    sum += numbers[i]
}

println "Sum: ${sum}"
