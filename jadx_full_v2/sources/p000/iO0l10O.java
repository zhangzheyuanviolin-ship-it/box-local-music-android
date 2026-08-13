            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iO0l10O {
                public static O1ooiI111i I00000oIO(O1ooiI111i o1ooiI111i, OiOl01il10lO oiOl01il10lO) {
/* 2 */             return I0000Il00O(o1ooiI111i, oiOl01il10lO, false);
                }

                public static final OiOl01il10lO I00000oOI(IloI0lOlll1 iloI0lOlll1) {
/* 2 */             Object[] objArr = new Object[0];
/* 4 */             IoloOio0I ioloOio0I = OiOl01il10lO.I000iOII;
/* 6 */             boolean zI0000oI00 = iloI0lOlll1.I0000oI00(0);
/* 10 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 14 */            if (zI0000oI00 || objI00O0i0ii == IOl11li.I00000oIO) {
/* 24 */                objI00O0i0ii = new Oi1O00OI(9);
/* 27 */                VarHandle.storeStoreFence();
/* 30 */                iloI0lOlll1.I00iio(objI00O0i0ii);
                    }
/* 39 */            return (OiOl01il10lO) lIo1lO.I0000Il00O(objArr, ioloOio0I, (IllOOo00lI) objI00O0i0ii, iloI0lOlll1, 0);
                }

                public static O1ooiI111i I0000Il00O(O1ooiI111i o1ooiI111i, OiOl01il10lO oiOl01il10lO, boolean z) {
/* 7 */             OIilII oIilII = z ? OIilII.I00iOIl : OIilII.I00iiI;
/* 10 */            OI0lOIiOIOOo oI0lOIiOIOOo = oiOl01il10lO.I0000oI00;
/* 12 */            OIilII oIilII2 = OIilII.I00iOIl;
/* 14 */            O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 46 */            O1ooiI111i o1ooiI111iI0000O = o1ooiI111i.I0000O(oIilII == oIilII2 ? ii0OOOOo0i.I00000oIO(o1ooIo101ll, IOIIoiI1oi1.I0000O) : ii0OOOOo0i.I00000oIO(o1ooIo101ll, IOIIoiI1oi1.I0000Il00O)).I0000O(new OiOl1l1(null, null, null, oI0lOIiOIOOo, oIilII, oiOl01il10lO, true, true));
/* 52 */            OiOoiOOo oiOoiOOo = new OiOoiOOo();
/* 55 */            oiOoiOOo.I00000oIO = oiOl01il10lO;
/* 57 */            oiOoiOOo.I00000oOI = z;
/* 59 */            VarHandle.storeStoreFence();
/* 62 */            return o1ooiI111iI0000O.I0000O(oiOoiOOo);
                }
            }
