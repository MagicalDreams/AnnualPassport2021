package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TimeUI {
    public static void applytimeUI(Player player) {

        Inventory time = Bukkit.createInventory(null, 9, ChatColor.BLUE + "Time");

        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack morning = new ItemStack((Material.YELLOW_DYE));
        ItemMeta morningMeta = morning.getItemMeta();
        morningMeta.setDisplayName(ChatColor.YELLOW + "Morning");
        morning.setItemMeta(morningMeta);

        ItemStack afternoon = new ItemStack((Material.ORANGE_DYE));
        ItemMeta afternoonMeta = morning.getItemMeta();
        afternoonMeta.setDisplayName(ChatColor.GOLD + "Afternoon");
        afternoon.setItemMeta(afternoonMeta);

        ItemStack evening = new ItemStack((Material.LAPIS_LAZULI));
        ItemMeta eveningMeta = morning.getItemMeta();
        eveningMeta.setDisplayName(ChatColor.DARK_AQUA + "Evening");
        evening.setItemMeta(eveningMeta);


        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        time.setItem(0, BSG);
        time.setItem(1, morning);
        time.setItem(2, BSG);
        time.setItem(3, BSG);
        time.setItem(4, afternoon);
        time.setItem(5, BSG);
        time.setItem(6, BSG);
        time.setItem(7, evening);
        time.setItem(8, back);


        player.openInventory(time);
    }
}