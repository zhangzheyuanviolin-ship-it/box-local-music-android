            package p000;

            import java.util.List;
            
            public final class Il1iiO implements OO1ll1 {
                public int I00iOIl;
                public OI10i0Il I00iiI;
                public int I00iiO;
                public OIooliIO0 I00iio;
                public I0l0Ii0O I00ilI0I1;
                public I0l0Ii0O I00ilO0;
                public i00I0IlOi0li I00io1l;
                public i00I0IlOi0li I00ioIO;
                public I0l0Iiil0 I00l0I0l0lO1;
                public I0l0Iiil0 I00l0OO0IO;
                public i00I0Io011I I00li1OI;
                public i00I0Io011I I00ll1;

                @Override
                public final long I00000oIO(IooO1IOlo iooO1IOlo, long j, O0iOOoiioO o0iOOoiioO, long j2) {
                    IooO1IOlo iooO1IOlo2;
                    char c;
                    long j3;
                    int iI00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00iiI;
/* 7 */             if (oI10i0Il != null) {
/* 9 */                 oI10i0Il.getValue();
                    }
/* 12 */            char c2 = ' ';
/* 17 */            long j4 = 4294967295L;
/* 32 */            long j5 = (((int) (j >> 32)) << 32) | ((((int) (j & 4294967295L)) + this.I00iOIl) & 4294967295L);
/* 45 */            int i = (int) (j5 >> 32);
/* 58 */            int i2 = 0;
/* 68 */            List listI000O01llI0 = IOOi1I.I000O01llI0(this.I00ilI0I1, this.I00ilO0, ((int) (iooO1IOlo.I00000oIO() >> 32)) < i / 2 ? this.I00io1l : this.I00ioIO);
/* 75 */            int size = listI000O01llI0.size();
/* 79 */            int i3 = 0;
                    while (true) {
/* 80 */                if (i3 >= size) {
/* 129 */                   iooO1IOlo2 = iooO1IOlo;
/* 131 */                   c = c2;
/* 133 */                   j3 = j4;
/* 135 */                   iI00000oIO = 0;
                            break;
                        }
/* 88 */                c = c2;
/* 90 */                j3 = j4;
/* 94 */                int i4 = (int) (j2 >> c);
/* 95 */                int i5 = size;
/* 96 */                int i6 = i3;
/* 98 */                iooO1IOlo2 = iooO1IOlo;
/* 100 */               List list = listI000O01llI0;
/* 104 */               iI00000oIO = ((O1l0Ii10I00l) listI000O01llI0.get(i3)).I00000oIO(iooO1IOlo2, j5, i4, o0iOOoiioO);
/* 112 */               if (i6 == IOOi1I.I000II(list) || (iI00000oIO >= 0 && i4 + iI00000oIO <= i)) {
                            break;
                        }
/* 120 */               i3 = i6 + 1;
/* 122 */               listI000O01llI0 = list;
/* 123 */               size = i5;
/* 124 */               c2 = c;
/* 126 */               j4 = j3;
                    }
/* 149 */           int i7 = (int) (j5 & j3);
/* 167 */           List listI000O01llI02 = IOOi1I.I000O01llI0(this.I00l0I0l0lO1, this.I00l0OO0IO, ((int) (iooO1IOlo2.I00000oIO() & j3)) < i7 / 2 ? this.I00li1OI : this.I00ll1);
/* 174 */           int size2 = listI000O01llI02.size();
/* 179 */           for (int i8 = 0; i8 < size2; i8++) {
/* 189 */               int i9 = (int) (j2 & j3);
/* 190 */               int iI00000oIO2 = ((O1l0O0i1IOoI) listI000O01llI02.get(i8)).I00000oIO(iooO1IOlo2, j5, i9);
/* 198 */               if (i8 == IOOi1I.I000II(listI000O01llI02)) {
/* 200 */                   int i10 = this.I00iiO;
/* 205 */                   iI00000oIO2 = lIiioliIlo.I0000Il00O(iI00000oIO2, i10, (i7 - i10) - i9);
                        }
/* 213 */               if (i8 == IOOi1I.I000II(listI000O01llI02) || (iI00000oIO2 >= 0 && i9 + iI00000oIO2 <= i7)) {
/* 224 */                   i2 = iI00000oIO2;
                            break;
                        }
                    }
/* 231 */           long j6 = (iI00000oIO << c) | (i2 & j3);
/* 246 */           this.I00iio.setValue(OoI0l01O.I00000oIO(O1ioliIli0o.I0000Il00O(iooO1IOlo2, ioooOioll1.I00000oIO(j6, j2))));
/* 1182 */          return j6;
                }
            }
