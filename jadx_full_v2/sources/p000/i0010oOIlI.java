            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class i0010oOIlI {
                public static final lolIo0 I00iOIl;
                public static final i0010oOIlI[] I00iiI;
                public static final Il0li01oOil I00iiO;

                static {
/* 57 */            i0010oOIlI[] i0010ooiliArr = {new i0010oOIlI("MONDAY", 0), new i0010oOIlI("TUESDAY", 1), new i0010oOIlI("WEDNESDAY", 2), new i0010oOIlI("THURSDAY", 3), new i0010oOIlI("FRIDAY", 4), new i0010oOIlI("SATURDAY", 5), new i0010oOIlI("SUNDAY", 6)};
/* 61 */            I00iiI = i0010ooiliArr;
/* 67 */            I00iiO = ilIII1o11.I00000oIO(i0010ooiliArr);
/* 76 */            I00iOIl = new lolIo0(16);
                }

                public static i0010oOIlI valueOf(String str) {
/* 7 */             return (i0010oOIlI) Enum.valueOf(i0010oOIlI.class, str);
                }

                public static i0010oOIlI[] values() {
/* 7 */             return (i0010oOIlI[]) I00iiI.clone();
                }
            }
