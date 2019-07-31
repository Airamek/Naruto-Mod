package sekwah.mods.narutomod.common.entity;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import sekwah.mods.narutomod.NarutoMod;
import sekwah.mods.narutomod.common.entity.jutsuprojectiles.EntityChibakuTensei;
import sekwah.mods.narutomod.common.entity.jutsuprojectiles.EntityFlameFireball;
import sekwah.mods.narutomod.common.entity.jutsuprojectiles.EntityWaterBullet;
import sekwah.mods.narutomod.common.entity.projectiles.*;
import sekwah.mods.narutomod.common.entity.specials.EntityChibakuBlock;
import sekwah.mods.narutomod.common.entity.specials.EntityMovingBlock;

import java.awt.*;

public class NarutoEntitys {

    public static void addEntities(NarutoMod narutoMod) {
        // Check when you have internet/are back if the entity list is needed and also if the id's are global or
        // if the same ids can be shared across different mods. Its registering a mod id so it may not be like modloader
        // they may be able to start at 1 for each mod and work their way up(would be pretty useful rather than always
        // looking at different ids and being unnecessarily odd... (however it does say mod specific id so its
        // pointing towards being good)

        EntityRegistry.registerModEntity(EntityKunai.class, "Kunai", 1, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntityShuriken.class, "Shuriken", 2, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntityPaperBomb.class, "PaperBomb", 3, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntitySenbon.class, "Senbon", 4, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntityExplosiveKunai.class, "Explosive Kunai", 5, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntityFlameFireball.class, "Fireball", 6, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntityWaterBullet.class, "WaterBullet", 7, narutoMod, 64, 1, true);

        EntityRegistry.registerModEntity(EntityMovingBlock.class, "EarthWall", 8, narutoMod, 120, 1, false);

        EntityRegistry.registerModEntity(EntityChibakuBlock.class, "ChibakuBlocks", 9, narutoMod, 64, 20, true);

        EntityRegistry.registerModEntity(EntityChibakuTensei.class, "ChibakuTensei", 10, narutoMod, 64, 1, false);

        // TODO make a custom egg for entities
        EntityRegistry.registerModEntity(EntityPuppet.class, "Puppet", 73, narutoMod, 80, 5, true);
        EntityList.idToClassMap.put(73, EntityPuppet.class);
        EntityList.entityEggs.put(73, new EntityList.EntityEggInfo(73, (new Color(50, 50, 50)).getRGB(), (new Color(195, 173, 169)).getRGB()));

        EntityRegistry.registerModEntity(EntityRogueNinja.class, "Rogue_Ninja", 70, narutoMod, 80, 1, true);
        EntityList.idToClassMap.put(70, EntityRogueNinja.class);
        EntityList.entityEggs.put(70, new EntityList.EntityEggInfo(70, (new Color(40, 40, 40)).getRGB(), (new Color(149, 94, 39)).getRGB()));

        EntityRegistry.registerModEntity(EntityNinjaVillager.class, "Ninja_Villager", 71, narutoMod, 80, 1, true);
        EntityList.idToClassMap.put(71, EntityNinjaVillager.class);
        EntityList.entityEggs.put(71, new EntityList.EntityEggInfo(71, (new Color(42, 135, 58)).getRGB(), (new Color(149, 94, 39)).getRGB()));

        EntityRegistry.registerModEntity(EntityNinjaVillagerAnbu.class, "Ninja_VillagerAnbu", 72, narutoMod, 80, 1, true);
        EntityList.idToClassMap.put(72, EntityNinjaVillagerAnbu.class);
        EntityList.entityEggs.put(72, new EntityList.EntityEggInfo(72, (new Color(173, 173, 173)).getRGB(), (new Color(23, 23, 23)).getRGB()));

        EntityRegistry.registerModEntity(EntityBandit.class, "Bandit", 74, narutoMod, 80, 1, true);
        EntityList.idToClassMap.put(74, EntityBandit.class);
        EntityList.entityEggs.put(74, new EntityList.EntityEggInfo(74, (new Color(227, 13, 13)).getRGB(), (new Color(242, 198, 121)).getRGB()));

        EntityRegistry.registerModEntity(EntityShadowClone.class, "Shadow_Clone", 75, narutoMod, 80, 1, true);
        EntityList.idToClassMap.put(75, EntityShadowClone.class);
        EntityList.entityEggs.put(75, new EntityList.EntityEggInfo(75, (new Color(40, 40, 40)).getRGB(), (new Color(149, 94, 39)).getRGB()));


        EntityRegistry.registerModEntity(EntitySubstitution.class, "Substitution", 14, narutoMod, 80, 1, true);

        EntityRegistry.registerModEntity(EntitySubstitutionLog.class, "SubstitutionLog", 15, narutoMod, 80, 1, true);

    }

    public static void addSpawns() {
        BiomeGenBase[] biomeList = {BiomeGenBase.plains, BiomeGenBase.forest, BiomeGenBase.birchForest, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.taiga
                , BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau};
        for (int i = 0; i < biomeList.length; i++) {
            EntityRegistry.addSpawn(EntityRogueNinja.class, 8, 1, 3, EnumCreatureType.monster, biomeList[i]);

            EntityRegistry.addSpawn(EntityBandit.class, 6, 1, 3, EnumCreatureType.monster, biomeList[i]);
        }

    }

}
