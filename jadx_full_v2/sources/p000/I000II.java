            package p000;

            import android.graphics.SurfaceTexture;
            import android.view.Surface;
            import java.io.EOFException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.ConcurrentModificationException;
            import java.util.concurrent.Executor;
            
/* 27 */    public final class I000II implements OOIOo1iOI, O0OI1I001l0l, OOIIOiIoll0, IIoi0i, Iiio1OI0O0i {
                public final int I00iOIl;

                public I000II(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static void I00000oIO() {
/* 29 */            throw new IOiIIo1l(6);
                }

                public static void I0001Ioi1lo(int i, int i2) throws EOFException {
/* 89 */            throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
                }

                public static void I000II(int i, Object obj) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             sb.append(obj);
/* 11 */            sb.append((Object) "#read(byte[]) returned invalid result: ");
/* 14 */            sb.append(i);
/* 19 */            sb.append((Object) "\nThe InputStream implementation is buggy.");
/* 89 */            throw new IllegalStateException(sb.toString());
                }

                public static void I000O01llI0(Object obj) {
/* 49 */            throw new AssertionError(obj);
                }

                public static void I000OOo1O(Object obj, int i, int i2) {
/* 5 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append(obj);
/* 11 */            sb.append(i2);
/* 215 */           throw new IndexOutOfBoundsException(sb.toString());
                }

                public static void I000OiO(Object obj, String str, Object obj2) {
/* 215 */           throw new IllegalStateException(str + obj + obj2);
                }

                public static void I000iOII(String str) {
/* 49 */            throw new IllegalArgumentException(str);
                }

                public static void I000l1(String str, Object obj) throws I00IlilI0i0i {
/* 89 */            throw new I00IlilI0i0i(str + obj, 0);
                }

                public static void I000lI(String str, Object obj, Exception exc) {
/* 215 */           throw new I00OI1(str + obj, exc);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void I000o00OoI0I(String str, Object obj, Object obj2, Object obj3, int i) {
/* 966 */           throw new IllegalStateException((str + obj + obj2 + obj3 + ((char) i)).toString());
                }

                public static void I000oI1ioi(StringBuilder sb, Object obj, Object obj2) {
/* 1 */             sb.append(obj);
/* 4 */             sb.append(obj2);
/* 215 */           throw new IllegalStateException(sb.toString().toString());
                }

                public static void I00100l0() throws InterruptedException {
/* 29 */            throw new InterruptedException();
                }

                public static void I00100o1O0lo(int i, int i2) {
/* 89 */            throw new IllegalArgumentException("Length too large: " + i + i2);
                }

                public static void I0010I0i(Object obj) {
/* 49 */            throw new IllegalArgumentException(obj.toString());
                }

                public static void I0010o(String str) {
/* 49 */            throw new IndexOutOfBoundsException(str);
                }

                public static void I00111O(String str, Object obj) throws IOException {
/* 89 */            throw new IOException(str + obj);
                }

                public static void I001IIilI0O() {
/* 29 */            throw new ConcurrentModificationException();
                }

                public static void I001IO000(String str) {
/* 49 */            throw new IllegalStateException(str);
                }

                public static void I001i1O0Ol() throws EOFException {
/* 29 */            throw new EOFException();
                }

                @Override
                public l0il1i0011O I00000oOI(Oili0i1IOo oili0i1IOo) throws GeneralSecurityException {
                    IO0o1O0li0 iO0o1O0li0;
/* 5 */             boolean z = false;
/* 21 */            int i = 22;
/* 23 */            int i2 = 4;
/* 24 */            int i3 = 2;
/* 25 */            int i4 = 3;
                    switch (this.I00iOIl) {
                        case 6:
/* 743 */                   OOi1OoI0loOi oOi1OoI0loOi = (OOi1OoI0loOi) oili0i1IOo;
/* 753 */                   if (!oOi1OoI0loOi.I00000oIO.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
/* 899 */                       I000iOII("Wrong type URL in call to AesCmacParameters.parseParameters");
/* 26 */                        return null;
                            }
                            try {
/* 761 */                       I0OO0l00IIO i0OO0l00IIOI001lloI = I0OO0l00IIO.I001lloI(oOi1OoI0loOi.I0000Il00O, Il1llO11O.I00000oIO());
/* 769 */                       if (i0OO0l00IIOI001lloI.I001lIiIIo1O() != 0) {
/* 890 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 773 */                       IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(i3, z);
/* 776 */                       ioIlOo1o0IIl.I00iiI = null;
/* 778 */                       ioIlOo1o0IIl.I00iiO = null;
/* 782 */                       ioIlOo1o0IIl.I00iio = I0OOO1l0IoO.I0001Ioi1lo;
/* 792 */                       ioIlOo1o0IIl.I00IoIO0lI(i0OO0l00IIOI001lloI.I001iOo1i0O().size());
/* 799 */                       int iI001l0I00 = i0OO0l00IIOI001lloI.I001l0I00().I001l0I00();
/* 805 */                       if (iI001l0I00 < 10 || 16 < iI001l0I00) {
/* 884 */                           throw new GeneralSecurityException(Oi010OO0.I000oI1ioi(iI001l0I00, "Invalid tag size for AesCmacParameters: "));
                                }
/* 813 */                       ioIlOo1o0IIl.I00iiO = Integer.valueOf(iI001l0I00);
/* 821 */                       ioIlOo1o0IIl.I00iio = I0OOlli.I00000oIO(oOi1OoI0loOi.I0000oI00);
/* 823 */                       I0OOi0 i0OOi0I000iOII = ioIlOo1o0IIl.I000iOII();
/* 829 */                       IOO000ilo iOO000ilo = new IOO000ilo(i4);
/* 832 */                       iOO000ilo.I00iiO = null;
/* 834 */                       iOO000ilo.I00iio = null;
/* 836 */                       iOO000ilo.I00iiI = i0OOi0I000iOII;
/* 848 */                       IIOIlli0IO iIOIlli0IOI00000oIO = IIOIlli0IO.I00000oIO(i0OO0l00IIOI001lloI.I001iOo1i0O().I000OiO());
/* 854 */                       O1OIll00i o1OIll00i = new O1OIll00i(22);
/* 857 */                       o1OIll00i.I00iiI = iIOIlli0IOI00000oIO;
/* 859 */                       VarHandle.storeStoreFence();
/* 862 */                       iOO000ilo.I00iiO = o1OIll00i;
/* 866 */                       iOO000ilo.I00iio = oOi1OoI0loOi.I0001Ioi1lo;
/* 868 */                       return iOO000ilo.I00000oOI();
                            } catch (O000oiiiOI0 | IllegalArgumentException unused) {
/* 893 */                       IioIoO10iOiI.I000oI1ioi("Parsing AesCmacKey failed");
/* 26 */                        return null;
                            }
                        case 7:
/* 523 */                   OOi1OoI0loOi oOi1OoI0loOi2 = (OOi1OoI0loOi) oili0i1IOo;
/* 533 */                   if (!oOi1OoI0loOi2.I00000oIO.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
/* 737 */                       I000iOII("Wrong type URL in call to AesEaxParameters.parseParameters");
/* 26 */                        return null;
                            }
                            try {
/* 541 */                       I0OlOl i0OlOlI001lloI = I0OlOl.I001lloI(oOi1OoI0loOi2.I0000Il00O, Il1llO11O.I00000oIO());
/* 549 */                       if (i0OlOlI001lloI.I001lIiIIo1O() != 0) {
/* 728 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 551 */                       IIlIi0lIii iIlIi0lIii = IIlIi0lIii.I00ilI0I1;
/* 557 */                       int size = i0OlOlI001lloI.I001iOo1i0O().size();
/* 561 */                       if (size != 16 && size != 24 && size != 32) {
/* 585 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                                }
/* 590 */                       int iI001l0I002 = i0OlOlI001lloI.I001l0I00().I001l0I00();
/* 594 */                       if (iI001l0I002 != 12 && iI001l0I002 != 16) {
/* 618 */                           throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iI001l0I002)));
                                }
/* 619 */                       OIl1lli oIl1lli = oOi1OoI0loOi2.I0000oI00;
/* 621 */                       int iOrdinal = oIl1lli.ordinal();
/* 625 */                       if (iOrdinal == 1) {
/* 659 */                           iIlIi0lIii = IIlIi0lIii.I00iiO;
                                } else if (iOrdinal == 2) {
/* 656 */                           iIlIi0lIii = IIlIi0lIii.I00iio;
                                } else if (iOrdinal != 3) {
/* 631 */                           if (iOrdinal != 4) {
/* 655 */                               throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli.I00000oOI());
                                    }
/* 656 */                           iIlIi0lIii = IIlIi0lIii.I00iio;
                                }
/* 663 */                       I0OllIi1iI1 i0OllIi1iI1 = new I0OllIi1iI1();
/* 666 */                       i0OllIi1iI1.I00000oIO = size;
/* 668 */                       i0OllIi1iI1.I00000oOI = iI001l0I002;
/* 670 */                       i0OllIi1iI1.I0000Il00O = 16;
/* 672 */                       i0OllIi1iI1.I0000O = iIlIi0lIii;
/* 674 */                       VarHandle.storeStoreFence();
/* 679 */                       IOO000ilo iOO000ilo2 = new IOO000ilo(i2);
/* 682 */                       iOO000ilo2.I00iiO = null;
/* 684 */                       iOO000ilo2.I00iio = null;
/* 686 */                       iOO000ilo2.I00iiI = i0OllIi1iI1;
/* 698 */                       IIOIlli0IO iIOIlli0IOI00000oIO2 = IIOIlli0IO.I00000oIO(i0OlOlI001lloI.I001iOo1i0O().I000OiO());
/* 704 */                       O1OIll00i o1OIll00i2 = new O1OIll00i(22);
/* 707 */                       o1OIll00i2.I00iiI = iIOIlli0IOI00000oIO2;
/* 709 */                       VarHandle.storeStoreFence();
/* 712 */                       iOO000ilo2.I00iiO = o1OIll00i2;
/* 716 */                       iOO000ilo2.I00iio = oOi1OoI0loOi2.I0001Ioi1lo;
/* 718 */                       return iOO000ilo2.I0000O();
                            } catch (O000oiiiOI0 unused2) {
/* 731 */                       IioIoO10iOiI.I000oI1ioi("Parsing AesEaxcKey failed");
/* 26 */                        return null;
                            }
                        case 8:
/* 336 */                   OOi1OoI0loOi oOi1OoI0loOi3 = (OOi1OoI0loOi) oili0i1IOo;
/* 346 */                   if (!oOi1OoI0loOi3.I00000oIO.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
/* 517 */                       I000iOII("Wrong type URL in call to AesGcmParameters.parseParameters");
/* 26 */                        return null;
                            }
                            try {
/* 354 */                       I0Ool0oO1io i0Ool0oO1ioI001lllioOl = I0Ool0oO1io.I001lllioOl(oOi1OoI0loOi3.I0000Il00O, Il1llO11O.I00000oIO());
/* 362 */                       if (i0Ool0oO1ioI001lllioOl.I001l0I00() != 0) {
/* 508 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 364 */                       I0OooiI1I i0OooiI1I = I0OooiI1I.I00ilI0I1;
/* 370 */                       int size2 = i0Ool0oO1ioI001lllioOl.I001iOo1i0O().size();
/* 374 */                       if (size2 != 16 && size2 != 24 && size2 != 32) {
/* 398 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                                }
/* 399 */                       OIl1lli oIl1lli2 = oOi1OoI0loOi3.I0000oI00;
/* 401 */                       int iOrdinal2 = oIl1lli2.ordinal();
/* 405 */                       if (iOrdinal2 == 1) {
/* 439 */                           i0OooiI1I = I0OooiI1I.I00iiO;
                                } else if (iOrdinal2 == 2) {
/* 436 */                           i0OooiI1I = I0OooiI1I.I00iio;
                                } else if (iOrdinal2 != 3) {
/* 411 */                           if (iOrdinal2 != 4) {
/* 435 */                               throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli2.I00000oOI());
                                    }
/* 436 */                           i0OooiI1I = I0OooiI1I.I00iio;
                                }
/* 443 */                       I0i000lio i0i000lio = new I0i000lio();
/* 446 */                       i0i000lio.I00000oIO = size2;
/* 448 */                       i0i000lio.I00000oOI = 12;
/* 450 */                       i0i000lio.I0000Il00O = 16;
/* 452 */                       i0i000lio.I0000O = i0OooiI1I;
/* 454 */                       VarHandle.storeStoreFence();
/* 459 */                       IoIlOo1o0IIl ioIlOo1o0IIl2 = new IoIlOo1o0IIl(i4, z);
/* 462 */                       ioIlOo1o0IIl2.I00iiO = null;
/* 464 */                       ioIlOo1o0IIl2.I00iio = null;
/* 466 */                       ioIlOo1o0IIl2.I00iiI = i0i000lio;
/* 478 */                       IIOIlli0IO iIOIlli0IOI00000oIO3 = IIOIlli0IO.I00000oIO(i0Ool0oO1ioI001lllioOl.I001iOo1i0O().I000OiO());
/* 484 */                       O1OIll00i o1OIll00i3 = new O1OIll00i(22);
/* 487 */                       o1OIll00i3.I00iiI = iIOIlli0IOI00000oIO3;
/* 489 */                       VarHandle.storeStoreFence();
/* 492 */                       ioIlOo1o0IIl2.I00iiO = o1OIll00i3;
/* 496 */                       ioIlOo1o0IIl2.I00iio = oOi1OoI0loOi3.I0001Ioi1lo;
/* 498 */                       return ioIlOo1o0IIl2.I000l1();
                            } catch (O000oiiiOI0 unused3) {
/* 511 */                       IioIoO10iOiI.I000oI1ioi("Parsing AesGcmKey failed");
/* 26 */                        return null;
                            }
                        case 9:
/* 154 */                   OOi1OoI0loOi oOi1OoI0loOi4 = (OOi1OoI0loOi) oili0i1IOo;
/* 164 */                   if (!oOi1OoI0loOi4.I00000oIO.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
/* 330 */                       I000iOII("Wrong type URL in call to AesGcmSivParameters.parseParameters");
/* 26 */                        return null;
                            }
                            try {
/* 172 */                       I0i0IOiOiO i0i0IOiOiOI001lllioOl = I0i0IOiOiO.I001lllioOl(oOi1OoI0loOi4.I0000Il00O, Il1llO11O.I00000oIO());
/* 180 */                       if (i0i0IOiOiOI001lllioOl.I001l0I00() != 0) {
/* 321 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 182 */                       I0i0io0oOOi i0i0io0oOOi = I0i0io0oOOi.I00ilI0I1;
/* 188 */                       int size3 = i0i0IOiOiOI001lllioOl.I001iOo1i0O().size();
/* 192 */                       if (size3 != 16 && size3 != 32) {
/* 216 */                           throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                                }
/* 217 */                       OIl1lli oIl1lli3 = oOi1OoI0loOi4.I0000oI00;
/* 219 */                       int iOrdinal3 = oIl1lli3.ordinal();
/* 223 */                       if (iOrdinal3 == 1) {
/* 257 */                           i0i0io0oOOi = I0i0io0oOOi.I00iiO;
                                } else if (iOrdinal3 == 2) {
/* 254 */                           i0i0io0oOOi = I0i0io0oOOi.I00iio;
                                } else if (iOrdinal3 != 3) {
/* 229 */                           if (iOrdinal3 != 4) {
/* 253 */                               throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli3.I00000oOI());
                                    }
/* 254 */                           i0i0io0oOOi = I0i0io0oOOi.I00iio;
                                }
/* 261 */                       I0i0l1O i0i0l1O = new I0i0l1O();
/* 264 */                       i0i0l1O.I00000oIO = size3;
/* 266 */                       i0i0l1O.I00000oOI = i0i0io0oOOi;
/* 268 */                       VarHandle.storeStoreFence();
/* 274 */                       IOO000ilo iOO000ilo3 = new IOO000ilo(5);
/* 277 */                       iOO000ilo3.I00iiO = null;
/* 279 */                       iOO000ilo3.I00iio = null;
/* 281 */                       iOO000ilo3.I00iiI = i0i0l1O;
/* 293 */                       IIOIlli0IO iIOIlli0IOI00000oIO4 = IIOIlli0IO.I00000oIO(i0i0IOiOiOI001lllioOl.I001iOo1i0O().I000OiO());
/* 297 */                       O1OIll00i o1OIll00i4 = new O1OIll00i(i);
/* 300 */                       o1OIll00i4.I00iiI = iIOIlli0IOI00000oIO4;
/* 302 */                       VarHandle.storeStoreFence();
/* 305 */                       iOO000ilo3.I00iiO = o1OIll00i4;
/* 309 */                       iOO000ilo3.I00iio = oOi1OoI0loOi4.I0001Ioi1lo;
/* 311 */                       return iOO000ilo3.I0000oI00();
                            } catch (O000oiiiOI0 unused4) {
/* 324 */                       IioIoO10iOiI.I000oI1ioi("Parsing AesGcmSivKey failed");
/* 26 */                        return null;
                            }
                        default:
/* 32 */                    OOi1OoI0loOi oOi1OoI0loOi5 = (OOi1OoI0loOi) oili0i1IOo;
/* 42 */                    if (!oOi1OoI0loOi5.I00000oIO.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
/* 148 */                       I000iOII("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
/* 26 */                        return null;
                            }
                            try {
/* 50 */                        IO0loooo0O0 iO0loooo0O0I001lllioOl = IO0loooo0O0.I001lllioOl(oOi1OoI0loOi5.I0000Il00O, Il1llO11O.I00000oIO());
/* 58 */                        if (iO0loooo0O0I001lllioOl.I001l0I00() != 0) {
/* 139 */                           throw new GeneralSecurityException("Only version 0 keys are accepted");
                                }
/* 60 */                        OIl1lli oIl1lli4 = oOi1OoI0loOi5.I0000oI00;
/* 62 */                        int iOrdinal4 = oIl1lli4.ordinal();
/* 66 */                        if (iOrdinal4 == 1) {
/* 103 */                           iO0o1O0li0 = IO0o1O0li0.I00iiO;
                                } else if (iOrdinal4 == 2) {
/* 100 */                           iO0o1O0li0 = IO0o1O0li0.I00iio;
                                } else if (iOrdinal4 == 3) {
/* 97 */                            iO0o1O0li0 = IO0o1O0li0.I00ilI0I1;
                                } else {
/* 72 */                            if (iOrdinal4 != 4) {
/* 96 */                                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + oIl1lli4.I00000oOI());
                                    }
/* 100 */                           iO0o1O0li0 = IO0o1O0li0.I00iio;
                                }
/* 115 */                       IIOIlli0IO iIOIlli0IOI00000oIO5 = IIOIlli0IO.I00000oIO(iO0loooo0O0I001lllioOl.I001iOo1i0O().I000OiO());
/* 119 */                       O1OIll00i o1OIll00i5 = new O1OIll00i(i);
/* 122 */                       o1OIll00i5.I00iiI = iIOIlli0IOI00000oIO5;
/* 124 */                       VarHandle.storeStoreFence();
/* 129 */                       return IO0o0ll.I00000oIO(iO0o1O0li0, o1OIll00i5, oOi1OoI0loOi5.I0001Ioi1lo);
                            } catch (O000oiiiOI0 unused5) {
/* 142 */                       IioIoO10iOiI.I000oI1ioi("Parsing ChaCha20Poly1305Key failed");
/* 26 */                        return null;
                            }
                    }
                }

                @Override
                public Object I0000Il00O(l0il1i0011O l0il1i0011o) throws GeneralSecurityException {
/* 5 */             IOIIl1O00 iOIIl1O00 = new IOIIl1O00();
/* 13 */            if (Oi010OO0.I0000oI00(1)) {
/* 15 */                return iOIIl1O00;
                    }
/* 18 */            IioIoO10iOiI.I000oI1ioi("Can not use AES-CMAC in FIPS-mode.");
/* 21 */            return null;
                }

                @Override
                public double I0000O(double d) {
                    double d2;
/* 9 */             double dPow = d < 0.0d ? -d : d;
/* 17 */            if (dPow >= 0.0031308049535603718d) {
/* 33 */                dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
/* 34 */                d2 = 0.9478672985781991d;
                    } else {
/* 41 */                d2 = 0.07739938080495357d;
                    }
/* 47 */            return Math.copySign(dPow / d2, d);
                }

                @Override
                public void I0000oI00(Oll0I0l1i1 oll0I0l1i1) {
/* 4 */             SurfaceTexture surfaceTexture = new SurfaceTexture(0);
/* 19 */            surfaceTexture.setDefaultBufferSize(oll0I0l1i1.I00000oOI.getWidth(), oll0I0l1i1.I00000oOI.getHeight());
/* 22 */            surfaceTexture.detachFromGLContext();
/* 27 */            Surface surface = new Surface(surfaceTexture);
/* 30 */            Executor executorI00000oIO = Iii11l.I00000oIO();
/* 36 */            IIoIIO iIoIIO = new IIoIIO(0);
/* 39 */            iIoIIO.I00000oOI = surface;
/* 41 */            iIoIIO.I0000Il00O = surfaceTexture;
/* 43 */            VarHandle.storeStoreFence();
/* 46 */            oll0I0l1i1.I00000oIO(surface, executorI00000oIO, iIoIIO);
                }

                @Override
/* 28 */        public void cancel() {
                }
            }
