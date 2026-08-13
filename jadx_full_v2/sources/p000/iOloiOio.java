            package p000;

            import java.util.Arrays;
            
            public abstract class iOloiOio {
                public static final i1i0olI I00000oIO;

                static {
/* 1 */             int i = iOl10iIiIiOi.I00000oIO;
/* 10 */            I00000oIO = new i1i0olI(19);
                }

                public static boolean I00000oIO(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }

                public static void I00000oOI(Object obj, Object obj2) {
/* 1 */             iOlOoOlI0li1 ioloooli0li1 = (iOlOoOlI0li1) obj;
/* 3 */             iOo00o ioo00o = ioloooli0li1.zzc;
/* 7 */             iOo00o ioo00o2 = ((iOlOoOlI0li1) obj2).zzc;
/* 9 */             iOo00o ioo00o3 = iOo00o.I0000oI00;
/* 15 */            if (!ioo00o3.equals(ioo00o2)) {
/* 22 */                if (ioo00o3.equals(ioo00o)) {
/* 28 */                    int i = ioo00o.I00000oIO + ioo00o2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(ioo00o.I00000oOI, i);
/* 41 */                    System.arraycopy(ioo00o2.I00000oOI, 0, iArrCopyOf, ioo00o.I00000oIO, ioo00o2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(ioo00o.I0000Il00O, i);
/* 56 */                    System.arraycopy(ioo00o2.I0000Il00O, 0, objArrCopyOf, ioo00o.I00000oIO, ioo00o2.I00000oIO);
/* 62 */                    ioo00o = new iOo00o(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    ioo00o.getClass();
/* 73 */                    if (!ioo00o2.equals(ioo00o3)) {
/* 78 */                        if (!ioo00o.I0000O) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = ioo00o.I00000oIO + ioo00o2.I00000oIO;
/* 85 */                        ioo00o.I0000Il00O(i2);
/* 96 */                        System.arraycopy(ioo00o2.I00000oOI, 0, ioo00o.I00000oOI, ioo00o.I00000oIO, ioo00o2.I00000oIO);
/* 107 */                       System.arraycopy(ioo00o2.I0000Il00O, 0, ioo00o.I0000Il00O, ioo00o.I00000oIO, ioo00o2.I00000oIO);
/* 110 */                       ioo00o.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           ioloooli0li1.zzc = ioo00o;
                }
            }
