            package p000;

            import java.io.IOException;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.Key;
            import java.security.KeyFactory;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.security.PrivateKey;
            import java.security.PublicKey;
            import java.security.spec.InvalidKeySpecException;
            import java.security.spec.InvalidParameterSpecException;
            import java.security.spec.X509EncodedKeySpec;
            import java.util.HashMap;
            import javax.crypto.Cipher;
            import javax.crypto.KeyAgreement;
            import javax.crypto.NoSuchPaddingException;
            import javax.crypto.SecretKey;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class O0OIoO extends OOloOo {
                public O0OIlll I0000oI00;

                @Override
                public final I0IIiO0iI I0000Il00O(OillOo0 oillOo0) throws IIOlio1ol, IllegalStateException, InvalidKeySpecException, NoSuchAlgorithmException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
                    byte[] bArrI00000oIO;
                    Key keyUnwrap;
/* 5 */             byte[] bArr = this.I0000oI00.I00iio.I00iOIl;
/* 9 */             PrivateKey privateKey = (PrivateKey) oillOo0.I00iiI;
/* 13 */            HashMap map = (HashMap) oillOo0.I00ilI0I1;
/* 17 */            Il0o10 il0o10 = (Il0o10) oillOo0.I00iiO;
/* 19 */            I0ioOiiIO0 i0ioOiiIO0 = this.I00000oOI;
/* 21 */            I00O0i0ii i00O0i0ii = i0ioOiiIO0.I00iOIl;
/* 25 */            boolean zContains = IIOo0iOIo.I00000oIO.contains(i00O0i0ii);
/* 29 */            I0ioOiiIO0 i0ioOiiIO02 = this.I0000Il00O;
/* 33 */            boolean z = false;
/* 34 */            if (zContains) {
                        try {
/* 36 */                    Io0il0IO1lI io0il0IO1lII000o00OoI0I = Io0il0IO1lI.I000o00OoI0I(bArr);
/* 40 */                    Io0ioI1I0lI0 io0ioI1I0lI0 = io0il0IO1lII000o00OoI0I.I00iiI;
/* 42 */                    KeyFactory keyFactoryI0000Il00O = il0o10.I0000Il00O(i00O0i0ii);
/* 48 */                    OliI1l0l oliI1l0l = io0ioI1I0lI0.I00iiI;
/* 50 */                    byte[] bArr2 = io0ioI1I0lI0.I00iiO;
/* 59 */                    PublicKey publicKeyGeneratePublic = keyFactoryI0000Il00O.generatePublic(new X509EncodedKeySpec(oliI1l0l.I000iOII()));
/* 63 */                    KeyAgreement keyAgreementI00000oOI = il0o10.I00000oOI(i00O0i0ii);
/* 69 */                    byte[] bArrI00000oIO2 = iOO1iOiOl.I00000oIO(bArr2);
/* 73 */                    OoliIIloo0I ooliIIloo0I = new OoliIIloo0I();
/* 76 */                    iOO1iOiOl.I00000oIO(bArrI00000oIO2);
/* 79 */                    keyAgreementI00000oOI.init(privateKey, ooliIIloo0I);
/* 83 */                    keyAgreementI00000oOI.doPhase(publicKeyGeneratePublic, true);
/* 86 */                    I00O0i0ii i00O0i0ii2 = Ii0i0o00.I0000Il00O;
/* 90 */                    SecretKey secretKeyGenerateSecret = keyAgreementI00000oOI.generateSecret(i00O0i0ii2.I00iOIl);
/* 94 */                    Cipher cipherI00000oIO = il0o10.I00000oIO(i00O0i0ii2);
/* 110 */                   cipherI00000oIO.init(4, secretKeyGenerateSecret, new Ilo0iI0(io0ioI1I0lI0.I00iOIl, iOO1iOiOl.I00000oIO(bArr2)));
/* 113 */                   Io0iiOoI io0iiOoI = io0il0IO1lII000o00OoI0I.I00iOIl;
/* 117 */                   byte[] bArrI00000oIO3 = iOO1iOiOl.I00000oIO(io0iiOoI.I00iOIl);
/* 123 */                   byte[] bArrI00000oIO4 = iOO1iOiOl.I00000oIO(io0iiOoI.I00iiO);
/* 127 */                   if (bArrI00000oIO3 == null) {
/* 129 */                       bArrI00000oIO = iOO1iOiOl.I00000oIO(bArrI00000oIO4);
                            } else if (bArrI00000oIO4 == null) {
/* 136 */                       bArrI00000oIO = iOO1iOiOl.I00000oIO(bArrI00000oIO3);
                            } else {
/* 144 */                       byte[] bArr3 = new byte[bArrI00000oIO3.length + bArrI00000oIO4.length];
/* 147 */                       System.arraycopy(bArrI00000oIO3, 0, bArr3, 0, bArrI00000oIO3.length);
/* 152 */                       System.arraycopy(bArrI00000oIO4, 0, bArr3, bArrI00000oIO3.length, bArrI00000oIO4.length);
/* 155 */                       bArrI00000oIO = bArr3;
                            }
/* 156 */                   I00O0i0ii i00O0i0ii3 = i0ioOiiIO02.I00iOIl;
/* 164 */                   String str = (String) Il0o10.I00000oIO.get(i00O0i0ii3);
/* 166 */                   if (str == null) {
/* 168 */                       str = i00O0i0ii3.I00iOIl;
                            }
/* 171 */                   keyUnwrap = cipherI00000oIO.unwrap(bArrI00000oIO, str, 3);
                        } catch (Exception e) {
/* 199 */                   throw new IIOlio1ol("exception unwrapping key: " + e.getMessage(), e);
                        }
                    } else {
/* 200 */               il0o10.getClass();
/* 205 */               o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 208 */               o01l1iooo0.I00iOIl = i0ioOiiIO0;
/* 215 */               o01l1iooo0.I00iiI = new OIiiIOi1l();
/* 222 */               o01l1iooo0.I00iiO = new HashMap();
/* 224 */               o01l1iooo0.I00iio = privateKey;
/* 230 */               if (!map.isEmpty()) {
/* 244 */                   for (I00O0i0ii i00O0i0ii4 : map.keySet()) {
/* 262 */                       ((HashMap) o01l1iooo0.I00iiO).put(i00O0i0ii4, (String) map.get(i00O0i0ii4));
                            }
                        }
                        try {
/* 266 */                   I00O0i0ii i00O0i0ii5 = i0ioOiiIO02.I00iOIl;
/* 274 */                   Object obj = (Serializable) o01l1iooo0.I000OOo1O(i0ioOiiIO02, bArr).I00iiI;
/* 278 */                   if (obj instanceof Key) {
/* 280 */                       keyUnwrap = (Key) obj;
                            } else {
/* 285 */                       if (!(obj instanceof byte[])) {
/* 420 */                           throw new IllegalArgumentException("unknown generic key type");
                                }
/* 289 */                       byte[] bArr4 = (byte[]) obj;
/* 297 */                       String str2 = (String) Il0o10.I00000oIO.get(i00O0i0ii5);
/* 299 */                       if (str2 == null) {
/* 301 */                           str2 = i00O0i0ii5.I00iOIl;
                                }
/* 303 */                       keyUnwrap = new SecretKeySpec(bArr4, str2);
                            }
                        } catch (OIiiIO e2) {
/* 966 */                   throw new IIOlio1ol("exception unwrapping key: " + e2.getMessage(), e2);
                        }
                    }
/* 309 */           Il0o10 il0o102 = (Il0o10) oillOo0.I00iio;
/* 311 */           il0o102.getClass();
/* 318 */           IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(12, z);
/* 321 */           ioIlOo1o0IIl.I00iio = il0o102;
/* 323 */           ioIlOo1o0IIl.I00iiI = i0ioOiiIO02;
/* 325 */           ioIlOo1o0IIl.I00iiO = keyUnwrap;
/* 327 */           VarHandle.storeStoreFence();
                    try {
/* 330 */               Cipher cipherI000oI1ioi = ioIlOo1o0IIl.I000oI1ioi();
/* 340 */               IIloOI iIloOI = new IIloOI(17);
/* 343 */               iIloOI.I00iiI = cipherI000oI1ioi;
/* 345 */               VarHandle.storeStoreFence();
/* 350 */               I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(20);
/* 353 */               i0IIiO0iI.I00iiI = iIloOI;
/* 355 */               VarHandle.storeStoreFence();
/* 358 */               return i0IIiO0iI;
                    } catch (InvalidAlgorithmParameterException e3) {
/* 376 */               throw new IIOlio1ol("algorithm parameters invalid.", e3);
                    } catch (InvalidKeyException e4) {
/* 403 */               throw new IIOlio1ol("key invalid in message.", e4);
                    } catch (NoSuchAlgorithmException e5) {
/* 412 */               throw new IIOlio1ol("can't find algorithm.", e5);
                    } catch (NoSuchProviderException e6) {
/* 394 */               throw new IIOlio1ol("can't find provider.", e6);
                    } catch (InvalidParameterSpecException e7) {
/* 367 */               throw new IIOlio1ol("MAC algorithm parameter spec invalid.", e7);
                    } catch (NoSuchPaddingException e8) {
/* 385 */               throw new IIOlio1ol("required padding not supported.", e8);
                    }
                }
            }
