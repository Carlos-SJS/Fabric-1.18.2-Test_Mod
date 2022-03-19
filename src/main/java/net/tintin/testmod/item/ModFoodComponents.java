package net.tintin.testmod.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents{
    public static final FoodComponent TOMATOE = new FoodComponent.Builder().hunger(3).saturationModifier(0.6f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(5).saturationModifier(0.7f).build();
    public static final FoodComponent TACO= new FoodComponent.Builder().hunger(8).saturationModifier(1.5f).build();
    public static final FoodComponent BABY= new FoodComponent.Builder().hunger(1).saturationModifier(.1f).build();

}
