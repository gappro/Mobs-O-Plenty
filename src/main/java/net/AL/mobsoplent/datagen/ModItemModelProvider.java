package net.AL.mobsoplent.datagen;
import net.AL.mobsoplent.MobsOPlent;
import net.AL.mobsoplent.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MobsOPlent.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        eggItem(ModItems.VOIDER_SPAWN_EGG);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MobsOPlent.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder eggItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MobsOPlent.MOD_ID,"item/" + "voider_egg"));
    }
}
