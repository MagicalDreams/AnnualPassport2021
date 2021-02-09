package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;
import java.util.List;

public class AnnualPassportUI {

    public static Inventory applyAnnualPassportUI;

    @SuppressWarnings("deprecation")
    public static void applyAnnualPassportUI(Player player){

        Inventory AnnualPassportGUI = Bukkit.createInventory(null, 27, ChatColor.BLUE + "Annual Passport");

        List<String> playerLore = new ArrayList<>();
        playerLore.add(ChatColor.RED + "Audio, Time, Report");
        playerLore.add(ChatColor.GRAY + "Player Vis., Resource Pack, Scoreboard Toggle");


        ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwner(player.getName());
        skullMeta.setDisplayName(ChatColor.YELLOW + player.getName() + "'s Settings");
        skull.setItemMeta(skullMeta);
        skullMeta.setLore(playerLore);

        ItemStack parks = new ItemStack(Material.NETHER_STAR);
        ItemMeta parksMeta = parks.getItemMeta();
        parksMeta.setDisplayName(ChatColor.YELLOW + "Parks");
        parks.setItemMeta(parksMeta);

        ItemStack attractions = new ItemStack(Material.MINECART);
        ItemMeta attractionsmeta = attractions.getItemMeta();
        attractionsmeta.setDisplayName(ChatColor.YELLOW + "Attractions");
        attractions.setItemMeta(attractionsmeta);

        ItemStack Entertianment = new ItemStack((Material.FIREWORK_ROCKET));
        ItemMeta EntertianmentMeta = Entertianment.getItemMeta();
        EntertianmentMeta.setDisplayName(ChatColor.YELLOW + "Entertainment");
        Entertianment.setItemMeta(EntertianmentMeta);

        ItemStack Dining = new ItemStack((Material.POTATO));
        ItemMeta DiningMeta = Dining.getItemMeta();
        DiningMeta.setDisplayName(ChatColor.YELLOW + "Dining");
        Dining.setItemMeta(DiningMeta);

        ItemStack Shops = new ItemStack((Material.IRON_CHESTPLATE));
        ItemMeta ShopsMeta = Shops.getItemMeta();
        ShopsMeta.setDisplayName(ChatColor.YELLOW + "Shops");
        Shops.setItemMeta(ShopsMeta);


        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack GSG = new ItemStack((Material.GREEN_STAINED_GLASS_PANE));
        ItemMeta GSGMeta = GSG.getItemMeta();
        GSGMeta.setDisplayName(" ");
        GSG.setItemMeta(GSGMeta);


        AnnualPassportGUI.setItem(0, BSG);
        AnnualPassportGUI.setItem(1, BSG);
        AnnualPassportGUI.setItem(2, BSG);
        AnnualPassportGUI.setItem(3, BSG);
        AnnualPassportGUI.setItem(4, skull);
        AnnualPassportGUI.setItem(5, BSG);
        AnnualPassportGUI.setItem(6, BSG);
        AnnualPassportGUI.setItem(7, BSG);
        AnnualPassportGUI.setItem(8, BSG);
        AnnualPassportGUI.setItem(9, GSG);
        AnnualPassportGUI.setItem(10, GSG);
        AnnualPassportGUI.setItem(11, Dining);
        AnnualPassportGUI.setItem(12, Entertianment);
        AnnualPassportGUI.setItem(13, parks);
        AnnualPassportGUI.setItem(14, attractions);
        AnnualPassportGUI.setItem(15, Shops);
        AnnualPassportGUI.setItem(16, GSG);
        AnnualPassportGUI.setItem(17, GSG);
        AnnualPassportGUI.setItem(18, BSG);
        AnnualPassportGUI.setItem(19, BSG);
        AnnualPassportGUI.setItem(20, BSG);
        AnnualPassportGUI.setItem(21, BSG);
        //UNDOWN(HIDDEN MICKIE)
        AnnualPassportGUI.setItem(23, BSG);
        AnnualPassportGUI.setItem(24, BSG);
        AnnualPassportGUI.setItem(25, BSG);
        AnnualPassportGUI.setItem(26, BSG);


        player.openInventory(AnnualPassportGUI);

    }

}