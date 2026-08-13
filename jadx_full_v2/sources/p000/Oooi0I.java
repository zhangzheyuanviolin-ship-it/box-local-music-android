            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oooi0I {
                public static final liIoOiiO1Oi I00iOIl;
                public static final Oooi0I I00iiI;
                public static final Oooi0I I00iiO;
                public static final Oooi0I I00iio;
                public static final Oooi0I I00ilI0I1;
                public static final Oooi0I[] I00ilO0;

                static {
/* 6 */             Oooi0I oooi0I = new Oooi0I("UNSPECIFIED", 0);
/* 9 */             I00iiI = oooi0I;
/* 16 */            Oooi0I oooi0I2 = new Oooi0I("OFF", 1);
/* 19 */            I00iiO = oooi0I2;
/* 26 */            Oooi0I oooi0I3 = new Oooi0I("ON", 2);
/* 29 */            I00iio = oooi0I3;
/* 36 */            Oooi0I oooi0I4 = new Oooi0I("PREVIEW", 3);
/* 39 */            I00ilI0I1 = oooi0I4;
/* 41 */            Oooi0I[] oooi0IArr = {oooi0I, oooi0I2, oooi0I3, oooi0I4};
/* 45 */            I00ilO0 = oooi0IArr;
/* 47 */            ilIII1o11.I00000oIO(oooi0IArr);
/* 57 */            I00iOIl = new liIoOiiO1Oi(16);
                }

                public static Oooi0I valueOf(String str) {
/* 7 */             return (Oooi0I) Enum.valueOf(Oooi0I.class, str);
                }

                public static Oooi0I[] values() {
/* 7 */             return (Oooi0I[]) I00ilO0.clone();
                }
            }
