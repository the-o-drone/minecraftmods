package com.javaminecraft;

import java.util.logging.Logger;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetEvent.TargetReason;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BestFriendOfZeus extends JavaPlugin
    implements Listener {
    
    public static final Logger LOG = Logger.getLogger(
        "minecraft");
   Player me;
   World world;
   Location spot;
   boolean on = false;
   
   @Override
   public boolean onCommand(CommandSender sender, 
       Command command, String label, String[] argument) {
       
       
       me = (Player) sender;
       world = me.getWorld();
       spot = me.getLocation();
       if (sender inctanceof Player) {
           if (label.equalsIgnoreCase("zeus")) {
               if (arguments.length > 0) {
                   if (arguments[0].equals("on")){
                       //Zeus powers activate
                       on = true;
                       me.sendMessage(
                           "zeus is yer friend!");
                   } else {
                        //Zeus powers deactivate
                        on = false;
                        me.sendMessage(
                           "zeus is not yer friend!");
                   }
                   return true;
               }
           }
       }
   }
   return false;
}

    //make this class listen to events
    @Override
    public void omEnable() {
    Server server = getServer();
    PluginManager manager = server.getPluginmanager();
    manager.registerEvents(this, this);
    }

    @EventHandler
    public void onEntityTarget(EntityTargetEvent event) {
        Entity entity = event.getEntity();
        Entity Target = event.getTarget();

        if (!on) {
            //don't do it, zeus
            return;
        }
LOG.info("Target " + target + " chosen by " + entity);
if (target instanceof) Player) {
//the mod's target is a player
Player playa = (Player) target;
if (playa == me) {
    //mob's target is the player
    if (event.getReason()==
        TargetReason.CLOSEST_PLAYER) {

Location loc = entity.getLogation();
//here come the boom!
world.strikeLightning(loc);
}
}
    }
}