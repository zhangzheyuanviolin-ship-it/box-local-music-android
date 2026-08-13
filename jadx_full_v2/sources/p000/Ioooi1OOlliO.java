            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ioooi1OOlliO {
                public static final Ioooi1OOlliO I00iOIl;
                public static final Ioooi1OOlliO I00iiI;
                public static final Ioooi1OOlliO[] I00iiO;

                static {
/* 6 */             Ioooi1OOlliO ioooi1OOlliO = new Ioooi1OOlliO("Min", 0);
/* 9 */             I00iOIl = ioooi1OOlliO;
/* 16 */            Ioooi1OOlliO ioooi1OOlliO2 = new Ioooi1OOlliO("Max", 1);
/* 19 */            I00iiI = ioooi1OOlliO2;
/* 21 */            Ioooi1OOlliO[] ioooi1OOlliOArr = {ioooi1OOlliO, ioooi1OOlliO2};
/* 25 */            I00iiO = ioooi1OOlliOArr;
/* 27 */            ilIII1o11.I00000oIO(ioooi1OOlliOArr);
                }

                public static Ioooi1OOlliO valueOf(String str) {
/* 7 */             return (Ioooi1OOlliO) Enum.valueOf(Ioooi1OOlliO.class, str);
                }

                public static Ioooi1OOlliO[] values() {
/* 7 */             return (Ioooi1OOlliO[]) I00iiO.clone();
                }
            }
