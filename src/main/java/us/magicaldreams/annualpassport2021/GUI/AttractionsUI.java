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

        //EGGSGSGGSGSGSGSGGSGGGGGSG

        //28

        //Sipped: FrointerLand Shooting Expositioin, Fantasyland Theatre, Pooh, Splash Mountinan

        ItemStack Tiki = new ItemStack(Material.BEE_SPAWN_EGG);
        ItemMeta TikiMeta = Tiki.getItemMeta();
        TikiMeta.setDisplayName("Tiki Room");
        Tiki.setItemMeta(TikiMeta);

        ItemStack Jungle = new ItemStack(Material.BLAZE_SPAWN_EGG);
        ItemMeta JungleMeta = Jungle.getItemMeta();
        JungleMeta.setDisplayName("Jungle Cruise");
        Jungle.setItemMeta(JungleMeta);

        ItemStack Indy = new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG);
        ItemMeta IndyMeta = Indy.getItemMeta();
        IndyMeta.setDisplayName("Indiana Jones");
        Indy.setItemMeta(IndyMeta);

        ItemStack Tarzan = new ItemStack(Material.CREEPER_SPAWN_EGG);
        ItemMeta TarzanMeta = Tarzan.getItemMeta();
        TarzanMeta.setDisplayName("Tarzan's Jungle TreeHouse");
        Tarzan.setItemMeta(TarzanMeta);

        ItemStack Pirates = new ItemStack(Material.DROWNED_SPAWN_EGG);
        ItemMeta PiratesMeta = Pirates.getItemMeta();
        PiratesMeta.setDisplayName("Pirates of the Caribbean");
        Pirates.setItemMeta(PiratesMeta);

        ItemStack Mansion = new ItemStack(Material.DOLPHIN_SPAWN_EGG);
        ItemMeta MansionMeta = Mansion.getItemMeta();
        MansionMeta.setDisplayName("The Haunted Mansion");
        Mansion.setItemMeta(MansionMeta);

        ItemStack Railroad = new ItemStack(Material.ELDER_GUARDIAN_SPAWN_EGG);
        ItemMeta RailroadMeta = Railroad.getItemMeta();
        RailroadMeta.setDisplayName("Disneyland Railroad");
        Railroad.setItemMeta(RailroadMeta);

        ItemStack Davy = new ItemStack(Material.ENDERMITE_SPAWN_EGG);
        ItemMeta DavyMeta = Davy.getItemMeta();
        DavyMeta.setDisplayName("Davy Crockett Explorer Canoes");
        Davy.setItemMeta(DavyMeta);

        ItemStack BigThunder = new ItemStack(Material.EVOKER_SPAWN_EGG);
        ItemMeta BigThunderMeta = BigThunder.getItemMeta();
        BigThunderMeta.setDisplayName("Big Thunder Mountain Railroad");
        BigThunder.setItemMeta(BigThunderMeta);

        ItemStack MarkTwain = new ItemStack(Material.FOX_SPAWN_EGG);
        ItemMeta MarkTwainMeta = MarkTwain.getItemMeta();
        MarkTwainMeta.setDisplayName("Mark Twain Riverboat");
        MarkTwain.setItemMeta(MarkTwainMeta);

        ItemStack TomSawyer = new ItemStack(Material.GHAST_SPAWN_EGG);
        ItemMeta TomSawyerMeta = TomSawyer.getItemMeta();
        TomSawyerMeta.setDisplayName("Tom Sawyer Island");
        TomSawyer.setItemMeta(TomSawyerMeta);

        ItemStack SailingColumbia = new ItemStack(Material.GUARDIAN_SPAWN_EGG);
        ItemMeta SailingColumbiaMeta = SailingColumbia.getItemMeta();
        SailingColumbiaMeta.setDisplayName("Sailing Columbia SeaShip");
        SailingColumbia.setItemMeta(SailingColumbiaMeta);

        ItemStack GoofysPlayhouse = new ItemStack(Material.HUSK_SPAWN_EGG);
        ItemMeta GoofysPlayhouseMeta = GoofysPlayhouse.getItemMeta();
        GoofysPlayhouseMeta.setDisplayName("Goofy's PlayHouse");
        GoofysPlayhouse.setItemMeta(GoofysPlayhouseMeta);

        ItemStack DonaldsBoat = new ItemStack(Material.LLAMA_SPAWN_EGG);
        ItemMeta DonaldsBoatMeta = DonaldsBoat.getItemMeta();
        DonaldsBoatMeta.setDisplayName("Donald's Boat");
        DonaldsBoat.setItemMeta(DonaldsBoatMeta);

        ItemStack GadgetGoCoaster = new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG);
        ItemMeta GadgetGoCoasterMeta = GadgetGoCoaster.getItemMeta();
        GadgetGoCoasterMeta.setDisplayName("Gadget Go Coaster");
        GadgetGoCoaster.setItemMeta(GadgetGoCoasterMeta);

        ItemStack ChipNDaleTreeHouse = new ItemStack(Material.PANDA_SPAWN_EGG);
        ItemMeta ChipNDaleTreeHouseMeta = ChipNDaleTreeHouse.getItemMeta();
        ChipNDaleTreeHouseMeta.setDisplayName("Chip N Dale TreeHouse");
        ChipNDaleTreeHouse.setItemMeta(ChipNDaleTreeHouseMeta);

        ItemStack MickeysHouse = new ItemStack(Material.PHANTOM_SPAWN_EGG);
        ItemMeta MickeysHouseMeta = MickeysHouse.getItemMeta();
        MickeysHouseMeta.setDisplayName("Mickey's House");
        MickeysHouse.setItemMeta(MickeysHouseMeta);

        ItemStack MinnieHouse = new ItemStack(Material.PILLAGER_SPAWN_EGG);
        ItemMeta MinnieHouseMeta = MinnieHouse.getItemMeta();
        MinnieHouseMeta.setDisplayName("Minnie's House");
        MinnieHouse.setItemMeta(MinnieHouseMeta);

        ItemStack RogerRabbit = new ItemStack(Material.POLAR_BEAR_SPAWN_EGG);
        ItemMeta RogerRabbitMeta = RogerRabbit.getItemMeta();
        RogerRabbitMeta.setDisplayName("Roger Rabbit");
        RogerRabbit.setItemMeta(RogerRabbitMeta);

        ItemStack ItsASmallWorld = new ItemStack(Material.RAVAGER_SPAWN_EGG);
        ItemMeta ItsASmallWorldMeta = ItsASmallWorld.getItemMeta();
        ItsASmallWorldMeta.setDisplayName("It's a Small World");
        ItsASmallWorld.setItemMeta(ItsASmallWorldMeta);

        ItemStack MrToad = new ItemStack(Material.SHULKER_SPAWN_EGG);
        ItemMeta MrToadMeta = MrToad.getItemMeta();
        MrToadMeta.setDisplayName("Mr. Toad");
        MrToad.setItemMeta(MrToadMeta);

        ItemStack PeterPanFlight = new ItemStack(Material.SILVERFISH_SPAWN_EGG);
        ItemMeta PeterPanFlightMeta = PeterPanFlight.getItemMeta();
        PeterPanFlightMeta.setDisplayName("Peter Pan's Flight");
        PeterPanFlight.setItemMeta(PeterPanFlightMeta);

        ItemStack Pinocchio = new ItemStack(Material.SHULKER_SPAWN_EGG);
        ItemMeta PinocchioMeta = Pinocchio.getItemMeta();
        PinocchioMeta.setDisplayName("Pinocchio");
        Pinocchio.setItemMeta(PinocchioMeta);

        ItemStack PixieHollow = new ItemStack(Material.SLIME_SPAWN_EGG);
        ItemMeta PixieHollowMeta = PixieHollow.getItemMeta();
        PixieHollowMeta.setDisplayName("Pixie Hollow");
        PixieHollow.setItemMeta(PixieHollowMeta);

        ItemStack SnowWhite = new ItemStack(Material.SPIDER_SPAWN_EGG);
        ItemMeta SnowWhiteMeta = SnowWhite.getItemMeta();
        SnowWhiteMeta.setDisplayName("Snow White");
        SnowWhite.setItemMeta(SnowWhiteMeta);

        ItemStack StoryBookLandCanalBoats = new ItemStack(Material.STRAY_SPAWN_EGG);
        ItemMeta StoryBookLandCanalBoatsMeta = StoryBookLandCanalBoats.getItemMeta();
        StoryBookLandCanalBoatsMeta.setDisplayName("Story Book Land Canal Boats");
        StoryBookLandCanalBoats.setItemMeta(StoryBookLandCanalBoatsMeta);

        ItemStack Dumbo = new ItemStack(Material.VEX_SPAWN_EGG);
        ItemMeta DumboMeta = Dumbo.getItemMeta();
        DumboMeta.setDisplayName("Dumbo");
        Dumbo.setItemMeta(DumboMeta);

        ItemStack CaseyJrTrain = new ItemStack(Material.VINDICATOR_SPAWN_EGG);
        ItemMeta CaseyJrTrainMeta = CaseyJrTrain.getItemMeta();
        CaseyJrTrainMeta.setDisplayName("Casey Jr Train");
        CaseyJrTrain.setItemMeta(CaseyJrTrainMeta);

        attractionsUI.setItem(10, Tiki);
        attractionsUI.setItem(11, Jungle);
        attractionsUI.setItem(12, Indy);
        attractionsUI.setItem(13, Tarzan);
        attractionsUI.setItem(14, Pirates);
        attractionsUI.setItem(15, Mansion);
        attractionsUI.setItem(16, Railroad);
        attractionsUI.setItem(19, Davy);
        attractionsUI.setItem(20, BigThunder);
        attractionsUI.setItem(21, MarkTwain);
        attractionsUI.setItem(22, TomSawyer);
        attractionsUI.setItem(23, SailingColumbia);
        attractionsUI.setItem(24, GoofysPlayhouse);
        attractionsUI.setItem(25, DonaldsBoat);
        attractionsUI.setItem(28, GadgetGoCoaster);
        attractionsUI.setItem(29, ChipNDaleTreeHouse);
        attractionsUI.setItem(30, MickeysHouse);
        attractionsUI.setItem(31, MinnieHouse);
        attractionsUI.setItem(32, RogerRabbit);
        attractionsUI.setItem(33, ItsASmallWorld);
        attractionsUI.setItem(34, MrToad);
        attractionsUI.setItem(37, PeterPanFlight);
        attractionsUI.setItem(38, Pinocchio);
        attractionsUI.setItem(39, PixieHollow);
        attractionsUI.setItem(40, SnowWhite);
        attractionsUI.setItem(41, StoryBookLandCanalBoats);
        attractionsUI.setItem(42, Dumbo);
        attractionsUI.setItem(43, CaseyJrTrain);


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

        ItemStack MoveF = new ItemStack(Material.GREEN_CONCRETE);
        ItemMeta MoveFMeta = MoveF.getItemMeta();
        MoveFMeta.setDisplayName(ChatColor.GREEN + "Next Page -->");
        MoveF.setItemMeta(MoveFMeta);

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
        attractionsUI.setItem(53, MoveF);
        attractionsUI.setItem(44, BSG);
        attractionsUI.setItem(35, BSG);
        attractionsUI.setItem(26, BSG);
        attractionsUI.setItem(17, BSG);


        player.openInventory(attractionsUI);

    }

    public static void applyattractions2UI(Player player) {


        Inventory attractions2UI = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Attractions: Page 2");


        ///SPAWN EgGSS


        ItemStack Alice = new ItemStack(Material.WITCH_SPAWN_EGG);
        ItemMeta AliceMeta = Alice.getItemMeta();
        AliceMeta.setDisplayName("Alice In Wonderland");
        Alice.setItemMeta(AliceMeta);

        ItemStack Matterhorn = new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG);
        ItemMeta MatterhornMeta = Matterhorn.getItemMeta();
        MatterhornMeta.setDisplayName("Matterhorn Bobsleds");
        Matterhorn.setItemMeta(MatterhornMeta);

        ItemStack KingArthur = new ItemStack(Material.WOLF_SPAWN_EGG);
        ItemMeta KingArthurMeta = KingArthur.getItemMeta();
        KingArthurMeta.setDisplayName("King Aurthur Carrousel");
        KingArthur.setItemMeta(KingArthurMeta);

        ItemStack TeaParty = new ItemStack(Material.ZOMBIE_SPAWN_EGG);
        ItemMeta TeaPartyMeta = TeaParty.getItemMeta();
        TeaPartyMeta.setDisplayName("Mad Tea Party");
        TeaParty.setItemMeta(TeaPartyMeta);

        ItemStack SleepingBeauty = new ItemStack(Material.ZOMBIE_VILLAGER_SPAWN_EGG);
        ItemMeta SleepingBeautyMeta = SleepingBeauty.getItemMeta();
        SleepingBeautyMeta.setDisplayName("Sleeping Beauty Castle Walkthrough");
        SleepingBeauty.setItemMeta(SleepingBeautyMeta);

        ItemStack AstroOrbit = new ItemStack(Material.SHEEP_SPAWN_EGG);
        ItemMeta AstroOrbitMeta = AstroOrbit.getItemMeta();
        AstroOrbitMeta.setDisplayName("Astro Orbiter");
        AstroOrbit.setItemMeta(AstroOrbitMeta);

        ItemStack Autopia = new ItemStack(Material.BAT_SPAWN_EGG);
        ItemMeta AutopiaMeta = Autopia.getItemMeta();
        AutopiaMeta.setDisplayName("Autopia");
        Autopia.setItemMeta(AutopiaMeta);

        ItemStack StarTours = new ItemStack(Material.CAT_SPAWN_EGG); //MY FAV!!!
        ItemMeta StarToursMeta = StarTours.getItemMeta();
        StarToursMeta.setDisplayName("Star Tours: The Adventure Continues");
        StarTours.setItemMeta(StarToursMeta);

        ItemStack Buzz = new ItemStack(Material.CHICKEN_SPAWN_EGG);
        ItemMeta BuzzMeta = Buzz.getItemMeta();
        BuzzMeta.setDisplayName("Buzz Lightyear Astro Blasters");
        Buzz.setItemMeta(BuzzMeta);

        ItemStack SpaceMountain = new ItemStack(Material.COD_SPAWN_EGG);
        ItemMeta SpaceMountainMeta = SpaceMountain.getItemMeta();
        SpaceMountainMeta.setDisplayName("Space Mountain");
        SpaceMountain.setItemMeta(SpaceMountainMeta);

        ItemStack DLRailroad = new ItemStack(Material.COW_SPAWN_EGG);
        ItemMeta DLRailroadMeta = DLRailroad.getItemMeta();
        DLRailroadMeta.setDisplayName("Disneyland Railroad");
        DLRailroad.setItemMeta(DLRailroadMeta);

        ItemStack DLMonorail = new ItemStack(Material.DONKEY_SPAWN_EGG);
        ItemMeta DLMonorailMeta = DLMonorail.getItemMeta();
        DLMonorailMeta.setDisplayName("Disneyland Monorail");
        DLMonorail.setItemMeta(DLMonorailMeta);

        ItemStack Nemo = new ItemStack(Material.HORSE_SPAWN_EGG);
        ItemMeta NemoMeta = Nemo.getItemMeta();
        NemoMeta.setDisplayName("Finding Nemo Submarine Voyage");
        Nemo.setItemMeta(NemoMeta);

        ItemStack SWLaunchBay = new ItemStack(Material.MOOSHROOM_SPAWN_EGG);
        ItemMeta SWLaunchBayMeta = SWLaunchBay.getItemMeta();
        SWLaunchBayMeta.setDisplayName("Star Wars Launch Bay");
        SWLaunchBay.setItemMeta(SWLaunchBayMeta);

        ItemStack SmugglersRun = new ItemStack(Material.MULE_SPAWN_EGG);
        ItemMeta SmugglersRunMeta = SmugglersRun.getItemMeta();
        SmugglersRunMeta.setDisplayName("Star Wars: Smugglers Run");
        SmugglersRun.setItemMeta(SmugglersRunMeta);

        ItemStack RiseofResistance = new ItemStack(Material.OCELOT_SPAWN_EGG);
        ItemMeta RiseofResistanceMeta = RiseofResistance.getItemMeta();
        RiseofResistanceMeta.setDisplayName("Star Wars: Rise of the Resistance");
        RiseofResistance.setItemMeta(RiseofResistanceMeta);


        //END of Main attractions Page 2


        attractions2UI.setItem(10, Alice);
        attractions2UI.setItem(11, Matterhorn);
        attractions2UI.setItem(12, KingArthur);
        attractions2UI.setItem(13, TeaParty);
        attractions2UI.setItem(14, SleepingBeauty);
        attractions2UI.setItem(15, AstroOrbit);
        attractions2UI.setItem(16, Autopia);
        attractions2UI.setItem(19, StarTours);
        attractions2UI.setItem(20, Buzz);
        attractions2UI.setItem(21, SpaceMountain);
        attractions2UI.setItem(22, DLRailroad);
        attractions2UI.setItem(23, DLMonorail);
        attractions2UI.setItem(24, Nemo);
        attractions2UI.setItem(25, SWLaunchBay);
        attractions2UI.setItem(28, SmugglersRun);
        attractions2UI.setItem(29, RiseofResistance);




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

