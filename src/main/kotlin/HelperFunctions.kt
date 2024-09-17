fun generateNumber(lowerLimit: Int, upperLimit: Int): Int {
    return (lowerLimit..upperLimit).random()
}
fun generateBoolean(): Boolean {
    return listOf(true, false).random()
}