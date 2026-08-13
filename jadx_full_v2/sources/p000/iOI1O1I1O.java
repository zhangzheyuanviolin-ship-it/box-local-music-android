            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOI1O1I1O {
                public static final O1OIi1 I00000oIO(iOI110IOi11i ioi110ioi11i, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
/* 1 */             lOO00IiI0li.I00000oOI(ioi110ioi11i, iloI0lOlll1);
/* 4 */             Object objI00000oOI = lOO00IiI0li.I00000oOI(function1, iloI0lOlll1);
/* 8 */             int i2 = 0;
/* 9 */             Object[] objArr = new Object[0];
/* 11 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 15 */            Object obj = IOl11li.I00000oIO;
/* 17 */            if (objI00O0i0ii == obj) {
/* 22 */                objI00O0i0ii = new I01iOOoiOI(2);
/* 25 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 34 */            Object obj2 = (String) lIo1lO.I00000oOI(objArr, (IllOOo00lI) objI00O0i0ii, iloI0lOlll1);
/* 42 */            I0IOio i0IOio = (I0IOio) iloI0lOlll1.I000iOII(O11lo0oiOli.I00000oIO);
/* 45 */            if (i0IOio == null) {
/* 50 */                iloI0lOlll1.I00i01iIIliI(1213380307);
/* 59 */                Object baseContext = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
                        while (true) {
/* 63 */                    if (!(baseContext instanceof ContextWrapper)) {
/* 77 */                        baseContext = null;
                                break;
                            }
/* 67 */                    if (baseContext instanceof I0IOio) {
                                break;
                            }
/* 72 */                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                        }
/* 78 */                i0IOio = (I0IOio) baseContext;
                    } else {
/* 87 */                iloI0lOlll1.I00i01iIIliI(1213379439);
                    }
/* 80 */            iloI0lOlll1.I0010I0i(false);
/* 91 */            if (i0IOio == null) {
/* 224 */               I000II.I001IO000("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
/* 44 */                return null;
                    }
/* 93 */            Object objI0001Ioi1lo = i0IOio.I0001Ioi1lo();
/* 97 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 101 */           if (objI00O0i0ii2 == obj) {
/* 105 */               objI00O0i0ii2 = new I0IO1OIi();
/* 108 */               iloI0lOlll1.I00iio(objI00O0i0ii2);
                    }
/* 111 */           I0IO1OIi i0IO1OIi = (I0IO1OIi) objI00O0i0ii2;
/* 113 */           Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                    Object obj3 = objI00O0i0ii3;
/* 117 */           if (objI00O0i0ii3 == obj) {
/* 121 */               O1OIi1 o1OIi1 = new O1OIi1();
/* 124 */               o1OIi1.I00000oIO = i0IO1OIi;
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               iloI0lOlll1.I00iio(o1OIi1);
                        obj3 = o1OIi1;
                    }
/* 132 */           O1OIi1 o1OIi12 = (O1OIi1) obj3;
/* 157 */           boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(i0IO1OIi) | iloI0lOlll1.I000OOo1O(objI0001Ioi1lo) | iloI0lOlll1.I000II(obj2) | iloI0lOlll1.I000OOo1O(ioi110ioi11i) | iloI0lOlll1.I000II(objI00000oOI);
/* 158 */           Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                    Object obj4 = objI00O0i0ii4;
/* 162 */           if (zI000OOo1O || objI00O0i0ii4 == obj) {
/* 168 */               I0IO1io0I i0IO1io0I = new I0IO1io0I(i2);
/* 171 */               i0IO1io0I.I00iiO = i0IO1OIi;
/* 173 */               i0IO1io0I.I00iio = objI0001Ioi1lo;
/* 175 */               i0IO1io0I.I00ilI0I1 = obj2;
/* 177 */               i0IO1io0I.I00ilO0 = ioi110ioi11i;
/* 179 */               i0IO1io0I.I00iiI = objI00000oOI;
/* 181 */               VarHandle.storeStoreFence();
/* 184 */               iloI0lOlll1.I00iio(i0IO1io0I);
                        obj4 = i0IO1io0I;
                    }
/* 187 */           Function1 function12 = (Function1) obj4;
/* 202 */           boolean zI000II = iloI0lOlll1.I000II(ioi110ioi11i) | iloI0lOlll1.I000II(objI0001Ioi1lo) | iloI0lOlll1.I000II(obj2);
/* 203 */           Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
/* 207 */           if (zI000II || objI00O0i0ii5 == obj) {
/* 213 */               objI00O0i0ii5 = new IiiO1IiOOIoI(function12);
/* 216 */               iloI0lOlll1.I00iio(objI00O0i0ii5);
                    }
/* 221 */           return o1OIi12;
                }
            }
