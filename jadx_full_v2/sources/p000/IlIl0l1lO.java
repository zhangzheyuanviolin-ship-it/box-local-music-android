            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IlIl0l1lO {
                public static final IlIl0l1lO I00iOIl;
                public static final IlIl0l1lO I00iiI;
                public static final IlIl0l1lO[] I00iiO;

                static {
/* 6 */             IlIl0l1lO ilIl0l1lO = new IlIl0l1lO("TOP_DOWN", 0);
/* 9 */             I00iOIl = ilIl0l1lO;
/* 16 */            IlIl0l1lO ilIl0l1lO2 = new IlIl0l1lO("BOTTOM_UP", 1);
/* 19 */            I00iiI = ilIl0l1lO2;
/* 21 */            IlIl0l1lO[] ilIl0l1lOArr = {ilIl0l1lO, ilIl0l1lO2};
/* 25 */            I00iiO = ilIl0l1lOArr;
/* 27 */            ilIII1o11.I00000oIO(ilIl0l1lOArr);
                }

                public static IlIl0l1lO valueOf(String str) {
/* 7 */             return (IlIl0l1lO) Enum.valueOf(IlIl0l1lO.class, str);
                }

                public static IlIl0l1lO[] values() {
/* 7 */             return (IlIl0l1lO[]) I00iiO.clone();
                }
            }
