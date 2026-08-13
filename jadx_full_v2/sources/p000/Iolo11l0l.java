            package p000;

            import java.lang.invoke.VarHandle;
            
/* 27 */    public final class Iolo11l0l extends OIoOo11 {
                public OioOIi1o0I I00ilI0I1;
                public IIlio101Io I00ilO0;
                public float I00io1l;

                @Override
                public final void I00000oIO(float f) {
/* 1 */             this.I00io1l = f;
                }

                @Override
                public final long I000OOo1O() {
/* 1 */             return 9205357640488583168L;
                }

                @Override
                public final void I000OiO(IilloIOOO0i iilloIOOO0i) {
/* 1 */             IIlio101Io iIlio101Io = this.I00ilO0;
/* 3 */             OioOIi1o0I oioOIi1o0I = this.I00ilI0I1;
/* 5 */             long jI0000oI00 = iilloIOOO0i.I0000oI00();
/* 9 */             O0iOOoiioO layoutDirection = iilloIOOO0i.getLayoutDirection();
                    synchronized (iIlio101Io) {
/* 16 */                I10011 i10011 = (I10011) iIlio101Io.I00iiO;
/* 18 */                if (i10011 == null) {
/* 31 */                    I10011 i100112 = new I10011(iO0ioilo.I00000oIO, 0L, O0iOOoiioO.I00iOIl, 1.0f, null);
/* 34 */                    iIlio101Io.I00iiO = i100112;
/* 36 */                    i10011 = i100112;
                        }
/* 37 */                i10011.I00000oIO = oioOIi1o0I;
/* 39 */                i10011.I00000oOI = jI0000oI00;
/* 41 */                i10011.I0000Il00O = layoutDirection;
/* 47 */                i10011.I0000O = iilloIOOO0i.I00000oIO();
/* 51 */                OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) iIlio101Io.I00iiI;
/* 53 */                if (oI10I1IoI0Ol == null) {
/* 57 */                    oI10I1IoI0Ol = new OI10I1IoI0Ol();
/* 60 */                    iIlio101Io.I00iiI = oI10I1IoI0Ol;
                        }
/* 68 */                if (((Iolo1i0ollO) oI10I1IoI0Ol.I000II(i10011)) == null) {
/* 70 */                    oioOIi1o0I.I00000oIO(jI0000oI00, layoutDirection, iilloIOOO0i);
/* 75 */                    Iolo1i0ollO iolo1i0ollO = new Iolo1i0ollO();
/* 78 */                    int i = IOOiio0i.I000oI1ioi;
/* 80 */                    O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 82 */                    iOIlil0Il1i.I00000oIO();
/* 85 */                    VarHandle.storeStoreFence();
/* 90 */                    OI10I1IoI0Ol oI10I1IoI0Ol2 = (OI10I1IoI0Ol) iIlio101Io.I00iiI;
/* 92 */                    if (oI10I1IoI0Ol2 == null) {
/* 96 */                        oI10I1IoI0Ol2 = new OI10I1IoI0Ol();
/* 99 */                        iIlio101Io.I00iiI = oI10I1IoI0Ol2;
                            }
/* 115 */                   oI10I1IoI0Ol2.I000lI(new I10011(i10011.I00000oIO, i10011.I00000oOI, i10011.I0000Il00O, i10011.I0000O, null), iolo1i0ollO);
                        }
                    }
/* 123 */           iilloIOOO0i.I0000oI00();
/* 127 */           throw null;
                }

                @Override
/* 28 */        public final void I0000Il00O(IOOil0 iOOil0) {
                }

                @Override
/* 28 */        public final void I0001Ioi1lo(O0iOOoiioO o0iOOoiioO) {
                }
            }
