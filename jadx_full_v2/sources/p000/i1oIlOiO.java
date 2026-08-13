            package p000;

            import java.util.Arrays;
            
            public abstract class i1oIlOiO {
                public static final lolIo0 I00000oIO;

                static {
/* 1 */             i1o1i00IlOiO i1o1i00iloio = i1o1i00IlOiO.I0000Il00O;
/* 10 */            I00000oIO = new lolIo0(18);
                }

                public static void I00000oIO(Object obj, Object obj2) {
/* 1 */             i1ilOol i1ilool = (i1ilOol) obj;
/* 3 */             i1ol00i i1ol00iVar = i1ilool.zzc;
/* 7 */             i1ol00i i1ol00iVar2 = ((i1ilOol) obj2).zzc;
/* 9 */             i1ol00i i1ol00iVar3 = i1ol00i.I0000oI00;
/* 15 */            if (!i1ol00iVar3.equals(i1ol00iVar2)) {
/* 22 */                if (i1ol00iVar3.equals(i1ol00iVar)) {
/* 28 */                    int i = i1ol00iVar.I00000oIO + i1ol00iVar2.I00000oIO;
/* 31 */                    int[] iArrCopyOf = Arrays.copyOf(i1ol00iVar.I00000oOI, i);
/* 41 */                    System.arraycopy(i1ol00iVar2.I00000oOI, 0, iArrCopyOf, i1ol00iVar.I00000oIO, i1ol00iVar2.I00000oIO);
/* 46 */                    Object[] objArrCopyOf = Arrays.copyOf(i1ol00iVar.I0000Il00O, i);
/* 56 */                    System.arraycopy(i1ol00iVar2.I0000Il00O, 0, objArrCopyOf, i1ol00iVar.I00000oIO, i1ol00iVar2.I00000oIO);
/* 62 */                    i1ol00iVar = new i1ol00i(i, iArrCopyOf, objArrCopyOf, true);
                        } else {
/* 66 */                    i1ol00iVar.getClass();
/* 73 */                    if (!i1ol00iVar2.equals(i1ol00iVar3)) {
/* 78 */                        if (!i1ol00iVar.I0000O) {
/* 113 */                           OIiilo1Ool0o.I000lI();
/* 116 */                           return;
                                }
/* 84 */                        int i2 = i1ol00iVar.I00000oIO + i1ol00iVar2.I00000oIO;
/* 85 */                        i1ol00iVar.I0000Il00O(i2);
/* 96 */                        System.arraycopy(i1ol00iVar2.I00000oOI, 0, i1ol00iVar.I00000oOI, i1ol00iVar.I00000oIO, i1ol00iVar2.I00000oIO);
/* 107 */                       System.arraycopy(i1ol00iVar2.I0000Il00O, 0, i1ol00iVar.I0000Il00O, i1ol00iVar.I00000oIO, i1ol00iVar2.I00000oIO);
/* 110 */                       i1ol00iVar.I00000oIO = i2;
                            }
                        }
                    }
/* 117 */           i1ilool.zzc = i1ol00iVar;
                }

                public static boolean I00000oOI(Object obj, Object obj2) {
/* 2 */             if (obj != obj2) {
                        return obj != null && obj.equals(obj2);
                    }
/* 1 */             return true;
                }
            }
