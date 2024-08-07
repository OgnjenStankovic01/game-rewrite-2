open class Item(val id : Int, val usable : Boolean, val desc : String, var name : String) {
    override fun toString(): String {
        return name
    }
    fun printDesc(): String {
        return desc
    }
    fun use(){

    }
}