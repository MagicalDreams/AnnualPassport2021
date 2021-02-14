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

        ItemStack TT = new ItemStack(Material.SHEEP_SPAWN_EGG);
        ItemMeta TTMeta = TT.getItemMeta();
        TTMeta.setDisplayName("Trolley Treats");
        TT.setItemMeta(TTMeta);

        ItemStack DDS = new ItemStack(Material.CAT_SPAWN_EGG);
        ItemMeta DDSMeta = DDS.getItemMeta();
        DDSMeta.setDisplayName("Disney Dress Shop");
        DDS.setItemMeta(DDSMeta);

        ItemStack CMC = new ItemStack(Material.BLAZE_SPAWN_EGG);
        ItemMeta CMCMeta = CMC.getItemMeta();
        CMCMeta.setDisplayName("20th Century Music Company");
        CMC.setItemMeta(CMCMeta);

        ItemStack BBB = new ItemStack(Material.BAT_SPAWN_EGG);
        ItemMeta BBBMeta = BBB.getItemMeta();
        BBBMeta.setDisplayName("Bibbidi Bobbidi Boutique");
        BBB.setItemMeta(BBBMeta);

        ItemStack BBSS = new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG);
        ItemMeta BBSSMeta = BBSS.getItemMeta();
        BBSSMeta.setDisplayName("Bing Bong's Sweet Stuff");
        BBSS.setItemMeta(BBSSMeta);

        ItemStack BSO = new ItemStack(Material.DOLPHIN_SPAWN_EGG);
        ItemMeta BSOMeta = BSO.getItemMeta();
        BSOMeta.setDisplayName("Black Spire Outfitters");
        BSO.setItemMeta(BSOMeta);

        ItemStack BP = new ItemStack(Material.CREEPER_SPAWN_EGG);
        ItemMeta BPMeta = BP.getItemMeta();
        BPMeta.setDisplayName("The Briar Patch");
        BP.setItemMeta(BPMeta);

        ItemStack CP = new ItemStack(Material.ELDER_GUARDIAN_SPAWN_EGG);
        ItemMeta CPMeta = CP.getItemMeta();
        CPMeta.setDisplayName("Candy Palace and Candy Kitchen");
        CP.setItemMeta(CPMeta);

        ItemStack CW = new ItemStack(Material.FOX_SPAWN_EGG);
        ItemMeta CWMeta = CW.getItemMeta();
        CWMeta.setDisplayName("The Collectors Warehouse");
        CW.setItemMeta(CMCMeta);

        ItemStack CS = new ItemStack(Material.LLAMA_SPAWN_EGG);
        ItemMeta CSMeta = CS.getItemMeta();
        CSMeta.setDisplayName("Creature Stall");
        CS.setItemMeta(CSMeta);

        ItemStack CDO = new ItemStack(Material.DRAGON_EGG);
        ItemMeta CDOMeta = CDO.getItemMeta();
        CDOMeta.setDisplayName("Cristal d'Orleans");
        CDO.setItemMeta(CDOMeta);

        ItemStack CA = new ItemStack(Material.DROWNED_SPAWN_EGG);
        ItemMeta CAMeta = CA.getItemMeta();
        CAMeta.setDisplayName("Crystal Arts");
        CA.setItemMeta(CAMeta);

        ItemStack DYA = new ItemStack(Material.PANDA_SPAWN_EGG);
        ItemMeta DYAMeta = DYA.getItemMeta();
        DYAMeta.setDisplayName("Disneyana");
        DYA.setItemMeta(DYAMeta);

        ItemStack FTS = new ItemStack(Material.ZOMBIFIED_PIGLIN_SPAWN_EGG);
        ItemMeta FTSMeta = FTS.getItemMeta();
        FTSMeta.setDisplayName("Disney's Fantasia Shop");
        FTS.setItemMeta(FTSMeta);

        ItemStack DS = new ItemStack(Material.MOOSHROOM_SPAWN_EGG);
        ItemMeta DSMeta = DS.getItemMeta();
        DSMeta.setDisplayName("Disney Showcase");
        DS.setItemMeta(DSMeta);



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