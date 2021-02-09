package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class DiningUI {

    @SuppressWarnings("deprecation")
    public static void applyDiningUI(Player player){
        Inventory DiningGUI = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Dining");

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        ItemStack Dining = new ItemStack((Material.POTATO));
        ItemMeta DiningMeta = Dining.getItemMeta();
        DiningMeta.setDisplayName(ChatColor.YELLOW + "Dining");
        Dining.setItemMeta(DiningMeta);

        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack none = new ItemStack(Material.BARRIER);
        ItemMeta noneMeta = none.getItemMeta();
        noneMeta.setDisplayName(ChatColor.RED + "No Dining Currently");
        none.setItemMeta(noneMeta);

        DiningGUI.setItem(0, BSG);
        DiningGUI.setItem(1, BSG);
        DiningGUI.setItem(2, BSG);
        DiningGUI.setItem(3, BSG);
        DiningGUI.setItem(4, Dining);
        DiningGUI.setItem(5, BSG);
        DiningGUI.setItem(6, BSG);
        DiningGUI.setItem(7, BSG);
        DiningGUI.setItem(8, back);
        DiningGUI.setItem(9, BSG);
        DiningGUI.setItem(18, BSG);

        DiningGUI.setItem(22, none);

        DiningGUI.setItem(27, BSG);
        DiningGUI.setItem(36, BSG);
        DiningGUI.setItem(45, BSG);
        DiningGUI.setItem(46, BSG);
        DiningGUI.setItem(47, BSG);
        DiningGUI.setItem(48, BSG);
        DiningGUI.setItem(49, BSG);
        DiningGUI.setItem(50, BSG);
        DiningGUI.setItem(51, BSG);
        DiningGUI.setItem(52, BSG);
        DiningGUI.setItem(53, BSG);
        DiningGUI.setItem(44, BSG);
        DiningGUI.setItem(35, BSG);
        DiningGUI.setItem(26, BSG);
        DiningGUI.setItem(17, BSG);


        player.openInventory(DiningGUI);

    }

}