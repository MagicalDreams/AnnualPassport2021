package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ShopsUI {

    @SuppressWarnings("deprecation")
    public static void applyShopsUI(Player player){
        Inventory ShopsGUI = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Shops");

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        ItemStack Shops = new ItemStack((Material.IRON_CHESTPLATE));
        ItemMeta ShopsMeta = Shops.getItemMeta();
        ShopsMeta.setDisplayName(ChatColor.YELLOW + "Shops");
        Shops.setItemMeta(ShopsMeta);

        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ShopsGUI.setItem(0, BSG);
        ShopsGUI.setItem(1, BSG);
        ShopsGUI.setItem(2, BSG);
        ShopsGUI.setItem(3, BSG);
        ShopsGUI.setItem(4, Shops);
        ShopsGUI.setItem(5, BSG);
        ShopsGUI.setItem(6, BSG);
        ShopsGUI.setItem(7, BSG);
        ShopsGUI.setItem(8, back);
        ShopsGUI.setItem(9, BSG);
        ShopsGUI.setItem(18, BSG);
        ShopsGUI.setItem(27, BSG);
        ShopsGUI.setItem(36, BSG);
        ShopsGUI.setItem(45, BSG);
        ShopsGUI.setItem(46, BSG);
        ShopsGUI.setItem(47, BSG);
        ShopsGUI.setItem(48, BSG);
        ShopsGUI.setItem(49, BSG);
        ShopsGUI.setItem(50, BSG);
        ShopsGUI.setItem(51, BSG);
        ShopsGUI.setItem(52, BSG);
        ShopsGUI.setItem(53, BSG);
        ShopsGUI.setItem(44, BSG);
        ShopsGUI.setItem(35, BSG);
        ShopsGUI.setItem(26, BSG);
        ShopsGUI.setItem(17, BSG);


        player.openInventory(ShopsGUI);

    }

}