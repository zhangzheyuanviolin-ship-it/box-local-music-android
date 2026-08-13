            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIll1lio implements IIi0O1OOO1i0 {
                public IIOoi0ooOoO I00iOIl;
                public float I00iiI = Float.NEGATIVE_INFINITY;
                public int I00iiO = -1;

                public OIll1lio(IIOoi0ooOoO iIOoi0ooOoO) {
/* 11 */            this.I00iOIl = iIOoi0ooOoO;
                }

                public final OIloOoil011l I00000oIO() {
/* 5 */             IIOoIilO iIOoIilOI00lli11 = this.I00iOIl.I00lli11(IIi0I0I0o.I01OoOi);
/* 9 */             if (iIOoIilOI00lli11 != null) {
/* 13 */                return new OIloOoil011l(iIOoIilOI00lli11);
                    }
/* 17 */            return null;
                }

                public final OIllIlO1 I00000oOI() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iOIl.I00oII(IIi0I0I0o.I01i1I);
/* 11 */            if (iIOoOiOII00oII instanceof IIi0io1lIo) {
/* 17 */                return new OIllIlO1((IIi0io1lIo) iIOoOiOII00oII);
                    }
/* 21 */            return null;
                }

                public final String I0000Il00O() {
/* 5 */             IIOoOiOI iIOoOiOII00oII = this.I00iOIl.I00oII(IIi0I0I0o.I01iI0l00O);
/* 11 */            if (iIOoOiOII00oII instanceof IIi0I0I0o) {
/* 15 */                return ((IIi0I0I0o) iIOoOiOII00oII).I00iOIl;
                    }
/* 18 */            return null;
                }

                public final OIloI11OoI01 I0000O() {
/* 9 */             IIOoi0ooOoO iIOoi0ooOoO = (IIOoi0ooOoO) this.I00iOIl.I00oII(IIi0I0I0o.I0IOoio1iool);
/* 11 */            if (iIOoi0ooOoO == null) {
/* 39 */                return null;
                    }
/* 21 */            byte[] bArr = ((IIi0l1) iIOoi0ooOoO.I00oII(IIi0I0I0o.I0I11i0)).I00iOIl;
/* 26 */            if (bArr.length < 12) {
/* 39 */                return null;
                    }
/* 30 */            OIloI11OoI01 oIloI11OoI01 = new OIloI11OoI01();
/* 33 */            oIloI11OoI01.I00000oIO = bArr;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            return oIloI11OoI01;
                }

                public final boolean I0000oI00(int i) {
/* 1 */             int iI00oooO = this.I00iiO;
/* 5 */             if (iI00oooO == -1) {
/* 12 */                iI00oooO = this.I00iOIl.I00oooO(IIi0I0I0o.I01OlIoIl, null, 0);
/* 16 */                this.I00iiO = iI00oooO;
                    }
                    return (iI00oooO & i) != 0;
                }

                @Override
                public final IIOoOiOI I00Io1lO() {
/* 1 */             return this.I00iOIl;
                }
            }
