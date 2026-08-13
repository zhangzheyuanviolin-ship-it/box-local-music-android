            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Oi1I11OiIO {
                public static final Oi1I11OiIO[] I00iiI;
                public static final Il0li01oOil I00iiO;
                public final String I00iOIl;

                static {
/* 61 */            Oi1I11OiIO[] oi1I11OiIOArr = {new Oi1I11OiIO("FORMAL", 0, "Formal"), new Oi1I11OiIO("CASUAL", 1, "Casual"), new Oi1I11OiIO("FRIENDLY", 2, "Friendly"), new Oi1I11OiIO("POLITE", 3, "Polite"), new Oi1I11OiIO("ENTHUSIASTIC", 4, "Enthusiastic"), new Oi1I11OiIO("CONCISE", 5, "Concise")};
/* 65 */            I00iiI = oi1I11OiIOArr;
/* 71 */            I00iiO = ilIII1o11.I00000oIO(oi1I11OiIOArr);
                }

                public Oi1I11OiIO(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static Oi1I11OiIO valueOf(String str) {
/* 7 */             return (Oi1I11OiIO) Enum.valueOf(Oi1I11OiIO.class, str);
                }

                public static Oi1I11OiIO[] values() {
/* 7 */             return (Oi1I11OiIO[]) I00iiI.clone();
                }
            }
