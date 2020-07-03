package com.wu_ming.flattechnologymod.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockLoader {
    //Block
    //public static Block (block name) = new Block class("name",Material.ROCK);
    public static Block testblock = new Blocktestblock("testblock",Material.ROCK);

    //Block register
    public static void Blockblock() {
        //ForgeRegistries.BLOCKS.register((block name));
        ForgeRegistries.BLOCKS.register(testblock);
    }
}
