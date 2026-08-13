            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OO1io1OOl {
                public static final OO1io1OOl I00iOIl;
                public static final OO1io1OOl I00iiI;
                public static final OO1io1OOl I00iiO;
                public static final OO1io1OOl[] I00iio;

                static {
/* 6 */             OO1io1OOl oO1io1OOl = new OO1io1OOl("Unknown", 0);
/* 9 */             I00iOIl = oO1io1OOl;
/* 16 */            OO1io1OOl oO1io1OOl2 = new OO1io1OOl("Dispatching", 1);
/* 19 */            I00iiI = oO1io1OOl2;
/* 26 */            OO1io1OOl oO1io1OOl3 = new OO1io1OOl("NotDispatching", 2);
/* 29 */            I00iiO = oO1io1OOl3;
/* 31 */            OO1io1OOl[] oO1io1OOlArr = {oO1io1OOl, oO1io1OOl2, oO1io1OOl3};
/* 35 */            I00iio = oO1io1OOlArr;
/* 37 */            ilIII1o11.I00000oIO(oO1io1OOlArr);
                }

                public static OO1io1OOl valueOf(String str) {
/* 7 */             return (OO1io1OOl) Enum.valueOf(OO1io1OOl.class, str);
                }

                public static OO1io1OOl[] values() {
/* 7 */             return (OO1io1OOl[]) I00iio.clone();
                }
            }
