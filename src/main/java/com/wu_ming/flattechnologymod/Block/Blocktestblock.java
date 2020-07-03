package com.wu_ming.flattechnologymod.Block;

import com.wu_ming.flattechnologymod.tab.Tabflattechnologymod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class Blocktestblock extends Block {

    public Blocktestblock(String nama,Material minecraft) {
        super(minecraft.ROCK);
        this.setUnlocalizedName(nama);
        this.setRegistryName(nama);
        this.setHardness(1F);
        this.setHarvestLevel("pickaxe", 0);
        this.setCreativeTab(Tabflattechnologymod.tabflattechnologymod);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
            tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"tooltip"));
        }
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
            tooltip.add(I18n.format(this.getUnlocalizedName()+".shift"+".1."+"tooltip"));
        }
    }
}
