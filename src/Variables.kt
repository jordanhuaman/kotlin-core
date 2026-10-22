class Variables {
    var name = "example";

    fun reassignVariable(a: Int) {
        var x = a;
        var y: Int;
        val w = 12;

        // reassign variable
        x = 12;
        y = x;
        // It doesn't allow to change.
        //w = 20;
    }
}