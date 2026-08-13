            package p000;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            
            public final class i0I0io000 implements Ool1II0ii {
                public i0I0OoIIOO01 I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public OllO00oiil I0000O;
                public OllO00oiil I0000oI00;
                public boolean I0001Ioi1lo;
                public Ool1lo I000II;
                public IOi10loi I000O01llI0;

                public final ListenableFuture I00000oIO(i0I0liI i0i0lii, boolean z, boolean z2) {
/* 3 */             IOi10loi iOi10loi = new IOi10loi();
/* 6 */             IOi10loi iOi10loi2 = this.I000O01llI0;
/* 8 */             if (iOi10loi2 != null) {
/* 10 */                if (z) {
/* 14 */                    IIl001iO0Io.I001l0I00("Cancelled due to another zoom value being set.", iOi10loi2);
                        } else {
/* 18 */                    iiolOOio1.I0000Il00O(iOi10loi, iOi10loi2);
                        }
                    }
/* 21 */            this.I000O01llI0 = iOi10loi;
/* 23 */            boolean zI00000oOI = lOllIO.I00000oOI();
/* 27 */            OllO00oiil ollO00oiil = this.I0000oI00;
/* 29 */            if (zI00000oOI) {
/* 37 */                ((OI0lOii0I) ollO00oiil.getValue()).I000iOII(i0i0lii);
                    } else {
/* 47 */                ((OI0lOii0I) ollO00oiil.getValue()).I000OOo1O(i0i0lii);
                    }
/* 50 */            Ool1lo ool1lo = this.I000II;
/* 52 */            if (ool1lo != null) {
/* 54 */                i0I0OoIIOO01 i0i0ooiioo01 = this.I00000oIO;
/* 67 */                iiolOOio1.I0000Il00O(z2 ? i0i0ooiioo01.I0010I0i(ool1lo) : i0i0ooiioo01.I00100l0(ool1lo), iOi10loi);
                    } else {
/* 73 */                IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
                    }
/* 80 */            I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(8);
/* 83 */            i0IOIlIOIII.I00iiI = iOi10loi;
/* 85 */            VarHandle.storeStoreFence();
/* 92 */            return iIllIoiiIO.I0000oI00(iOiiloIII0O.I00000oIO(i0IOIlIOIII));
                }

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
                    boolean z;
/* 1 */             this.I000II = ool1lo;
/* 15 */            i0I0liI i0i0lii = (i0I0liI) ((OI0lOii0I) this.I0000oI00.getValue()).I0000O();
/* 17 */            if (i0i0lii == null) {
/* 25 */                i0i0lii = (i0I0liI) this.I0000O.getValue();
                    }
/* 31 */            if (this.I0001Ioi1lo) {
/* 38 */                z = true;
                    } else {
/* 33 */                i0i0lii.getClass();
/* 36 */                z = false;
                    }
/* 39 */            I00000oIO(i0i0lii, false, z);
/* 42 */            this.I0001Ioi1lo = true;
                }

                @Override
                public final void reset() {
/* 10 */            I00000oIO((i0I0liI) this.I0000O.getValue(), true, true);
                }
            }
