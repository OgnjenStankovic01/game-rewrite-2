data class Position(var x : Int, var y : Int){
    fun moveX(positive: Boolean){
        if (positive){
            x++
        }
        else x--
    }
    fun moveY(positive: Boolean){
        if(positive){
            y++
        }
        else y--
    }

    fun positionEquality(other: Position): Boolean {
        if (this.x == other.x && this.y == other.y){
            return true
        }
        else return false
    }

    override fun hashCode(): Int {
        return 31 * x + y
    }

}