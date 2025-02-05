package stallitium.bowBreakDamage;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    //config.yml
    FileConfiguration config;
    //弓破壊ダメージ
    BowBreakDamage bowBreakDamage;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        config = getConfig();
        //弓破壊ダメージ
        Bukkit.getPluginCommand("bbd").setExecutor(new BowBreakDamage(this));


        //弓破壊ダメージ
        BowBreakDamage.bowBreakDamage = config.getBoolean("power.bowBreakDamage",false);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
