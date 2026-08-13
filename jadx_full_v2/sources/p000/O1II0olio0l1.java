            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Oili0O
            public final class O1II0olio0l1 {
                public static final O1II00 Companion;
                public static final O0ioIllo0i1 I00iOIl;
                public static final O1II0olio0l1[] I00iiI;

                static {
/* 65 */            O1II0olio0l1[] o1II0olio0l1Arr = {new O1II0olio0l1("Debug", 0), new O1II0olio0l1("Info", 1), new O1II0olio0l1("Notice", 2), new O1II0olio0l1("Warning", 3), new O1II0olio0l1("Error", 4), new O1II0olio0l1("Critical", 5), new O1II0olio0l1("Alert", 6), new O1II0olio0l1("Emergency", 7)};
/* 69 */            I00iiI = o1II0olio0l1Arr;
/* 71 */            ilIII1o11.I00000oIO(o1II0olio0l1Arr);
/* 79 */            Companion = new O1II00();
/* 94 */            I00iOIl = l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new O0o0Ol0(18));
                }

                public static O1II0olio0l1 valueOf(String str) {
/* 7 */             return (O1II0olio0l1) Enum.valueOf(O1II0olio0l1.class, str);
                }

                public static O1II0olio0l1[] values() {
/* 7 */             return (O1II0olio0l1[]) I00iiI.clone();
                }
            }
