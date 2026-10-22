package conditionals_01

open class ForWhileConditional {
    val items = listOf("apple", "banana", "kiwifruit")

    fun findAnApple(): Boolean {
        var con: Boolean = false
        for (item in items) if (item == "apple") con = true;
        return con;
    }

    fun findOddValue() {
        val items = listOf(20, 2, 10, 3)

        var rep = 0

        while (rep < items.size) {
            val number = items[rep]
            var divisor = 2
            var isPrime = number >= 2

            while (divisor < number && isPrime) {
                if (number % divisor == 0) {
                    isPrime = false
                }
                divisor++
            }

            if (isPrime) {
                println("$number es primo")
            }

            rep++
        }
    }

}