            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi0OO1IIl1 {
                public int I00000oIO;

                public static final Oi0OO1IIl1 I00000oIO(int i) {
/* 3 */             Oi0OO1IIl1 oi0OO1IIl1 = new Oi0OO1IIl1();
/* 6 */             oi0OO1IIl1.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oi0OO1IIl1;
                }

                public static final String I00000oOI(int i) {
                    switch (i) {
                        case 1:
/* 26 */                    return "TEMPLATE_PREVIEW";
                        case 2:
/* 23 */                    return "TEMPLATE_STILL_CAPTURE";
                        case 3:
/* 20 */                    return "TEMPLATE_RECORD";
                        case 4:
/* 17 */                    return "TEMPLATE_VIDEO_SNAPSHOT";
                        case 5:
/* 14 */                    return "TEMPLATE_ZERO_SHUTTER_LAG";
                        case 6:
/* 11 */                    return "TEMPLATE_MANUAL";
                        default:
/* 6 */                     return Oi010OO0.I000oI1ioi(i, "UNKNOWN-");
                    }
                }

                public static String I0000Il00O(int i) {
/* 5 */             return Oi010OO0.I0010I0i("RequestTemplate(value=", i, ')');
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oi0OO1IIl1) && this.I00000oIO == ((Oi0OO1IIl1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I0000Il00O(this.I00000oIO);
                }
            }
