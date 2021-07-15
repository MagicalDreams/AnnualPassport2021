package us.magicaldreams.annualpassport2021.Override;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import us.magicaldreams.annualpassport2021.Changeables.ShowsUI;
import us.magicaldreams.annualpassport2021.GUI.*;

import java.io.IOException;
import java.net.URISyntaxException;

public class OpenAP implements Listener {

    private Main main;

    public OpenAP(Main main) {
        this.main = main;
    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void PlayerClick(InventoryClickEvent e) throws IOException, URISyntaxException {

        Player player = (Player) e.getWhoClicked();


        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Player Settings")) {

            if (e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);

                        break;
                    case JUKEBOX:


                        break;
                    case BOOK:
                        player.sendMessage(ChatColor.YELLOW
                                + "Click this link to Report/Issue: https://docs.google.com/forms/d/e/1FAIpQLSf-7fXP9KbaQ6FcpzPaqBA7eeqtBIr1mc0cfxFtQmHMBNp_dg/viewform");
                        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "-------------------- " + player.getName() + " has to report something --------------------");
                        player.sendMessage(ChatColor.RED + "The staff has been notified of your issue and will address it soon!");
                        player.closeInventory();

                        break;
                    case CHEST:

                        player.setResourcePack("https://github.com/chums122/Resource-Pack/raw/master/Archives/Development/md3173alpha.zip");

                        break;
                    case SCUTE:

                        break;
                    case ACACIA_SIGN:

                        break;
                    case SUNFLOWER:
                        player.closeInventory();
                        TimeUI.applytimeUI((Player) player);

                        break;
                    default:
                        return;
                }
            }
        }
    }



    @EventHandler
    public void AttractionClick(InventoryClickEvent e) throws IOException, URISyntaxException {

        Player player = (Player) e.getWhoClicked();


        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Attractions: Page 1")) {

            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case BLAZE_SPAWN_EGG:
                        player.sendMessage(ChatColor.RED + "This Warp is Currently Not Available");
                     
                        break;
                    case CAVE_SPIDER_SPAWN_EGG:
                        player.sendMessage(ChatColor.RED + "This Warp is Currently Not Available");

                        break;
                    case CREEPER_SPAWN_EGG:
                        player.sendMessage(ChatColor.RED + "This Warp is Currently Not Available");
                        break;
                    default:
                        return;
                }
            }
        }
    }



    @SuppressWarnings("deprecation")
    @EventHandler
    public void APonClick(InventoryClickEvent e) throws IOException, URISyntaxException {

        Player player = (Player) e.getWhoClicked();


        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Annual Passport")) {


            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PLAYER_HEAD:
                        player.closeInventory();
                        PlayerUI.applyPlayerUI((Player) player);

                        break;
                    case NETHER_STAR:
                        player.closeInventory();
                        ParksUI.applyParksUI((Player) player);

                        break;
                    case MINECART:
                        player.closeInventory();
                        AttractionsUI.applyattractionsUI((Player) player);

                        break;
                    case FIREWORK_ROCKET:
                        player.closeInventory();
                        ShowsUI.applyShowTimesUI((Player) player);

                        break;
                    case POTATO:
                        player.closeInventory();
                        DiningUI.applyDiningUI((Player) player);

                        break;
                    case IRON_CHESTPLATE:
                        player.closeInventory();
                        ShopsUI.applyShopsUI((Player) player);

                        break;
                    default:
                        return;

                }
            }

        }


    }
/*
    @EventHandler
    public void onBlockbreak(BlockBreakEvent e){
        e.setCancelled(true);
    }

    */
    @EventHandler
    public void ParksonClick(InventoryClickEvent e) {



        Player player = (Player) e.getWhoClicked();


        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Parks")) {

            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {
                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);

                        break;
                    case TROPICAL_FISH:
                        player.performCommand("join swsa");
                        player.sendMessage(ChatColor.YELLOW + "Attempting to send you to: SWSA");
                        player.closeInventory();

                        break;
                    case DIAMOND_HOE:
                        player.performCommand("join dlr");
                        player.sendMessage(ChatColor.YELLOW + "Attempting to send you to: DLR");
                        player.closeInventory();

                        break;
                    case DIAMOND_PICKAXE:
                        player.performCommand("join creative");
                        player.sendMessage(ChatColor.YELLOW + "Attempting to send you to: Creative");
                        player.closeInventory();

                        break;
                    case POTATO:
                        player.performCommand("join tdr");
                        player.sendMessage(ChatColor.YELLOW + "Attempting to send you to: TDR");
                        player.closeInventory();

                        break;
                    case ENCHANTED_BOOK:
                        player.performCommand("join hub");
                        player.sendMessage(ChatColor.YELLOW + "Attempting to send you to: HUB");
                        player.closeInventory();

                        break;
                    case GOLDEN_PICKAXE:
                        player.performCommand("join custom");
                        player.sendMessage(ChatColor.YELLOW + "Attempting to send you to: Custom");
                        player.closeInventory();

                        break;
                    default:
                        return;
                }
            }

        }

    }

    @EventHandler
    public void DiningCLick(InventoryClickEvent e){

        Player player = (Player) e.getWhoClicked();

        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Dining")) {

            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PAPER:
                        player.closeInventory();
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);


                        break;
                    default:
                        return;
                }
            }
        }
    }

    @EventHandler
    public void timeclick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Time")) {
            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {
                    case YELLOW_DYE:
                        player.setPlayerTime(1000, false);
                        break;
                    case ORANGE_DYE:
                        player.setPlayerTime(7000, false);
                        break;
                    case LAPIS_LAZULI:
                        player.setPlayerTime(14000, false);
                        break;
                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);
                        break;
                    default:
                        return;
                }
            }
        }
    }

    @EventHandler
    public void ShopsCLick(InventoryClickEvent e){

        Player player = (Player) e.getWhoClicked();

        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Shops")) {

            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);


                        break;
                    default:
                        return;
                }
            }
        }
    }

    @EventHandler
    public void STonClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Show Times")) {

            if(e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);


                        break;
                    default:
                        return;
                }
            }
        }

    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void AtractionsClick(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Attractions: Page 1")) {

            if (e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);

                        break;
                    case GREEN_CONCRETE:
                        player.closeInventory();
                        AttractionsUI.applyattractions2UI((Player) player);
                        break;
                    default:
                        return;


                }
            }

        }


    }


    @SuppressWarnings("deprecation")
    @EventHandler
    public void Atractions2Click(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if( e.getView().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Attractions: Page 2")) {

            if (e.getCurrentItem() != null) {
                e.setCancelled(true);
                switch (e.getCurrentItem().getType()) {

                    case PAPER:
                        AnnualPassportUI.applyAnnualPassportUI((Player) player);

                        break;
                    case RED_CONCRETE:
                        player.closeInventory();
                        AttractionsUI.applyattractionsUI((Player) player);
                        break;
                    default:
                        return;


                }
            }

        }


    }



    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory() == AnnualPassportUI.applyAnnualPassportUI) {
            e.setCancelled(true);
        }
    }
}

