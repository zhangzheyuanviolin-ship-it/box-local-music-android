            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.OiliO0I;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/ai/edge/gallery/data/AICoreModelPreference;", "", "<init>", "(Ljava/lang/String;I)V", "FAST", "FULL", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class AICoreModelPreference {
                private static final Il0lIli0 $ENTRIES;
                private static final AICoreModelPreference[] $VALUES;

                @OiliO0I("fast")
                public static final AICoreModelPreference FAST = new AICoreModelPreference("FAST", 0);

                @OiliO0I("full")
                public static final AICoreModelPreference FULL = new AICoreModelPreference("FULL", 1);

                private static final AICoreModelPreference[] $values() {
/* 5 */             return new AICoreModelPreference[]{FAST, FULL};
                }

                static {
/* 21 */            AICoreModelPreference[] aICoreModelPreferenceArr$values = $values();
/* 25 */            $VALUES = aICoreModelPreferenceArr$values;
/* 31 */            $ENTRIES = ilIII1o11.I00000oIO(aICoreModelPreferenceArr$values);
                }

                private AICoreModelPreference(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static AICoreModelPreference valueOf(String str) {
/* 7 */             return (AICoreModelPreference) Enum.valueOf(AICoreModelPreference.class, str);
                }

                public static AICoreModelPreference[] values() {
/* 7 */             return (AICoreModelPreference[]) $VALUES.clone();
                }
            }
