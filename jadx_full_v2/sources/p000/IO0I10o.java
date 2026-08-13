            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IO0I10o {
                public static final IO0I10o I00iOIl;
                public static final IO0I10o I00iiI;
                public static final IO0I10o I00iiO;
                public static final IO0I10o I00iio;
                public static final IO0I10o I00ilI0I1;
                public static final IO0I10o[] I00ilO0;

                static {
/* 6 */             IO0I10o iO0I10o = new IO0I10o("PENDING", 0);
/* 9 */             I00iOIl = iO0I10o;
/* 16 */            IO0I10o iO0I10o2 = new IO0I10o("CREATING", 1);
/* 19 */            I00iiI = iO0I10o2;
/* 26 */            IO0I10o iO0I10o3 = new IO0I10o("CREATED", 2);
/* 29 */            I00iiO = iO0I10o3;
/* 36 */            IO0I10o iO0I10o4 = new IO0I10o("CLOSING", 3);
/* 39 */            I00iio = iO0I10o4;
/* 46 */            IO0I10o iO0I10o5 = new IO0I10o("CLOSED", 4);
/* 49 */            I00ilI0I1 = iO0I10o5;
/* 51 */            IO0I10o[] iO0I10oArr = {iO0I10o, iO0I10o2, iO0I10o3, iO0I10o4, iO0I10o5};
/* 55 */            I00ilO0 = iO0I10oArr;
/* 57 */            ilIII1o11.I00000oIO(iO0I10oArr);
                }

                public static IO0I10o valueOf(String str) {
/* 7 */             return (IO0I10o) Enum.valueOf(IO0I10o.class, str);
                }

                public static IO0I10o[] values() {
/* 7 */             return (IO0I10o[]) I00ilO0.clone();
                }
            }
