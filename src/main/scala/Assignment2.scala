object Assignment2 extends App {

  //1. Convert Kilograms to Grams
  //Write a program to convert 82 kg to grams.
  //Expected Output: 82000 g

  def intoGrams(kg: Int): Int = {
    var grams = kg * 1000
    return grams
  }

  println(s"Q1: " + intoGrams(82) + "g")


  //2. Celsius to Fahrenheit Conversion
  //Convert 35°C to Fahrenheit using the formula (C × 9/5) + 32.

  def intoFahrenheit(c: Int): Int = {
    var F = (c * 9 % 5) + 32
    return F
  }

  println("Q2:" + intoFahrenheit(35) + "f")

  //3. Find the Largest of Three Numbers
  //Declare and initialize 3 variables and print the largest.
  //Example: x = 45, y = 68, z = 33

  def largeOf3(x: Int, y: Int, z: Int): Int = {
    if (x > y && x > y) {
      return x
    } else if (y > x && y > z) {
      return y
    } else {
      return z
    }
  }

  println("Q3:" + largeOf3(45, 68, 33) + " is Largest")

  //4. Conditional Number Evaluation
  //• Store a number.
  //• If not in range 150–950, print "Invalid number".
  //• If valid:
  //o Check if it's even or odd.
  //o If even → divide by 4, print remainder.
  //o If odd → divide by 3, print remainder.
  //Input: number = 721

  def eval(number: Int): Unit = {
    if (number < 150 || number > 950) {
      println("Invalid number")
    } else {
      if (number % 2 == 0) {
        val remainder = number % 4
        println(s"Even number, remainder after dividing by 4 is $remainder")
      } else {
        val remainder = number % 3
        println(s"Odd number, remainder after dividing by 3 is $remainder")
      }
    }
  }
  print("Q4.:")
  eval(721)
  println()
  //5. Range & Labeling Evaluation
  //If number is in [0–100]:
  //• 90–100: "Genius"
  //• 80–89: "Excellent"
  //• 70–79: "Very Good"
  //• 60–69: "Good"
  //• 40–59: "Average"
  //• 0–39: "Fail"
  //Else, print "Invalid input"
  //Input: score = 75

  def remarks(marks:Int):String={
    if(marks >=90 && marks<=100 ){
      return "Genius"
    }else if(marks >=80 && marks<=89){
      return "Excellent"
    }else if(marks >=70 && marks<=79){
      return "Good"
    }else if(marks >=60 && marks<=69){
      return "Average"
    }else if(marks >=40 && marks<=59){
      return "Fail"
    } else if(marks >=0 && marks<=39){
      return "Fail"
    }else{
      return "Invalid input"
    }
  }

  println("Q5."+remarks(75))

  //6. Simple Calculator using Match / if- elif
  //Accept two numbers and an operator (+, -, *, /, %)
  //Input: a = 25, b = 6, op = %

  def calculator(a: Int, b: Int, op: Char): Int = op match {
    case '+' => return a + b
    case '-' => return a - b
    case '*' => return a * b
    case '/' => return a / b
    case '%' => return a % b
    case _ => return 0
  }

  println("Q6." + calculator(2, 3, '*'))

  //7. Repeat Phrase with Loop
  //Print "LEARN SCALA PYTHON" 75 times.
//  def Loop(n:Int):Unit={
//    for(i<-1 to  n){
//      println(s"LEARN SCALA PYTHON $i")
//    }
//  }
//  Loop(75)

  //8. Print Numbers Divisible by 14
  //From 120 to 360, print numbers divisible by 14.
  print("Q8.")
    for (n <- 120 to 360) {
      if (n % 14 == 0) {
        print(n +",")
      }
    }
  //9. Sum Numbers in a Range
  //Sum all numbers from 60 to 170.
  println()
  print("Q9.")
  var sum=0
  for(i<-60 to 170){
    sum+=i
  }
  println(sum)

  //10. Print Even Numbers: 350 to 500
  //Output all even numbers in this range.
  print("Q10.")
  for(i<-350 to 500){
    if(i%2==0){
      print(i +",")
    }
  }
  println()
  print("Q11.")

  //11. Print Odd Numbers Reverse: 401 to 201
  //Print all odd numbers from 401 to 201 (decrementing).
  for (i <- 400 to 201 by -1) {
    if (i % 2 != 0) {
      print(i + ",")
    }
  }

  //12. Count Even Numbers in Range
  //Count even numbers between 45 and 145.
  println()
  print("Q12.")
  var count=0
  for (i <- 45 to 145) {
    if (i % 2 == 0) {
      count+=1
    }
  }
  println(count)

  //13. Print Alternate Even Numbers (Start from 36)
  //Pattern: 36, 40, 44, ..., 140
  print("Q13.")
  for (i <- 36 to 140 by 4) {
    if (i % 2 == 0) {
      print(i+",")
    }
  }

  //14. Alternate Even Numbers Starting from 38
  //Pattern: 38, 42, 46, ..., 140
  //Math Patterns & Series
  println()
  print("Q14.")
  for (i <- 38 to 140 by 4) {
    if (i % 2 == 0) {
      print(i+",")
    }
  }
 println()
  //15. Multiplication Pattern & Result
  //Print:  3*4, 4*5, ..., 15*16
  //Show both pattern and product.
  println("Q15.")

  for (i<-3 to 15  ){
    for (j<-i+1 to 16 by 13){
      println(s"$i*$j="+i*j)
    }
  }

  //16. Sum Even Numbers from 280 to 480
  var sum1=0
  for(i<-280 to 480){
    if (i%2==0){
      sum1+=i
    }
  }
println("Q16.sum of even numbers :"+sum)

  //17. Print All Alphabets
  //Use a loop to print a–z (or A–Z if you prefer).
  println("Q17:")
  for(ch <- 'a' to 'z'){
        print(ch+" ")
    }
  println()
  for(ch <- 'A' to 'Z'){
    print(ch+" ")
  }
  println()

  //18. Find Average of Series
  //Find the average of: 28, 30, 32, ..., 96
  print("Q18.")

  var sm=0
  var cnt=0
  for(i<-28 to 96 by 2){
    cnt+=1
    sm=(sm+i)

  }
  val avg=sm/cnt
  println(" Average ="+avg)

  //19. Sum of Squares Series
  //Compute: 55² + 57² + ... + 95²
  print("Q19.")
  var sum2=0
  for(i<-55 to 95 by 2){

    sum2+=i*i
  }
  println(sum2)

  //20. Print A and B Alternately
  //Print: A, B, A, B, ... → 100 times.
  print("Q20.")

  for (_ <-1 to  100){

      print("A,B,")
  }
  println()
  //21. Pattern: n@(n-1)
  //Print: 18@17, 17@16, ..., 1@0
  print("Q21.")
  for (i <- 18 to 1 by -1) {
    print(s"$i@${i - 1}, ")
  }
   println()
  //22. Progressive 250s Series
  //Print: 250, 500, 750, ..., 10000
  print("Q22.")
  for (i <- 250 to 10000 by 250) {
    print(i+",")
  }
  println()
  //23. Odd Squares Series
  //Print: 13², 15², ..., 29²
  print("Q23.")
  for (i <- 13 to 29 by 2) {
    print(s"$i² = ${i * i},")
  }
  println()
  //24. Alternating Values Series
  //Print: 6, 12, 6, 12, ..., (7 times)
  print("Q24.")

  for (i <-1 to  7){

    print("6,12,")
  }
  println()

  print("Q25.")
  //25. Decreasing Multiplication
  //Print: 6*4, 6*3, ..., 6*(-10) (both pattern and result)
  for (i <- 4 to -10 by -1) {
    print(s"6*$i = ${6 * i}, ")
  }
  println()
  //26. Even-Odd Label Series
  //Print: 1, even, 3, even, ..., 33, even
  print("Q26.")
  for (i<-1 to  34){
    if (i%2==0){
      print("Even,")
    }else{
      print(i+",")
    }
  }
  println()

  //27. Factor of Five Labeling
  //Print: 1, 2, factor of five, 4, 5, factor of five, ..., 30
  print("Q27.")
  for(i<-1 to 30){
    if (i%3==0){
      print("factor of Five,")
    }else{
      print(i+",")
    }
  }
  println()
  //28. Divisible by 4 Label
  //Print: 1, 3, divisible by 4, 5, 7, ... up to 25
  print("Q28.")
  for (i <- 1 to 25) {
    if (i % 4 == 0)
      print("divisible by 4,")
    else
      print(i+",")
  }
  println()
  //29. Floating Point Square Series
  //Print: 0.6², 0.8², ..., 4.6²
  print("Q29.")
  for (i <- 1 to 25) {
    if (i % 4 == 0) {
      print("divisible by 4,")
    } else if (i % 2 != 0) {
      print(i+",")
    }
  }
  println()
  //30. Write an Infinite Loop
  //Use while(true) or for(;;) for an infinite loop.
  print("Q30.")
  println()
  //31. Nested Loops Execution Flow
  //Write a loop inside another (e.g., outer 1–3, inner 1–2) and print flow like:
  print("Q31.")
  for (i <- 1 to 3) {
    print(s"Outer loop: $i,")
    for (j <- 1 to 2) {
      print(s"  Inner loop: $j,")
    }
  }

}
