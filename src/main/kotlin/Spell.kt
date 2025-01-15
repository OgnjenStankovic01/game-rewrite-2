data class Spell(val name: String, val cost: Int, val desc: String, val time: Int, val damage: Int, val tag: String)
{
    fun useSpell(attacker : Creature, defender : Creature, spell: Spell) {
    }
}