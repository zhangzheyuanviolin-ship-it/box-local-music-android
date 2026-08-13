            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiiOIlioi0 extends IiIioO0ol1oI implements O0iOoioOoI, Iillo1il11l, Io0Illo, IOlIil1, OIOilOIi1, O0iOIlio1O, Ooii0O0 {
                public OiiiOo1IOlI I00o101lO;
                public OloOoi I00oI0i;
                public boolean I00oII;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 3 */             return this.I00oI0i.I0000Il00O(o1iOIoOiO0, o1iIo0ll, j);
                }

                @Override
                public final int I0001Ioi1lo(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             return this.I00oI0i.I0001Ioi1lo(o1IiO0l, o1iIo0ll, i);
                }

                @Override
                public final void I000iOII(O0iOOo0Ii o0iOOo0Ii) {
/* 3 */             if (this.I00oII) {
/* 29 */                return;
                    }
/* 7 */             this.I00oII = true;
/* 9 */             OiiiOo1IOlI oiiiOo1IOlI = this.I00o101lO;
/* 11 */            if (oiiiOo1IOlI != null) {
/* 13 */                oiiiOo1IOlI.I00000oIO();
                    }
                }

                @Override
                public final int I00Ol10(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             return this.I00oI0i.I00Ol10(o1IiO0l, o1iIo0ll, i);
                }

                @Override
                public final void I00i01iIIliI(OIIlIII0Ili oIIlIII0Ili) {
/* 1 */             OiiiOo1IOlI oiiiOo1IOlI = this.I00o101lO;
/* 3 */             if (oiiiOo1IOlI != null) {
/* 13 */                oiiiOo1IOlI.I0000O = IOO000ilo.I000lI(oiiiOo1IOlI.I0000O, oIIlIII0Ili, null, null, 6);
/* 15 */                Oiio1oll000 oiio1oll000 = oiiiOo1IOlI.I00000oOI;
/* 17 */                long j = oiiiOo1IOlI.I00000oIO;
/* 20 */                oiio1oll000.I00000oIO = false;
/* 22 */                Oiii0i1Oil1 oiii0i1Oil1 = oiio1oll000.I0000oI00;
/* 24 */                if (oiii0i1Oil1 != null) {
/* 30 */                    oiii0i1Oil1.invoke(Long.valueOf(j));
                        }
                    }
                }

                @Override
                public final int I00iOIl(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             return this.I00oI0i.I00iOIl(o1IiO0l, o1iIo0ll, i);
                }

                @Override
                public final void I00ilO0() {
/* 1 */             OiiiOo1IOlI oiiiOo1IOlI = this.I00o101lO;
/* 3 */             if (oiiiOo1IOlI != null) {
/* 17 */                oiiiOo1IOlI.I0000O = IOO000ilo.I000lI(oiiiOo1IOlI.I0000O, null, null, I010o0o0oO(), 3);
                    }
                }

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) throws Throwable {
/* 3 */             this.I00oI0i.I00l0I0l0lO1(o0iiliOio);
                }

                @Override
                public final int I00li1OI(O1IiO0l o1IiO0l, O1iIo0ll o1iIo0ll, int i) {
/* 3 */             return this.I00oI0i.I00li1OI(o1IiO0l, o1iIo0ll, i);
                }

                @Override
                public final void I00ooIo0() {
/* 3 */             if (this.I00oII) {
/* 7 */                 this.I00oII = false;
/* 9 */                 OiiiOo1IOlI oiiiOo1IOlI = this.I00o101lO;
/* 11 */                if (oiiiOo1IOlI != null) {
/* 13 */                    oiiiOo1IOlI.I00000oOI();
                        }
                    }
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 1 */             OiiiOo1IOlI oiiiOo1IOlI = this.I00o101lO;
/* 3 */             if (oiiiOo1IOlI != null) {
/* 17 */                oiiiOo1IOlI.I0000O = IOO000ilo.I000lI(oiiiOo1IOlI.I0000O, null, null, I010o0o0oO(), 3);
                    }
                }

                @Override
                public final void I010I0() {
/* 1 */             OiiiOo1IOlI oiiiOo1IOlI = this.I00o101lO;
/* 3 */             if (oiiiOo1IOlI != null) {
/* 13 */                oiiiOo1IOlI.I0000O = IOO000ilo.I000lI(oiiiOo1IOlI.I0000O, null, null, null, 3);
                    }
                }

                public final O0ll1IIi I010o0o0oO() {
/* 3 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 10 */            O1l110o o1l110o = new O1l110o(17);
/* 13 */            o1l110o.I00iiI = oOo0ooi;
/* 15 */            o1l110o.I00iiO = this;
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            l1ioloOOl00l.I00000oIO(this, o1l110o);
/* 25 */            return (O0ll1IIi) oOo0ooi.I00iOIl;
                }
            }
