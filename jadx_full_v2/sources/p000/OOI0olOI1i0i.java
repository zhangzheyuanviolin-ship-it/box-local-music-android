            package p000;

            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Collection;
            
            public final class OOI0olOI1i0i extends Io00l0 {
                private static final OOI0olOI1i0i DEFAULT_INSTANCE;
                private static volatile OO01IIl0i0oI PARSER = null;
                public static final int STRINGS_FIELD_NUMBER = 1;
                private Iool1O1Ol1i strings_ = OOiI0Oo.I00iio;

                static {
/* 3 */             OOI0olOI1i0i oOI0olOI1i0i = new OOI0olOI1i0i();
/* 6 */             DEFAULT_INSTANCE = oOI0olOI1i0i;
/* 10 */            Io00l0.I000iOII(OOI0olOI1i0i.class, oOI0olOI1i0i);
                }

                public static OOI0olOI1i0i I000o00OoI0I() {
/* 1 */             return DEFAULT_INSTANCE;
                }

                public static OOI0oi1 I00100l0() {
/* 10 */            return (OOI0oi1) ((Ilooooo) DEFAULT_INSTANCE.I0000Il00O(5));
                }

                @Override
                public final Object I0000Il00O(int i) {
                    OO01IIl0i0oI io000iO;
                    switch (IIlIOloOOO.I001lIiIIo1O(i)) {
                        case 0:
/* 73 */                    return (byte) 1;
                        case 1:
/* 5 */                     return null;
                        case 2:
/* 66 */                    return Io00l0.I000OOo1O(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
                        case 3:
/* 52 */                    return new OOI0olOI1i0i();
                        case 4:
/* 46 */                    return new OOI0oi1(DEFAULT_INSTANCE);
                        case 5:
/* 39 */                    return DEFAULT_INSTANCE;
                        case 6:
/* 13 */                    OO01IIl0i0oI oO01IIl0i0oI = PARSER;
/* 15 */                    if (oO01IIl0i0oI != null) {
/* 38 */                        return oO01IIl0i0oI;
                            }
                            synchronized (OOI0olOI1i0i.class) {
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

                public final void I000lI(Iterable iterable) {
/* 1 */             Iool1O1Ol1i iool1O1Ol1i = this.strings_;
/* 6 */             boolean z = ((I01O1I1) iool1O1Ol1i).I00iOIl;
                    Iool1O1Ol1i iool1O1Ol1i2 = iool1O1Ol1i;
/* 8 */             if (!z) {
/* 10 */                int size = iool1O1Ol1i.size();
/* 23 */                OOiI0Oo oOiI0OoI0000oI00 = ((OOiI0Oo) iool1O1Ol1i).I0000oI00(size == 0 ? 10 : size * 2);
/* 27 */                this.strings_ = oOiI0OoI0000oI00;
                        iool1O1Ol1i2 = oOiI0OoI0000oI00;
                    }
/* 29 */            Charset charset = IoolIIolo1lI.I00000oIO;
/* 33 */            if (iterable instanceof O0o1oOII) {
/* 140 */               ((O0o1oOII) iterable).I00000oIO();
/* 143 */               OIiilo1Ool0o.I00000oIO();
/* 168 */               return;
                    }
/* 37 */            if (iterable instanceof OOIiI00OIll0) {
/* 41 */                iool1O1Ol1i2.addAll((Collection) iterable);
/* 44 */                return;
                    }
/* 47 */            if ((iool1O1Ol1i2 instanceof ArrayList) && (iterable instanceof Collection)) {
/* 68 */                ((ArrayList) iool1O1Ol1i2).ensureCapacity(((Collection) iterable).size() + iool1O1Ol1i2.size());
                    }
/* 71 */            int size2 = iool1O1Ol1i2.size();
/* 83 */            for (Object obj : iterable) {
/* 89 */                if (obj == null) {
/* 111 */                   String str = "Element at index " + (iool1O1Ol1i2.size() - size2) + " is null.";
/* 121 */                   for (int size3 = iool1O1Ol1i2.size() - 1; size3 >= size2; size3--) {
/* 123 */                       iool1O1Ol1i2.remove(size3);
                            }
/* 129 */                   IOOlIIilOl0.I000II(str);
/* 132 */                   return;
                        }
/* 133 */               iool1O1Ol1i2.add(obj);
                    }
                }

                public final Iool1O1Ol1i I000oI1ioi() {
/* 1 */             return this.strings_;
                }
            }
