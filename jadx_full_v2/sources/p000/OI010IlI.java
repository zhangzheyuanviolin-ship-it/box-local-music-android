            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OI010IlI {
                public static final l1I0oI I00iOIl;
                public static final OI010IlI[] I00iiI;
                public static final Il0li01oOil I00iiO;

                static {
/* 101 */           OI010IlI[] oI010IlIArr = {new OI010IlI("JANUARY", 0), new OI010IlI("FEBRUARY", 1), new OI010IlI("MARCH", 2), new OI010IlI("APRIL", 3), new OI010IlI("MAY", 4), new OI010IlI("JUNE", 5), new OI010IlI("JULY", 6), new OI010IlI("AUGUST", 7), new OI010IlI("SEPTEMBER", 8), new OI010IlI("OCTOBER", 9), new OI010IlI("NOVEMBER", 10), new OI010IlI("DECEMBER", 11)};
/* 105 */           I00iiI = oI010IlIArr;
/* 111 */           I00iiO = ilIII1o11.I00000oIO(oI010IlIArr);
/* 120 */           I00iOIl = new l1I0oI(13);
                }

                public static OI010IlI valueOf(String str) {
/* 7 */             return (OI010IlI) Enum.valueOf(OI010IlI.class, str);
                }

                public static OI010IlI[] values() {
/* 7 */             return (OI010IlI[]) I00iiI.clone();
                }
            }
