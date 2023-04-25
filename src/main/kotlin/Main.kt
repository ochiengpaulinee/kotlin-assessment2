fun main(){
word("original")
    passwordKey("316rwn3400schools")
    multiples()
    var banking=CurrentAccount("4567ort","Brenda",2000.0)
    banking.deposit(500.0)
    println("The current balance is ${banking.balance}")
    banking.withdraw(1200.0)
    println("The balance after withdrawal is ${banking.balance}")
    banking.details()

    var save = SavingsAccount("324aok040","Victor",3800.0,2)
    save.withdraws(500.0)
    println("The current balance for SavingsAccount is ${save.balance}")
    println("The number of withdrawals for SavingsAccount is now ${save.withdrawals}")

}
//Question 1
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun word(stmt:String){
    val x = stmt.length
    println("The length is ${x}")
    val v = stmt[0]
    println("The first character is ${v}")
    val p = stmt[stmt.length-1]
    println("The last character is ${p}")
    var vowels = arrayOf('a','e','i','o','u')
    for(i in vowels){
        if(stmt[0]==i){
            println("it begins with a vowel")
        }
    }

}

//Question 2
//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

fun passwordKey(password:String){
   if(password.length>8 && password.length<16 &&password!="password"){
       println("true")
   }
    else{
        println("false")
   }
}

//Question 3
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(){
    for(number in 1..1000)
    if(number%6==0){
        println("${number} is a multiple of 6")
    }
    else if (number%8==0){
        println("${number} is a multiple of 8")
    }
    else if(number%4==0){
        println("Bingo!")
    }
}

//Question 4
//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)

open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
    }
    fun withdraw(amount: Double){
        balance-=amount
    }
    fun details(){
        println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")

    }
}


//Question 5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)


class SavingsAccount(accountNumber: String,accountName: String,balance: Double,var withdrawals:Int):CurrentAccount(accountNumber,accountName,balance){
    fun withdraws(w:Double) {
        if (withdrawals < 4) {
            balance -= w
            withdrawals++
        }
    }
}
