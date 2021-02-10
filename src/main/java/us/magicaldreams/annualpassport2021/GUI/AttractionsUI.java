package us.magicaldreams.annualpassport2021.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class AttractionsUI {
    public static void applyattractionsUI(Player player) {

        Inventory attractionsUI = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Attractions: Page 1");


        ItemStack JTA = new ItemStack(Material.ZOMBIE_HORSE_SPAWN_EGG);
        ItemMeta JTAMeta = JTA.getItemMeta();
        JTAMeta.setDisplayName("Journey to Atlantis");
        JTA.setItemMeta(JTAMeta);

        ItemStack GW = new ItemStack(Material.PIG_SPAWN_EGG);
        ItemMeta GWMeta = GW.getItemMeta();
        GWMeta.setDisplayName("Great White");
        GW.setItemMeta(GWMeta);

        ItemStack SE = new ItemStack(Material.PARROT_SPAWN_EGG);
        ItemMeta SEMeta = SE.getItemMeta();
        SEMeta.setDisplayName("Steel Eel");
        SE.setItemMeta(SEMeta);

        ItemStack RL = new ItemStack(Material.OCELOT_SPAWN_EGG);
        ItemMeta RLMeta = RL.getItemMeta();
        RLMeta.setDisplayName("Rio Loco");
        RL.setItemMeta(RLMeta);

        ItemStack WB = new ItemStack(Material.MULE_SPAWN_EGG);
        ItemMeta WBMeta = WB.getItemMeta();
        WBMeta.setDisplayName("Wave Breaker");
        WB.setItemMeta(WBMeta);

        ItemStack SG = new ItemStack(Material.HORSE_SPAWN_EGG);
        ItemMeta SGMeta = SG.getItemMeta();
        SGMeta.setDisplayName("Super Groovers Box Car Derby");
        SG.setItemMeta(SGMeta);

        ///INPUTS///

        attractionsUI.setItem(10, JTA);
        attractionsUI.setItem(11, GW);
        attractionsUI.setItem(12, SE);
        attractionsUI.setItem(13, RL);
        attractionsUI.setItem(14, WB);
        attractionsUI.setItem(15, SG);


        //NONNNNNN NEEEDED STiFFFFFF
        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack GSG = new ItemStack((Material.GREEN_STAINED_GLASS_PANE));
        ItemMeta GSGMeta = GSG.getItemMeta();
        GSGMeta.setDisplayName(" ");
        GSG.setItemMeta(GSGMeta);

        ItemStack attractions = new ItemStack(Material.MINECART);
        ItemMeta attractionsmeta = attractions.getItemMeta();
        attractionsmeta.setDisplayName(ChatColor.YELLOW + "Attractions");
        attractions.setItemMeta(attractionsmeta);

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);


        attractionsUI.setItem(0, BSG);
        attractionsUI.setItem(1, BSG);
        attractionsUI.setItem(2, BSG);
        attractionsUI.setItem(3, BSG);
        attractionsUI.setItem(4, attractions);
        attractionsUI.setItem(5, BSG);
        attractionsUI.setItem(6, BSG);
        attractionsUI.setItem(7, BSG);
        attractionsUI.setItem(8, back);
        attractionsUI.setItem(9, BSG);
        attractionsUI.setItem(18, BSG);
        attractionsUI.setItem(27, BSG);
        attractionsUI.setItem(36, BSG);
        attractionsUI.setItem(45, BSG);
        attractionsUI.setItem(46, BSG);
        attractionsUI.setItem(47, BSG);
        attractionsUI.setItem(48, BSG);
        attractionsUI.setItem(49, BSG);
        attractionsUI.setItem(50, BSG);
        attractionsUI.setItem(51, BSG);
        attractionsUI.setItem(52, BSG);
        attractionsUI.setItem(53, BSG);
        attractionsUI.setItem(44, BSG);
        attractionsUI.setItem(35, BSG);
        attractionsUI.setItem(26, BSG);
        attractionsUI.setItem(17, BSG);


        player.openInventory(attractionsUI);

    }

    public static void applyattractions2UI(Player player) {


        Inventory attractions2UI = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Attractions: Page 2");


      
        //REgular STuff

        ItemStack BSG = new ItemStack((Material.BLUE_STAINED_GLASS_PANE));
        ItemMeta BSGMeta = BSG.getItemMeta();
        BSGMeta.setDisplayName(" ");
        BSG.setItemMeta(BSGMeta);

        ItemStack GSG = new ItemStack((Material.GREEN_STAINED_GLASS_PANE));
        ItemMeta GSGMeta = GSG.getItemMeta();
        GSGMeta.setDisplayName(" ");
        GSG.setItemMeta(GSGMeta);

        ItemStack attractions = new ItemStack(Material.MINECART);
        ItemMeta attractionsmeta = attractions.getItemMeta();
        attractionsmeta.setDisplayName(ChatColor.YELLOW + "Attractions");
        attractions.setItemMeta(attractionsmeta);

        ItemStack back = new ItemStack(Material.PAPER);
        ItemMeta backMeta = back.getItemMeta();
        backMeta.setDisplayName(ChatColor.GREEN + "<-- Back");
        back.setItemMeta(backMeta);

        ItemStack MoveB = new ItemStack(Material.RED_CONCRETE);
        ItemMeta MoveBMeta = MoveB.getItemMeta();
        MoveBMeta.setDisplayName(ChatColor.GREEN + "<-- Reverse Page");
        MoveB.setItemMeta(MoveBMeta);

        attractions2UI.setItem(0, BSG);
        attractions2UI.setItem(1, BSG);
        attractions2UI.setItem(2, BSG);
        attractions2UI.setItem(3, BSG);
        attractions2UI.setItem(4, attractions);
        attractions2UI.setItem(5, BSG);
        attractions2UI.setItem(6, BSG);
        attractions2UI.setItem(7, BSG);
        attractions2UI.setItem(8, back);
        attractions2UI.setItem(9, BSG);
        attractions2UI.setItem(18, BSG);
        attractions2UI.setItem(27, BSG);
        attractions2UI.setItem(36, BSG);
        attractions2UI.setItem(45, MoveB);
        attractions2UI.setItem(46, BSG);
        attractions2UI.setItem(47, BSG);
        attractions2UI.setItem(48, BSG);
        attractions2UI.setItem(49, BSG);
        attractions2UI.setItem(50, BSG);
        attractions2UI.setItem(51, BSG);
        attractions2UI.setItem(52, BSG);
        attractions2UI.setItem(53, BSG);
        attractions2UI.setItem(44, BSG);
        attractions2UI.setItem(35, BSG);
        attractions2UI.setItem(26, BSG);
        attractions2UI.setItem(17, BSG);


        player.openInventory(attractions2UI);

    }
}