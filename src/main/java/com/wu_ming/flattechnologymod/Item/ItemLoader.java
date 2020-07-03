package com.wu_ming.flattechnologymod.Item;

import com.wu_ming.flattechnologymod.Block.BlockLoader;
//import com.wu_ming.flattechnologymod.Item.Tool.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
    //Item 实例化
    // static Item (Item name) = new Item class("name");
    public static Item test = new Itemtest("test");
    public static Item flatTechnology = new ItemflatTechnology("flatTechnology");
    //block 物品方块注册
    public static void Blockitem(){
        //registeritemblock(BlockLoader.Block name);
        registeritemblock(BlockLoader.testblock);
    }

    public static void registeritemblock(Block block) {
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    public static void Itemitem() {
        //ForgeRegistries.ITEMS.register(Item name);
        ForgeRegistries.ITEMS.register(test);
    }

    //Block 物品材质加载
    @SideOnly(Side.CLIENT)
    public static void BlockitemregisterRenders() {
        //regsiterRender(Item.getItemFromBlock(BlockLoader.材质名);
        regsiterRender(Item.getItemFromBlock(BlockLoader.testblock));

    }

    //Item 物品材质加载
    @SideOnly(Side.CLIENT)
    public static void ItemitemregisterRenders() {
        //regsiterRender(物品材质名);
        regsiterRender(test);
        regsiterRender(flatTechnology);

    }

    @SideOnly(Side.CLIENT)
    private static void regsiterRender(Item item) {
        ModelResourceLocation model = new ModelResourceLocation(item.getRegistryName(), "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0,model);
    }
}
