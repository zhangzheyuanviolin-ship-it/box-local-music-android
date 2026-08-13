            package p000;

            import android.os.Trace;
            
            public final class I1olil1illO implements Runnable {
                public Oo0lloOiiIOI I00iOIl;
                public O0iOOoiioO I00iiI;
                public String I00iiO;
                public IiIooOOOI I00iio;
                public IliO0o11i01 I00ilI0I1;
                public boolean I00ilO0;

                @Override
                public final void run() {
                    OI10OloOOoi oI10OloOOoiI001lloI;
/* 1 */             Oo0lloOiiIOI oo0lloOiiIOI = this.I00iOIl;
/* 3 */             O0iOOoiioO o0iOOoiioO = this.I00iiI;
/* 5 */             String str = this.I00iiO;
/* 7 */             IiIooOOOI iiIooOOOI = this.I00iio;
/* 9 */             IliO0o11i01 iliO0o11i01 = this.I00ilI0I1;
/* 11 */            boolean z = this.I00ilO0;
/* 15 */            Trace.beginSection("BackgroundTextMeasurement");
                    try {
/* 18 */                Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 30 */                OI10OloOOoi oI10OloOOoi = ol1il1o1I000O01llI0 instanceof OI10OloOOoi ? (OI10OloOOoi) ol1il1o1I000O01llI0 : null;
/* 31 */                if (oI10OloOOoi == null || (oI10OloOOoiI001lloI = oI10OloOOoi.I001lloI(null, null)) == null) {
/* 100 */                   throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                        }
                        try {
/* 39 */                    Ol1il1o1 ol1il1o1I000OiO = oI10OloOOoiI001lloI.I000OiO();
                            try {
/* 43 */                        Oo0lloOiiIOI oo0lloOiiIOII00000oIO = lOlilIi0I.I00000oIO(oo0lloOiiIOI, o0iOOoiioO);
/* 47 */                        Il01100l il01100l = Il01100l.I00iOIl;
/* 50 */                        I0ol0iioI i0ol0iioII00000oIO = l1o1o11OIIOo.I00000oIO(str, oo0lloOiiIOII00000oIO, il01100l, iiIooOOOI, iliO0o11i01, il01100l, z);
/* 54 */                        i0ol0iioII00000oIO.I000l1();
/* 57 */                        i0ol0iioII00000oIO.I000II();
/* 67 */                        oI10OloOOoiI001lloI.I001i1O0Ol().I00000oIO();
/* 73 */                        Trace.endSection();
                            } finally {
/* 80 */                        Ol1il1o1.I00100o1O0lo(ol1il1o1I000OiO);
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
/* 101 */               Trace.endSection();
/* 110 */               throw th;
                    }
                }
            }
