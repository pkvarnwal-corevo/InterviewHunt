class PrimeNumber {

    fun checkPrime() {
        var isPrime = false
        val primeNumber = 13

        for(i in 2..primeNumber/2) {
            if (primeNumber % i == 0) {
                isPrime = true
                break
            }
        }

        if (isPrime) println("$primeNumber is not Prime number")
        else println("$primeNumber is Prime number")
    }
}

fun main() {
    val p = PrimeNumber()
    p.checkPrime()
}