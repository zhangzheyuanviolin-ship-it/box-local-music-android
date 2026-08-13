            package com.google.ai.edge.gallery.data;

            import kotlin.Metadata;
            import p000.Il0lIli0;
            import p000.OiliO0I;
            import p000.ilIII1o11;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/ai/edge/gallery/data/RuntimeType;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "LITERT_LM", "AICORE", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class RuntimeType {
                private static final Il0lIli0 $ENTRIES;
                private static final RuntimeType[] $VALUES;

                @OiliO0I("unknown")
                public static final RuntimeType UNKNOWN = new RuntimeType("UNKNOWN", 0);

                @OiliO0I("litert_lm")
                public static final RuntimeType LITERT_LM = new RuntimeType("LITERT_LM", 1);

                @OiliO0I("aicore")
                public static final RuntimeType AICORE = new RuntimeType("AICORE", 2);

                private static final RuntimeType[] $values() {
/* 7 */             return new RuntimeType[]{UNKNOWN, LITERT_LM, AICORE};
                }

                static {
/* 31 */            RuntimeType[] runtimeTypeArr$values = $values();
/* 35 */            $VALUES = runtimeTypeArr$values;
/* 41 */            $ENTRIES = ilIII1o11.I00000oIO(runtimeTypeArr$values);
                }

                private RuntimeType(String str, int i) {
                }

                public static Il0lIli0 getEntries() {
/* 1 */             return $ENTRIES;
                }

                public static RuntimeType valueOf(String str) {
/* 7 */             return (RuntimeType) Enum.valueOf(RuntimeType.class, str);
                }

                public static RuntimeType[] values() {
/* 7 */             return (RuntimeType[]) $VALUES.clone();
                }
            }
