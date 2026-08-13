            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oii0IOl {
                public static final Oii0IOl I00iOIl;
                public static final Oii0IOl I00iiI;
                public static final Oii0IOl[] I00iiO;

                static {
/* 6 */             Oii0IOl oii0IOl = new Oii0IOl("Inherit", 0);
/* 9 */             I00iOIl = oii0IOl;
/* 16 */            Oii0IOl oii0IOl2 = new Oii0IOl("SecureOn", 1);
/* 19 */            I00iiI = oii0IOl2;
/* 29 */            Oii0IOl[] oii0IOlArr = {oii0IOl, oii0IOl2, new Oii0IOl("SecureOff", 2)};
/* 33 */            I00iiO = oii0IOlArr;
/* 35 */            ilIII1o11.I00000oIO(oii0IOlArr);
                }

                public static Oii0IOl valueOf(String str) {
/* 7 */             return (Oii0IOl) Enum.valueOf(Oii0IOl.class, str);
                }

                public static Oii0IOl[] values() {
/* 7 */             return (Oii0IOl[]) I00iiO.clone();
                }
            }
