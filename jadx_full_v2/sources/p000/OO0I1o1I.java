            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OO0I1o1I {
                public static final OO0I1o1I[] I00iOIl;

                static {
/* 17 */            OO0I1o1I[] oO0I1o1IArr = {new OO0I1o1I("CounterClockwise", 0), new OO0I1o1I("Clockwise", 1)};
/* 21 */            I00iOIl = oO0I1o1IArr;
/* 23 */            ilIII1o11.I00000oIO(oO0I1o1IArr);
                }

                public static OO0I1o1I valueOf(String str) {
/* 7 */             return (OO0I1o1I) Enum.valueOf(OO0I1o1I.class, str);
                }

                public static OO0I1o1I[] values() {
/* 7 */             return (OO0I1o1I[]) I00iOIl.clone();
                }
            }
