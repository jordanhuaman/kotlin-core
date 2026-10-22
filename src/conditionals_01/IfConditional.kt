package conditionals

class IfConditional(val type: String, val size: Int) {

    /**
     * **if**  Similar to another languages
     */
    fun verifyType(){
        if (type != "PDF"){
            println("Not a pdf");
            return;
        }else{
            // validate logic.
        }
    }
    /**
     * **if** new declaration
     */
    fun maxOf(a: Int, b: Int) = if (a > b) a else b
}