            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OoooOoIO {
                public static final OoooOoIO I00iiI;
                public static final OoooOoIO[] I00iiO;
                public static final Il0li01oOil I00iio;
                public final IlO1Oi1 I00iOIl;

                static {
/* 6 */             OoooOoIO ooooOoIO = new OoooOoIO("INTERNAL", 0, 0);
/* 14 */            OoooOoIO ooooOoIO2 = new OoooOoIO("PRIVATE", 1, 1);
/* 22 */            OoooOoIO ooooOoIO3 = new OoooOoIO("PROTECTED", 2, 2);
/* 30 */            OoooOoIO ooooOoIO4 = new OoooOoIO("PUBLIC", 3, 3);
/* 33 */            I00iiI = ooooOoIO4;
/* 51 */            OoooOoIO[] ooooOoIOArr = {ooooOoIO, ooooOoIO2, ooooOoIO3, ooooOoIO4, new OoooOoIO("PRIVATE_TO_THIS", 4, 4), new OoooOoIO("LOCAL", 5, 5)};
/* 55 */            I00iiO = ooooOoIOArr;
/* 61 */            I00iio = ilIII1o11.I00000oIO(ooooOoIOArr);
                }

                public OoooOoIO(String str, int i, int i2) {
/* 11 */            this.I00iOIl = new IlO1Oi1(IlO1il.I0000O, i2);
                }

                public static OoooOoIO valueOf(String str) {
/* 7 */             return (OoooOoIO) Enum.valueOf(OoooOoIO.class, str);
                }

                public static OoooOoIO[] values() {
/* 7 */             return (OoooOoIO[]) I00iiO.clone();
                }
            }
