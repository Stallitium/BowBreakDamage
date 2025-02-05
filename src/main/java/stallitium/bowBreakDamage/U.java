package stallitium.bowBreakDamage;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class U {
    //ランダム
    public static Random random = new Random();

    //アイテム渡す
    public static void addItem(Player player, ItemStack item) {
        if (player.getInventory().firstEmpty() == -1) {
            player.getWorld().dropItem(player.getLocation(),item);
        } else {
            player.getInventory().addItem(item);
        }
    }
}
