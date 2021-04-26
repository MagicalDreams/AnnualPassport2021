package us.magicaldreams.annualpassport2021.Backpack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import us.magicaldreams.annualpassport2021.Config.FileManager;


public class Backpack extends JavaPlugin implements Listener {

    FileManager fm = FileManager.getInstance();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){

        if(cmd.getName().equalsIgnoreCase("backpack")){

            if(!(sender instanceof Player)){
                sender.sendMessage(ChatColor.RED + "The console cannot do this!");
                return true;
            }

            if(!(sender.hasPermission("backpack.use"))){
                sender.sendMessage(ChatColor.RED + "You do not have permission to do this!");
                return true;
            }
            /*
               <UUID>
                    1.
                    2.
                    3.


             */

            Player player = (Player) sender;

            Inventory bpInven = Bukkit.createInventory(null, 36, ChatColor.BLACK + "Backpack");

            if(fm.getConfig().contains(player.getUniqueId().toString())){
                for(String i : fm.getConfig().getConfigurationSection(player.getUniqueId().toString()).getKeys(false)){
                    ItemStack item = fm.getConfig().getItemStack(player.getUniqueId().toString() + "." + i);
                    bpInven.addItem(item);
                }
            }

            player.openInventory(bpInven);
            return true;

        }

        return true;
    }

}

