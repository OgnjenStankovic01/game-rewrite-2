class Player(name : String, var maxHp : Int, var maxMana : Int, hp : Int, xp : Int, level : Int, attack : Int, magicSpells: List<Spell> = listOf(), var mana : Int, var inv : MutableList<Item>, position: Position, icon: String) : Creature(name,hp,xp,attack,level,position,icon, magicSpells) {
    fun levelup(){
        if (xp >= 30){
            println("You've levelled up!")
            xp = 0
            level++
            maxHp += 10
            hp = maxHp
            maxMana += 10
            mana = maxMana
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

    fun castSpell(player: Player, defender : Creature){
        player.magicSpells.forEachIndexed { index, spell ->
            println("${index+1}) ${spell.name}")
        }
        if (player.magicSpells.isNotEmpty()){
            println("Choose a spell: ")
            val spell = readln().lowercase().toInt()
            val selectedItem = player.magicSpells[spell-1]
            if (player.mana >= selectedItem.cost && player.mana - selectedItem.cost > 0) {
                defender.hp -= selectedItem.damage
                player.mana -= selectedItem.cost
                println("You cast ${selectedItem.name}")
                println("You deal ${selectedItem.damage} damage!")
            }
            else println("YOU HAVE NO MANAAA")
        }
        else println("You know no spells.")
    }
}

