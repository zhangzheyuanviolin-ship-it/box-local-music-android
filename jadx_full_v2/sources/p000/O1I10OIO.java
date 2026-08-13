            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O1I10OIO {
                public static final O1I10OIO I00iOIl;
                public static final O1I10OIO I00iiI;
                public static final O1I10OIO I00iiO;
                public static final O1I10OIO[] I00iio;
                public static final Il0li01oOil I00ilI0I1;

                static {
/* 6 */             O1I10OIO o1i10oio = new O1I10OIO("Info", 0);
/* 9 */             I00iOIl = o1i10oio;
/* 16 */            O1I10OIO o1i10oio2 = new O1I10OIO("Warning", 1);
/* 19 */            I00iiI = o1i10oio2;
/* 26 */            O1I10OIO o1i10oio3 = new O1I10OIO("Error", 2);
/* 29 */            I00iiO = o1i10oio3;
/* 31 */            O1I10OIO[] o1i10oioArr = {o1i10oio, o1i10oio2, o1i10oio3};
/* 35 */            I00iio = o1i10oioArr;
/* 41 */            I00ilI0I1 = ilIII1o11.I00000oIO(o1i10oioArr);
                }

                public static O1I10OIO valueOf(String str) {
/* 7 */             return (O1I10OIO) Enum.valueOf(O1I10OIO.class, str);
                }

                public static O1I10OIO[] values() {
/* 7 */             return (O1I10OIO[]) I00iio.clone();
                }
            }
