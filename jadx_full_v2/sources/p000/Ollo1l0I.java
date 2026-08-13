            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ollo1l0I {
                public static final Ollo1l0I I00iOIl;
                public static final Ollo1l0I I00iiI;
                public static final Ollo1l0I I00iiO;
                public static final Ollo1l0I[] I00iio;

                static {
/* 6 */             Ollo1l0I ollo1l0I = new Ollo1l0I("Tabs", 0);
/* 9 */             I00iOIl = ollo1l0I;
/* 16 */            Ollo1l0I ollo1l0I2 = new Ollo1l0I("Divider", 1);
/* 19 */            I00iiI = ollo1l0I2;
/* 26 */            Ollo1l0I ollo1l0I3 = new Ollo1l0I("Indicator", 2);
/* 29 */            I00iiO = ollo1l0I3;
/* 31 */            Ollo1l0I[] ollo1l0IArr = {ollo1l0I, ollo1l0I2, ollo1l0I3};
/* 35 */            I00iio = ollo1l0IArr;
/* 37 */            ilIII1o11.I00000oIO(ollo1l0IArr);
                }

                public static Ollo1l0I valueOf(String str) {
/* 7 */             return (Ollo1l0I) Enum.valueOf(Ollo1l0I.class, str);
                }

                public static Ollo1l0I[] values() {
/* 7 */             return (Ollo1l0I[]) I00iio.clone();
                }
            }
