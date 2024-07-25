open class Creature (var hp : Int, var xp : Int, var attack : Int, var level : Int) {
    fun attack(creature: Creature){
        creature.hp =- attack
        println("Attacked for $attack, remaining hp $creature.hp")
    }
}