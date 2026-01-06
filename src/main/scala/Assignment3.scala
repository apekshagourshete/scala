import scala.util.control.Breaks.{break, breakable}

object Assignment3 extends App{

  println("Q1.Print numbers from 1 to 10 using a for loop.")//
  def loop(n:Int):Unit={
    for (i<-1 to  n){
      print(i+",")
    }
  }

 loop(10)
  println()
  println("Q2.Print the first 5 even numbers using a for loop.")
  for(i<-1 to 5){
    print(i*2+",")

  }
  println()

  println("Q3.Print the squares of numbers from 1 to 7 using a for loop.")
  for(i<-1 to 7){
    print(i*i+",")
  }
  println()

  println("Q.4. Print characters of the word \"HELLO\" one by one using a for loop. ")

  def printChar(str:String) : Unit =
  {
    for(ch <- str ){
      print(ch+",")
    }
  }

  printChar("Hello")
  println()

  println("Q.5. Print the elements of a list [10, 20, 30, 40, 50] using a for loop. ")
  val l= List(10, 20, 30, 40, 50)
  for(i<-l){
    print(i+",")
  }

  println()
  println("Q.6. Print numbers from 10 to 1 (reverse order) using a for loop. ")

  for(i<-10 to 1 by -1){
    print(i+",")
  }
  println()

  println("Q.7. Print the multiplication table of 4 (4×1 to 4×10) using a for loop.")

  for(i<- 1 to 10){
    println(s"4x$i="+4*i)
  }
  println("Q.8. Print the sum of numbers in the list [3, 5, 7, 9] using a for loop. ")
  val l1=List(3, 5, 7, 9)
  var cnt=0
  for(i<-l1){
    cnt+=i
  }
  println(cnt)
  println("Q.9. Print all vowels in the string \"education\" using a for loop. ")
  val s="education"
  val vowels="aeiou"
  for(i<-s){
    for(j<-vowels){
      if(i==j){
        print(i+",")
      }
    }
  }
  println()

  println("Q.10. Print a specific character in a string [Presence of character in a given string can be check using \ncontains] Example: “scala” -> s")
  val s1="scala"
  val ch='s'
  for(c<-s1){
    if(ch==c){
      println(s"String contains $ch")
    }
    else{
      println(s"string dosent contain $ch")
    }
  }
  //or
  if(s1.contains(ch)){
    println(s"string contains $ch")
  }else{
    println(s"string dosent contain $ch")
  }

  println("Q.11. Print even-indexed characters in a string using a for loop. \nExample: \"hello\" -> h, l, o")
  val s2="hello"
  print(s2+"->")
  for(i<- 0 until s1.length){
    if(i%2==0){
      print(s2.charAt(i)+",")
    }
  }
  println()

  //While Loop Questions
  println("Q.1. Print numbers from 5 to 1 using a while loop.")
  var N=5
  while(N>=1){
    print(N+",")
    N-=1
  }
  println()

  println("Q.2. Print the first 6 odd numbers using a while loop.")  ////Expected Output: 1, 3, 5, 7, 9, 11
  var count=0
  var num=1
  while(count<=5){
    if(num%2!=0){
      print(num+",")
      count+=1
    }
    num+=1
  }
//or
  println()
  var co=0
  var n=1
  while (co <= 5) {
    print(n + ",")
    n += 2
    co += 1
  }
println()

  println("3. Print all characters of a string using a while loop. (“Education”)")
  val s3="Education"
  var len=s3.length
  var i=0
  while(i<len){
    print(s3.charAt(i)+",")
    i+=1
  }
  println()

  println("Q.4. Print the sum of numbers from 1 to 20 using a while loop.")
  var nb=1
  var sum=0
  while(nb<=20){
    sum+=nb
    nb+=1
  }
  println(sum)

  println("Q.5. Print the factorial of 6 using a while loop.")
  var fact=1
  var nm=6
  while(nm>=1){
    fact=fact*nm
    nm-=1
  }
 println(fact)

  println("Q.6. Reverse a string using a while loop.")
  //Example: "code" => "edoc"

  val s4="code"
  var in=s4.length-1
  var rev=""
  while(in>=0){
    rev+=s4.charAt(in)
    in-=1
  }
  print(rev)
  println()

  println("Q.7. Count the number of digits in a number using a while loop.")
  //Example: number = 12345 => 5 digits
  var number = 12345
  val og=number
  var count1 = 0

  while (number != 0) {
    number = number / 10
    count1 += 1
  }

  println(s"$og is $count1 number")

  println("Q.8. Print all elements of a list using a while loop.")
  val list=List( 2, 4, 6, 8, 10)
  var k=0
  while (k<list.length){
    print(list(k)+",")
    k+=1
  }
  println()

  println("Q.9. Print numbers from 1 to 20, but skip numbers divisible by 3 using a while loop.")
  var y=1
  while(y<=20){
    if(y%3 !=0){
      print(y+",")
    }else{print("skip,")}
    y+=1
  }
  println()

  println("Q.10. Print the square of all even numbers from 2 to 10 using a while loop.")

  var no=2
  while(no<=10){
    if(no%2==0){
      println(s"square of $no :"+no*no)
    }
    no+=1
  }
  println()
  //Pattern Questions (Loops + Logic)

  println("Q11.Print pattern using a for loop:")
  //#
  //##
  //###
  //####
  for(i<- 1 to 4){
    for(j<- 1 to i){
      print("#")
    }
    println()
  }

  println("Q12.Print pattern using a while loop:")
  //1
  //12
  //123
  //1234
   for(i<- 1 to 4){
     for(j<- 1 to i){
       print(j)
     }
     println()
   }

  println("Q13.Print the following using a for loop:") //10 //20 30....//100

  for(i<- 1 to 10){
    println(10*i)
  }

  println("Q14.Print numbers from 1 to 30 but break when number is 17. (Use loop + break)")
  breakable{
    for(i<- 1 to 30){

    if(i==17){
      break();
    }else{print(i+",")}

  }}
   println()

  println("Q.15.Print numbers from 1 to 10, skip 5 and 6. ")//(Use loop + continue)

  for (i <- 1 to 10) {
    if (i != 5 && i != 6) {
      print(i + ",")
    }
  }




}

