            package p000;

            import android.util.Size;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class OlioII extends IiIO1ol1i1o0 {
                public final IIiOiI0il I000o00OoI0I;
                public IIiOOI I000oI1ioi;
                public IiIO1ol1i1o0 I00100l0;
                public OliolIlIO I00100o1O0lo;

                public OlioII(int i, Size size) {
/* 1 */             super(i, size);
/* 7 */             Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(0);
/* 10 */            olio1i0OI00i.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 19 */            this.I000o00OoI0I = iOiiloIII0O.I00000oIO(olio1i0OI00i);
                }

                @Override
                public final void I00000oIO() {
/* 1 */             super.I00000oIO();
/* 7 */             Olio0o olio0o = new Olio0o(2);
/* 10 */            olio0o.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            lOllIO.I0000Il00O(olio0o);
                }

                @Override
                public final ListenableFuture I0001Ioi1lo() {
/* 1 */             return this.I000o00OoI0I;
                }

                public final boolean I000II(IiIO1ol1i1o0 iiIO1ol1i1o0, Runnable runnable) {
                    boolean z;
/* 5 */             Size size = this.I000O01llI0;
/* 7 */             lOllIO.I00000oIO();
/* 10 */            int i = iiIO1ol1i1o0.I000OOo1O;
/* 12 */            Size size2 = iiIO1ol1i1o0.I000O01llI0;
/* 14 */            IiIO1ol1i1o0 iiIO1ol1i1o02 = this.I00100l0;
/* 17 */            if (iiIO1ol1i1o02 == iiIO1ol1i1o0) {
/* 16 */                return false;
                    }
/* 28 */            lII1OI11o1I.I0000oI00("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", iiIO1ol1i1o02 == null);
/* 58 */            lII1OI11o1I.I00000oIO("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
/* 61 */            int i2 = this.I000OOo1O;
/* 72 */            lII1OI11o1I.I00000oIO(Oi010OO0.I0010o("The provider's format(", i2, ") must match the parent(", i, ")"), i2 == i);
                    synchronized (this.I00000oIO) {
/* 78 */                z = this.I0000Il00O;
                    }
/* 85 */            lII1OI11o1I.I0000oI00("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
/* 88 */            this.I00100l0 = iiIO1ol1i1o0;
/* 100 */           iIllIoiiIO.I0001Ioi1lo(true, iiIO1ol1i1o0.I0000Il00O(), this.I000oI1ioi, Iii11l.I00000oIO());
/* 103 */           iiIO1ol1i1o0.I0000O();
/* 108 */           ListenableFuture listenableFutureI0000oI00 = iIllIoiiIO.I0000oI00(this.I0000oI00);
/* 116 */           OOIl1i1 oOIl1i1 = new OOIl1i1(10);
/* 119 */           oOIl1i1.I00iiI = iiIO1ol1i1o0;
/* 121 */           VarHandle.storeStoreFence();
/* 128 */           listenableFutureI0000oI00.addListener(oOIl1i1, Iii11l.I00000oIO());
/* 141 */           iIllIoiiIO.I0000oI00(iiIO1ol1i1o0.I000II).addListener(runnable, O1OIIoio0i1.I0000O());
/* 20 */            return true;
                }
            }
