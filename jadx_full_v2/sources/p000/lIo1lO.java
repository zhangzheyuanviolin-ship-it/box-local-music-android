            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class lIo1lO {
                public static final String I00000oIO(Object obj) {
/* 14 */            return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                }

                public static final Object I00000oOI(Object[] objArr, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1) {
/* 13 */            return I0000O(Arrays.copyOf(objArr, objArr.length), OiIoloOl0.I00000oIO, illOOo00lI, iloI0lOlll1, 3456, 0);
                }

                public static final Object I0000Il00O(Object[] objArr, OiIoliiIoIi0 oiIoliiIoIi0, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
/* 18 */            return I0000O(Arrays.copyOf(objArr, objArr.length), oiIoliiIoIi0, illOOo00lI, iloI0lOlll1, 384 | ((i << 3) & 7168), 0);
                }

                public static final Object I0000O(Object[] objArr, OiIoliiIoIi0 oiIoliiIoIi0, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    Object objI0000oI00;
/* 1 */             long j = iloI0lOlll1.I00OI1;
/* 5 */             iOlI1lIi0.I00000oIO(36);
/* 8 */             String string = Long.toString(j, 36);
/* 18 */            OiIiol10 oiIiol10 = (OiIiol10) iloI0lOlll1.I000iOII(OiIl0oI.I00000oIO);
/* 20 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 25 */            Object obj = IOl11li.I00000oIO;
/* 27 */            if (objI00O0i0ii == obj) {
/* 42 */                Object objI000II = (oiIiol10 == null || (objI0000oI00 = oiIiol10.I0000oI00(string)) == null) ? null : oiIoliiIoIi0.I000II(objI0000oI00);
/* 43 */                if (objI000II == null) {
/* 45 */                    objI000II = illOOo00lI.invoke();
                        }
/* 51 */                OiIiOi0II oiIiOi0II = new OiIiOi0II();
/* 54 */                oiIiOi0II.I00iOIl = oiIoliiIoIi0;
/* 56 */                oiIiOi0II.I00iiI = oiIiol10;
/* 58 */                oiIiOi0II.I00iiO = string;
/* 60 */                oiIiOi0II.I00iio = objI000II;
/* 62 */                oiIiOi0II.I00ilI0I1 = objArr;
/* 68 */                OIOo1iiI oIOo1iiI = new OIOo1iiI(18);
/* 71 */                oIOo1iiI.I00iiI = oiIiOi0II;
/* 73 */                VarHandle.storeStoreFence();
/* 76 */                oiIiOi0II.I00io1l = oIOo1iiI;
/* 78 */                VarHandle.storeStoreFence();
/* 81 */                iloI0lOlll1.I00iio(oiIiOi0II);
/* 84 */                objI00O0i0ii = oiIiOi0II;
                    }
/* 85 */            OiIiOi0II oiIiOi0II2 = (OiIiOi0II) objI00O0i0ii;
/* 95 */            Object objInvoke = Arrays.equals(objArr, oiIiOi0II2.I00ilI0I1) ? oiIiOi0II2.I00iio : null;
/* 97 */            if (objInvoke == null) {
/* 99 */                objInvoke = illOOo00lI.invoke();
                    }
/* 148 */           boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oiIiOi0II2) | ((((i & 112) ^ 48) > 32 && iloI0lOlll1.I000OOo1O(oiIoliiIoIi0)) || (i & 48) == 32) | iloI0lOlll1.I000OOo1O(oiIiol10) | iloI0lOlll1.I000II(string) | iloI0lOlll1.I000OOo1O(objInvoke) | iloI0lOlll1.I000OOo1O(objArr);
/* 149 */           Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj2 = objI00O0i0ii2;
/* 153 */           if (zI000OOo1O || objI00O0i0ii2 == obj) {
/* 160 */               I0iI0llll1 i0iI0llll1 = new I0iI0llll1(5);
/* 163 */               i0iI0llll1.I00ilI0I1 = oiIiOi0II2;
/* 165 */               i0iI0llll1.I00ilO0 = oiIoliiIoIi0;
/* 167 */               i0iI0llll1.I00io1l = oiIiol10;
/* 169 */               i0iI0llll1.I00iiI = string;
/* 171 */               i0iI0llll1.I00iiO = objInvoke;
/* 173 */               i0iI0llll1.I00iio = objArr;
/* 175 */               VarHandle.storeStoreFence();
/* 178 */               iloI0lOlll1.I00iio(i0iI0llll1);
                        obj2 = i0iI0llll1;
                    }
/* 183 */           iIO0iiOiOl0l.I0001Ioi1lo((IllOOo00lI) obj2, iloI0lOlll1);
/* 685 */           return objInvoke;
                }
            }
