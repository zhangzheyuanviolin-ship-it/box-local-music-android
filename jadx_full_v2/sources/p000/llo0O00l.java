            package p000;

            import java.io.FilterInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            
/* 27 */    public final class llo0O00l extends OOiO0OIilloO {
                public ArrayList I00iiI;

                public static llo0O00l I0000Il00O(ArrayList arrayList, InputStream inputStream) {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 6 */             Iterator it = arrayList.iterator();
/* 14 */            if (it.hasNext()) {
/* 106 */               throw IIlIOloOOO.I000lI(it);
                    }
/* 20 */            if (arrayList2.isEmpty()) {
/* 34 */                return null;
                    }
/* 25 */            llo0O00l llo0o00l = new llo0O00l(inputStream, 1);
/* 28 */            llo0o00l.I00iiI = arrayList2;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            return llo0o00l;
                }

                @Override
                public final void close() throws IOException {
/* 3 */             Iterator it = this.I00iiI.iterator();
/* 11 */            while (it.hasNext()) {
/* 21 */                if (it.next() != null) {
/* 23 */                    OIiilo1Ool0o.I00000oIO();
/* 26 */                    return;
                        }
                        try {
/* 55 */                    throw null;
                        } catch (Throwable unused) {
                        }
                    }
/* 13 */            super.close();
                }

                @Override
                public final int read() throws IOException {
/* 3 */             int i = ((FilterInputStream) this).in.read();
/* 8 */             if (i != -1) {
/* 12 */                Iterator it = this.I00iiI.iterator();
/* 20 */                if (it.hasNext()) {
/* 27 */                    throw IIlIOloOOO.I000lI(it);
                        }
                    }
/* 55 */            return i;
                }

                @Override
/* 28 */        public final int read(byte[] bArr) throws IOException {
/* 29 */            int i = ((FilterInputStream) this).in.read(bArr);
                    if (i != -1) {
/* 30 */                Iterator it = this.I00iiI.iterator();
                        if (it.hasNext()) {
/* 32 */                    throw IIlIOloOOO.I000lI(it);
                        }
                    }
                    return i;
                }

                @Override
/* 32 */        public final int read(byte[] bArr, int i, int i2) throws IOException {
/* 33 */            int i3 = ((FilterInputStream) this).in.read(bArr, i, i2);
                    if (i3 != -1) {
/* 34 */                Iterator it = this.I00iiI.iterator();
                        if (it.hasNext()) {
/* 36 */                    throw IIlIOloOOO.I000lI(it);
                        }
                    }
                    return i3;
                }
            }
