            package p000;

            import android.graphics.Paint;
            import android.graphics.Shader;
            
            public abstract class OioIoiOi extends III11l1I {
                public IIloOI I00000oIO;
                public long I00000oOI = 9205357640488583168L;

                @Override
                public final void I00000oIO(float f, long j, I0oiil10Ili i0oiil10Ili) {
/* 3 */             Paint paint = (Paint) i0oiil10Ili.I00iiO;
/* 5 */             IIloOI iIloOI = this.I00000oIO;
/* 8 */             if (iIloOI == null || !Ol0i1I.I00000oOI(this.I00000oOI, j)) {
/* 22 */                if (Ol0i1I.I0001Ioi1lo(j)) {
/* 24 */                    this.I00000oIO = null;
/* 31 */                    this.I00000oOI = 9205357640488583168L;
/* 33 */                    iIloOI = null;
                        } else {
/* 35 */                    iIloOI = this.I00000oIO;
/* 37 */                    if (iIloOI == null) {
/* 43 */                        iIloOI = new IIloOI(27);
/* 46 */                        this.I00000oIO = iIloOI;
                            }
/* 52 */                    iIloOI.I00iiI = I0000Il00O(j);
/* 54 */                    this.I00000oIO = iIloOI;
/* 56 */                    this.I00000oOI = j;
                        }
                    }
/* 60 */            long jI00000oIO = i01l0lil1O0.I00000oIO.I00000oIO(paint);
/* 64 */            long j2 = IOOiio0i.I00000oOI;
/* 70 */            if (!Ooi0i1.I00000oOI(jI00000oIO, j2)) {
/* 72 */                i0oiil10Ili.I0010o(j2);
                    }
/* 91 */            if (!O0000Ioio00.I0000O((Shader) i0oiil10Ili.I00iio, iIloOI != null ? (Shader) iIloOI.I00iiI : null)) {
/* 100 */               i0oiil10Ili.I001i1O0Ol(iIloOI != null ? (Shader) iIloOI.I00iiI : null);
                    }
/* 113 */           if (paint.getAlpha() / 255.0f == f) {
/* 115 */               return;
                    }
/* 116 */           i0oiil10Ili.I00100l0(f);
                }

                public abstract Shader I0000Il00O(long j);
            }
