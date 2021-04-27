package us.magicaldreams.annualpassport2021.Backpack;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;


public class BPInv {

    public static void applybpINV(Player player){

        Inventory bpInv = Bukkit.createInventory(null, 36, ChatColor.BLACK + "Backpack");

        player.openInventory(bpInv);
    }
}
