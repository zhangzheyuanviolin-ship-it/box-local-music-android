            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            
            public final class IIlll1OOiIO1 implements IIllOo0 {
                public OolOO1oOoo I00iOIl;
                public IIllOioOlolI I00iiI;
                public IIlO1O0lOl I00iiO;
                public OolOi0i I00iio;
                public IIo0ll0o I00ilI0I1;
                public String I00ilO0;
                public IIlIi00 I00io1l;
                public int I00ioIO;
                public I1Ool1IoO110 I00l0I0l0lO1;

                @Override
                public final ListenableFuture I00000oIO() {
/* 13 */            OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(this.I00iio.I00000oIO, null, null, new IIlli11OIol(this, null, 1), 3);
/* 21 */            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(8);
/* 24 */            i0IOIlIOIII.I00iiI = olIl0iI0000O;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            return iOiiloIII0O.I00000oIO(i0IOIlIOIII);
                }

                @Override
                public final OIOiOoiIil1I I0000O() {
/* 3 */             return this.I00ilI0I1.I00000oOI;
                }

                @Override
                public final void I0000oI00(Ool10o ool10o) {
/* 1 */             OolOO1oOoo oolOO1oOoo = this.I00iOIl;
                    synchronized (oolOO1oOoo.I000oI1ioi) {
/* 12 */                if (oolOO1oOoo.I00100l0.contains(ool10o)) {
/* 16 */                    oolOO1oOoo.I000iOII(oolOO1oOoo.I00100l0);
                        }
                    }
                }

                @Override
                public final void I000II(Ool10o ool10o) {
/* 3 */             this.I00iOIl.I00000oIO(ool10o);
                }

                @Override
                public final IIlO1O0lOl I000O01llI0() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final IIlIi00 I000OOo1O() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final void I000OiO(Ool10o ool10o) {
/* 1 */             OolOO1oOoo oolOO1oOoo = this.I00iOIl;
                    synchronized (oolOO1oOoo.I000oI1ioi) {
/* 12 */                if (oolOO1oOoo.I00100l0.contains(ool10o)) {
/* 14 */                    oolOO1oOoo.I000l1();
                        }
                    }
                }

                @Override
                public final void I000iOII(IIlIi00 iIlIi00) {
/* 7 */             this.I00io1l = iIlIi00 == null ? IIlIool0Oi0O.I00000oIO : iIlIi00;
/* 9 */             if (iIlIi00 != null) {
/* 11 */                iIlIi00.I001IIilI0O();
                    }
                    synchronized (this.I00iOIl.I000oI1ioi) {
                    }
                }

                @Override
                public final void I000l1(boolean z) {
/* 1 */             OolOO1oOoo oolOO1oOoo = this.I00iOIl;
                    synchronized (oolOO1oOoo.I000oI1ioi) {
/* 6 */                 oolOO1oOoo.I0010I0i = z;
/* 8 */                 Ool1i0ll ool1i0llI000O01llI0 = oolOO1oOoo.I000O01llI0();
/* 12 */                if (ool1i0llI000O01llI0 != null) {
/* 25 */                    iOi1II01i0.I0000O(ool1i0llI000O01llI0.I00000oOI.I0000oI00, null, null, new I1oo01II0O11((IOoil1iiIilo) null, ool1i0llI000O01llI0, z), 3);
                        }
                    }
                }

                @Override
                public final boolean I000lI() {
/* 3 */             return this.I00l0I0l0lO1.I00000oOI();
                }

                @Override
                public final void I000o00OoI0I(Collection collection) {
/* 9 */             this.I00iOIl.I0000O(IOOi0Ool1i.I00iIi0i1o(collection));
                }

                @Override
                public final void I000oI1ioi(ArrayList arrayList) {
/* 7 */             this.I00iOIl.I000II(IOOi0Ool1i.I00iIi0i1o(arrayList));
                }

                @Override
                public final void I00100l0() {
/* 8 */             if (l11I11lO.I0000O(3, "CXCP")) {
/* 10 */                toString();
                    }
/* 19 */            if (this.I00l0I0l0lO1.I00000oIO()) {
/* 32 */                iOi1II01i0.I0000O(this.I00iio.I00000oIO, null, null, new IIlli11OIol(this, null, 0), 3);
                    }
                }

                @Override
                public final void I0010I0i(boolean z) {
/* 1 */             OolOO1oOoo oolOO1oOoo = this.I00iOIl;
                    synchronized (oolOO1oOoo.I000oI1ioi) {
/* 6 */                 oolOO1oOoo.I00111O = z;
                    }
                }

                @Override
                public final IIllOioOlolI I0010o() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void I00111O(Ool10o ool10o) {
/* 1 */             OolOO1oOoo oolOO1oOoo = this.I00iOIl;
                    synchronized (oolOO1oOoo.I000oI1ioi) {
/* 12 */                if (oolOO1oOoo.I00100o1O0lo.remove(ool10o)) {
/* 14 */                    oolOO1oOoo.I000l1();
                        }
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
/* 14 */            sb.append((Object) IIllI0o.I0000Il00O(this.I00ilO0));
/* 19 */            sb.append('(');
/* 26 */            return IIl001iO0Io.I000lI(this.I00ioIO, ")>", sb);
                }
            }
