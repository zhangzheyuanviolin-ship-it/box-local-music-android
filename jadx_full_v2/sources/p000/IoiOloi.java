            package p000;

            import java.io.Closeable;
            import java.io.EOFException;
            import java.io.IOException;
            import java.nio.charset.Charset;
            import java.util.Calendar;
            import java.util.TimeZone;
            
            public abstract class IoiOloi implements Closeable {
                public abstract long I00000oIO();

                public abstract O1ii0l1iii I0000Il00O();

                public abstract long I000II();

                public abstract ioOiI0O0I I000O01llI0();

                public abstract long I000l1();

                public byte[] I00100l0(int i) throws IOException {
/* 1 */             byte[] bArr = new byte[i];
/* 3 */             int i2 = 0;
/* 4 */             while (i2 < i) {
/* 8 */                 int i3 = read(bArr, i2, i - i2);
/* 13 */                if (i3 == -1) {
                            break;
                        }
/* 15 */                i2 += i3;
                    }
/* 17 */            if (i2 == i) {
/* 19 */                return bArr;
                    }
/* 22 */            IioIoO10iOiI.I000OOo1O("Unexpected end of TTF stream reached");
/* 25 */            return null;
                }

                public float I001i1lo1io() {
/* 14 */            return (I00OIl() / 65536.0f) + I00IioO0OiOi();
                }

                public void I001l0I00() {
/* 1 */             long jI00IOO = I00IOO();
/* 11 */            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
/* 22 */            calendar.set(1904, 0, 1, 0, 0, 0);
/* 28 */            calendar.set(14, 0);
/* 39 */            calendar.setTimeInMillis((jI00IOO * 1000) + calendar.getTimeInMillis());
                }

                public abstract long I00IOO();

                public abstract short I00IioO0OiOi();

                public String I00Io1lO(int i, Charset charset) {
/* 7 */             return new String(I00100l0(i), charset);
                }

                public long I00IoiI() throws EOFException {
/* 1 */             long j = read();
/* 6 */             long j2 = read();
/* 11 */            long j3 = read();
/* 16 */            long j4 = read();
/* 25 */            if (j4 >= 0) {
/* 39 */                return (j << 24) + (j2 << 16) + (j3 << 8) + j4;
                    }
/* 41 */            I000II.I001i1O0Ol();
/* 44 */            return 0L;
                }

                public abstract int I00OIl();

                public int[] I00OOll1(int i) {
/* 1 */             int[] iArr = new int[i];
/* 4 */             for (int i2 = 0; i2 < i; i2++) {
/* 10 */                iArr[i2] = I00OIl();
                    }
/* 49 */            return iArr;
                }

                public abstract void I00Ol00(long j);

                public abstract IIIIlO11I0lO I00iOIl();

                public String I00iiI() throws IOException {
                    Charset charsetI00000oIO;
/* 1 */             IIIIlO11I0lO iIIIlO11I0lOI00iOIl = I00iOIl();
                    try {
/* 5 */                 O1ii0l1iii o1ii0l1iiiI0000Il00O = I0000Il00O();
/* 9 */                 if (o1ii0l1iiiI0000Il00O == null || (charsetI00000oIO = o1ii0l1iiiI0000Il00O.I00000oIO(IO1IOI.I00000oIO)) == null) {
/* 19 */                    charsetI00000oIO = IO1IOI.I00000oIO;
                        }
/* 25 */                String strI00Ol1ll1 = iIIIlO11I0lOI00iOIl.I00Ol1ll1(OollIoI001lo.I0010I0i(iIIIlO11I0lOI00iOIl, charsetI00000oIO));
/* 29 */                iIIIlO11I0lOI00iOIl.close();
/* 32 */                return strI00Ol1ll1;
                    } finally {
                    }
                }

                @Override
                public void close() {
/* 5 */             OollIoI001lo.I0000O(I00iOIl());
                }

                public abstract int read();

                public abstract int read(byte[] bArr, int i, int i2);
            }
