            package p000;

            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.concurrent.Executor;
            import javax.crypto.Cipher;
            import javax.crypto.spec.SecretKeySpec;
            
/* 66 */    public abstract class O0OIoll1 {
                public final int I00000oIO;
                public final Object I00000oOI;
                public final Object I0000Il00O;
                public final Object I0000O;

                public O0OIoll1(Class cls, I0OO1oilIOl[] i0OO1oilIOlArr) {
/* 2 */             this.I00000oIO = 0;
/* 7 */             this.I00000oOI = cls;
/* 11 */            HashMap map = new HashMap();
/* 16 */            for (I0OO1oilIOl i0OO1oilIOl : i0OO1oilIOlArr) {
/* 22 */                boolean zContainsKey = map.containsKey(i0OO1oilIOl.I00000oIO);
/* 26 */                Class cls2 = i0OO1oilIOl.I00000oIO;
/* 28 */                if (zContainsKey) {
/* 42 */                    IoOOl0iOl1io.I001l0I00("KeyTypeManager constructed with duplicate factories for primitive ", cls2.getCanonicalName());
/* 46 */                    throw null;
                        }
/* 30 */                map.put(cls2, i0OO1oilIOl);
                    }
/* 48 */            if (i0OO1oilIOlArr.length > 0) {
/* 54 */                this.I0000Il00O = i0OO1oilIOlArr[0].I00000oIO;
                    } else {
/* 59 */                this.I0000Il00O = Void.class;
                    }
/* 65 */            this.I0000O = Collections.unmodifiableMap(map);
                }

                public abstract Ill0IO I00000oIO();

                public void I00000oOI() {
/* 3 */             IIiOiI0il iIiOiI0il = (IIiOiI0il) this.I0000O;
/* 7 */             O10lo0O o10lo0O = new O10lo0O();
/* 10 */            o10lo0O.I00iOIl = this;
/* 12 */            VarHandle.storeStoreFence();
/* 21 */            iIiOiI0il.I00iiI.addListener(o10lo0O, (Executor) this.I00000oOI);
                }

                public int I0000Il00O() {
/* 1 */             return 1;
                }

                public abstract String I0000O();

                /* JADX WARN: Multi-variable type inference failed */
                public Object I0000oI00(I01Iio10lo i01Iio10lo, Class cls) throws GeneralSecurityException {
                    OOIOOl1OOlI1 oOIOOl1OOlI1;
/* 9 */             I0OO1oilIOl i0OO1oilIOl = (I0OO1oilIOl) ((Map) this.I0000O).get(cls);
/* 11 */            OOIOOl1OOlI1 oOIOOl1OOlI12 = null;
/* 12 */            if (i0OO1oilIOl == null) {
/* 1049 */              IoOOl0iOl1io.I000o00OoI0I(cls.getCanonicalName(), "Requested primitive class ", " not supported.");
/* 11 */                return null;
                    }
/* 22 */            int i = 3;
/* 25 */            int i2 = 0;
/* 28 */            int i3 = 2;
                    switch (i0OO1oilIOl.I00000oOI) {
                        case 0:
/* 1012 */                  I0OO0l00IIO i0OO0l00IIO = (I0OO0l00IIO) i01Iio10lo;
/* 1037 */                  return new OOIOOl1OOlI1(new IoIlOo1o0IIl(i0OO0l00IIO.I001iOo1i0O().I000OiO()), i0OO0l00IIO.I001l0I00().I001l0I00());
                        case 1:
/* 949 */                   I0OOoOII1Io i0OOoOII1Io = (I0OOoOII1Io) i01Iio10lo;
/* 968 */                   I0OillIOOOIl i0OillIOOOIl = (I0OillIOOOIl) new I0Oi0oOOollO().I0000oI00(i0OOoOII1Io.I001iOo1i0O(), I0OillIOOOIl.class);
/* 985 */                   O1O1I111l o1O1I111l = (O1O1I111l) new Io1lOiII0().I0000oI00(i0OOoOII1Io.I001l0I00(), O1O1I111l.class);
/* 995 */                   int iI001lIiIIo1O = i0OOoOII1Io.I001l0I00().I001lIiIIo1O().I001lIiIIo1O();
/* 999 */                   Il0IO01ioii il0IO01ioii = new Il0IO01ioii();
/* 1002 */                  il0IO01ioii.I00000oIO = i0OillIOOOIl;
/* 1004 */                  il0IO01ioii.I00000oOI = o1O1I111l;
/* 1006 */                  il0IO01ioii.I0000Il00O = iI001lIiIIo1O;
/* 1008 */                  VarHandle.storeStoreFence();
/* 1040 */                  return il0IO01ioii;
                        case 2:
/* 736 */                   I0OiIlIl i0OiIlIl = (I0OiIlIl) i01Iio10lo;
/* 744 */                   byte[] bArrI000OiO = i0OiIlIl.I001iOo1i0O().I000OiO();
/* 756 */                   String strI00000oIO = lOOliO.I00000oIO(i0OiIlIl.I001l0I00().I001lllioOl());
/* 764 */                   int iI001lIiIIo1O2 = i0OiIlIl.I001l0I00().I001lIiIIo1O();
/* 780 */                   String strI00000oIO2 = lOOliO.I00000oIO(i0OiIlIl.I001l0I00().I001lloI().I001l0I00());
/* 792 */                   int iI001lIiIIo1O3 = i0OiIlIl.I001l0I00().I001lloI().I001lIiIIo1O();
/* 800 */                   int iI001iOo1i0O = i0OiIlIl.I001l0I00().I001iOo1i0O();
/* 804 */                   I0OiI1 i0OiI1 = new I0OiI1();
/* 811 */                   if (!Oi010OO0.I0000oI00(1)) {
/* 944 */                       IioIoO10iOiI.I000oI1ioi("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
/* 240 */                       return oOIOOl1OOlI12;
                            }
/* 813 */                   int length = bArrI000OiO.length;
/* 814 */                   if (length < 16 || length < iI001lIiIIo1O2) {
/* 941 */                       throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, iI001lIiIIo1O2));
                            }
/* 818 */                   Oolo11o0IIio.I00000oIO(iI001lIiIIo1O2);
/* 823 */                   if (iI001lIiIIo1O3 < 10) {
/* 919 */                       throw new InvalidAlgorithmParameterException(Oi010OO0.I000oI1ioi(iI001lIiIIo1O3, "tag size too small "));
                            }
/* 831 */                   if ((strI00000oIO2.equals("HmacSha1") && iI001lIiIIo1O3 > 20) || ((strI00000oIO2.equals("HmacSha256") && iI001lIiIIo1O3 > 32) || (strI00000oIO2.equals("HmacSha512") && iI001lIiIIo1O3 > 64))) {
/* 869 */                       throw new InvalidAlgorithmParameterException("tag size too big");
                            }
/* 870 */                   int i4 = iI001iOo1i0O - iI001lIiIIo1O3;
/* 876 */                   if ((i4 - iI001lIiIIo1O2) - 8 <= 0) {
/* 907 */                       throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
                            }
/* 883 */                   i0OiI1.I000II = Arrays.copyOf(bArrI000OiO, bArrI000OiO.length);
/* 885 */                   i0OiI1.I0001Ioi1lo = strI00000oIO;
/* 887 */                   i0OiI1.I00000oIO = iI001lIiIIo1O2;
/* 889 */                   i0OiI1.I00000oOI = strI00000oIO2;
/* 891 */                   i0OiI1.I0000Il00O = iI001lIiIIo1O3;
/* 893 */                   i0OiI1.I0000O = iI001iOo1i0O;
/* 895 */                   i0OiI1.I0000oI00 = i4;
/* 897 */                   VarHandle.storeStoreFence();
                            oOIOOl1OOlI1 = i0OiI1;
/* 329 */                   oOIOOl1OOlI12 = oOIOOl1OOlI1;
/* 240 */                   return oOIOOl1OOlI12;
                        case 3:
/* 657 */                   I0Oioo0l0oO i0Oioo0l0oO = (I0Oioo0l0oO) i01Iio10lo;
/* 665 */                   byte[] bArrI000OiO2 = i0Oioo0l0oO.I001l0I00().I000OiO();
/* 673 */                   int iI001l0I00 = i0Oioo0l0oO.I001lIiIIo1O().I001l0I00();
/* 677 */                   I0OillIOOOIl i0OillIOOOIl2 = new I0OillIOOOIl();
/* 684 */                   if (Oi010OO0.I0001Ioi1lo(2)) {
/* 687 */                       Oolo11o0IIio.I00000oIO(bArrI000OiO2.length);
/* 695 */                       i0OillIOOOIl2.I00000oIO = new SecretKeySpec(bArrI000OiO2, "AES");
/* 705 */                       int blockSize = ((Cipher) I0OillIOOOIl.I0000O.get()).getBlockSize();
/* 709 */                       i0OillIOOOIl2.I0000Il00O = blockSize;
/* 711 */                       if (iI001l0I00 < 12 || iI001l0I00 > blockSize) {
/* 724 */                           IioIoO10iOiI.I000oI1ioi("invalid IV size");
                                } else {
/* 715 */                           i0OillIOOOIl2.I00000oOI = iI001l0I00;
/* 717 */                           VarHandle.storeStoreFence();
                                    oOIOOl1OOlI1 = i0OillIOOOIl2;
/* 329 */                           oOIOOl1OOlI12 = oOIOOl1OOlI1;
                                }
                            } else {
/* 731 */                       IioIoO10iOiI.I000oI1ioi("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
                            }
/* 240 */                   return oOIOOl1OOlI12;
                        case 4:
/* 562 */                   I0OlOl i0OlOl = (I0OlOl) i01Iio10lo;
/* 570 */                   byte[] bArrI000OiO3 = i0OlOl.I001iOo1i0O().I000OiO();
/* 578 */                   int iI001l0I002 = i0OlOl.I001l0I00().I001l0I00();
/* 582 */                   I0OlIIolO0lO i0OlIIolO0lO = new I0OlIIolO0lO();
/* 589 */                   if (!Oi010OO0.I0000oI00(1)) {
/* 652 */                       IioIoO10iOiI.I000oI1ioi("Can not use AES-EAX in FIPS-mode.");
                            } else if (iI001l0I002 == 12 || iI001l0I002 == 16) {
/* 603 */                       i0OlIIolO0lO.I0000O = iI001l0I002;
/* 606 */                       Oolo11o0IIio.I00000oIO(bArrI000OiO3.length);
/* 611 */                       SecretKeySpec secretKeySpec = new SecretKeySpec(bArrI000OiO3, "AES");
/* 614 */                       i0OlIIolO0lO.I0000Il00O = secretKeySpec;
/* 622 */                       Cipher cipher = (Cipher) I0OlIIolO0lO.I0000oI00.get();
/* 624 */                       cipher.init(1, secretKeySpec);
/* 633 */                       byte[] bArrI0000Il00O = I0OlIIolO0lO.I0000Il00O(cipher.doFinal(new byte[16]));
/* 637 */                       i0OlIIolO0lO.I00000oIO = bArrI0000Il00O;
/* 643 */                       i0OlIIolO0lO.I00000oOI = I0OlIIolO0lO.I0000Il00O(bArrI0000Il00O);
/* 645 */                       VarHandle.storeStoreFence();
                                oOIOOl1OOlI1 = i0OlIIolO0lO;
/* 329 */                       oOIOOl1OOlI12 = oOIOOl1OOlI1;
                            } else {
/* 598 */                       I000II.I000iOII("IV size should be either 12 or 16 bytes");
                            }
/* 240 */                   return oOIOOl1OOlI12;
                        case 5:
/* 454 */                   I0OoI1oo101 i0OoI1oo101 = (I0OoI1oo101) i01Iio10lo;
/* 462 */                   byte[] bArrI000OiO4 = i0OoI1oo101.I001iOo1i0O().I000OiO();
/* 474 */                   String strI00000oIO3 = lOOliO.I00000oIO(i0OoI1oo101.I001l0I00().I001lllioOl());
/* 482 */                   int iI001lIiIIo1O4 = i0OoI1oo101.I001l0I00().I001lIiIIo1O();
/* 490 */                   int iI001iOo1i0O2 = i0OoI1oo101.I001l0I00().I001iOo1i0O();
/* 494 */                   I0OoI1 i0OoI1 = new I0OoI1();
/* 498 */                   if (bArrI000OiO4.length < 16 || bArrI000OiO4.length < iI001lIiIIo1O4) {
/* 561 */                       throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, iI001lIiIIo1O4));
                            }
/* 503 */                   Oolo11o0IIio.I00000oIO(iI001lIiIIo1O4);
/* 511 */                   if (iI001iOo1i0O2 <= i0OoI1.I0000oI00() + 16) {
/* 539 */                       throw new InvalidAlgorithmParameterException("ciphertextSegmentSize too small");
                            }
/* 518 */                   i0OoI1.I0000oI00 = Arrays.copyOf(bArrI000OiO4, bArrI000OiO4.length);
/* 520 */                   i0OoI1.I0000O = strI00000oIO3;
/* 522 */                   i0OoI1.I00000oIO = iI001lIiIIo1O4;
/* 524 */                   i0OoI1.I00000oOI = iI001iOo1i0O2;
/* 527 */                   i0OoI1.I0000Il00O = iI001iOo1i0O2 - 16;
/* 529 */                   VarHandle.storeStoreFence();
/* 1040 */                  return i0OoI1;
                        case 6:
/* 396 */                   byte[] bArrI000OiO5 = ((I0Ool0oO1io) i01Iio10lo).I001iOo1i0O().I000OiO();
/* 400 */                   I0Ooii0oll i0Ooii0oll = new I0Ooii0oll(i2);
/* 409 */                   if (Oi010OO0.I0001Ioi1lo(2)) {
/* 413 */                       Ioo01l1iOOiI ioo01l1iOOiI = new Ioo01l1iOOiI();
/* 420 */                       if (Oi010OO0.I0001Ioi1lo(2)) {
/* 423 */                           Oolo11o0IIio.I00000oIO(bArrI000OiO5.length);
/* 431 */                           ioo01l1iOOiI.I00000oIO = new SecretKeySpec(bArrI000OiO5, "AES");
/* 433 */                           ioo01l1iOOiI.I00000oOI = true;
/* 435 */                           VarHandle.storeStoreFence();
/* 438 */                           i0Ooii0oll.I00000oOI = ioo01l1iOOiI;
/* 440 */                           VarHandle.storeStoreFence();
                                    oOIOOl1OOlI1 = i0Ooii0oll;
/* 329 */                           oOIOOl1OOlI12 = oOIOOl1OOlI1;
                                } else {
/* 444 */                           IioIoO10iOiI.I000oI1ioi("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                                }
                            } else {
/* 449 */                       IioIoO10iOiI.I000oI1ioi("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                            }
/* 240 */                   return oOIOOl1OOlI12;
                        case 7:
/* 365 */                   byte[] bArrI000OiO6 = ((I0i0IOiOiO) i01Iio10lo).I001iOo1i0O().I000OiO();
/* 369 */                   I0i01110lolO i0i01110lolO = new I0i01110lolO();
/* 373 */                   Oolo11o0IIio.I00000oIO(bArrI000OiO6.length);
/* 381 */                   i0i01110lolO.I00000oIO = new SecretKeySpec(bArrI000OiO6, "AES");
/* 383 */                   VarHandle.storeStoreFence();
/* 1040 */                  return i0i01110lolO;
                        case 8:
/* 278 */                   byte[] bArrI000OiO7 = ((I0i0loloI) i01Iio10lo).I001iOo1i0O().I000OiO();
/* 282 */                   I0i0lO0 i0i0lO0 = new I0i0lO0();
/* 289 */                   if (!Oi010OO0.I0000oI00(1)) {
/* 353 */                       IioIoO10iOiI.I000oI1ioi("Can not use AES-SIV in FIPS-mode.");
/* 240 */                       return oOIOOl1OOlI12;
                            }
/* 302 */                   if (!I0i0lO0.I0000Il00O.contains(Integer.valueOf(bArrI000OiO7.length))) {
/* 350 */                       throw new InvalidKeyException(IIl001iO0Io.I000lI(bArrI000OiO7.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
                            }
/* 306 */                   byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrI000OiO7, 0, bArrI000OiO7.length / 2);
/* 317 */                   i0i0lO0.I00000oOI = Arrays.copyOfRange(bArrI000OiO7, bArrI000OiO7.length / 2, bArrI000OiO7.length);
/* 324 */                   i0i0lO0.I00000oIO = new IoIlOo1o0IIl(bArrCopyOfRange);
/* 326 */                   VarHandle.storeStoreFence();
                            oOIOOl1OOlI1 = i0i0lO0;
/* 329 */                   oOIOOl1OOlI12 = oOIOOl1OOlI1;
/* 240 */                   return oOIOOl1OOlI12;
                        case 9:
/* 251 */                   byte[] bArrI000OiO8 = ((IO0loooo0O0) i01Iio10lo).I001iOo1i0O().I000OiO();
/* 255 */                   I0Ooii0oll i0Ooii0oll2 = new I0Ooii0oll(i3);
/* 263 */                   i0Ooii0oll2.I00000oOI = new Ioo0ilOlI(0, bArrI000OiO8);
/* 265 */                   VarHandle.storeStoreFence();
/* 1040 */                  return i0Ooii0oll2;
                        case 10:
/* 121 */                   Io1lI0 io1lI0 = (Io1lI0) i01Iio10lo;
/* 127 */                   Io1IOo0o10ol io1IOo0o10olI001l0I00 = io1lI0.I001lIiIIo1O().I001l0I00();
/* 143 */                   SecretKeySpec secretKeySpec2 = new SecretKeySpec(io1lI0.I001l0I00().I000OiO(), "HMAC");
/* 150 */                   int iI001lIiIIo1O5 = io1lI0.I001lIiIIo1O().I001lIiIIo1O();
/* 154 */                   int iOrdinal = io1IOo0o10olI001l0I00.ordinal();
/* 158 */                   if (iOrdinal == 1) {
/* 237 */                       oOIOOl1OOlI12 = new OOIOOl1OOlI1(new o00io0IiOOo0("HMACSHA1", secretKeySpec2), iI001lIiIIo1O5);
                            } else if (iOrdinal == 2) {
/* 224 */                       oOIOOl1OOlI12 = new OOIOOl1OOlI1(new o00io0IiOOo0("HMACSHA384", secretKeySpec2), iI001lIiIIo1O5);
                            } else if (iOrdinal == 3) {
/* 211 */                       oOIOOl1OOlI12 = new OOIOOl1OOlI1(new o00io0IiOOo0("HMACSHA256", secretKeySpec2), iI001lIiIIo1O5);
                            } else if (iOrdinal == 4) {
/* 198 */                       oOIOOl1OOlI12 = new OOIOOl1OOlI1(new o00io0IiOOo0("HMACSHA512", secretKeySpec2), iI001lIiIIo1O5);
                            } else if (iOrdinal == 5) {
/* 179 */                       oOIOOl1OOlI12 = new OOIOOl1OOlI1(new o00io0IiOOo0("HMACSHA224", secretKeySpec2), iI001lIiIIo1O5);
                            } else {
/* 185 */                       IioIoO10iOiI.I000oI1ioi("unknown hash");
                            }
/* 240 */                   return oOIOOl1OOlI12;
                        case 11:
/* 107 */                   String strI001l0I00 = ((O0i11lIO1lO0) i01Iio10lo).I001iOo1i0O().I001l0I00();
/* 115 */                   return O0i1O0.I00000oIO(strI001l0I00).I0000Il00O(strI001l0I00);
                        case 12:
/* 60 */                    O0i1OI o0i1OI = (O0i1OI) i01Iio10lo;
/* 66 */                    String strI001lIiIIo1O = o0i1OI.I001iOo1i0O().I001lIiIIo1O();
/* 74 */                    I0Ooii0oll i0Ooii0ollI0000Il00O = O0i1O0.I00000oIO(strI001lIiIIo1O).I0000Il00O(strI001lIiIIo1O);
/* 84 */                    O0OIIIoOilol o0OIIIoOilolI001l0I00 = o0i1OI.I001iOo1i0O().I001l0I00();
/* 88 */                    O0i1O0o o0i1O0o = new O0i1O0o();
/* 91 */                    o0i1O0o.I00000oIO = o0OIIIoOilolI001l0I00;
/* 93 */                    o0i1O0o.I00000oOI = i0Ooii0ollI0000Il00O;
/* 95 */                    VarHandle.storeStoreFence();
/* 98 */                    return o0i1O0o;
                        default:
/* 41 */                    byte[] bArrI000OiO9 = ((i01lolol) i01Iio10lo).I001iOo1i0O().I000OiO();
/* 45 */                    I0Ooii0oll i0Ooii0oll3 = new I0Ooii0oll(i);
/* 53 */                    i0Ooii0oll3.I00000oOI = new Ioo0ilOlI(1, bArrI000OiO9);
/* 55 */                    VarHandle.storeStoreFence();
/* 1040 */                  return i0Ooii0oll3;
                    }
                }

                public abstract I00i01iIIliI I0001Ioi1lo();

                public abstract O0O1ii I000II();

                public abstract I01Iio10lo I000O01llI0(IIOI1Ii1I iIOI1Ii1I);

                public abstract byte[] I000OOo1O(Object obj);

                public abstract void I000OiO(I01Iio10lo i01Iio10lo);

                public String toString() {
                    switch (this.I00000oIO) {
                        case 2:
/* 36 */                    return getClass().getSimpleName() + ": " + I00000oIO();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 67 */        public O0OIoll1(Object obj, Object obj2, Object obj3, int i) {
/* 68 */            this.I00000oIO = i;
                    this.I00000oOI = obj;
                    this.I0000Il00O = obj2;
                    this.I0000O = obj3;
                }
            }
