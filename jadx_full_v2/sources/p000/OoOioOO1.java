            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoOioOO1 {
                public static final OoOioOO1 I00iiI;
                public static final OoOioOO1 I00iiO;
                public static final OoOioOO1 I00iio;
                public static final OoOioOO1[] I00ilI0I1;
                public final String I00iOIl;

                static {
/* 8 */             OoOioOO1 ooOioOO1 = new OoOioOO1("IN", 0, "in");
/* 11 */            I00iiI = ooOioOO1;
/* 20 */            OoOioOO1 ooOioOO12 = new OoOioOO1("OUT", 1, "out");
/* 23 */            I00iiO = ooOioOO12;
/* 32 */            OoOioOO1 ooOioOO13 = new OoOioOO1("INV", 2, "");
/* 35 */            I00iio = ooOioOO13;
/* 37 */            OoOioOO1[] ooOioOO1Arr = {ooOioOO1, ooOioOO12, ooOioOO13};
/* 41 */            I00ilI0I1 = ooOioOO1Arr;
/* 43 */            ilIII1o11.I00000oIO(ooOioOO1Arr);
                }

                public OoOioOO1(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static OoOioOO1 valueOf(String str) {
/* 7 */             return (OoOioOO1) Enum.valueOf(OoOioOO1.class, str);
                }

                public static OoOioOO1[] values() {
/* 7 */             return (OoOioOO1[]) I00ilI0I1.clone();
                }

                @Override
                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
