            package p000;

            import java.util.Arrays;
            
            public abstract class iI0I0l {
                public static final o0llIi I00000oIO;

                static {
/* 1 */             iI00o0I11 ii00o0i11 = iI00o0I11.I0000Il00O;
/* 10 */            I00000oIO = new o0llIi(18);
                }

                public static void I00000oIO(Object obj, Object obj2) {
/* 1 */             i1loi1lII i1loi1lii = (i1loi1lII) obj;
/* 3 */             iI0Ol11Il010 ii0ol11il010 = i1loi1lii.zzc;
/* 7 */             iI0Ol11Il010 ii0ol11il0102 = ((i1loi1lII) obj2).zzc;
/* 9 */             iI0Ol11Il010 ii0ol11il0103 = iI0Ol11Il010.I0000oI00;
/* 15 */            if (!ii0ol11il0103.equals(ii0ol11il0102)) {
/* 22 */                if (ii0ol11il0103.equals(ii0ol11il010)) {
/* 28 */                    int i = ii0ol11il010.I00000oIO + ii0ol11il0102.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(ii0ol11il010.I00000oOI, i);
/* 41 */                    System.arraycopy(ii0ol11il0102.I00000oOI, 0, iArrCopyOf, ii0ol11il010.I00000oIO, ii0ol11il0102.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(ii0ol11il010.I0000Il00O, i);
/* 56 */                    System.arraycopy(ii0ol11il0102.I0000Il00O, 0, objArrCopyOf, ii0ol11il010.I00000oIO, ii0ol11il0102.I00000oIO);
/* 62 */                    ii0ol11il010 = new iI0Ol11Il010(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    ii0ol11il010.getClass();
/* 73 */                    if (!ii0ol11il0102.equals(ii0ol11il0103)) {
/* 78 */                        if (!ii0ol11il010.I0000O) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = ii0ol11il010.I00000oIO + ii0ol11il0102.I00000oIO;
/* 85 */                        ii0ol11il010.I0000Il00O(i2);
/* 96 */                        System.arraycopy(ii0ol11il0102.I00000oOI, 0, ii0ol11il010.I00000oOI, ii0ol11il010.I00000oIO, ii0ol11il0102.I00000oIO);
/* 107 */                       System.arraycopy(ii0ol11il0102.I0000Il00O, 0, ii0ol11il010.I0000Il00O, ii0ol11il010.I00000oIO, ii0ol11il0102.I00000oIO);
/* 110 */                       ii0ol11il010.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           i1loi1lii.zzc = ii0ol11il010;
                }

                public static boolean I00000oOI(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }
            }
