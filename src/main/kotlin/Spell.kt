data class Spell(val name: String, val cost: Int, val desc: String, val time: Int, val damage: Int, val tag: String)
{
    fun useSpell(attacker : Creature, defender : Creature, spell: Spell) {
        println(spell.name)
            if (attacker.magicSpells.contains(spell)) {
                if (spell.tag == "damage") {
                    defender.hp -= spell.damage
                    println("It deals ${spell.damage} damage")
                }
            }
            else if (!attacker.magicSpells.contains(spell)){
                println(spell.name)
                println("how tf did you reach this")
            }
    }
}