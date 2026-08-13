            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IO0liII0O {
                public static final IO0liII0O I00iiO;
                public static final IO0liII0O I00iio;
                public static final IO0liII0O I00ilI0I1;
                public static final IO0liII0O I00ilO0;
                public static final IO0liII0O[] I00io1l;
                public static final Il0li01oOil I00ioIO;
                public final String I00iOIl;
                public final String I00iiI;

                static {
/* 10 */            IO0liII0O iO0liII0O = new IO0liII0O(0, "LATTE", "Latte", "latte");
/* 13 */            I00iiO = iO0liII0O;
/* 24 */            IO0liII0O iO0liII0O2 = new IO0liII0O(1, "FRAPPE", "Frappé", "frappe");
/* 27 */            I00iio = iO0liII0O2;
/* 38 */            IO0liII0O iO0liII0O3 = new IO0liII0O(2, "MACCHIATO", "Macchiato", "macchiato");
/* 41 */            I00ilI0I1 = iO0liII0O3;
/* 52 */            IO0liII0O iO0liII0O4 = new IO0liII0O(3, "MOCHA", "Mocha", "mocha");
/* 55 */            I00ilO0 = iO0liII0O4;
/* 57 */            IO0liII0O[] iO0liII0OArr = {iO0liII0O, iO0liII0O2, iO0liII0O3, iO0liII0O4};
/* 61 */            I00io1l = iO0liII0OArr;
/* 67 */            I00ioIO = ilIII1o11.I00000oIO(iO0liII0OArr);
                }

                public IO0liII0O(int i, String str, String str2, String str3) {
/* 4 */             this.I00iOIl = str2;
/* 6 */             this.I00iiI = str3;
                }

                public static IO0liII0O valueOf(String str) {
/* 7 */             return (IO0liII0O) Enum.valueOf(IO0liII0O.class, str);
                }

                public static IO0liII0O[] values() {
/* 7 */             return (IO0liII0O[]) I00io1l.clone();
                }
            }
