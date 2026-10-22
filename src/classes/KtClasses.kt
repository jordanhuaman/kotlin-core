package ktclasses


class KtClasses(val name: String, val parameter: Int) : KtOpenClass() {

    constructor(name: String, parameter: Int, psuname: String) : this(name, parameter);

    val printLm = "Class name $name size: $parameter $PARAMS";
}