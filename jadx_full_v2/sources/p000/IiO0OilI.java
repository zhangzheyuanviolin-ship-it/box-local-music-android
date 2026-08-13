            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IiO0OilI {
                public static final IiO0OilI I00iOIl;
                public static final IiO0OilI[] I00iiI;

                static {
/* 6 */             IiO0OilI iiO0OilI = new IiO0OilI("WARNING", 0);
/* 14 */            IiO0OilI iiO0OilI2 = new IiO0OilI("ERROR", 1);
/* 17 */            I00iOIl = iiO0OilI2;
/* 27 */            IiO0OilI[] iiO0OilIArr = {iiO0OilI, iiO0OilI2, new IiO0OilI("HIDDEN", 2)};
/* 31 */            I00iiI = iiO0OilIArr;
/* 33 */            ilIII1o11.I00000oIO(iiO0OilIArr);
                }

                public static IiO0OilI valueOf(String str) {
/* 7 */             return (IiO0OilI) Enum.valueOf(IiO0OilI.class, str);
                }

                public static IiO0OilI[] values() {
/* 7 */             return (IiO0OilI[]) I00iiI.clone();
                }
            }
