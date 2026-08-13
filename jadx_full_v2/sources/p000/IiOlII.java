            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IiOlII {
                public static final IiOlII[] I00iOIl;

                static {
/* 17 */            IiOlII[] iiOlIIArr = {new IiOlII("STABLE", 0), new IiOlII("UNSTABLE", 1)};
/* 21 */            I00iOIl = iiOlIIArr;
/* 23 */            ilIII1o11.I00000oIO(iiOlIIArr);
                }

                public static IiOlII valueOf(String str) {
/* 7 */             return (IiOlII) Enum.valueOf(IiOlII.class, str);
                }

                public static IiOlII[] values() {
/* 7 */             return (IiOlII[]) I00iOIl.clone();
                }
            }
