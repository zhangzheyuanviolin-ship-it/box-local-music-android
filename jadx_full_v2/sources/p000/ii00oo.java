            package p000;

            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.logging.Logger;
            
            public abstract class ii00oo {
                protected int zza;

                /* JADX WARN: Multi-variable type inference failed */
                public static void I00000oOI(Iterable iterable, ii0i1l11 ii0i1l11Var) {
/* 1 */             Charset charset = ii0i1ll10I0.I00000oIO;
/* 3 */             iterable.getClass();
/* 8 */             if (iterable instanceof ii0ioio1) {
/* 12 */                List listZza = ((ii0ioio1) iterable).zza();
/* 16 */                IIlIOloOOO.I001i1lo1io(ii0i1l11Var);
/* 19 */                ii0i1l11Var.size();
/* 22 */                Iterator it = listZza.iterator();
/* 30 */                if (it.hasNext()) {
/* 32 */                    Object next = it.next();
/* 36 */                    next.getClass();
/* 42 */                    if (next instanceof ii01lO0l11ii) {
/* 59 */                        throw null;
                            }
/* 46 */                    if (!(next instanceof byte[])) {
/* 58 */                        throw null;
                            }
/* 48 */                    byte[] bArr = (byte[]) next;
/* 52 */                    ii01lO0l11ii.I0010o(bArr, 0, bArr.length);
/* 55 */                    throw null;
                        }
/* 139 */               return;
                    }
/* 62 */            if (iterable instanceof ii0oII1lo) {
/* 142 */               ii0i1l11Var.addAll((Collection) iterable);
/* 332 */               return;
                    }
/* 66 */            if (ii0i1l11Var instanceof ArrayList) {
/* 83 */                ((ArrayList) ii0i1l11Var).ensureCapacity(((Collection) iterable).size() + ii0i1l11Var.size());
                    }
/* 86 */            int size = ii0i1l11Var.size();
/* 98 */            for (Object obj : iterable) {
/* 104 */               if (obj == null) {
/* 115 */                   String strI00100l0 = IIlIOloOOO.I00100l0("Element at index ", ii0i1l11Var.size() - size, " is null.");
/* 119 */                   int size2 = ii0i1l11Var.size();
                            while (true) {
                                size2--;
/* 125 */                       if (size2 < size) {
/* 131 */                           IOOlIIilOl0.I000II(strI00100l0);
/* 134 */                           return;
                                }
/* 127 */                       ii0i1l11Var.remove(size2);
                            }
                        } else {
/* 135 */                   ii0i1l11Var.add(obj);
                        }
                    }
                }

                public abstract int I00000oIO(ii0oioOi00i ii0oiooi00i);

                public final void I0000Il00O(FileOutputStream fileOutputStream) {
/* 1 */             ii0OoOo10 ii0oooo10 = (ii0OoOo10) this;
/* 3 */             int iI0010o = ii0oooo10.I0010o();
/* 7 */             Logger logger = ii0I1Il.I00000oOI;
/* 11 */            if (iI0010o > 4096) {
/* 13 */                iI0010o = 4096;
                    }
/* 16 */            ii0I0oioo1 ii0i0oioo1 = new ii0I0oioo1();
/* 19 */            if (iI0010o < 0) {
/* 51 */                I000II.I000iOII("bufferSize must be >= 0");
/* 77 */                return;
                    }
/* 23 */            int iMax = Math.max(iI0010o, 20);
/* 29 */            ii0i0oioo1.I0000O = new byte[iMax];
/* 31 */            ii0i0oioo1.I0000oI00 = iMax;
/* 33 */            ii0i0oioo1.I000II = fileOutputStream;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            ii0oooo10.I00100o1O0lo(ii0i0oioo1);
/* 43 */            if (ii0i0oioo1.I0001Ioi1lo > 0) {
/* 45 */                ii0i0oioo1.I001lloI();
                    }
                }

                public final byte[] I0000O() {
                    try {
/* 2 */                 ii0OoOo10 ii0oooo10 = (ii0OoOo10) this;
/* 4 */                 int iI0010o = ii0oooo10.I0010o();
/* 8 */                 byte[] bArr = new byte[iI0010o];
/* 12 */                ii01oiO ii01oio = new ii01oiO(iI0010o, bArr);
/* 15 */                ii0oooo10.I00100o1O0lo(ii01oio);
/* 22 */                if (ii01oio.I001lllioOl() == 0) {
/* 24 */                    return bArr;
                        }
/* 32 */                throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
/* 50 */                OIiilo1Ool0o.I000iOII(IlIi0I0.I000lI("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 53 */                return null;
                    }
                }
            }
