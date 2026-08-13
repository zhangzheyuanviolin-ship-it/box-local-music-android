            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.Collections;
            import java.util.Map;
            
            public final class OOI0oi extends Io00l0 {
                private static final OOI0oi DEFAULT_INSTANCE;
                private static volatile OO01IIl0i0oI PARSER = null;
                public static final int PREFERENCES_FIELD_NUMBER = 1;
                private O1Oi011o preferences_ = O1Oi011o.I00iiI;

                static {
/* 3 */             OOI0oi oOI0oi = new OOI0oi();
/* 6 */             DEFAULT_INSTANCE = oOI0oi;
/* 10 */            Io00l0.I000iOII(OOI0oi.class, oOI0oi);
                }

                public static OOI0l1O I000oI1ioi() {
/* 10 */            return (OOI0l1O) ((Ilooooo) DEFAULT_INSTANCE.I0000Il00O(5));
                }

                public static OOI0oi I00100l0(FileInputStream fileInputStream) {
/* 1 */             OOI0oi oOI0oi = DEFAULT_INSTANCE;
/* 5 */             IOOO0lio iOOO0lio = new IOOO0lio();
/* 11 */            iOOO0lio.I000OiO = Integer.MAX_VALUE;
/* 13 */            Charset charset = IoolIIolo1lI.I00000oIO;
/* 15 */            iOOO0lio.I0000Il00O = fileInputStream;
/* 21 */            iOOO0lio.I0000O = new byte[Barcode.FORMAT_AZTEC];
/* 24 */            iOOO0lio.I0000oI00 = 0;
/* 26 */            iOOO0lio.I000II = 0;
/* 28 */            iOOO0lio.I000OOo1O = 0;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            Il1llli0O1 il1llli0O1I00000oIO = Il1llli0O1.I00000oIO();
/* 37 */            Io00l0 io00l0I000OiO = oOI0oi.I000OiO();
                    try {
/* 41 */                OOi1oI oOi1oI = OOi1oI.I0000Il00O;
/* 43 */                oOi1oI.getClass();
/* 50 */                OiOIlIo oiOIlIoI00000oIO = oOi1oI.I00000oIO(io00l0I000OiO.getClass());
/* 58 */                oiOIlIoI00000oIO.I0000oI00(io00l0I000OiO, IOOOi1.I00000oIO(iOOO0lio), il1llli0O1I00000oIO);
/* 61 */                oiOIlIoI00000oIO.I00000oOI(io00l0I000OiO);
/* 69 */                if (Io00l0.I0001Ioi1lo(io00l0I000OiO, true)) {
/* 71 */                    return (OOI0oi) io00l0I000OiO;
                        }
/* 88 */                throw new O0011oo(new OoiIIIOlI0l().getMessage());
                    } catch (O0011oo e) {
/* 146 */               if (e.I00iOIl) {
/* 168 */                   throw new O0011oo(e.getMessage(), e);
                        }
/* 168 */               throw e;
                    } catch (OoiIIIOlI0l e2) {
/* 142 */               throw new O0011oo(e2.getMessage());
                    } catch (IOException e3) {
/* 113 */               if (e3.getCause() instanceof O0011oo) {
/* 121 */                   throw ((O0011oo) e3.getCause());
                        }
/* 131 */               throw new O0011oo(e3.getMessage(), e3);
                    } catch (RuntimeException e4) {
/* 96 */                if (e4.getCause() instanceof O0011oo) {
/* 104 */                   throw ((O0011oo) e4.getCause());
                        }
/* 105 */               throw e4;
                    }
                }

                @Override
                public final Object I0000Il00O(int i) {
                    OO01IIl0i0oI io000iO;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 75 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 68 */                    return Io00l0.I000OOo1O(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", OOI0oIi011.I00000oIO});
                        case 3:
/* 52 */                    return new OOI0oi();
                        case 4:
/* 46 */                    return new OOI0l1O(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIl0i0oI oO01IIl0i0oI = PARSER;
/* 15 */                    if (oO01IIl0i0oI != null) {
/* 38 */                        return oO01IIl0i0oI;
                            }
                            synchronized (OOI0oi.class) {
                                try {
/* 20 */                            io000iO = PARSER;
/* 22 */                            if (io000iO == null) {
/* 26 */                                io000iO = new Io000iO();
/* 29 */                                PARSER = io000iO;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                            }
/* 35 */                    return io000iO;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final Map I000lI() {
/* 3 */             return Collections.unmodifiableMap(this.preferences_);
                }

                public final O1Oi011o I000o00OoI0I() {
/* 1 */             O1Oi011o o1Oi011o = this.preferences_;
/* 5 */             if (o1Oi011o.I00iOIl) {
/* 20 */                return o1Oi011o;
                    }
/* 7 */             O1Oi011o o1Oi011oI00000oOI = o1Oi011o.I00000oOI();
/* 11 */            this.preferences_ = o1Oi011oI00000oOI;
/* 20 */            return o1Oi011oI00000oOI;
                }
            }
