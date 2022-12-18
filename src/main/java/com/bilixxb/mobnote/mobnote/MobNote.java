package com.bilixxb.mobnote.mobnote;

import function.mobnote_funcion;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;



public final class MobNote extends JavaPlugin implements CommandExecutor {
    public void onEnable() {
        // Plugin startup logic
         r("§aMobNote 成功加载！");
        getServer().getPluginManager().registerEvents(new mobnote_funcion(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        r("§c感谢你使用MobNote！");
    }
   

    public void r(String s){
        Bukkit.getConsoleSender().sendMessage(s);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("mobnote")) {
            if(sender instanceof Player){sender.sendMessage("MobNote插件可以正常使用！");}else{r("MobNote插件可以正常使用！");}
            return true;
        }
        return false;
    }

}


