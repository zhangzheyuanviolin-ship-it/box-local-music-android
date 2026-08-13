            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class OIoIol {
                public static final OIoIoilI1 I00000oIO;
                public static final OIoI1lIli I00000oOI;

                static {
/* 4 */             OIoIoilI1 oIoIoilI1 = new OIoIoilI1(0);
/* 7 */             VarHandle.storeStoreFence();
/* 10 */            I00000oIO = oIoIoilI1;
/* 12 */            OIilII oIilII = OIilII.I00iOIl;
/* 14 */            IOO0o0I1l iOO0o0I1l = IOO0o0I1l.I00ilO0;
/* 19 */            O0l101OI o0l101OI = new O0l101OI(2);
/* 22 */            VarHandle.storeStoreFence();
/* 48 */            I00000oOI = new OIoI1lIli(0, 0, 0, 0, 0, 0, iOO0o0I1l, o0l101OI, il001oo1.I00000oIO(Il00o11.I00iOIl), oIoIoilI1, IOo0olo.I00000oOI(0, 0, 0, 0, 15));
                }

                public static final long I00000oIO(OIoI1lIli oIoI1lIli, int i) {
/* 19 */            long j = (((i * (oIoI1lIli.I00000oOI + r0)) + (-oIoI1lIli.I0001Ioi1lo)) + oIoI1lIli.I0000O) - oIoI1lIli.I0000Il00O;
/* 33 */            int iI000OOo1O = (int) (oIoI1lIli.I0000oI00 == OIilII.I00iiI ? oIoI1lIli.I000OOo1O() >> 32 : oIoI1lIli.I000OOo1O() & 4294967295L);
/* 48 */            oIoI1lIli.I000o00OoI0I.getClass();
/* 58 */            long jI0000Il00O = j - (iI000OOo1O - lIiioliIlo.I0000Il00O(0, 0, iI000OOo1O));
/* 63 */            if (jI0000Il00O < 0) {
/* 59 */                return 0L;
                    }
/* 106 */           return jI0000Il00O;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final IiI0O1Io I00000oOI(int i, IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    Object obj;
/* 1 */             int i4 = 1;
/* 4 */             if ((i3 & 1) != 0) {
/* 6 */                 i = 0;
                    }
/* 7 */             Object[] objArr = new Object[0];
/* 9 */             IoloOio0I ioloOio0I = IiI0O1Io.I00IOO;
/* 42 */            boolean zI0000oI00 = ((((i2 & 896) ^ 384) > 256 && iloI0lOlll1.I000II(illOOo00lI)) || (i2 & 384) == 256) | iloI0lOlll1.I0000oI00(i) | iloI0lOlll1.I0000O(0.0f);
/* 43 */            Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 47 */            if (!zI0000oI00) {
                        obj = objI00O0i0ii;
/* 51 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 55 */                    O1lIIliooi o1lIIliooi = new O1lIIliooi(i4);
/* 58 */                    o1lIIliooi.I00iiI = i;
/* 60 */                    o1lIIliooi.I00iiO = illOOo00lI;
/* 62 */                    VarHandle.storeStoreFence();
/* 65 */                    iloI0lOlll1.I00iio(o1lIIliooi);
                            obj = o1lIIliooi;
                        }
                    }
/* 74 */            IiI0O1Io iiI0O1Io = (IiI0O1Io) lIo1lO.I0000Il00O(objArr, ioloOio0I, (IllOOo00lI) obj, iloI0lOlll1, 0);
/* 78 */            iiI0O1Io.I00IO1oi11O.setValue(illOOo00lI);
/* 399 */           return iiI0O1Io;
                }
            }
