class Player(name : String, hp : Int,xp : Int,level : Int,attack : Int, magicSpells: Map<Int, String> = mapOf(), var mana : Int, var inv : MutableList<Item>, position: Position, icon: String) : Creature(name,hp,xp,attack,level,position,icon, magicSpells) {
    fun levelup(){
        if (xp >= 30){
            xp = 0
            level++
        }
    }
    fun openInv(){
        inv.forEachIndexed{ index, item ->
            println("${index+1}) ${item.name}")
       }
    }
    fun usePotion(player: Player) {
        openInv()
        println("Choose which item to use: (Type '0' to cancel)")
        if (inv.isNotEmpty()){
            val input = readln().lowercase().trim().toInt()
            val selectedItem = inv[input - 1]
            if (selectedItem is Potion && selectedItem.usable && selectedItem.healing > 0) {
                selectedItem.usePotion(player)
                println("You have healed for ${selectedItem.healing}")
            } else if (input.equals("0")) {
                println("You close your inventory")
            }
        }
        else {
            println("You have no items in your inventory")
        }

    }
    override fun attack(attacker: Creature,defender : Creature){
        defender.hp -= attacker.attack
    }

    override fun magicAttack(attacker: Creature, defender: Creature, spell: Spell) {
        if (this.mana >= spell.cost){
            spell.useSpell(attacker, defender, spell)
        }
        else println("YOU HAVE NO MANAAA")
    }
}

