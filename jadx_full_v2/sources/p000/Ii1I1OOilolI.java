            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ii1I1OOilolI {
                public static final Ii1I1OOilolI I00iOIl;
                public static final Ii1I1OOilolI I00iiI;
                public static final Ii1I1OOilolI I00iiO;
                public static final Ii1I1OOilolI I00iio;
                public static final Ii1I1OOilolI[] I00ilI0I1;

                static {
/* 6 */             Ii1I1OOilolI ii1I1OOilolI = new Ii1I1OOilolI("MEMORY_CACHE", 0);
/* 9 */             I00iOIl = ii1I1OOilolI;
/* 16 */            Ii1I1OOilolI ii1I1OOilolI2 = new Ii1I1OOilolI("MEMORY", 1);
/* 19 */            I00iiI = ii1I1OOilolI2;
/* 26 */            Ii1I1OOilolI ii1I1OOilolI3 = new Ii1I1OOilolI("DISK", 2);
/* 29 */            I00iiO = ii1I1OOilolI3;
/* 36 */            Ii1I1OOilolI ii1I1OOilolI4 = new Ii1I1OOilolI("NETWORK", 3);
/* 39 */            I00iio = ii1I1OOilolI4;
/* 41 */            Ii1I1OOilolI[] ii1I1OOilolIArr = {ii1I1OOilolI, ii1I1OOilolI2, ii1I1OOilolI3, ii1I1OOilolI4};
/* 45 */            I00ilI0I1 = ii1I1OOilolIArr;
/* 47 */            ilIII1o11.I00000oIO(ii1I1OOilolIArr);
                }

                public static Ii1I1OOilolI valueOf(String str) {
/* 7 */             return (Ii1I1OOilolI) Enum.valueOf(Ii1I1OOilolI.class, str);
                }

                public static Ii1I1OOilolI[] values() {
/* 7 */             return (Ii1I1OOilolI[]) I00ilI0I1.clone();
                }
            }
