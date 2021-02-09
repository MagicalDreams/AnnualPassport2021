package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ParksUI {

    public static void applyParksUI(Player player) {

        List<String> parksLore = new ArrayList<>();


        Inventory ParksGUI = Bukkit.createInventory(null, 27, ChatColor.BLUE + "Parks");

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        ItemStack parks = new ItemStack(Material.NETHER_STAR);
        ItemMeta parksMeta = parks.getItemMeta();
        parksMeta.setDisplayName(ChatColor.YELLOW + "Parks");
        parks.setItemMeta(parksMeta);

        ItemStack fish = new ItemStack(Material.TROPICAL_FISH);
        ItemMeta fishMeta = fish.getItemMeta();
        fishMeta.setDisplayName(ChatColor.YELLOW + "Join SWSA");
        fish.setItemMeta(fishMeta);

        ItemStack key = new ItemStack(Material.DIAMOND_HOE);
        ItemMeta keyMeta = key.getItemMeta();
        keyMeta.setDisplayName(ChatColor.AQUA + "Join DLR");
        key.setItemMeta(keyMeta);

        ItemStack DAXE = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta DAXEMeta = DAXE.getItemMeta();
        DAXEMeta.setDisplayName(ChatColor.AQUA + "Join Creative");
        DAXE.setItemMeta(DAXEMeta);

        ItemStack Mickey = new ItemStack(Material.POTATO);
        ItemMeta MickeyMeta = Mickey.getItemMeta();
        MickeyMeta.setDisplayName(ChatColor.GOLD + "Join TDR");
        Mickey.setItemMeta(MickeyMeta);

        ItemStack BOOK = new ItemStack(Material.ENCHANTED_BOOK);
        ItemMeta BOOKMeta = BOOK.getItemMeta();
        BOOKMeta.setDisplayName(ChatColor.BOLD + "Join HUB");
        BOOK.setItemMeta(BOOKMeta);

        ItemStack GAXE = new ItemStack(Material.GOLDEN_PICKAXE);
        ItemMeta GAXEMeta = GAXE.getItemMeta();
        GAXEMeta.setDisplayName(ChatColor.GOLD + "Join Custom");
        GAXE.setItemMeta(GAXEMeta);

        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack GSG = new ItemStack((Material.GREEN_STAINED_GLASS_PANE));
        ItemMeta GSGMeta = GSG.getItemMeta();
        GSGMeta.setDisplayName(" ");
        GSG.setItemMeta(GSGMeta);


        ParksGUI.setItem( 0,BSG);
        ParksGUI.setItem( 1,BSG);
        ParksGUI.setItem( 2,BSG);
        ParksGUI.setItem(3 ,BSG);
        ParksGUI.setItem(4 ,key);
        ParksGUI.setItem(5 ,BSG);
        ParksGUI.setItem( 6,BSG);
        ParksGUI.setItem( 7,BSG);
        ParksGUI.setItem( 8,BSG);
        ParksGUI.setItem(9 ,parks);
        ParksGUI.setItem(10 ,GSG);
        ParksGUI.setItem( 11,GSG);
        ParksGUI.setItem(12 , GAXE);
        ParksGUI.setItem( 13, BOOK);
        ParksGUI.setItem( 14, DAXE);
        ParksGUI.setItem( 15,GSG);
        ParksGUI.setItem( 16,GSG);
        ParksGUI.setItem( 17, back);
        ParksGUI.setItem( 18,BSG);
        ParksGUI.setItem( 19,BSG);
        ParksGUI.setItem( 20,BSG);
        ParksGUI.setItem( 21,Mickey);
        ParksGUI.setItem( 22,BSG);
        ParksGUI.setItem( 23,fish);
        ParksGUI.setItem( 24,BSG);
        ParksGUI.setItem( 25,BSG);
        ParksGUI.setItem( 26,BSG);


        player.openInventory(ParksGUI);


    }
}