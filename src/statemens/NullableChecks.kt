package statemens

fun main(){
    println(parseInt("adasd"))
}

/**
 * Null safe return
 */
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

/**
 * Null check to avoid cast, also we can return a null || int value;
 */
fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        // `obj` is automatically cast to `String` in this branch
        return obj.length
    }

    // `obj` is still of type `Any` outside of the type-checked branch
    return null
}