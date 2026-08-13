            package p000;

            import android.util.Log;
            import java.io.Closeable;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 12 */    public class OOl1ilO extends InputStream {
                public final int I00iOIl;
                public long I00iiI;
                public final Closeable I00iiO;

                public OOl1ilO(OiOOiIO1 oiOOiIO1) {
/* 2 */             this.I00iOIl = 0;
/* 7 */             this.I00iiO = oiOOiIO1;
/* 11 */            this.I00iiI = 0L;
                }

                @Override
                public int available() throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    OiOOiIO1 oiOOiIO1 = (OiOOiIO1) this.I00iiO;
/* 17 */                    oiOOiIO1.I000l1(this.I00iiI);
/* 26 */                    long position = oiOOiIO1.I00iiO - oiOOiIO1.getPosition();
/* 32 */                    if (position > 2147483647L) {
/* 34 */                        return Integer.MAX_VALUE;
                            }
/* 38 */                    return (int) position;
                        default:
/* 6 */                     return super.available();
                    }
                }

                @Override
                public void close() throws IOException {
                    switch (this.I00iOIl) {
                        case 1:
/* 10 */                    super.close();
/* 17 */                    ((FileInputStream) this.I00iiO).close();
/* 22 */                    this.I00iiI = 0L;
                            break;
                        default:
/* 6 */                     super.close();
                            break;
                    }
                }

                @Override
                public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 1 */             int i3 = this.I00iOIl;
/* 3 */             Closeable closeable = this.I00iiO;
                    switch (i3) {
                        case 0:
/* 40 */                    OiOOiIO1 oiOOiIO1 = (OiOOiIO1) closeable;
/* 44 */                    oiOOiIO1.I000l1(this.I00iiI);
/* 51 */                    if (oiOOiIO1.I00l0OO0IO()) {
/* 5 */                         return -1;
                            }
/* 54 */                    int i4 = oiOOiIO1.read(bArr, i, i2);
/* 58 */                    long j = this.I00iiI;
/* 60 */                    if (i4 != -1) {
/* 64 */                        this.I00iiI = j + i4;
                            } else {
/* 72 */                        StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "read() returns -1, assumed position: ", ", actual position: ");
/* 80 */                        sbI001iOo1i0O.append(oiOOiIO1.getPosition());
/* 89 */                        Log.e("PdfBox-Android", sbI001iOo1i0O.toString());
                            }
/* 66 */                    return i4;
                        default:
/* 9 */                     long j2 = this.I00iiI;
/* 15 */                    if (j2 <= 0) {
/* 5 */                         return -1;
                            }
/* 26 */                    int i5 = ((FileInputStream) closeable).read(bArr, i, (int) Math.min(i2, j2));
/* 30 */                    if (i5 != -1) {
                                this.I00iiI -= i5;
                            }
/* 38 */                    return i5;
                    }
                }

                @Override
                public long skip(long j) throws IOException {
                    switch (this.I00iOIl) {
                        case 0:
/* 13 */                    OiOOiIO1 oiOOiIO1 = (OiOOiIO1) this.I00iiO;
/* 17 */                    oiOOiIO1.I000l1(this.I00iiI);
/* 23 */                    oiOOiIO1.I000l1(this.I00iiI + j);
                            this.I00iiI += j;
/* 31 */                    return j;
                        default:
/* 6 */                     return super.skip(j);
                    }
                }

/* 13 */        public OOl1ilO(FileInputStream fileInputStream, long j) {
                    this.I00iOIl = 1;
                    this.I00iiO = fileInputStream;
                    this.I00iiI = j;
                }

                @Override
/* 94 */        public final int read() throws IOException {
                    int i = this.I00iOIl;
                    Closeable closeable = this.I00iiO;
                    switch (i) {
                        case 0:
/* 96 */                    OiOOiIO1 oiOOiIO1 = (OiOOiIO1) closeable;
                            oiOOiIO1.I000l1(this.I00iiI);
/* 97 */                    if (oiOOiIO1.I00l0OO0IO()) {
                                return -1;
                            }
/* 98 */                    int i2 = oiOOiIO1.read();
/* 99 */                    long j = this.I00iiI;
                            if (i2 != -1) {
/* 100 */                       this.I00iiI = j + 1;
                            } else {
/* 102 */                       StringBuilder sbI001iOo1i0O = Oi010OO0.I001iOo1i0O(j, "read() returns -1, assumed position: ", ", actual position: ");
/* 103 */                       sbI001iOo1i0O.append(oiOOiIO1.getPosition());
/* 104 */                       Log.e("PdfBox-Android", sbI001iOo1i0O.toString());
                            }
                            return i2;
                        default:
/* 95 */                    long j2 = this.I00iiI;
                            if (j2 <= 0) {
                                return -1;
                            }
                            this.I00iiI = j2 - 1;
                            return ((FileInputStream) closeable).read();
                    }
                }
            }
