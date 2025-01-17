package de.srendi.advancedperipherals.common.addons.refinedstorage;


import com.refinedmods.refinedstorage.apiimpl.network.node.NetworkNode;
import de.srendi.advancedperipherals.AdvancedPeripherals;
import de.srendi.advancedperipherals.common.configuration.APConfig;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;

public class RefinedStorageNode extends NetworkNode {

    public RefinedStorageNode(World world, BlockPos pos) {
        super(world, pos);
    }

    @Override
    public int getEnergyUsage() {
        return APConfig.PERIPHERALS_CONFIG.RS_CONSUMPTION.get();
    }

    @Override
    public ResourceLocation getId() {
        return new ResourceLocation(AdvancedPeripherals.MOD_ID, "rs_bridge");
    }

    @NotNull
    @Override
    public ItemStack getItemStack() {
        return super.getItemStack();
    }

}
