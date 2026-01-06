import scala.util.control.Breaks._
object Assignment1 extends App {

  //Q1.Check for Even AND Positive Number
  //Write a Scala function to check if a given number is both even and positive.
  //Sample Data: Number: 28

    def isEven(n: Int): Boolean = {

      if (n > 0 && n % 2 == 0) {
        return true
      }
      else return false
    }

    print("Q1.is even: "+ isEven(27))

  // Q2. Range Check with OR
  //  Determine if a given value
  //  is either less than -10 or greater than 10.Sample Data: Value:13

  def isGreater(N: Int): Unit = {
    if (N > 10) {
      println("Q2:Yes greater than 10")
    }
    else println("Q2:Less than 10")
  }

  isGreater(13)

  // Q3. Odd Number Check with AND
  //  Check if a number is odd and not divisible by 3.
  //    Sample Data: Number: 17

    def isOdd(n: Int): Boolean = {

      if (n % 3 != 0 && n % 2 != 0) {
        return true
      }
      else return false
    }

    println("Q3:is Odd: " + isOdd(17))

  // Q4. Divisibility by 4 OR 6
  //  Check if a number is divisible by either 4 or 6.
  //    Sample Data: Number:36

  def isDivisible(n: Int): String = {
    if (n % 4 == 0 || n % 6 == 0) {
      return ("Q4.:yes divisible")
    } else ("Q4.:Not divisble")
  }

  println(isDivisible(36))

  // Q5. Eligibility for Voting OR Driving
  //   Check if a person is eligible to vote (age ≥ 18) or drive(age ≥ 16).
  //    Sample Data:Age: 17

  def isEligible(age: Int): String = {
    if (age >= 18) {
      return "Q5.:Yes you are eligible!"
    } else return "Q5.:Come Nxt Year"

  }

  println(isEligible(17))

  // Q6. Multiple Range Check
  //  Check if a number is in the range[1, 10] or[20, 30].
  //    Sample Data: Number: 8

    def LieIn(n:Int):String={
      if(n>1 && n < 10 ){
        return "Lie in Between 1-10"
      }else if(n>20 && n < 300){
        return "Lie in Between 20-30"
      } else return "Not lie in 1-10 or 20-30"

    }
    println("Q6.:"+LieIn(8))

  // Q7. Check for Negative AND Odd Number Check
  //  if a number is both negative and odd.
  //  Sample Data:Number: -15

  def isNegativeOdd(n:Int):String={
    if(n<0 && n%2!=0){
      return "yes its -ve and odd"
    }else return  "No its not"
  }
  println("Q7."+isNegativeOdd(-15))

  // Q8. Eligibility for Senior Discount OR Student Discount
  //  Check if age > 60 or age < 25.
  //  Sample Data: Age:22

  def checkDiscount(age: Int): String = {
      if (age < 25) {
        return "eligible for Student Discount"
      } else if (age > 60) {
        return "eligible for Senior Discount"
      } else return "Not Eligible"
    }

    println("Q8."+checkDiscount(22))

 //Q9.Divisibility by 5 AND 7
  //Check if a number is divisible by both 5 and 7.
  //Sample Data: Number: 70

    def isDivisible5_7(n: Int): String = {
      if (n % 5 == 0 && n % 7 == 0) {
        return ("yes divisible by 5 and 7")
      } else ("Not divisble")
    }

    print("Q9."+isDivisible5_7(70))

  //Q10. Check for Non-Negative OR Even Number
  //Check if a number is either non-negative or even.
  //Sample Data: Number: -3

    def isPositiveEven(n: Int): Boolean = {

      if (n >= 0 || n % 2 == 0) {
        return true
      } else return false

    }
    println("Q10."+isPositiveEven(-3))

  //Q11. Check for Prime AND Odd Number
  //Check if a number is both prime and odd.
  //Sample Data: Number: 13

  def isPrimeOdd(n: Int): String = {
    var flag = false
    for (i <- 2 until n) {
      if (n % i == 0) {
        flag = true
      }
    }
    if (!flag && n % 2 != 0) {
      return ("its prime and odd")
    } else if (n % 2 != 0) {
      return "its odd only"
    } else if (!flag) {
      return "its prime only"
    }
    else {
      return ("Not prime no nor odd")
    }
  }

  println("Q11."+isPrimeOdd(13))


  // Q12.Eligibility for Discount OR Free Shipping
  //Check if purchase > 150 or purchase > 100.
  //Sample Data: Purchase Amount: 155

    def eligible_for_freeSshipping(amt: Int): String = {
      if (amt > 100) {
        return "Free shipping unlocked"
      } else return "Add more item to unlock free shipping"
    }

    println("Q12."+eligible_for_freeSshipping(100))

  //Q13.Divisibility by 3 OR 8
  //Check if a number is divisible by either 3 or 8.
  //Sample Data: Number: 16

    def isDivisible3_8(n: Int): String = {
      if (n % 3 == 0 || n % 8 == 0) {
        return ("yes divisible either 3 or 8/both")
      } else ("Not divisble")
    }

    println("Q13."+isDivisible3_8(16))


//  Q14.Check for Non-Positive AND Even Number
//  Check if a number is both non-positive and even.
//  Sample Data: Number: 0

    def isNegativeEven(n: Int): Boolean = {

      if (n < 0 && n % 2 == 0) {
        return true
      } else return false

    }

    println("Q14."+isNegativeEven(0))


  //Q15.Age Group Classification with AND
  //Classify as child (<13), teen (13–19), adult (≥20).
  //Sample Data: Age: 19

    def ageGroup(age: Int): String = {
      if (age < 13) {
        return "child group"
      } else if (age >= 13 && age <= 19) {
        return "teen group"
      } else return "adult group"
    }

    println("Q15."+ageGroup(20))

  //Q16.Check for Divisibility by 2 OR 5
  //Check if a number is divisible by either 2 or 5.
  //Sample Data: Number: 40

    def isDivisible2_5(n: Int): String = {
      if (n % 2 == 0 || n % 5 == 0) {
        return ("yes divisible either 2 or 5/both")
      } else ("Not divisble")
    }

    println("Q16."+isDivisible2_5(40))

  //17.Eligibility for Senior Discount AND Student Discount
  //Check if age > 60 and age < 25 (impossible case).
  //Sample Data: Age: 18

  //already covered in Q8.

  //18. Check for Multiple of 3 AND 7
  //Check if a number is divisible by both 3 and 7.
  //Sample Data: Number: 42

    def isDivisible3_7(n: Int): String = {
      if (n % 3 == 0 && n % 7 == 0) {
        "Yes divisible by both 3 and 7"
      } else "Not divisible"
    }

    println("Q18."+isDivisible3_7(42))

  //19. Divisibility by 5 OR 9
  //Sample Data: Number: 27

  def isDivisible5_9(n: Int): String = {
    if (n % 5 == 0 || n % 9 == 0) {
      "Yes divisible by 5 or 9"
    } else "Not divisible"
  }

  println("Q19."+isDivisible5_9(27))

  //20. Check for Odd AND Not Divisible by 4
  //Sample Data: Number: 9

  def isDivisible2_4(n: Int): String = {
    if (n % 2 != 0 && n % 4 != 0) {
      "Odd and not divisible by 4"
    } else "Condition not satisfied"
  }

  println("Q20."+isDivisible2_4(9))

  //21. Check for Divisibility by 3 AND 5
  //Sample Data: Number: 90

  def isDivisible3_5(n: Int): String = {
    if (n % 3 == 0 && n % 5 == 0) {
      "Yes divisible by 3 and 5"
    } else "Not divisible"
  }

  println("Q21."+isDivisible3_5(90))

  //22. Eligibility for Discount OR Membership Benefits
  //Check if purchase > 200 or has loyalty card.
  //Sample Data: Purchase Amount: 140, Loyalty Card: true

  def checkDiscount(amount: Int, card: Boolean): String = {
    if (amount > 200 || card) {
      "Eligible for discount"
    } else "Not eligible"
  }

  println("Q22."+checkDiscount(140, true))

  //23. Divisibility by 2 OR 3
  //Sample Data: Number: 4

  def isDivisible2_3(n: Int): String = {
    if (n % 2 == 0 || n % 3 == 0) {
      "Yes divisible by 2 or 3"
    } else "Not divisible"
  }

  println("Q23."+isDivisible2_3(4))

  //24. Check for Positive AND Not Divisible by 3
  //Check if a number is positive and not divisible by 3.
  //Sample Data: Number: 10

  def isDivisible_3(n: Int): String = {
    if (n > 0 && n % 3 != 0) {
      "Positive and not divisible by 3"
    } else "Condition not satisfied"
  }

  println("Q24."+isDivisible_3(10))

  //25. Eligibility for Senior Discount AND Not a New Customer
  //Check if age > 65 and not a new customer.
  //Sample Data: Age: 68, New Customer: false

  def checkNewCus(age: Int, newCustomer: Boolean): String = {
    if (age > 65 && !newCustomer) {
      "Eligible for senior discount"
    } else "Not eligible"
  }

  println("Q25."+checkNewCus(68, false))

  //26. Check for Odd OR Prime Number
  //Sample Data: Number: 9

  //covered in Q11.

  //27. Eligibility for Discount AND Free Shipping
  //Check if purchase > 150 and > 100.
  //Sample Data: Purchase Amount: 180

  def DiscountEligibility(amount: Int): String = {
    if (amount > 150 && amount > 100) {
      "Eligible for discount and free shipping"
    } else "Not eligible"
  }

  println("Q27."+DiscountEligibility(180))

  //28. Check for Non-Negative AND Not Divisible by 7
  //Sample Data: Number: 9

  def isPositiveDivisible_7(n: Int): String = {
    if (n >= 0 && n % 7 != 0) {
      "Non-negative and not divisible by 7"
    } else "Condition not satisfied"
  }

  println("Q28."+isPositiveDivisible_7(9))

  //29. Eligibility for Student Discount OR Free Trial
  //Check if age < 25 or free trial is true.
  //Sample Data: Age: 27, Free Trial: true

  def StudentDiscountElgibility(age: Int, freeTrial: Boolean): String = {
    if (age < 25 || freeTrial) {
      "Eligible for offer"
    } else "Not eligible"
  }

  println("Q29."+StudentDiscountElgibility(27, true))

  //30. Check for Divisibility by 4 OR 6
  //Sample Data: Number: 12

  def isDivisible4_6(n: Int): String = {
    if (n % 4 == 0 || n % 6 == 0) {
      "Yes divisible by 4 or 6"
    } else "Not divisible"
  }

  println("Q30."+isDivisible4_6(12))


}