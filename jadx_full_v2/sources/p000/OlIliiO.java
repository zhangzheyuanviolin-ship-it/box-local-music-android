            package p000;

            import java.lang.invoke.VarHandle;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlIliiO {
                public static final OlIliiO I00iiI;
                public static final OlIliiO I00iiO;
                public static final OlIliiO[] I00iio;
                public String I00iOIl;

                OlIliiO EF0;

                static {
/* 6 */             OlIliiO olIliiO = new OlIliiO("CR", 0);
/* 11 */            olIliiO.I00iOIl = "\r";
/* 13 */            VarHandle.storeStoreFence();
/* 21 */            OlIliiO olIliiO2 = new OlIliiO("CRLF", 1);
/* 26 */            olIliiO2.I00iOIl = "\r\n";
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            I00iiI = olIliiO2;
/* 38 */            OlIliiO olIliiO3 = new OlIliiO("LF", 2);
/* 43 */            olIliiO3.I00iOIl = "\n";
/* 45 */            VarHandle.storeStoreFence();
/* 48 */            I00iiO = olIliiO3;
/* 54 */            I00iio = new OlIliiO[]{olIliiO, olIliiO2, olIliiO3};
                }

                public static OlIliiO valueOf(String str) {
/* 7 */             return (OlIliiO) Enum.valueOf(OlIliiO.class, str);
                }

                public static OlIliiO[] values() {
/* 7 */             return (OlIliiO[]) I00iio.clone();
                }
            }
