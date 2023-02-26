package de.florianmichael.viafabricplus.setting.groups;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import de.florianmichael.viafabricplus.platform.ProtocolRange;
import de.florianmichael.viafabricplus.setting.SettingGroup;
import de.florianmichael.viafabricplus.setting.impl.ProtocolSyncBooleanSetting;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public class DebugSettings extends SettingGroup {
    public static final DebugSettings self = new DebugSettings();

    // 1.19 -> 1.18.2
    public final ProtocolSyncBooleanSetting disableSequencing = new ProtocolSyncBooleanSetting(this, "Disable sequencing", ProtocolRange.andOlder(ProtocolVersion.v1_18_2));

    // 1.14 -> 1.13.2
    public final ProtocolSyncBooleanSetting smoothOutMerchantScreens = new ProtocolSyncBooleanSetting(this, "Smooth out merchant screens", ProtocolRange.andOlder(ProtocolVersion.v1_13_2));

    // 1.13 -> 1.12.2
    public final ProtocolSyncBooleanSetting executeInputsInSync = new ProtocolSyncBooleanSetting(this, "Execute inputs in sync", ProtocolRange.andOlder(ProtocolVersion.v1_12_2));
    public final ProtocolSyncBooleanSetting sneakInstant = new ProtocolSyncBooleanSetting(this, "Sneak instant", new ProtocolRange(ProtocolVersion.v1_12_2, ProtocolVersion.v1_8));

    // 1.9 -> 1.8.x
    public final ProtocolSyncBooleanSetting removeCooldowns = new ProtocolSyncBooleanSetting(this, "Remove cooldowns", ProtocolRange.andOlder(ProtocolVersion.v1_8));
    public final ProtocolSyncBooleanSetting sendIdlePacket = new ProtocolSyncBooleanSetting(this, "Send idle packet", new ProtocolRange(ProtocolVersion.v1_8, LegacyProtocolVersion.r1_3_1tor1_3_2));

    // 1.8.x -> 1.7.6
    public final ProtocolSyncBooleanSetting replaceSneaking = new ProtocolSyncBooleanSetting(this, "Replace sneaking", ProtocolRange.andOlder(ProtocolVersion.v1_7_6));
    public final ProtocolSyncBooleanSetting longSneaking = new ProtocolSyncBooleanSetting(this, "Long sneaking", ProtocolRange.andOlder(ProtocolVersion.v1_7_6));

    public DebugSettings() {
        super("Debug");
    }

    public static DebugSettings getClassWrapper() {
        return DebugSettings.self;
    }
}