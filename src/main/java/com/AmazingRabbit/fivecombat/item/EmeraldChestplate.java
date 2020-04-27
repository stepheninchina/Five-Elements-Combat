package com.AmazingRabbit.fivecombat.item;

import com.AmazingRabbit.fivecombat.FiveCombat;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class EmeraldChestplate extends EmeraldArmor {
    private static final String name = "emeraldchestplate";

    public EmeraldChestplate() {
        super(EntityEquipmentSlot.CHEST);
        this.setRegistryName(name);
        this.setUnlocalizedName(FiveCombat.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (flagIn.isAdvanced()) {
            tooltip.add("§6木");
            tooltip.add("");
            tooltip.add("§6觉醒");
            tooltip.add("§b传奇");
            tooltip.add("");
            tooltip.add("§e格雷夫的神圣战甲");
            tooltip.add("§e让村民王国颤抖");
            tooltip.add("§c从爱尔兰到契丹无人不晓");
            tooltip.add("§8反抗者联盟制造");
        } else {
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".1." + "desc"));
            tooltip.add("");
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".3." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".4." + "desc"));
            tooltip.add("");
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".6." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".7." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".8." + "desc"));
            tooltip.add(I18n.format(this.getUnlocalizedName() + ".9." + "desc"));
        }
    }
}
