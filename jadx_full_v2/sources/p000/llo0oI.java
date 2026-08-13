            package p000;

            import java.io.FilterOutputStream;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 30 */    public final class llo0oI extends lo1liI1iiO {
                public static final int I00iiI = 0;
                public ArrayList I00iOIl;

                @Override
                public final void close() throws IOException {
/* 3 */             Iterator it = this.I00iOIl.iterator();
/* 11 */            while (it.hasNext()) {
/* 21 */                if (it.next() != null) {
/* 23 */                    OIiilo1Ool0o.I00000oIO();
/* 26 */                    return;
                        }
                        try {
/* 29 */                    throw null;
                        } catch (Throwable unused) {
                        }
                    }
/* 13 */            super.close();
                }

                @Override
                public final void write(byte[] bArr) throws IOException {
/* 3 */             ((FilterOutputStream) this).out.write(bArr);
/* 8 */             Iterator it = this.I00iOIl.iterator();
/* 16 */            if (it.hasNext()) {
/* 23 */                if (it.next() != null) {
/* 25 */                    OIiilo1Ool0o.I00000oIO();
                        } else {
/* 29 */                    int length = bArr.length;
/* 49 */                    throw null;
                        }
                    }
                }

                @Override
/* 31 */        public final void write(int i) throws IOException {
/* 32 */            ((FilterOutputStream) this).out.write(i);
/* 33 */            Iterator it = this.I00iOIl.iterator();
                    if (it.hasNext()) {
/* 35 */                throw IIlIOloOOO.I000lI(it);
                    }
                }

                @Override
/* 35 */        public final void write(byte[] bArr, int i, int i2) throws IOException {
/* 36 */            ((FilterOutputStream) this).out.write(bArr, i, i2);
/* 37 */            Iterator it = this.I00iOIl.iterator();
                    if (it.hasNext()) {
/* 39 */                throw IIlIOloOOO.I000lI(it);
                    }
                }
            }
