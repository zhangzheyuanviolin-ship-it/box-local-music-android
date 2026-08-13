            package p000;

            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.OutputStream;
            
/* 255 */   public final class i0O0oIIlI extends OutputStream {
                public i0O1ilIOoli1 I00iOIl;
                public File I00iiI;
                public i0OIi1oi0i1 I00iiO;
                public long I00iio;
                public long I00ilI0I1;
                public FileOutputStream I00ilO0;
                public i0IoI1olO1 I00io1l;

                /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void write(byte[] bArr, int i, int i2) throws IOException {
                    int i3;
                    int i4;
/* 1 */             byte[] bArr2 = bArr;
/* 2 */             i0O1ilIOoli1 i0o1iliooli1 = this.I00iOIl;
/* 4 */             i0OIi1oi0i1 i0oii1oi0i1 = this.I00iiO;
/* 6 */             int i5 = i;
/* 8 */             int i6 = i2;
/* 10 */            while (i6 > 0) {
/* 21 */                if (this.I00iio == 0 && this.I00ilI0I1 == 0) {
/* 29 */                    int iI00000oIO = i0o1iliooli1.I00000oIO(bArr, i5, i6);
/* 34 */                    if (iI00000oIO == -1) {
/* 2160 */                      return;
                            }
/* 38 */                    i5 += iI00000oIO;
/* 39 */                    i6 -= iI00000oIO;
/* 40 */                    i0IoI1olO1 i0ioi1olo1I00000oOI = i0o1iliooli1.I00000oOI();
/* 44 */                    this.I00io1l = i0ioi1olo1I00000oOI;
/* 48 */                    if (i0ioi1olo1I00000oOI.I0000oI00) {
/* 50 */                        this.I00iio = 0L;
/* 52 */                        byte[] bArr3 = i0ioi1olo1I00000oOI.I0001Ioi1lo;
/* 55 */                        i0oii1oi0i1.I000iOII(bArr3.length, bArr3);
/* 64 */                        this.I00ilI0I1 = this.I00io1l.I0001Ioi1lo.length;
                            } else if (i0ioi1olo1I00000oOI.I0000Il00O != 0) {
/* 125 */                       byte[] bArr4 = this.I00io1l.I0001Ioi1lo;
/* 128 */                       i0oii1oi0i1.I000iOII(bArr4.length, bArr4);
/* 135 */                       this.I00iio = this.I00io1l.I00000oOI;
                            } else {
/* 71 */                        String str = i0ioi1olo1I00000oOI.I00000oIO;
/* 81 */                        if (!(str == null ? false : str.endsWith("/"))) {
/* 88 */                            i0oii1oi0i1.I000OOo1O(this.I00io1l.I0001Ioi1lo);
/* 99 */                            File file = new File(this.I00iiI, this.I00io1l.I00000oIO);
/* 106 */                           file.getParentFile().mkdirs();
/* 113 */                           this.I00iio = this.I00io1l.I00000oOI;
/* 120 */                           this.I00ilO0 = new FileOutputStream(file);
                                }
                            }
                        }
/* 138 */               int iMin = i6;
/* 142 */               String str2 = this.I00io1l.I00000oIO;
/* 152 */               if (str2 == null ? false : str2.endsWith("/")) {
/* 252 */                   bArr2 = bArr;
/* 253 */                   i6 = iMin;
                        } else {
                            long j = iMin;
/* 155 */                   i0IoI1olO1 i0ioi1olo1 = this.I00io1l;
/* 159 */                   if (i0ioi1olo1.I0000oI00) {
/* 161 */                       i3 = i5;
/* 166 */                       this.I00iiO.I0000O(this.I00ilI0I1, bArr2, i3, iMin);
/* 169 */                       i4 = iMin;
                                this.I00ilI0I1 += j;
                            } else {
/* 176 */                       i3 = i5;
/* 177 */                       i4 = iMin;
/* 184 */                       boolean z = i0ioi1olo1.I0000Il00O == 0;
/* 185 */                       long j2 = this.I00iio;
/* 187 */                       if (z) {
/* 193 */                           iMin = (int) Math.min(j, j2);
/* 196 */                           this.I00ilO0.write(bArr, i3, iMin);
/* 202 */                           long j3 = this.I00iio - iMin;
/* 203 */                           this.I00iio = j3;
/* 207 */                           if (j3 == 0) {
/* 211 */                               this.I00ilO0.close();
                                    }
                                } else {
/* 219 */                           iMin = (int) Math.min(j, j2);
/* 234 */                           this.I00iiO.I0000O((r0.I0001Ioi1lo.length + this.I00io1l.I00000oOI) - this.I00iio, bArr2, i3, iMin);
                                    this.I00iio -= iMin;
                                }
                            }
/* 243 */                   i5 = i3 + iMin;
/* 245 */                   i6 = i4 - iMin;
/* 247 */                   bArr2 = bArr;
                        }
                    }
                }

                @Override
/* 256 */       public final void write(byte[] bArr) throws IOException {
/* 257 */           write(bArr, 0, bArr.length);
                }

                @Override
/* 257 */       public final void write(int i) throws IOException {
/* 258 */           write(new byte[]{(byte) i}, 0, 1);
                }
            }
