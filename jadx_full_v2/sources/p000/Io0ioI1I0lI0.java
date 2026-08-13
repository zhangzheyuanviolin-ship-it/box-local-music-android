            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Io0ioI1I0lI0 extends I00IoO0 {
                public I00O0i0ii I00iOIl;
                public OliI1l0l I00iiI;
                public byte[] I00iiO;

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(3);
/* 9 */             i00ioo.I0000O(this.I00iOIl);
/* 12 */            OliI1l0l oliI1l0l = this.I00iiI;
/* 14 */            if (oliI1l0l != null) {
/* 26 */                i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 0, oliI1l0l, 1));
                    }
/* 36 */            i00ioo.I0000O(new Ii0oii1lIil(this.I00iiO));
/* 42 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 46 */            ii0ol0ii01I.I00iio = -1;
/* 113 */           return ii0ol0ii01I;
                }
            }
