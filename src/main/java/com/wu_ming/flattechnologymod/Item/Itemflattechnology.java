package com.wu_ming.flattechnologymod.Item;

import com.wu_ming.flattechnologymod.tab.Tabflattechnologymod;
import javafx.scene.effect.Effect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Itemflattechnology extends Item {

    public Itemflattechnology(String name) {
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setMaxStackSize(64);
        this.setCreativeTab(Tabflattechnologymod.tabflattechnologymod);

    }

    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack) {return true;}
}
