            package p000;

            import java.io.OutputStream;
            
/* 27 */    public final class ill0OO1 extends OutputStream {
                public final int I00iOIl;

                public final String toString() {
                    switch (this.I00iOIl) {
                    }
/* 6 */             return "ByteStreams.nullOutputStream()";
                }

                @Override
                public final void write(byte[] bArr, int i, int i2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    bArr.getClass();
/* 18 */                    int i3 = i2 + i;
/* 19 */                    int length = bArr.length;
/* 20 */                    if (i < 0 || i3 < i || i3 > length) {
/* 74 */                        throw new IndexOutOfBoundsException((i < 0 || i > length) ? lil0lI0lI1.I00000oOI(i, length, "start index") : (i3 < 0 || i3 > length) ? lil0lI0lI1.I00000oOI(i3, length, "end index") : lili0Oooiil.I00000oIO("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i)));
                            }
/* 27 */                    return;
                        default:
/* 6 */                     bArr.getClass();
/* 11 */                    ll0OlOllOl.I0000oI00(i, i2 + i, bArr.length);
/* 14 */                    return;
                    }
                }

/* 28 */        private final void I00000oIO(int i) {
                }

/* 28 */        private final void I0000Il00O(int i) {
                }

                @Override
/* 74 */        public final void write(byte[] bArr) {
                    switch (this.I00iOIl) {
                        case 0:
/* 76 */                    bArr.getClass();
                            break;
                        default:
/* 75 */                    bArr.getClass();
                            break;
                    }
                }

                @Override
/* 76 */        public final void write(int i) {
/* 77 */            int i2 = this.I00iOIl;
                }
            }
