package net.thevaliantsquidward.scalesntrails.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.thevaliantsquidward.scalesntrails.ScalesNTrails;
import net.thevaliantsquidward.scalesntrails.entity.custom.EntityLeafTailedGecko;

public class ModEntities {
public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ScalesNTrails.MOD_ID);


public static final RegistryObject<EntityType<EntityLeafTailedGecko>> LEAFGECKO =
        ENTITY_TYPES.register("leaf_tailed_gecko",
                () -> EntityType.Builder.of(EntityLeafTailedGecko::new, MobCategory.CREATURE)
                        .sized(0.4f, 0.4f)
                        .build(new ResourceLocation(ScalesNTrails.MOD_ID, "leaf_tailed_gecko").toString()));

public static void register(IEventBus eventBus) {
    ENTITY_TYPES.register(eventBus);
}
}