package com.wu_ming.flattechnologymod.Item;

import com.wu_ming.flattechnologymod.tab.Tabflattechnologymod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Itemflattechnology extends Item {
    public Itemflattechnology(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxDamage(16);
        this.setCreativeTab(Tabflattechnologymod.tabflattechnologymod);
    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) { return true;}
}
