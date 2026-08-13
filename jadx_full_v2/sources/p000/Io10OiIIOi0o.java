            package p000;

            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.RenderNode;
            
            public final class Io10OiIIOi0o {
                public final IIoll1I0 I00000oIO;
                public final IIolilIo I00000oOI;
                public final RenderNode I0000Il00O;
                public long I0000O;
                public Paint I0000oI00;
                public Matrix I0001Ioi1lo;
                public boolean I000II;
                public float I000O01llI0;
                public int I000OOo1O;
                public IOOil0 I000OiO;
                public long I000iOII;
                public float I000l1;
                public float I000lI;
                public float I000o00OoI0I;
                public float I000oI1ioi;
                public float I00100l0;
                public long I00100o1O0lo;
                public long I0010I0i;
                public float I0010o;
                public float I00111O;
                public float I001IIilI0O;
                public float I001IO000;
                public boolean I001i1O0Ol;
                public int I001i1lo1io;
                public int I001iOo1i0O;
                public int I001l0I00;
                public int I001lIiIIo1O;
                public boolean I001lllioOl;
                public boolean I001lloI;
                public int I00II0Ol1O0l;
                public int I00II0oii1o;
                public int I00IO1;

                public Io10OiIIOi0o() {
/* 3 */             IIoll1I0 iIoll1I0 = new IIoll1I0();
/* 8 */             IIolilIo iIolilIo = new IIolilIo();
/* 14 */            this.I00000oIO = iIoll1I0;
/* 16 */            this.I00000oOI = iIolilIo;
/* 22 */            RenderNode renderNode = new RenderNode("graphicsLayer");
/* 25 */            this.I0000Il00O = renderNode;
/* 29 */            this.I0000O = 0L;
/* 32 */            renderNode.setClipToBounds(false);
/* 35 */            I00000oOI(renderNode, 0);
/* 40 */            this.I000O01llI0 = 1.0f;
/* 43 */            this.I000OOo1O = 3;
/* 50 */            this.I000iOII = 9205357640488583168L;
/* 52 */            this.I000l1 = 1.0f;
/* 54 */            this.I000lI = 1.0f;
/* 56 */            long j = IOOiio0i.I00000oOI;
/* 58 */            this.I00100o1O0lo = j;
/* 60 */            this.I0010I0i = j;
/* 64 */            this.I001IO000 = 8.0f;
/* 66 */            this.I00IO1 = 0;
                }

                public final void I00000oIO() {
/* 1 */             boolean z = this.I001i1O0Ol;
/* 3 */             boolean z2 = false;
/* 13 */            boolean z3 = z && !this.I000II;
/* 14 */            if (z && this.I000II) {
/* 20 */                z2 = true;
                    }
/* 21 */            boolean z4 = this.I001lllioOl;
/* 23 */            RenderNode renderNode = this.I0000Il00O;
/* 25 */            if (z3 != z4) {
/* 27 */                this.I001lllioOl = z3;
/* 29 */                renderNode.setClipToBounds(z3);
                    }
/* 34 */            if (z2 != this.I001lloI) {
/* 36 */                this.I001lloI = z2;
/* 38 */                renderNode.setClipToOutline(z2);
                    }
                }

                public final void I00000oOI(RenderNode renderNode, int i) {
/* 2 */             if (i == 1) {
/* 6 */                 renderNode.setUseCompositingLayer(true, this.I0000oI00);
/* 9 */                 renderNode.setHasOverlappingRendering(true);
/* 12 */                return;
                    }
/* 13 */            Paint paint = this.I0000oI00;
/* 17 */            if (i == 2) {
/* 19 */                renderNode.setUseCompositingLayer(false, paint);
/* 22 */                renderNode.setHasOverlappingRendering(false);
                    } else {
/* 26 */                renderNode.setUseCompositingLayer(false, paint);
/* 29 */                renderNode.setHasOverlappingRendering(true);
                    }
                }

                public final void I0000Il00O() {
/* 1 */             int i = this.I00IO1;
/* 3 */             RenderNode renderNode = this.I0000Il00O;
/* 6 */             if (i != 1 && this.I000OOo1O == 3 && this.I000OiO == null) {
/* 19 */                I00000oOI(renderNode, i);
                    } else {
/* 23 */                I00000oOI(renderNode, 1);
                    }
                }

                public final void I0000O() {
/* 1 */             long j = this.I000iOII;
/* 8 */             long j2 = 9223372034707292159L & j;
/* 23 */            RenderNode renderNode = this.I0000Il00O;
/* 25 */            if (j2 == 9205357640488583168L) {
/* 42 */                renderNode.setPivotX((Float.intBitsToFloat((int) (this.I0000O >> 32)) / 2.0f) + this.I001i1lo1io);
/* 59 */                renderNode.setPivotY((Float.intBitsToFloat((int) (this.I0000O & 4294967295L)) / 2.0f) + this.I001iOo1i0O);
                    } else {
/* 73 */                renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.I001i1lo1io);
/* 88 */                renderNode.setPivotY(Float.intBitsToFloat((int) (this.I000iOII & 4294967295L)) + this.I001iOo1i0O);
                    }
                }

                public final void I0000oI00() {
/* 1 */             int i = this.I00II0Ol1O0l;
/* 49 */            this.I0000Il00O.setPosition(i - this.I001i1lo1io, this.I00II0oii1o - this.I001iOo1i0O, i + ((int) Float.intBitsToFloat((int) (this.I0000O >> 32))) + this.I001l0I00, this.I00II0oii1o + ((int) Float.intBitsToFloat((int) (this.I0000O & 4294967295L))) + this.I001lIiIIo1O);
                }
            }
