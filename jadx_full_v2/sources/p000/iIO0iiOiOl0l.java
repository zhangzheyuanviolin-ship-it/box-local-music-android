            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iIO0iiOiOl0l {
                public static final IiiO1ollOoo I00000oIO = new IiiO1ollOoo();

                public static final void I00000oIO(Object obj, Object obj2, Function1 function1, IloI0lOlll1 iloI0lOlll1) {
/* 9 */             boolean zI000II = iloI0lOlll1.I000II(obj) | iloI0lOlll1.I000II(obj2);
/* 10 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 14 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 22 */                objI00O0i0ii = new IiiO1IiOOIoI(function1);
/* 25 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
                }

                public static final void I00000oOI(Object obj, Function1 function1, IloI0lOlll1 iloI0lOlll1) {
/* 1 */             boolean zI000II = iloI0lOlll1.I000II(obj);
/* 5 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 9 */             if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 17 */                objI00O0i0ii = new IiiO1IiOOIoI(function1);
/* 20 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
                }

                public static final void I0000Il00O(Object[] objArr, Function1 function1, IloI0lOlll1 iloI0lOlll1) {
/* 2 */             Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
/* 7 */             boolean zI0000oI00 = iloI0lOlll1.I0000oI00(objArrCopyOf.length);
/* 13 */            for (Object obj : objArrCopyOf) {
/* 21 */                zI0000oI00 |= iloI0lOlll1.I000II(obj);
                    }
/* 25 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 29 */            if (zI0000oI00 || objI00O0i0ii == IOl11li.I00000oIO) {
/* 42 */                iloI0lOlll1.I00iio(new IiiO1IiOOIoI(function1));
                    }
                }

                public static final void I0000O(IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, Object obj) {
/* 1 */             Ii00l101O ii00l101O = iloI0lOlll1.I00O0o1oo;
/* 3 */             boolean zI000II = iloI0lOlll1.I000II(obj);
/* 7 */             Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 11 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 19 */                objI00O0i0ii = new O0iO1OIol(ii00l101O, illiIl1l11O);
/* 22 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
                }

                public static final void I0000oI00(Object obj, Object obj2, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1) {
/* 1 */             Ii00l101O ii00l101O = iloI0lOlll1.I00O0o1oo;
/* 11 */            boolean zI000II = iloI0lOlll1.I000II(obj) | iloI0lOlll1.I000II(obj2);
/* 12 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 16 */            if (zI000II || objI00O0i0ii == IOl11li.I00000oIO) {
/* 24 */                objI00O0i0ii = new O0iO1OIol(ii00l101O, illiIl1l11O);
/* 27 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
                }

                public static final void I0001Ioi1lo(IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1) {
/* 5 */             OIii0IO oIii0IO = iloI0lOlll1.I00IoIO0lI.I00000oOI.I00000oIO;
/* 9 */             oIii0IO.I0000O(OIiO0iiol0I.I0000O);
/* 13 */            l1lI1iI.I00000oIO(oIii0IO, 0, illOOo00lI);
                }

                public static final Ii0110 I000II(IloI0lOlll1 iloI0lOlll1) {
/* 1 */             Ii00l101O ii00l101O = iloI0lOlll1.I00O0o1oo;
/* 5 */             OOooIi0I0O1i oOooIi0I0O1i = new OOooIi0I0O1i();
/* 8 */             oOooIi0I0O1i.I00iOIl = ii00l101O;
/* 10 */            oOooIi0I0O1i.I00iiI = oOooIi0I0O1i;
/* 12 */            VarHandle.storeStoreFence();
/* 29 */            return oOooIi0I0O1i;
                }
            }
