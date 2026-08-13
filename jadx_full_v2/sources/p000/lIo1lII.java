            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class lIo1lII {
                public static final IOioOloI0o0 I00000oIO(O0oOi0I o0oOi0I, IloI0lOlll1 iloI0lOlll1) {
/* 7 */             Object obj = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 9 */             boolean zI000II = iloI0lOlll1.I000II(obj);
/* 13 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 17 */            Object obj2 = IOl11li.I00000oIO;
                    Object obj3 = objI00O0i0ii;
/* 19 */            if (zI000II || objI00O0i0ii == obj2) {
/* 25 */                IOioOloI0o0 iOioOloI0o0 = new IOioOloI0o0();
/* 34 */                iOioOloI0o0.I00iOIl = new O0oiiOll0O1(iOioOloI0o0, true);
/* 36 */                O0oOi0I o0oOi0I2 = O0oOi0I.I00iiI;
/* 38 */                iOioOloI0o0.I00iiI = o0oOi0I2;
/* 40 */                iOioOloI0o0.I00iiO = o0oOi0I2;
/* 42 */                VarHandle.storeStoreFence();
/* 45 */                iloI0lOlll1.I00iio(iOioOloI0o0);
                        obj3 = iOioOloI0o0;
                    }
/* 48 */            IOioOloI0o0 iOioOloI0o02 = (IOioOloI0o0) obj3;
/* 58 */            boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iOioOloI0o02) | iloI0lOlll1.I000OOo1O(obj);
/* 59 */            Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                    Object obj4 = objI00O0i0ii2;
/* 63 */            if (zI000OOo1O || objI00O0i0ii2 == obj2) {
/* 71 */                O1lIIi o1lIIi = new O1lIIi(28);
/* 74 */                o1lIIi.I00iiI = obj;
/* 76 */                o1lIIi.I00iiO = iOioOloI0o02;
/* 78 */                VarHandle.storeStoreFence();
/* 81 */                iloI0lOlll1.I00iio(o1lIIi);
                        obj4 = o1lIIi;
                    }
/* 86 */            iIO0iiOiOl0l.I00000oIO(iOioOloI0o02, obj, (Function1) obj4, iloI0lOlll1);
/* 101 */           boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(iOioOloI0o02) | iloI0lOlll1.I0000oI00(o0oOi0I.ordinal());
/* 102 */           Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 106 */           if (zI000OOo1O2 || objI00O0i0ii3 == obj2) {
/* 115 */               objI00O0i0ii3 = new O00lOIIO(iOioOloI0o02, o0oOi0I, null, 25);
/* 118 */               iloI0lOlll1.I00iio(objI00O0i0ii3);
                    }
/* 123 */           iIO0iiOiOl0l.I0000oI00(iOioOloI0o02, o0oOi0I, (IlliIl1l11O) objI00O0i0ii3, iloI0lOlll1);
/* 332 */           return iOioOloI0o02;
                }
            }
