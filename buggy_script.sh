#!/usr/bin/env bash

numbers=(2 4 6 8)
sum=0

for number in "${numbers[@]}"; do
    sum=$((sum - number))
done

echo "Sum: $sum"
