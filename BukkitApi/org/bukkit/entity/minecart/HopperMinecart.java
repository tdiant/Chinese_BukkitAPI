package org.bukkit.entity.minecart;

import org.bukkit.entity.Minecart;
import org.bukkit.inventory.InventoryHolder;

/**
 * 代表漏斗矿车.
 */
public interface HopperMinecart extends Minecart, InventoryHolder {

    /**
     * 
     * <p>
     * 原文：Checks whether or not this Minecart will pick up 
     * items into its inventory.
     * 
     * @return true if the Minecart will pick up items
     */
    boolean isEnabled();

    /**
     * 
     *
     * 原文：Sets whether this Minecart will pick up items.
     * 
     * @param enabled new enabled state
     */
    void setEnabled(boolean enabled);
}
