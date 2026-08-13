            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class OlliI1olI extends I00IoO0 {
                public I00OOll1 I00iOIl;
                public I00IoIO0lI I00iiI;
                public I00IoIO0lI I00iiO;
                public I0ioOiiIO0 I00iio;
                public i01lOO0li I00ilI0I1;
                public Oo110i I00ilO0;
                public Oo110i I00io1l;
                public i01lOO0li I00ioIO;
                public OliI1l0l I00l0I0l0lO1;
                public Ii0o0iiI I00l0OO0IO;
                public Ii0o0iiI I00li1OI;
                public Il1oi01OOI1 I00ll1;

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final I00OIO1 I0000O() {
/* 1 */             I00IoIO0lI i00IoIO0lI = this.I00iiI;
/* 3 */             I00OOll1 i00OOll1 = this.I00iOIl;
/* 11 */            if (OOOIo1ioIi01.I00000oIO("org.bouncycastle.x509.allow_non-der_tbscert") == null || OOOIo1ioIi01.I00000oOI("org.bouncycastle.x509.allow_non-der_tbscert")) {
/* 541 */               return i00OOll1;
                    }
/* 23 */            int i = 0;
/* 24 */            I00IOO i00ioo = new I00IOO(0, false);
/* 33 */            if (!i00IoIO0lI.I001iOo1i0O(0)) {
/* 40 */                i00ioo.I0000O(new I1lliI1o0l(true, 0, i00IoIO0lI, 1));
                    }
/* 45 */            i00ioo.I0000O(this.I00iiO);
/* 50 */            i00ioo.I0000O(this.I00iio);
/* 55 */            i00ioo.I0000O(this.I00ilI0I1);
/* 61 */            I00IOO i00ioo2 = new I00IOO(2);
/* 66 */            i00ioo2.I0000O(this.I00ilO0);
/* 71 */            i00ioo2.I0000O(this.I00io1l);
/* 76 */            Ii0ol0ii01I ii0ol0ii01I = new Ii0ol0ii01I(i00ioo2, i);
/* 80 */            ii0ol0ii01I.I00iio = -1;
/* 82 */            i00ioo.I0000O(ii0ol0ii01I);
/* 85 */            i01lOO0li i01loo0li = this.I00ioIO;
                    i01lOO0li i01loo0li2 = i01loo0li;
/* 87 */            if (i01loo0li == null) {
/* 95 */                Ii0ol0ii01I ii0ol0ii01I2 = new Ii0ol0ii01I(i);
/* 98 */                ii0ol0ii01I2.I00iio = -1;
                        i01loo0li2 = ii0ol0ii01I2;
                    }
/* 89 */            i00ioo.I0000O(i01loo0li2);
/* 103 */           i00ioo.I0000O(this.I00l0I0l0lO1);
/* 106 */           Ii0o0iiI ii0o0iiI = this.I00l0OO0IO;
/* 110 */           if (ii0o0iiI != null) {
/* 118 */               i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 1, ii0o0iiI, 1));
                    }
/* 121 */           Ii0o0iiI ii0o0iiI2 = this.I00li1OI;
/* 123 */           if (ii0o0iiI2 != null) {
/* 134 */               i00ioo.I0000O(new I1lliI1o0l(2, Barcode.FORMAT_ITF, 2, ii0o0iiI2, 1));
                    }
/* 137 */           Il1oi01OOI1 il1oi01OOI1 = this.I00ll1;
/* 139 */           if (il1oi01OOI1 != null) {
/* 147 */               i00ioo.I0000O(new I1lliI1o0l(true, 3, il1oi01OOI1, 1));
                    }
/* 152 */           Ii0ol0ii01I ii0ol0ii01I3 = new Ii0ol0ii01I(i00ioo, i);
/* 155 */           ii0ol0ii01I3.I00iio = -1;
/* 157 */           return ii0ol0ii01I3;
                }
            }
