#!/usr/local/bin/python3

import sys

sum = sum( n for n in range(1, 100) if (n % 3 == 0 or n % 5 == 0) )

print("the sum is ", sum)

