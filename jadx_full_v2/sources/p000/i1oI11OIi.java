            package p000;

            import java.util.Arrays;
            
            public abstract class i1oI11OIi {
                public static final loilIl10Ii I00000oIO;

                static {
/* 1 */             i1o0Ol1I1oI1 i1o0ol1i1oi1 = i1o0Ol1I1oI1.I0000Il00O;
/* 10 */            I00000oIO = new loilIl10Ii(18);
                }

                public static void I00000oIO(Object obj, Object obj2) {
/* 1 */             i1ii0i i1ii0iVar = (i1ii0i) obj;
/* 3 */             i1oiI1 i1oii1 = i1ii0iVar.zzc;
/* 7 */             i1oiI1 i1oii12 = ((i1ii0i) obj2).zzc;
/* 9 */             i1oiI1 i1oii13 = i1oiI1.I0000oI00;
/* 15 */            if (!i1oii13.equals(i1oii12)) {
/* 22 */                if (i1oii13.equals(i1oii1)) {
/* 28 */                    int i = i1oii1.I00000oIO + i1oii12.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(i1oii1.I00000oOI, i);
/* 41 */                    System.arraycopy(i1oii12.I00000oOI, 0, iArrCopyOf, i1oii1.I00000oIO, i1oii12.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(i1oii1.I0000Il00O, i);
/* 56 */                    System.arraycopy(i1oii12.I0000Il00O, 0, objArrCopyOf, i1oii1.I00000oIO, i1oii12.I00000oIO);
/* 62 */                    i1oii1 = new i1oiI1(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    i1oii1.getClass();
/* 73 */                    if (!i1oii12.equals(i1oii13)) {
/* 78 */                        if (!i1oii1.I0000O) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = i1oii1.I00000oIO + i1oii12.I00000oIO;
/* 85 */                        i1oii1.I0000Il00O(i2);
/* 96 */                        System.arraycopy(i1oii12.I00000oOI, 0, i1oii1.I00000oOI, i1oii1.I00000oIO, i1oii12.I00000oIO);
/* 107 */                       System.arraycopy(i1oii12.I0000Il00O, 0, i1oii1.I0000Il00O, i1oii1.I00000oIO, i1oii12.I00000oIO);
/* 110 */                       i1oii1.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           i1ii0iVar.zzc = i1oii1;
                }

                public static boolean I00000oOI(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }
            }
