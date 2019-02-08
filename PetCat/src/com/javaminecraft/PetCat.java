package com.javaminecraft;

import java.util.logging.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.*;

public class PetCat extends JavaPlugin {
   public static final Logger LOG = Logger.getLogger(
        "Minecraft");
   
    /**
     *
     * @param sender
     * @param command
     * @param label
     * @param arguments
     * @return
     */
    @Override
   public boolean onCommand(CommandSender sender, 
           Command command, String label, String[] arguments) {
       
       if (label.equalsIgnoreCase("petcat")){
           if (sender instanceof Player) {
               //get the player
               Player me = (Player) sender;
               //get the player's current location
               Location spot =me.getLocation();
               //get the game world
               World world = me.getWorld();
               //spawn one wolf
               Ocelot ocelot = world.spawn(spot, Ocelot.class);
               //set the color of it's collar
              ocelot.setCatType(Ocelot.Type.SIAMESE_CAT);
               //make the player the owner
              ocelot.setOwner(me);
               //do something cool here
               LOG.info("[PetCat] Meow!");
               return true;
           }
       }
       return false;
       
   }
}