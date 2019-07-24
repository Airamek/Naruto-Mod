package sekwah.mods.narutomod.packets;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.entity.EntityClientPlayerMP;
import sekwah.mods.narutomod.client.JutsuClient;
import sekwah.mods.narutomod.client.ParticleEffects;
import sekwah.mods.narutomod.client.PlayerClientTickEvent;
import sekwah.mods.narutomod.client.SoundEffects;
import sekwah.mods.narutomod.settings.NarutoSettings;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class ClientPacketHandler {

    public static void handleJutsuData(byte[] packet) {
        EntityClientPlayerMP playerMP = FMLClientHandler.instance().getClient().thePlayer;

        ByteArrayInputStream bais = new ByteArrayInputStream(packet);
        DataInputStream dis = new DataInputStream(bais);
        int JutsuCombo = 0;
        int dimension = 0;
        try {
            JutsuCombo = dis.readInt();
        } catch (Exception e) {
            e.printStackTrace();
        }

        JutsuClient.execute(JutsuCombo, playerMP);
    }

    public static void handleMaxStats(byte[] packet) {
        ByteArrayInputStream bais = new ByteArrayInputStream(packet);
        DataInputStream dis = new DataInputStream(bais);
        try {
            PlayerClientTickEvent.maxStamina = PlayerClientTickEvent.stamina = dis.readDouble();
            PlayerClientTickEvent.maxChakra = PlayerClientTickEvent.chakra = dis.readDouble();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void handleParticleEffect(byte[] packet) {
        ByteArrayInputStream bais = new ByteArrayInputStream(packet);
        DataInputStream dis = new DataInputStream(bais);
        /*int effectID = 0;
        double x = -1.0D;
        double y = -1.0D;
        double z = -1.0D;
        int dimension = 0;
        try {
            effectID = dis.readInt();
            x = dis.readDouble();
            y = dis.readDouble();
            z = dis.readDouble();
            dimension = dis.readInt();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        EntityClientPlayerMP playerMP = FMLClientHandler.instance().getClient().thePlayer;
        ParticleEffects.execute(dis, playerMP);
    }

    public static void handleAnimationData(byte[] packet) {
    }

    public static void handleSoundData(byte[] packet) {
        ByteArrayInputStream bais = new ByteArrayInputStream(packet);
        DataInputStream dis = new DataInputStream(bais);
        int soundID = 0;
        double x = -1.0D;
        double y = -1.0D;
        double z = -1.0D;
        try {
            soundID = dis.readInt();
            x = dis.readDouble();
            y = dis.readDouble();
            z = dis.readDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        EntityClientPlayerMP playerMP = FMLClientHandler.instance().getClient().thePlayer;
        SoundEffects.play(soundID, playerMP, x, y, z);
    }

    public static void handlePlayerDataPacket(byte[] packet) {

    }
}
