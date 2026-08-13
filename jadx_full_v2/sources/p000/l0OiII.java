            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            
            public final class l0OiII extends ilOl10 {
                private static final l0OiII zzb;
                private iliiiioo zzd = ioIioOi0IOI.I00iio;

                static {
/* 3 */             l0OiII l0oiii = new l0OiII();
/* 6 */             zzb = l0oiii;
/* 10 */            ilOl10.I000OOo1O(l0OiII.class, l0oiii);
                }

                public static l0OiII I000oI1ioi() {
/* 1 */             return zzb;
                }

                public static l0OiII I00100l0(InputStream inputStream, ilI1iIO0oiIo ili1iio0oiio) throws ill0ll01OOOO {
                    IOOOI0 ioooi0I00Iooi00oi;
/* 1 */             l0OiII l0oiii = zzb;
/* 3 */             if (inputStream == null) {
/* 5 */                 byte[] bArr = ililOO0.I00000oOI;
/* 7 */                 int length = bArr.length;
/* 8 */                 ioooi0I00Iooi00oi = IOOOI0.I00Iooi00oi(bArr);
                    } else {
/* 15 */                il0ll0lO il0ll0lo = new il0ll0lO();
/* 21 */                il0ll0lo.I000OiO = Integer.MAX_VALUE;
/* 23 */                Charset charset = ililOO0.I00000oIO;
/* 25 */                il0ll0lo.I0000Il00O = inputStream;
/* 31 */                il0ll0lo.I0000O = new byte[Barcode.FORMAT_AZTEC];
/* 34 */                il0ll0lo.I0000oI00 = 0;
/* 36 */                il0ll0lo.I000II = 0;
/* 38 */                il0ll0lo.I000OOo1O = 0;
/* 40 */                VarHandle.storeStoreFence();
/* 43 */                ioooi0I00Iooi00oi = il0ll0lo;
                    }
/* 44 */            ilOl10 ilol10I0000oI00 = l0oiii.I0000oI00();
                    try {
/* 54 */                ioO0I1oi1lio ioo0i1oi1lioI00000oIO = ioIOiiiiO0.I0000Il00O.I00000oIO(ilol10I0000oI00.getClass());
/* 62 */                ioo0i1oi1lioI00000oIO.I0000oI00(ilol10I0000oI00, IOOOi1.I01O1lIi(ioooi0I00Iooi00oi), ili1iio0oiio);
/* 65 */                ioo0i1oi1lioI00000oIO.I00000oIO(ilol10I0000oI00);
/* 72 */                if (ilol10I0000oI00.I000iOII()) {
/* 74 */                    return (l0OiII) ilol10I0000oI00;
                        }
/* 91 */                throw new ill0ll01OOOO(new ioo01i().getMessage());
                    } catch (ill0ll01OOOO e) {
/* 149 */               if (e.I00iOIl) {
/* 332 */                   throw new ill0ll01OOOO(e.getMessage(), e);
                        }
/* 332 */               throw e;
                    } catch (ioo01i e2) {
/* 145 */               throw new ill0ll01OOOO(e2.getMessage());
                    } catch (IOException e3) {
/* 116 */               if (e3.getCause() instanceof ill0ll01OOOO) {
/* 124 */                   throw ((ill0ll01OOOO) e3.getCause());
                        }
/* 134 */               throw new ill0ll01OOOO(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 99 */                if (e4.getCause() instanceof ill0ll01OOOO) {
/* 107 */                   throw ((ill0ll01OOOO) e4.getCause());
                        }
/* 108 */               throw e4;
                    }
                }

                @Override
                public final Object I000lI(int i) {
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 54 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 48 */                return ilOl10.I000II(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", l0i0OIlo11I0.class});
                    }
/* 9 */             if (i2 == 3) {
/* 32 */                return new l0OiII();
                    }
/* 12 */            if (i2 == 4) {
/* 26 */                return new l01oll(zzb);
                    }
/* 15 */            if (i2 != 5) {
/* 17 */                return null;
                    }
/* 19 */            return zzb;
                }

                public final iliiiioo I00100o1O0lo() {
/* 1 */             return this.zzd;
                }
            }
