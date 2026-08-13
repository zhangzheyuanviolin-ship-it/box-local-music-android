            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/google/ai/edge/gallery/data/ConfigEditorType;", "", "<init>", "(Ljava/lang/String;I)V", "LABEL", "NUMBER_SLIDER", "BOOLEAN_SWITCH", "SEGMENTED_BUTTON", "BOTTOMSHEET_SELECTOR", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ConfigEditorType {
                private static final Il0lIli0 $ENTRIES;
                private static final ConfigEditorType[] $VALUES;
                public static final ConfigEditorType LABEL = new ConfigEditorType("LABEL", 0);
                public static final ConfigEditorType NUMBER_SLIDER = new ConfigEditorType("NUMBER_SLIDER", 1);
                public static final ConfigEditorType BOOLEAN_SWITCH = new ConfigEditorType("BOOLEAN_SWITCH", 2);
                public static final ConfigEditorType SEGMENTED_BUTTON = new ConfigEditorType("SEGMENTED_BUTTON", 3);
                public static final ConfigEditorType BOTTOMSHEET_SELECTOR = new ConfigEditorType("BOTTOMSHEET_SELECTOR", 4);

                private static final ConfigEditorType[] $values() {
/* 11 */            return new ConfigEditorType[]{LABEL, NUMBER_SLIDER, BOOLEAN_SWITCH, SEGMENTED_BUTTON, BOTTOMSHEET_SELECTOR};
                }

                static {
/* 51 */            ConfigEditorType[] configEditorTypeArr$values = $values();
/* 55 */            $VALUES = configEditorTypeArr$values;
/* 61 */            $ENTRIES = ilIII1o11.I00000oIO(configEditorTypeArr$values);
                }

                private ConfigEditorType(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static ConfigEditorType valueOf(String str) {
/* 7 */             return (ConfigEditorType) Enum.valueOf(ConfigEditorType.class, str);
                }

                public static ConfigEditorType[] values() {
/* 7 */             return (ConfigEditorType[]) $VALUES.clone();
                }
            }
