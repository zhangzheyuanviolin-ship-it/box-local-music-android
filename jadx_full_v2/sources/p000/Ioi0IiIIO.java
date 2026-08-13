            package p000;

            import android.graphics.Matrix;
            import android.graphics.Rect;
            
            public final class Ioi0IiIIO implements Runnable {
                public Ioi0O0l1Ol I00iOIl;
                public IoiO1IO1I1i I00iiI;
                public Matrix I00iiO;
                public IoiO1IO1I1i I00iio;
                public Rect I00ilI0I1;
                public IoOoo0ll I00ilO0;
                public IIiOOI I00io1l;

                @Override
                public final void run() {
/* 1 */             Ioi0O0l1Ol ioi0O0l1Ol = this.I00iOIl;
/* 3 */             IoiO1IO1I1i ioiO1IO1I1i = this.I00iiI;
/* 5 */             Matrix matrix = this.I00iiO;
/* 7 */             IoiO1IO1I1i ioiO1IO1I1i2 = this.I00iio;
/* 9 */             Rect rect = this.I00ilI0I1;
/* 11 */            IoOoo0ll ioOoo0ll = this.I00ilO0;
/* 13 */            IIiOOI iIiOOI = this.I00io1l;
/* 17 */            if (!ioi0O0l1Ol.I00oO101o) {
/* 86 */                iIiOOI.I0000O(new OIiOolI10lO0("ImageAnalysis is detached"));
/* 110 */               return;
                    }
/* 60 */            Oio0oi11l oio0oi11l = new Oio0oi11l(ioiO1IO1I1i2, null, I1l0l0.I0001Ioi1lo(ioiO1IO1I1i.I00i0oil().I00000oOI(), ioiO1IO1I1i.I00i0oil().I0000oI00(), ioi0O0l1Ol.I00ilI0I1 ? 0 : ioi0O0l1Ol.I00iiI, matrix, ioiO1IO1I1i.I00i0oil().I0000O()));
/* 67 */            if (!rect.isEmpty()) {
/* 69 */                oio0oi11l.I0000Il00O(rect);
                    }
/* 72 */            ioOoo0ll.I00000oIO(oio0oi11l);
/* 75 */            iIiOOI.I00000oOI(null);
                }
            }
