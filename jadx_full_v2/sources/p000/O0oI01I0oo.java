            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class O0oI01I0oo {
                public static final O0oI01I0oo I00iOIl;
                public static final O0oI01I0oo I00iiI;
                public static final O0oI01I0oo[] I00iiO;

                static {
/* 6 */             O0oI01I0oo o0oI01I0oo = new O0oI01I0oo("SYNCHRONIZED", 0);
/* 14 */            O0oI01I0oo o0oI01I0oo2 = new O0oI01I0oo("PUBLICATION", 1);
/* 17 */            I00iOIl = o0oI01I0oo2;
/* 24 */            O0oI01I0oo o0oI01I0oo3 = new O0oI01I0oo("NONE", 2);
/* 27 */            I00iiI = o0oI01I0oo3;
/* 29 */            O0oI01I0oo[] o0oI01I0ooArr = {o0oI01I0oo, o0oI01I0oo2, o0oI01I0oo3};
/* 33 */            I00iiO = o0oI01I0ooArr;
/* 35 */            ilIII1o11.I00000oIO(o0oI01I0ooArr);
                }

                public static O0oI01I0oo valueOf(String str) {
/* 7 */             return (O0oI01I0oo) Enum.valueOf(O0oI01I0oo.class, str);
                }

                public static O0oI01I0oo[] values() {
/* 7 */             return (O0oI01I0oo[]) I00iiO.clone();
                }
            }
