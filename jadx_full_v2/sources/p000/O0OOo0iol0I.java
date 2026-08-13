            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.util.List;
            
            public final class O0OOo0iol0I extends Io00Io0IO11 {
                private static final O0OOo0iol0I DEFAULT_INSTANCE;
                public static final int KEY_FIELD_NUMBER = 2;
                private static volatile OO01I1 PARSER = null;
                public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
                private Iool0o0iOI key_ = OOiI00liIO.I00iio;
                private int primaryKeyId_;

                static {
/* 3 */             O0OOo0iol0I o0OOo0iol0I = new O0OOo0iol0I();
/* 6 */             DEFAULT_INSTANCE = o0OOo0iol0I;
/* 10 */            Io00Io0IO11.I001IO000(O0OOo0iol0I.class, o0OOo0iol0I);
                }

                public static O0OO1oo I00II0Ol1O0l() {
/* 7 */             return (O0OO1oo) DEFAULT_INSTANCE.I000O01llI0();
                }

                public static O0OOo0iol0I I00II0oii1o(ByteArrayInputStream byteArrayInputStream, Il1llO11O il1llO11O) {
/* 7 */             return (O0OOo0iol0I) Io00Io0IO11.I00111O(DEFAULT_INSTANCE, byteArrayInputStream, il1llO11O);
                }

                public static O0OOo0iol0I I00IO1(byte[] bArr, Il1llO11O il1llO11O) {
/* 1 */             O0OOo0iol0I o0OOo0iol0I = DEFAULT_INSTANCE;
/* 3 */             int length = bArr.length;
/* 4 */             Io00Io0IO11 io00Io0IO11I0010I0i = o0OOo0iol0I.I0010I0i();
                    try {
/* 8 */                 OOi1lIO1Oi oOi1lIO1Oi = OOi1lIO1Oi.I0000Il00O;
/* 10 */                oOi1lIO1Oi.getClass();
/* 17 */                OiOIiIO0 oiOIiIO0I00000oIO = oOi1lIO1Oi.I00000oIO(io00Io0IO11I0010I0i.getClass());
/* 23 */                I1Il011OO i1Il011OO = new I1Il011OO();
/* 26 */                il1llO11O.getClass();
/* 31 */                oiOIiIO0I00000oIO.I000OOo1O(io00Io0IO11I0010I0i, bArr, 0, length, i1Il011OO);
/* 34 */                oiOIiIO0I00000oIO.I00000oOI(io00Io0IO11I0010I0i);
/* 37 */                Io00Io0IO11.I000II(io00Io0IO11I0010I0i);
/* 40 */                return (O0OOo0iol0I) io00Io0IO11I0010I0i;
                    } catch (O000oiiiOI0 e) {
/* 91 */                if (e.I00iOIl) {
/* 551 */                   throw new O000oiiiOI0(e.getMessage(), e);
                        }
/* 551 */               throw e;
                    } catch (OoiI1iioio1 e2) {
/* 86 */                throw new O000oiiiOI0(e2.getMessage());
                    } catch (IOException e3) {
/* 56 */                if (e3.getCause() instanceof O000oiiiOI0) {
/* 64 */                    throw ((O000oiiiOI0) e3.getCause());
                        }
/* 74 */                throw new O000oiiiOI0(e3.getMessage(), e3);
                    } catch (IndexOutOfBoundsException unused) {
/* 47 */                throw O000oiiiOI0.I000II();
                    }
                }

                @Override
                public final Object I000OOo1O(int i) {
                    OO01I1 io000II1liI;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 77 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 70 */                    return Io00Io0IO11.I00100o1O0lo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", O0OOlOII0l0.class});
                        case 3:
/* 52 */                    return new O0OOo0iol0I();
                        case 4:
/* 46 */                    return new O0OO1oo(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01I1 oo01i1 = PARSER;
/* 15 */                    if (oo01i1 != null) {
/* 38 */                        return oo01i1;
                            }
                            synchronized (O0OOo0iol0I.class) {
                                try {
/* 20 */                            io000II1liI = PARSER;
/* 22 */                            if (io000II1liI == null) {
/* 26 */                                io000II1liI = new Io000II1liI();
/* 29 */                                PARSER = io000II1liI;
                                    }
                                } catch (Throwable th) {
/* 37 */                            throw th;
                                }
                            }
/* 35 */                    return io000II1liI;
                        default:
/* 9 */                     OIiilo1Ool0o.I000lI();
/* 5 */                     return null;
                    }
                }

                public final void I001iOo1i0O(O0OOlOII0l0 o0OOlOII0l0) {
/* 1 */             Iool0o0iOI iool0o0iOII000O01llI0 = this.key_;
/* 8 */             if (!((I01Iol) iool0o0iOII000O01llI0).I00iOIl) {
/* 10 */                int size = iool0o0iOII000O01llI0.size();
/* 21 */                iool0o0iOII000O01llI0 = iool0o0iOII000O01llI0.I000O01llI0(size == 0 ? 10 : size * 2);
/* 25 */                this.key_ = iool0o0iOII000O01llI0;
                    }
/* 27 */            iool0o0iOII000O01llI0.add(o0OOlOII0l0);
                }

                public final O0OOlOII0l0 I001l0I00(int i) {
/* 7 */             return (O0OOlOII0l0) this.key_.get(i);
                }

                public final int I001lIiIIo1O() {
/* 3 */             return this.key_.size();
                }

                public final List I001lllioOl() {
/* 1 */             return this.key_;
                }

                public final int I001lloI() {
/* 1 */             return this.primaryKeyId_;
                }

                public final void I00IO1oi11O(int i) {
/* 1 */             this.primaryKeyId_ = i;
                }
            }
