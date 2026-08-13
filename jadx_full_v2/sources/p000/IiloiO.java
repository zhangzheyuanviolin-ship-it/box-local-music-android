            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IiloiO {
                public static final IiloiO I00iOIl;
                public static final IiloiO I00iiI;
                public static final IiloiO[] I00iiO;

                static {
/* 6 */             IiloiO iiloiO = new IiloiO("Closed", 0);
/* 9 */             I00iOIl = iiloiO;
/* 16 */            IiloiO iiloiO2 = new IiloiO("Open", 1);
/* 19 */            I00iiI = iiloiO2;
/* 21 */            IiloiO[] iiloiOArr = {iiloiO, iiloiO2};
/* 25 */            I00iiO = iiloiOArr;
/* 27 */            ilIII1o11.I00000oIO(iiloiOArr);
                }

                public static IiloiO valueOf(String str) {
/* 7 */             return (IiloiO) Enum.valueOf(IiloiO.class, str);
                }

                public static IiloiO[] values() {
/* 7 */             return (IiloiO[]) I00iiO.clone();
                }
            }
