package us.magicaldreams.annualpassport2021.Backpack;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import us.magicaldreams.annualpassport2021.Config.FileManager;

public class Backpack implements CommandExecutor {

    FileManager fm = FileManager.getInstance();


    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("backpack")){
            if(!(sender.hasPermission("backpack.use"))){
                sender.sendMessage(ChatColor.RED+"You do not have permission to do this!");
                return true;
            }

            if(!(sender instanceof Player)){
                sender.sendMessage("The console cannot do this!");
                return true;
            }

            return true;
        }

            return true;
    }
}
