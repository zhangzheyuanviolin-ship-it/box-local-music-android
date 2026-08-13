            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
/* 26 */    public final class OIIOlOIoOO extends Ol0O0iI0l0O implements IO0OlIoI1oI {
                public final IO0Io01l1 I00iiI;
                public final OIIOli0 I00iiO;
                public final Ooioo0o1l0 I00iio;
                public final OoOI1i1i I00ilI0I1;
                public final boolean I00ilO0;
                public final boolean I00io1l;

                /* JADX WARN: Illegal instructions before constructor call */
                public OIIOlOIoOO(IO0Io01l1 iO0Io01l1, OIIOli0 oIIOli0, Ooioo0o1l0 ooioo0o1l0, OoOI1i1i ooOI1i1i, boolean z, int i) {
/* 3 */             if ((i & 8) != 0) {
/* 7 */                 OoOI1i1i.I00iiI.getClass();
/* 10 */                ooOI1i1i = OoOI1i1i.I00iiO;
                    }
/* 24 */            this(iO0Io01l1, oIIOli0, ooioo0o1l0, ooOI1i1i, (i & 16) != 0 ? false : z, false);
                }

                @Override
                public final O1iil1I01o I00IoiI() {
/* 7 */             return Il0ooiloI.I00000oIO(Il0olOol.I00iiI, true, new String[0]);
                }

                @Override
                public final List I00OIl() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final OoOI1i1i I00OloOo() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final OoOIOoO1I I00iOIl() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I00iiI() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final Ooioo0o1l0 I00li1OI(boolean z) {
/* 14 */            return new OIIOlOIoOO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, z, 32);
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
/* 14 */            return new OIIOlOIoOO(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, z, 32);
                }

                @Override
                public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
/* 14 */            return new OIIOlOIoOO(this.I00iiI, this.I00iiO, this.I00iio, ooOI1i1i, this.I00ilO0, this.I00io1l);
                }

                @Override
                public final OIIOlOIoOO I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
                    I01illiil1Oo i01illiil1Oo;
/* 1 */             OIIOli0 oIIOli0 = this.I00iiO;
/* 5 */             OoOi1Ol ooOi1OlI0000O = oIIOli0.I00iOIl.I0000O(o0iIoIOO0O0);
/* 12 */            if (oIIOli0.I00iiI != null) {
/* 18 */                i01illiil1Oo = new I01illiil1Oo(24);
/* 21 */                i01illiil1Oo.I00iiO = oIIOli0;
/* 23 */                i01illiil1Oo.I00iiI = o0iIoIOO0O0;
/* 25 */                VarHandle.storeStoreFence();
                    } else {
/* 29 */                i01illiil1Oo = null;
                    }
/* 30 */            OIIOli0 oIIOli02 = oIIOli0.I00iiO;
/* 32 */            if (oIIOli02 == null) {
/* 34 */                oIIOli02 = oIIOli0;
                    }
/* 39 */            OIIOli0 oIIOli03 = new OIIOli0(ooOi1OlI0000O, i01illiil1Oo, oIIOli02, oIIOli0.I00iio);
/* 42 */            Ooioo0o1l0 ooioo0o1l0 = this.I00iio;
/* 59 */            return new OIIOlOIoOO(this.I00iiI, oIIOli03, ooioo0o1l0 != null ? ooioo0o1l0 : null, this.I00ilI0I1, this.I00ilO0, 32);
                }

/* 27 */        public OIIOlOIoOO(IO0Io01l1 iO0Io01l1, OIIOli0 oIIOli0, Ooioo0o1l0 ooioo0o1l0, OoOI1i1i ooOI1i1i, boolean z, boolean z2) {
/* 29 */            this.I00iiI = iO0Io01l1;
/* 30 */            this.I00iiO = oIIOli0;
/* 31 */            this.I00iio = ooioo0o1l0;
/* 32 */            this.I00ilI0I1 = ooOI1i1i;
/* 33 */            this.I00ilO0 = z;
/* 34 */            this.I00io1l = z2;
                }
            }
