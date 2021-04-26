package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import us.magicaldreams.annualpassport2021.Config.FileManager;

import java.io.IOException;

public class PlayerCloseInv implements Listener{

    FileManager fm = FileManager.getInstance();

    @EventHandler
    public void onInvClose(InventoryCloseEvent e) throws IOException {
        Player player = (Player) e.getPlayer();

        Inventory bpcloseinv = e.getInventory();


        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "Backpack")) {

            }
        fm.getConfig().set(player.getUniqueId().toString(), null);
        fm.saveConfig();

        for(int i = 0; i<=35;i++){

            ItemStack item = bpcloseinv.getItem(i);
            if(item == null) continue;
            if(item.getType() == Material.AIR) continue;
            fm.getConfig().set(e.getPlayer().getUniqueId().toString() + "." + i, item);
        }
    }
}
