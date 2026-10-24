package statemens_02

class RangesExpression {

    /**
     * Check if ***x*** in between 1 and 10.
     */
    fun checkRange() {
        val x = 10
        val y = 9
        if (x in 1..y + 1) {
            println("fits in range")
        }
    }

    /**
     * Check if -1
     */
    fun checkOutRange(i: Int, start: Int) {
        val list = listOf("a", "b", "c")

        if (start > list.lastIndex) return

        if (i !in start..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list indices range, too")
        }
    }

    fun downprogrestion(from: Int, to: Int): Int {

        for (x in 1..10 step 2) println("Progresion $x")
        for (x in 10 downTo 0 step 2) println("Regresion $x")

        return 1
    }
}