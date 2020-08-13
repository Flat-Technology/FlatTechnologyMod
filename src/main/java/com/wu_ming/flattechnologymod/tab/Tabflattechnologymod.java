package com.wu_ming.flattechnologymod.tab;

import com.wu_ming.flattechnologymod.Item.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Tabflattechnologymod extends CreativeTabs {

    public static final Tabflattechnologymod tabflattechnologymod = new Tabflattechnologymod();

    public  Tabflattechnologymod() {super("flattechnologymod");}

    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {return new ItemStack(ItemLoader.flattechnology);}
}
