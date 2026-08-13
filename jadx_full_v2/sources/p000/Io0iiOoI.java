            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class Io0iiOoI extends I00IoO0 {
                public byte[] I00iOIl;
                public byte[] I00iiI;
                public byte[] I00iiO;

                @Override
                public final I00OIO1 I0000O() {
/* 4 */             I00IOO i00ioo = new I00IOO(3);
/* 9 */             byte[] bArr = this.I00iOIl;
/* 14 */            i00ioo.I0000O(new Ii0oii1lIil(bArr));
/* 19 */            if (this.I00iiI != null) {
/* 36 */                i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 0, new Ii0oii1lIil(bArr), 1));
                    }
/* 46 */            i00ioo.I0000O(new Ii0oii1lIil(this.I00iiO));
/* 52 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo, 0);
/* 56 */            ii0ol0ii01I.I00iio = -1;
/* 113 */           return ii0ol0ii01I;
                }
            }
