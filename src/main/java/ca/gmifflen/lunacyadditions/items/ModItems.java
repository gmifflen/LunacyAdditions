package ca.gmifflen.lunacyadditions.items;

import ca.gmifflen.lunacyadditions.LunacyAdditions;
import ca.gmifflen.lunacyadditions.builders.SwordBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create( ForgeRegistries.ITEMS, LunacyAdditions.MOD_ID );

  public static final RegistryObject<SwordItem> BLACKSTONE_SWORD = ITEMS.register( "blackstone_sword",
      () -> new SwordBuilder()
          .attackDamage( 5 )
          .attackSpeed( 1.6f )
          .fireResistant( true )
          .tier( Tiers.BLACKSTONE )
          .build()
  );

  public static void register( IEventBus eventBus ) {
    ITEMS.register( eventBus );

  }

  public static class Tiers {
    public static final Tier BLACKSTONE = new ForgeTier(
        0,
        131,
        0,
        0,
        5,
        null,
        () -> Ingredient.of( Blocks.BLACKSTONE.asItem() )
    );

  }

}

