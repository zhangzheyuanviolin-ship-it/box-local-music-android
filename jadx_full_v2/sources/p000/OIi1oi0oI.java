            package p000;

            import java.util.List;
            
            public final class OIi1oi0oI extends IlO1i1lOIi {
                public static final OIi1oi0oI I0000O = new OIi1oi0oI(0, 4, 1);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
/* 6 */             OI0Iol1O oI0Iol1O = (OI0Iol1O) iOOOi1.I0001Ioi1lo(2);
/* 13 */            OI0Iol1O oI0Iol1O2 = (OI0Iol1O) iOOOi1.I0001Ioi1lo(3);
/* 20 */            IOl1ool0 iOl1ool0 = (IOl1ool0) iOOOi1.I0001Ioi1lo(1);
/* 27 */            OI0Iloloi oI0IloloiI00100l0 = (OI0Iloloi) iOOOi1.I0001Ioi1lo(0);
/* 29 */            if (oI0IloloiI00100l0 == null && (oI0IloloiI00100l0 = iOl1ool0.I00100l0(oI0Iol1O)) == null) {
/* 40 */                IOl1II00.I00000oOI("Could not resolve state for movable content");
/* 43 */                IOOlIIilOl0.I0000Il00O();
/* 46 */                return;
                    }
/* 49 */            Ol11i0000Oo ol11i0000OoI00000oIO = Ol11iOOOoo1.I00000oIO(oI0IloloiI00100l0.I00000oIO);
/* 55 */            if (ol11il011o0.I000o00OoI0I > 0 || ol11il011o0.I00111O(ol11il011o0.I00111O + 1) != 1) {
/* 69 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 72 */            int i = ol11il011o0.I00111O;
/* 74 */            int i2 = ol11il011o0.I000OOo1O;
/* 76 */            int i3 = ol11il011o0.I000OiO;
/* 78 */            ol11il011o0.I00000oIO(1);
/* 81 */            ol11il011o0.I00O0i0ii();
/* 84 */            ol11il011o0.I0000O();
/* 87 */            Ol11il011o0 ol11il011o0I000lI = ol11i0000OoI00000oIO.I000lI();
                    try {
/* 96 */                List listI00000oIO = lOIlIOil.I00000oIO(ol11il011o0I000lI, 2, ol11il011o0, false, true, true);
/* 100 */               ol11il011o0I000lI.I0000oI00(true);
/* 103 */               ol11il011o0.I000OiO();
/* 106 */               ol11il011o0.I000OOo1O();
/* 109 */               ol11il011o0.I00111O = i;
/* 111 */               ol11il011o0.I000OOo1O = i2;
/* 113 */               ol11il011o0.I000OiO = i3;
/* 117 */               lIilio1l0.I00000oIO(ol11il011o0, listI00000oIO, oI0Iol1O2.I0000Il00O);
                    } catch (Throwable th) {
/* 123 */               ol11il011o0I000lI.I0000oI00(false);
/* 399 */               throw th;
                    }
                }
            }
