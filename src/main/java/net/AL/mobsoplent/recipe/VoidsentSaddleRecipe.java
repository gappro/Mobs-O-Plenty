package net.AL.mobsoplent.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.AL.mobsoplent.MobsOPlent;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class VoidsentSaddleRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> inputItems;
    private final ItemStack output;
    private final ResourceLocation id;

    public VoidsentSaddleRecipe(NonNullList<Ingredient> inputItems, ItemStack output, ResourceLocation id) {
        this.inputItems = inputItems;
        this.output = output;
        this.id = id;
    }


    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if(pLevel.isClientSide()){
            return false;
        }

        return inputItems.get(0).test(pContainer.getItem(1))&&
                inputItems.get(1).test(pContainer.getItem(2))&&
                inputItems.get(2).test(pContainer.getItem(3))&&
                inputItems.get(3).test(pContainer.getItem(4))&&
                inputItems.get(4).test(pContainer.getItem(5))&&
                inputItems.get(5).test(pContainer.getItem(6))&&
                inputItems.get(6).test(pContainer.getItem(7))&&
                inputItems.get(7).test(pContainer.getItem(8))&&
                inputItems.get(8).test(pContainer.getItem(9))&&
                inputItems.get(9).test(pContainer.getItem(10));
    }

    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess pRegistryAccess) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess pRegistryAccess) {
        return output.copy();
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }
    public static class Type implements RecipeType<VoidsentSaddleRecipe>{
        public static final Type INSTANCE = new Type();
        public static final String ID = "voidsent_saddle";
    }

    public static class Serializer implements RecipeSerializer<VoidsentSaddleRecipe>{
        public static final  Serializer INSTANCE = new Serializer();
        public static final  ResourceLocation ID = new ResourceLocation(MobsOPlent.MOD_ID, "voidsent_saddle");


        @Override
        public VoidsentSaddleRecipe fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe, "output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(pSerializedRecipe, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(9, Ingredient.EMPTY);

            for(int i = 0; i < inputs.size(); i++){
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new VoidsentSaddleRecipe(inputs, output, pRecipeId);
        }

        @Override
        public @Nullable VoidsentSaddleRecipe fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(pBuffer.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++){
                inputs.set(i, Ingredient.fromNetwork(pBuffer));
            }

            ItemStack output = pBuffer.readItem();

            return new VoidsentSaddleRecipe(inputs, output, pRecipeId);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, VoidsentSaddleRecipe pRecipe) {
            pBuffer.writeInt(pRecipe.inputItems.size());

            for(Ingredient ingredient : pRecipe.getIngredients()){
                ingredient.toNetwork(pBuffer);

            }
            pBuffer.writeItemStack(pRecipe.getResultItem(null), false);
        }
    }
}
