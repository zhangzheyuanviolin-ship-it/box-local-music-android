            package p000;

            import java.util.Arrays;
            
            public final class O1Ii0OO implements IiIooOOOI {
                public boolean I00iOIl;
                public long I00iiI = 9223372034707292159L;
                public long I00iiO = 0;
                public final O1IiO0l I00iio;

                public O1Ii0OO(O1IiO0l o1IiO0l) {
/* 4 */             this.I00iio = o1IiO0l;
                }

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iio.I00000oIO();
                }

                public final O0iOOo0Ii I00000oOI() {
/* 2 */             this.I00iOIl = true;
/* 4 */             O1IiO0l o1IiO0l = this.I00iio;
/* 6 */             O0iOOo0Ii o0iOOo0IiI00oIiI10 = o1IiO0l.I00oIiI10();
/* 21 */            if (IooO0O.I0000Il00O(this.I00iiI, 9223372034707292159L)) {
/* 33 */                this.I00iiI = ioolillioIIO.I00000oOI(o0iOOo0IiI00oIiI10.I001l0I00(0L));
/* 39 */                this.I00iiO = o0iOOo0IiI00oIiI10.I000iOII();
                    }
/* 47 */            o1IiO0l.I00olI().I010I0.I00000oOI();
/* 55 */            return o0iOOo0IiI00oIiI10;
                }

                public final void I0000Il00O(IoI1O1i1 ioI1O1i1, float f) {
/* 1 */             O1IiO0l o1IiO0l = this.I00iio;
/* 3 */             I11l01l i11l01l = o1IiO0l.I00o101lO;
/* 5 */             if (i11l01l == null) {
/* 9 */                 i11l01l = new I11l01l();
/* 12 */                o1IiO0l.I00o101lO = i11l01l;
                    }
/* 18 */            int iI001l0I00 = I1IoiO1l.I001l0I00((IoI1O1i1[]) i11l01l.I0000Il00O, ioI1O1i1);
/* 23 */            if (iI001l0I00 >= 0) {
/* 91 */                float[] fArr = (float[]) i11l01l.I0000O;
/* 97 */                if (fArr[iI001l0I00] != f) {
/* 112 */                   fArr[iI001l0I00] = f;
/* 118 */                   ((byte[]) i11l01l.I0000oI00)[iI001l0I00] = 1;
/* 332 */                   return;
                        } else {
/* 101 */                   byte[] bArr = (byte[]) i11l01l.I0000oI00;
/* 106 */                   if (bArr[iI001l0I00] == 2) {
/* 109 */                       bArr[iI001l0I00] = 0;
/* 111 */                       return;
                            }
/* 111 */                   return;
                        }
                    }
/* 25 */            int i = i11l01l.I00000oOI;
/* 29 */            IoI1O1i1[] ioI1O1i1Arr = (IoI1O1i1[]) i11l01l.I0000Il00O;
/* 32 */            if (i == ioI1O1i1Arr.length) {
/* 34 */                int i2 = i * 2;
/* 42 */                i11l01l.I0000Il00O = (IoI1O1i1[]) Arrays.copyOf(ioI1O1i1Arr, i2);
/* 52 */                i11l01l.I0000O = Arrays.copyOf((float[]) i11l01l.I0000O, i2);
/* 62 */                i11l01l.I0000oI00 = Arrays.copyOf((byte[]) i11l01l.I0000oI00, i2);
                    }
/* 68 */            ((IoI1O1i1[]) i11l01l.I0000Il00O)[i] = ioI1O1i1;
/* 75 */            ((byte[]) i11l01l.I0000oI00)[i] = 3;
/* 81 */            ((float[]) i11l01l.I0000O)[i] = f;
                    i11l01l.I00000oOI++;
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iio.I00Ol00();
                }
            }
