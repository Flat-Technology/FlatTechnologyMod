package com.wu_ming.flattechnologymod.Item;

import com.wu_ming.flattechnologymod.Block.BlockLoader;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    //Item Instantiate
    // static Item (Item name) = new Item class("name");
    public static Item flattechnology = new Itemflattechnology("flattechnology");

    //Block registeritemblock
    public static void Blockitem(){
        //registeritemblock(BlockLoader.Block name);
    }

    public static void registeritemblock(Block block) {
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    public static void Itemitem(){
        //ForgeRegistries.ITEMS.register(Item name);
        ForgeRegistries.ITEMS.register(flattechnology);
    }

    //Block item resources load
    @SideOnly(Side.CLIENT)
    public static void BlockitemregisterRenders() {
        //regsiterRender(Item.getItemFromBlock(BlockLoader.resources name);

    }

    //Item item resources load
    @SideOnly(Side.CLIENT)
    public static void ItemitemregisterRenders() {
        //regsiterRender(item resources name);
        regsiterRender(flattechnology);
    }

    @SideOnly(Side.CLIENT)
    private static void regsiterRender(Item item) {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0,model);
    }
}