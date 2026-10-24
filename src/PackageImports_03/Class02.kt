package PackageImports_03

import classes.KtClasses as OutsideClass
class Class02 {

    fun importFromSamePackage() {
        val instance01 = Class01();
        var instance02 = OutsideClass("another class", 12);
    }

}