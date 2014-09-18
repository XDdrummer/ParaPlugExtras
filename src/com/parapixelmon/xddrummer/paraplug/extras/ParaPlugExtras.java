package com.parapixelmon.xddrummer.paraplug.extras;

import org.bukkit.plugin.java.JavaPlugin;
import us.xddrummer.util.XDStrings;

public class ParaPlugExtras extends JavaPlugin {

  @Override
  public void onEnable(){
    
    XDStrings.log("Enabling ParaPlug Extras by XDdrummer. View Config.yml for details.");
    
    saveDefaultConfig();
    XDStrings.log("Loaded config.yml in plugins>paraplugextras>config.yml");
    
    this.getCommand("setup-extras").setExecutor(SetupCommand(this));
    XDStrings.log("Loaded /setup-extras");
    this.getCommand("reset-extras").setExecutor(ResetCommand(this));
    XDStrings.log("Loaded /reset-extras");
    
  }
  
  @Override
  public void onDisable(){
    
    XDStrings.log("Disabling ParaPlug Extras by XDdrummer. View config.yml for details.");
    
  }

}
