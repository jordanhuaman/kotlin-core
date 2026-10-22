package statemens

/**
 * ***In** we can use this statement to iterate an collection in any statement like ```for, while, when, lambda expresions and more````
 */
fun main() {
    var items = listOf<String>("a", "b", "bc")
    for (item in items) {
        if (item.length > 1) break;
    }
}

/**
 * With a collection variable we cna use many of the collections utility.
 */
fun findAnApple() {
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("apple") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}