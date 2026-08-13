            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class ilI0IIll1l {
                /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IllOOo00lI I00000oIO(IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1) {
                    Object obj;
/* 7 */             Object obj2 = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 9 */             O0oOi0I o0oOi0I = O0oOi0I.I00iOIl;
/* 19 */            boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(obj2) | iloI0lOlll1.I000II(illOOo00lI);
/* 20 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 24 */            if (!zI000OOo1O) {
                        obj = objI00O0i0ii;
/* 28 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 33 */                    IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(7);
/* 36 */                    iO1Io1IOOOIi.I00iiI = obj2;
/* 38 */                    iO1Io1IOOOIi.I00iiO = illOOo00lI;
/* 40 */                    VarHandle.storeStoreFence();
/* 43 */                    iloI0lOlll1.I00iio(iO1Io1IOOOIi);
                            obj = iO1Io1IOOOIi;
                        }
                    }
/* 46 */            return (IllOOo00lI) obj;
                }
            }
