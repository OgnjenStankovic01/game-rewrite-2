open class Creature (var name : String,var hp : Int, var xp : Int, var attack : Int, var level : Int, val position: Position, val icon: String, var magicSpells: List<Spell> = listOf()) {
    open fun attack(attacker: Creature, defender : Creature){
        if (defender is Player){
            generateBoolean().let {
                if (it){
                    println("The ${attacker.name} attacks you!")
                    defender.hp -= attacker.attack
                }
                else {
                    println("The monster missed!")
                }
            }
        }
    }
    open fun magicAttack(attacker: Creature, defender: Creature, spell: Spell ){
        if (defender is Player){
            generateBoolean().let {
                if (it){
                    println("The ${attacker.name} casts ${spell.name}")
                    spell.useSpell(attacker,defender, spell)
                }
                else {
                    println("The ${attacker.name} casts ${spell.name}")
                    println("The monster missed!")
                }
            }
        }
    }
    open fun knowsByName(magicSpells: List<Spell>, spellName: String): Boolean{
        var returnVar = false
       magicSpells.forEach{
           if(it.name == spellName){
               returnVar = true
           }
           else returnVar = false
       }
        return returnVar
    }
}