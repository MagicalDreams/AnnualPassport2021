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

        ItemStack SSM = new ItemStack(Material.ZOMBIE_HORSE_SPAWN_EGG);
        ItemMeta SSMMeta = SSM.getItemMeta();
        SSMMeta.setDisplayName("Sea Star Market");
        SSM.setItemMeta(SSMMeta);

        ItemStack HM = new ItemStack(Material.PIG_SPAWN_EGG);
        ItemMeta HMMeta = HM.getItemMeta();
        HMMeta.setDisplayName("Harbor Market");
        HM.setItemMeta(HMMeta);

        ItemStack C = new ItemStack(Material.PARROT_SPAWN_EGG);
        ItemMeta CMeta = C.getItemMeta();
        CMeta.setDisplayName("Currents");
        C.setItemMeta(CMeta);

        ItemStack SE = new ItemStack(Material.OCELOT_SPAWN_EGG);
        ItemMeta SEMeta = SE.getItemMeta();
        SEMeta.setDisplayName("Shamus Emporium");
        SE.setItemMeta(SEMeta);

        ItemStack US = new ItemStack(Material.MULE_SPAWN_EGG);
        ItemMeta USMeta = US.getItemMeta();
        USMeta.setDisplayName("Under the Sun");
        US.setItemMeta(USMeta);


        ShopsGUI.setItem(10, SSM);
        ShopsGUI.setItem(11, HM);
        ShopsGUI.setItem(12, C);
        ShopsGUI.setItem(13, SE);
        ShopsGUI.setItem(14, US);

        // Secondary Stuff

        ItemStack P = new ItemStack(Material.MOOSHROOM_SPAWN_EGG);
        ItemMeta PMeta = P.getItemMeta();
        PMeta.setDisplayName("Pretzel Kitchen");
        P.setItemMeta(PMeta);

        ItemStack S = new ItemStack(Material.SILVERFISH_SPAWN_EGG);
        ItemMeta SMeta = C.getItemMeta();
        SMeta.setDisplayName("Spankys");
        S.setItemMeta(SMeta);

        ItemStack SA = new ItemStack(Material.PILLAGER_SPAWN_EGG);
        ItemMeta SAMeta = SA.getItemMeta();
        SAMeta.setDisplayName("Sneak Attack");
        SA.setItemMeta(SAMeta);

        ItemStack PP = new ItemStack(Material.PIGLIN_BRUTE_SPAWN_EGG);
        ItemMeta PPMeta = PP.getItemMeta();
        PPMeta.setDisplayName("Polar Polar");
        PP.setItemMeta(PPMeta);



        ShopsGUI.setItem(15, S);
        ShopsGUI.setItem(16, SA);
        ShopsGUI.setItem(22, PP);


        ///INPUTS///



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