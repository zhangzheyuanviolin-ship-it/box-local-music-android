            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Iooolo0OlI {
                public static final Iooolo0OlI I00iOIl;
                public static final Iooolo0OlI I00iiI;
                public static final Iooolo0OlI[] I00iiO;

                static {
/* 6 */             Iooolo0OlI iooolo0OlI = new Iooolo0OlI("Width", 0);
/* 9 */             I00iOIl = iooolo0OlI;
/* 16 */            Iooolo0OlI iooolo0OlI2 = new Iooolo0OlI("Height", 1);
/* 19 */            I00iiI = iooolo0OlI2;
/* 21 */            Iooolo0OlI[] iooolo0OlIArr = {iooolo0OlI, iooolo0OlI2};
/* 25 */            I00iiO = iooolo0OlIArr;
/* 27 */            ilIII1o11.I00000oIO(iooolo0OlIArr);
                }

                public static Iooolo0OlI valueOf(String str) {
/* 7 */             return (Iooolo0OlI) Enum.valueOf(Iooolo0OlI.class, str);
                }

                public static Iooolo0OlI[] values() {
/* 7 */             return (Iooolo0OlI[]) I00iiO.clone();
                }
            }
