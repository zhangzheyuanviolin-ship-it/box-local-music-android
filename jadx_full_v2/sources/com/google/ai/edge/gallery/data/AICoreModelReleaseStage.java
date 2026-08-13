            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.OiliO0I;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/ai/edge/gallery/data/AICoreModelReleaseStage;", "", "<init>", "(Ljava/lang/String;I)V", "STABLE", "PREVIEW", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class AICoreModelReleaseStage {
                private static final Il0lIli0 $ENTRIES;
                private static final AICoreModelReleaseStage[] $VALUES;

                @OiliO0I("stable")
                public static final AICoreModelReleaseStage STABLE = new AICoreModelReleaseStage("STABLE", 0);

                @OiliO0I("preview")
                public static final AICoreModelReleaseStage PREVIEW = new AICoreModelReleaseStage("PREVIEW", 1);

                private static final AICoreModelReleaseStage[] $values() {
/* 5 */             return new AICoreModelReleaseStage[]{STABLE, PREVIEW};
                }

                static {
/* 21 */            AICoreModelReleaseStage[] aICoreModelReleaseStageArr$values = $values();
/* 25 */            $VALUES = aICoreModelReleaseStageArr$values;
/* 31 */            $ENTRIES = ilIII1o11.I00000oIO(aICoreModelReleaseStageArr$values);
                }

                private AICoreModelReleaseStage(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static AICoreModelReleaseStage valueOf(String str) {
/* 7 */             return (AICoreModelReleaseStage) Enum.valueOf(AICoreModelReleaseStage.class, str);
                }

                public static AICoreModelReleaseStage[] values() {
/* 7 */             return (AICoreModelReleaseStage[]) $VALUES.clone();
                }
            }
