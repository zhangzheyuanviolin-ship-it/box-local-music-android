            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Iill0oiIl0Io extends O1ooOo implements O0iOoioOoI {
                public I0l1OOl1l10 I00o0iI0io1;
                public IlliIl1l11O I00o0l1o1o0;
                public OIilII I00o101lO;
                public boolean I00oI0i;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 9 */             boolean z = true;
/* 10 */            if (!o1iOIoOiO0.I00OloOo() || !this.I00oI0i) {
/* 47 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) this.I00o0l1o1o0.invoke(IooOl0ol01.I00000oIO((oO1I0001000iI001lllioOl.I00iOIl << 32) | (oO1I0001000iI001lllioOl.I00iiI & 4294967295L)), IOo0oO11ll1O.I00000oIO(j));
/* 57 */                this.I00o0iI0io1.I000II((Ii1loIll001) oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI);
/* 60 */                this.I00oI0i = true;
                    }
/* 66 */            if (!o1iOIoOiO0.I00OloOo() && !this.I00oI0i) {
/* 73 */                z = false;
                    }
/* 74 */            this.I00oI0i = z;
/* 76 */            int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 78 */            int i2 = oO1I0001000iI001lllioOl.I00iiI;
/* 84 */            I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(16);
/* 87 */            i01oIoOI01l.I00iiI = o1iOIoOiO0;
/* 89 */            i01oIoOI01l.I00iiO = this;
/* 91 */            i01oIoOI01l.I00iio = oO1I0001000iI001lllioOl;
/* 93 */            VarHandle.storeStoreFence();
/* 98 */            return o1iOIoOiO0.I001i1lo1io(i, i2, Il011I1OiO0I.I00iOIl, i01oIoOI01l);
                }

                @Override
                public final void I010I0() {
/* 2 */             this.I00oI0i = false;
                }
            }
