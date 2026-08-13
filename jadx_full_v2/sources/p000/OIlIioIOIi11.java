            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OIlIioIOIi11 {
                public static final OIlIioIOIi11 I00iOIl;
                public static final OIlIioIOIi11 I00iiI;
                public static final OIlIioIOIi11[] I00iiO;

                static {
/* 6 */             OIlIioIOIi11 oIlIioIOIi11 = new OIlIioIOIi11("RENDER_OVERRIDE", 0);
/* 9 */             I00iOIl = oIlIioIOIi11;
/* 16 */            OIlIioIOIi11 oIlIioIOIi112 = new OIlIioIOIi11("RENDER_OPEN", 1);
/* 19 */            I00iiI = oIlIioIOIi112;
/* 29 */            OIlIioIOIi11[] oIlIioIOIi11Arr = {oIlIioIOIi11, oIlIioIOIi112, new OIlIioIOIi11("RENDER_OPEN_OVERRIDE", 2)};
/* 33 */            I00iiO = oIlIioIOIi11Arr;
/* 35 */            ilIII1o11.I00000oIO(oIlIioIOIi11Arr);
                }

                public static OIlIioIOIi11 valueOf(String str) {
/* 7 */             return (OIlIioIOIi11) Enum.valueOf(OIlIioIOIi11.class, str);
                }

                public static OIlIioIOIi11[] values() {
/* 7 */             return (OIlIioIOIi11[]) I00iiO.clone();
                }
            }
