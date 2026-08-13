            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoOIII1llli1 {
                public static final OoOIII1llli1[] I00iOIl;

                static {
/* 25 */            OoOIII1llli1[] ooOIII1llli1Arr = {new OoOIII1llli1("CHECK_ONLY_LOWER", 0), new OoOIII1llli1("CHECK_SUBTYPE_AND_LOWER", 1), new OoOIII1llli1("SKIP_LOWER", 2)};
/* 29 */            I00iOIl = ooOIII1llli1Arr;
/* 31 */            ilIII1o11.I00000oIO(ooOIII1llli1Arr);
                }

                public static OoOIII1llli1 valueOf(String str) {
/* 7 */             return (OoOIII1llli1) Enum.valueOf(OoOIII1llli1.class, str);
                }

                public static OoOIII1llli1[] values() {
/* 7 */             return (OoOIII1llli1[]) I00iOIl.clone();
                }
            }
