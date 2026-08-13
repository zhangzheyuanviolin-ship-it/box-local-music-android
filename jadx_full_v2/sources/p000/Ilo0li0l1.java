            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ilo0li0l1 {
                public static final Ilo0li0l1[] I00iOIl;

                static {
/* 49 */            Ilo0li0l1[] ilo0li0l1Arr = {new Ilo0li0l1("CAPABILITY_SELECT", 0), new Ilo0li0l1("MODEL_DOWNLOAD", 1), new Ilo0li0l1("GENERATE_ACTION", 2), new Ilo0li0l1("BUTTON_CLICKED", 3), new Ilo0li0l1("MCP_MANAGEMENT", 4), new Ilo0li0l1("MCP_EXECUTION", 5)};
/* 53 */            I00iOIl = ilo0li0l1Arr;
/* 55 */            ilIII1o11.I00000oIO(ilo0li0l1Arr);
                }

                public static Ilo0li0l1 valueOf(String str) {
/* 7 */             return (Ilo0li0l1) Enum.valueOf(Ilo0li0l1.class, str);
                }

                public static Ilo0li0l1[] values() {
/* 7 */             return (Ilo0li0l1[]) I00iOIl.clone();
                }
            }
