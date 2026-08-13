            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.OiliO0I;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/ai/edge/gallery/data/ModelCapability;", "", "<init>", "(Ljava/lang/String;I)V", "LLM_THINKING", "SPECULATIVE_DECODING", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class ModelCapability {
                private static final Il0lIli0 $ENTRIES;
                private static final ModelCapability[] $VALUES;

                @OiliO0I("llm_thinking")
                public static final ModelCapability LLM_THINKING = new ModelCapability("LLM_THINKING", 0);

                @OiliO0I("speculative_decoding")
                public static final ModelCapability SPECULATIVE_DECODING = new ModelCapability("SPECULATIVE_DECODING", 1);

                private static final ModelCapability[] $values() {
/* 5 */             return new ModelCapability[]{LLM_THINKING, SPECULATIVE_DECODING};
                }

                static {
/* 21 */            ModelCapability[] modelCapabilityArr$values = $values();
/* 25 */            $VALUES = modelCapabilityArr$values;
/* 31 */            $ENTRIES = ilIII1o11.I00000oIO(modelCapabilityArr$values);
                }

                private ModelCapability(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static ModelCapability valueOf(String str) {
/* 7 */             return (ModelCapability) Enum.valueOf(ModelCapability.class, str);
                }

                public static ModelCapability[] values() {
/* 7 */             return (ModelCapability[]) $VALUES.clone();
                }
            }
