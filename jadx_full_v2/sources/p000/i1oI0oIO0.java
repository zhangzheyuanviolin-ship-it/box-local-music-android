            package p000;

            import java.util.Arrays;
            
            public abstract class i1oI0oIO0 {
                public static final loIOiIO1O1 I00000oIO;

                static {
/* 1 */             i1o0Oi i1o0oi = i1o0Oi.I0000Il00O;
/* 10 */            I00000oIO = new loIOiIO1O1(18);
                }

                public static void I00000oIO(Object obj, Object obj2) {
/* 1 */             i1ii0Io i1ii0io = (i1ii0Io) obj;
/* 3 */             i1oi1lOoII1 i1oi1looii1 = i1ii0io.zzc;
/* 7 */             i1oi1lOoII1 i1oi1looii12 = ((i1ii0Io) obj2).zzc;
/* 9 */             i1oi1lOoII1 i1oi1looii13 = i1oi1lOoII1.I0000oI00;
/* 15 */            if (!i1oi1looii13.equals(i1oi1looii12)) {
/* 22 */                if (i1oi1looii13.equals(i1oi1looii1)) {
/* 28 */                    int i = i1oi1looii1.I00000oIO + i1oi1looii12.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(i1oi1looii1.I00000oOI, i);
/* 41 */                    System.arraycopy(i1oi1looii12.I00000oOI, 0, iArrCopyOf, i1oi1looii1.I00000oIO, i1oi1looii12.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(i1oi1looii1.I0000Il00O, i);
/* 56 */                    System.arraycopy(i1oi1looii12.I0000Il00O, 0, objArrCopyOf, i1oi1looii1.I00000oIO, i1oi1looii12.I00000oIO);
/* 62 */                    i1oi1looii1 = new i1oi1lOoII1(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    i1oi1looii1.getClass();
/* 73 */                    if (!i1oi1looii12.equals(i1oi1looii13)) {
/* 78 */                        if (!i1oi1looii1.I0000O) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = i1oi1looii1.I00000oIO + i1oi1looii12.I00000oIO;
/* 85 */                        i1oi1looii1.I0000Il00O(i2);
/* 96 */                        System.arraycopy(i1oi1looii12.I00000oOI, 0, i1oi1looii1.I00000oOI, i1oi1looii1.I00000oIO, i1oi1looii12.I00000oIO);
/* 107 */                       System.arraycopy(i1oi1looii12.I0000Il00O, 0, i1oi1looii1.I0000Il00O, i1oi1looii1.I00000oIO, i1oi1looii12.I00000oIO);
/* 110 */                       i1oi1looii1.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           i1ii0io.zzc = i1oi1looii1;
                }

                public static boolean I00000oOI(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }
            }
