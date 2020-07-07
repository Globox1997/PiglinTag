package net.piglintag.mixin;

import java.util.Iterator;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.piglintag.PiglinTagMain;

@Mixin(PiglinBrain.class)
public class PiglinBrainMixin {
  @Overwrite
  public static boolean wearsGoldArmor(LivingEntity entity) {
    Iterable<ItemStack> iterable = entity.getArmorItems();
    Iterator<ItemStack> var2 = iterable.iterator();

    Item item;
    do {
      if (!var2.hasNext()) {
        return false;
      }

      ItemStack itemStack = (ItemStack) var2.next();
      item = itemStack.getItem();
    } while (!(item instanceof ArmorItem)
        || (((ArmorItem) item).getMaterial() != ArmorMaterials.GOLD && !item.isIn(PiglinTagMain.PIGLIN_NOT_ATTACK)));

    return true;
  }

}