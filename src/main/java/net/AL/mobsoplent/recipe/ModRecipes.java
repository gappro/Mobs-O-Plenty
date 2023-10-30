package net.AL.mobsoplent.recipe;

import net.AL.mobsoplent.MobsOPlent;
import net.minecraft.util.datafix.fixes.RecipesRenameningFix;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MobsOPlent.MOD_ID);

    public static final RegistryObject<RecipeSerializer<VoidsentSaddleRecipe>> VOIDSENT_SADDLE_SERIALIZER =
            SERIALIZERS.register("voidsent_saddle", () -> VoidsentSaddleRecipe.Serializer.INSTANCE);
    public static void register(IEventBus eventBus){
        SERIALIZERS.register(eventBus);
    }
}
