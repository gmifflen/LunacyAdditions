package ca.gmifflen.lunacyadditions;

import ca.gmifflen.lunacyadditions.items.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod( LunacyAdditions.MOD_ID )
public class LunacyAdditions {
  public static final String MOD_ID = "lunacyadditions";
  private static final Logger LOGGER = LogUtils.getLogger();

  public LunacyAdditions() {
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    ModItems.register( modEventBus );

    modEventBus.addListener( this::commonSetup );

    MinecraftForge.EVENT_BUS.register( this );

  }

  private void commonSetup( final FMLCommonSetupEvent event ) {

  }

  @Mod.EventBusSubscriber( modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT )
  public static class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup( FMLClientSetupEvent event ) {

    }

  }

}
