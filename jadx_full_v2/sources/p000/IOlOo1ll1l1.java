            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.Set;
            
            public interface IOlOo1ll1l1 {
                static void I000oI1ioi(OI0oiliol10O oI0oiliol10O, IOlOo1ll1l1 iOlOo1ll1l1, IOlOo1ll1l1 iOlOo1ll1l12, I1ioiI i1ioiI) {
/* 7 */             if (!Objects.equals(i1ioiI, IoiIli1i0Oil.I001lllioOl)) {
/* 71 */                oI0oiliol10O.I000lI(i1ioiI, iOlOo1ll1l12.I000OiO(i1ioiI), iOlOo1ll1l12.I0000O(i1ioiI));
/* 204 */               return;
                    }
/* 14 */            Oi0Oliol oi0Oliol = (Oi0Oliol) iOlOo1ll1l12.I00000oOI(i1ioiI, null);
/* 20 */            Oi0Oliol oi0Oliol2 = (Oi0Oliol) iOlOo1ll1l1.I00000oOI(i1ioiI, null);
/* 22 */            IOlOo0 iOlOo0I000OiO = iOlOo1ll1l12.I000OiO(i1ioiI);
/* 26 */            if (oi0Oliol == null) {
/* 28 */                oi0Oliol = oi0Oliol2;
                    } else if (oi0Oliol2 != null) {
/* 33 */                iOl0lOIi11 iol0loii11 = oi0Oliol2.I00000oIO;
/* 35 */                Oi0Oo11I oi0Oo11I = oi0Oliol2.I00000oOI;
/* 37 */                iOl0lOIi11 iol0loii112 = oi0Oliol.I00000oIO;
/* 39 */                if (iol0loii112 != null) {
/* 41 */                    iol0loii11 = iol0loii112;
                        }
/* 42 */                Oi0Oo11I oi0Oo11I2 = oi0Oliol.I00000oOI;
/* 44 */                if (oi0Oo11I2 != null) {
/* 46 */                    oi0Oo11I = oi0Oo11I2;
                        }
/* 49 */                oi0Oliol = new Oi0Oliol();
/* 52 */                oi0Oliol.I00000oIO = iol0loii11;
/* 54 */                oi0Oliol.I00000oOI = oi0Oo11I;
/* 56 */                VarHandle.storeStoreFence();
                    }
/* 59 */            oI0oiliol10O.I000lI(i1ioiI, iOlOo0I000OiO, oi0Oliol);
                }

                static OIil0iio0 I00100l0(IOlOo1ll1l1 iOlOo1ll1l1, IOlOo1ll1l1 iOlOo1ll1l12) {
/* 1 */             if (iOlOo1ll1l1 == null && iOlOo1ll1l12 == null) {
/* 5 */                 return OIil0iio0.I00iiO;
                    }
/* 15 */            OI0oiliol10O oI0oiliol10OI000iOII = iOlOo1ll1l12 != null ? OI0oiliol10O.I000iOII(iOlOo1ll1l12) : OI0oiliol10O.I000OOo1O();
/* 19 */            if (iOlOo1ll1l1 != null) {
/* 25 */                Iterator it = iOlOo1ll1l1.I0000Il00O().iterator();
/* 33 */                while (it.hasNext()) {
/* 41 */                    I000oI1ioi(oI0oiliol10OI000iOII, iOlOo1ll1l12, iOlOo1ll1l1, (I1ioiI) it.next());
                        }
                    }
/* 45 */            return OIil0iio0.I0001Ioi1lo(oI0oiliol10OI000iOII);
                }

                void I00000oIO(IIoIil iIoIil);

                Object I00000oOI(I1ioiI i1ioiI, Object obj);

                Set I0000Il00O();

                Object I0000O(I1ioiI i1ioiI);

                Set I0000oI00(I1ioiI i1ioiI);

                Object I000II(I1ioiI i1ioiI, IOlOo0 iOlOo0);

                boolean I000O01llI0(I1ioiI i1ioiI);

                IOlOo0 I000OiO(I1ioiI i1ioiI);
            }
