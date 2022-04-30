fun main(args: Array<String>) {
    /*
    A function without name is called anonymous function.
    For lambda expression we can say that it is anonymous function.

    val lambda_name : Data_type = { argument_List -> code_body }
    */
    val lambdaExpression: () -> Unit = {
        println("Lambda expression")
    }
    lambdaExpression()
    lambdaExpression.invoke()

    val result1 = sum(5, 4)
    println(result1)

    println(sum2(3, 4))


    val result = "Abdullah".lambda4(40)
    println(result)

    val numbers = arrayOf(-1, -2, 4, 2, 4, -5)
    println(numbers.filter { it > 0 })

    println(find(100))
    println(find2(100))
    println(find3(100))

    performMath(3, 5, funMultiply)
}

//Examples
val sum: (a: Int, b: Int) -> Int = { a: Int, b: Int -> a + b }
val sum2: (a: Int, b: Int) -> Int = { a, b -> a + b }
val sum3 = { a: Int, b: Int -> a + b }

//Lambdas examples with return type
val sumWithString: (a: Int, b: Int) -> String = { a: Int, b: Int ->
    val num = a + b
    num.toString()
}

//Lambdas examples with return type
val sumWithString2: (a: Int, b: Int) -> String = { a, b ->
    val num = a + b
    num.toString()
}

val sumWithString3 = { a: Int, b: Int ->
    val num = a + b
    num.toString()
}

//Lambdas can be used as class extension:
val lambda4: String.(Int) -> String = { this + it }
val lambda5: String.(Int) -> String = { a -> this + a }
val lambda6: String.(Int) -> String = { a: Int -> this + a }

//Returning a value from lambda expression –
val find = fun(num: Int): String {
    if (num % 2 == 0 && num < 0) {
        return "Number is even and negative"
    } else if (num % 2 == 0 && num > 0) {
        return "Number is even and positive"
    } else if (num % 2 != 0 && num < 0) {
        return "Number is odd and negative"
    } else {
        return "Number is odd and positive"
    }
}

val find2 = { num: Int ->
    if (num % 2 == 0 && num < 0) {
        "Number is even and negative"
    } else if (num % 2 == 0 && num > 0) {
        "Number is even and positive"
    } else if (num % 2 != 0 && num < 0) {
        "Number is odd and negative"
    } else {
        "Number is odd and positive"
    }
}

val find3 = label@{ num: Int ->
    if (num % 2 == 0 && num < 0) {
        return@label "Number is even and negative"
    } else if (num % 2 == 0 && num > 0) {
        return@label "Number is even and positive"
    } else if (num % 2 != 0 && num < 0) {
        return@label "Number is odd and negative"
    } else {
        return@label "Number is odd and positive"
    }
}

//Anonymous Function

// anonymous function with body as an expression
val anonymous1 = fun(x: Int, y: Int): Int = x + y

// anonymous function with body as a block
val anonymous2 = fun(a: Int, b: Int): Int {
    val mul = a * b
    return mul
}


/*Difference between lambda expressions and anonymous functions-
The only difference is the behavior of non-local returns.
A return statement without a label always returns from the function declared with the fun keyword.
This means that a return inside a lambda expression will return from the enclosing function,
whereas a return inside an anonymous function will return from the anonymous function itself.*/


val funMultiply = { a: Int, b: Int -> a * b }
val funSayHi = { name: String -> println("Hello $name") }

fun performMath(a: Int, b: Int, mathFun: (Int, Int) -> Int): Unit {
    println("Value of calculation: ${mathFun(a, b)}")
}