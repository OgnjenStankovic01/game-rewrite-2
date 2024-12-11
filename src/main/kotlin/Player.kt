class Player(name : String, hp : Int, xp : Int, level : Int, attack : Int, magicSpells: List<Spell> = listOf(), var mana : Int, var inv : MutableList<Item>, position: Position, icon: String) : Creature(name,hp,xp,attack,level,position,icon, magicSpells) {
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

    fun castSpell(player: Player,attacker: Creature){
        player.magicSpells.forEachIndexed { index, spell ->
            println("${index+1}) ${spell.name}")
        }
        println("Choose a spell: ")
        val spell = readln().lowercase().toInt()
        val selectedItem = player.magicSpells[spell-1]
        if (player.mana >= selectedItem.cost) {
                selectedItem.useSpell(attacker,player, selectedItem)
            }
        else println("YOU HAVE NO MANAAA")
    }
}

