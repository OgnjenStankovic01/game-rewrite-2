data class Spell(val name: String, val cost: Int, val desc: String, val time: Int, val damage: Int, val tag: String)
{
    fun useSpell(attacker : Creature, defender : Creature, spell: Spell){
        if (attacker.knowsByName(attacker.magicSpells, spell.name)) {
            if (spell.tag == "damage") {
                var i = 1
                while (i < time) {
                    defender.hp -= spell.damage
                }
            }
        }
    }
}