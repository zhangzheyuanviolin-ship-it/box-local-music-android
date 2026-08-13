            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I1O1ioi1ll0O {
                public static final I1O1ioi1ll0O I00iiI;
                public static final I1O1ioi1ll0O[] I00iiO;
                public static final Il0li01oOil I00iio;
                public final String I00iOIl;

                static {
/* 8 */             I1O1ioi1ll0O i1O1ioi1ll0O = new I1O1ioi1ll0O("LIVE", 0, "Live");
/* 11 */            I00iiI = i1O1ioi1ll0O;
/* 33 */            I1O1ioi1ll0O[] i1O1ioi1ll0OArr = {i1O1ioi1ll0O, new I1O1ioi1ll0O("READING", 1, "Reading"), new I1O1ioi1ll0O("DESCRIBE", 2, "Describe")};
/* 37 */            I00iiO = i1O1ioi1ll0OArr;
/* 43 */            I00iio = ilIII1o11.I00000oIO(i1O1ioi1ll0OArr);
                }

                public I1O1ioi1ll0O(String str, int i, String str2) {
/* 4 */             this.I00iOIl = str2;
                }

                public static I1O1ioi1ll0O valueOf(String str) {
/* 7 */             return (I1O1ioi1ll0O) Enum.valueOf(I1O1ioi1ll0O.class, str);
                }

                public static I1O1ioi1ll0O[] values() {
/* 7 */             return (I1O1ioi1ll0O[]) I00iiO.clone();
                }
            }
