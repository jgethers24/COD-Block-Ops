package net.rizza.tutorialemod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rizza.tutorialemod.TutorialMod;

public class ModTags {
    public  static class Blocks{
        //public static final TagKey<Block>
        public static TagKey<Block>tag(String name){
            return BlockTags.create(new ResourceLocation(TutorialMod.MOD_ID, name));
        }
    }
    public  static class Items{

        public static TagKey<Item>tag(String name){
            return ItemTags.create(new ResourceLocation(TutorialMod.MOD_ID, name));
        }
    }
}
