def main():
   numbers = eval(input("Give me an array of numbers: "))
   smallest = numbers[0]
   for i in range(0,len(numbers),1):
      if (numbers[i] < smallest):
         smallest = numbers[i]
   print("The smallest number is: ", smallest)
main()