            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            
            public final class iiilO1lo extends ii0OoOo10 {
                private static final iiilO1lo zzb;
                private int zzd;
                private ii10lIloOOii zze;

                static {
/* 3 */             iiilO1lo iiilo1lo = new iiilO1lo();
/* 6 */             zzb = iiilo1lo;
/* 10 */            ii0OoOo10.I000lI(iiilO1lo.class, iiilo1lo);
                }

                public static iiilO1lo I001IIilI0O(InputStream inputStream, ii0II11oi0I ii0ii11oi0i) throws ii0iI11ol {
                    IOOOI0 ioooi0I00IoiI;
/* 1 */             iiilO1lo iiilo1lo = zzb;
/* 4 */             if (inputStream == null) {
/* 6 */                 byte[] bArr = ii0i1ll10I0.I00000oOI;
/* 8 */                 int length = bArr.length;
/* 9 */                 ioooi0I00IoiI = IOOOI0.I00IoiI(0, bArr);
                    } else {
/* 16 */                ii01o0lo ii01o0loVar = new ii01o0lo();
/* 22 */                ii01o0loVar.I000OiO = Integer.MAX_VALUE;
/* 24 */                Charset charset = ii0i1ll10I0.I00000oIO;
/* 26 */                ii01o0loVar.I0000Il00O = inputStream;
/* 32 */                ii01o0loVar.I0000O = new byte[Barcode.FORMAT_AZTEC];
/* 34 */                ii01o0loVar.I0000oI00 = 0;
/* 36 */                ii01o0loVar.I000II = 0;
/* 38 */                ii01o0loVar.I000OOo1O = 0;
/* 40 */                VarHandle.storeStoreFence();
/* 43 */                ioooi0I00IoiI = ii01o0loVar;
                    }
/* 44 */            ii0OoOo10 ii0oooo10I000II = iiilo1lo.I000II();
                    try {
/* 55 */                ii0oioOi00i ii0oiooi00iI00000oIO = ii0oIOiIl.I0000Il00O.I00000oIO(ii0oooo10I000II.getClass());
/* 61 */                IOOOi1 iOOOi1 = (IOOOi1) ioooi0I00IoiI.I00000oOI;
/* 63 */                if (iOOOi1 == null) {
/* 69 */                    iOOOi1 = new IOOOi1(7);
/* 72 */                    iOOOi1.I0000O = 0;
/* 74 */                    iOOOi1.I0000oI00 = ioooi0I00IoiI;
/* 76 */                    ioooi0I00IoiI.I00000oOI = iOOOi1;
/* 78 */                    VarHandle.storeStoreFence();
                        }
/* 81 */                ii0oiooi00iI00000oIO.I000O01llI0(ii0oooo10I000II, iOOOi1, ii0ii11oi0i);
/* 84 */                ii0oiooi00iI00000oIO.I00000oIO(ii0oooo10I000II);
/* 92 */                if (ii0OoOo10.I000oI1ioi(ii0oooo10I000II, true)) {
/* 94 */                    return (iiilO1lo) ii0oooo10I000II;
                        }
/* 106 */               OoOil11Ol1o.I001iOo1i0O(new ii10Il0l().getMessage());
/* 48 */                return null;
                    } catch (ii0iI11ol e) {
/* 166 */               if (e.I00iOIl) {
/* 177 */                   throw new ii0iI11ol(e.getMessage(), e);
                        }
/* 332 */               throw e;
                    } catch (ii10Il0l e2) {
/* 159 */               OoOil11Ol1o.I001iOo1i0O(e2.getMessage());
/* 48 */                return null;
                    } catch (IOException e3) {
/* 136 */               if (e3.getCause() instanceof ii0iI11ol) {
/* 144 */                   throw ((ii0iI11ol) e3.getCause());
                        }
/* 154 */               throw new ii0iI11ol(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 119 */               if (e4.getCause() instanceof ii0iI11ol) {
/* 127 */                   throw ((ii0iI11ol) e4.getCause());
                        }
/* 128 */               throw e4;
                    }
                }

                @Override
                public final Object I0010I0i(int i, ii0OoOo10 ii0oooo10) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 55 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 50 */                return new ii0oOi0(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new iiilO1lo();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new iiilIIOoI1i(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final ii10lIloOOii I00111O() {
/* 1 */             ii10lIloOOii ii10liloooii = this.zze;
                    return ii10liloooii == null ? ii10lIloOOii.I00111O() : ii10liloooii;
                }
            }
