            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.security.AlgorithmParameters;
            import java.security.GeneralSecurityException;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.util.HashMap;
            import javax.crypto.Cipher;
            
            public final class OIiiIOi1l {
                public static final HashMap I00000oIO;
                public static final HashMap I00000oOI;

                static {
/* 3 */             HashMap map = new HashMap();
/* 8 */             HashMap map2 = new HashMap();
/* 11 */            I00000oIO = map2;
/* 15 */            HashMap map3 = new HashMap();
/* 20 */            HashMap map4 = new HashMap();
/* 23 */            I00000oOI = map4;
/* 27 */            HashMap map5 = new HashMap();
/* 36 */            map.put(OIOi01IIiI.I00000oOI, "SHA1");
/* 43 */            map.put(OI1II0.I0000O, "SHA224");
/* 50 */            map.put(OI1II0.I00000oIO, "SHA256");
/* 57 */            map.put(OI1II0.I00000oOI, "SHA384");
/* 64 */            map.put(OI1II0.I0000Il00O, "SHA512");
/* 71 */            map.put(OloOI0i.I00000oOI, "RIPEMD128");
/* 78 */            map.put(OloOI0i.I00000oIO, "RIPEMD160");
/* 85 */            map.put(OloOI0i.I0000Il00O, "RIPEMD256");
/* 92 */            map2.put(OIo0iOol.I00000oIO, "RSA/ECB/PKCS1Padding");
/* 99 */            map2.put(Ii0i0o00.I000OOo1O, "ECGOST3410");
/* 102 */           I00O0i0ii i00O0i0ii = OIo0iOol.I001IIilI0O;
/* 106 */           map3.put(i00O0i0ii, "DESEDEWrap");
/* 113 */           map3.put(OIo0iOol.I001IO000, "RC2Wrap");
/* 116 */           I00O0i0ii i00O0i0ii2 = OI1II0.I000iOII;
/* 120 */           map3.put(i00O0i0ii2, "AESWrap");
/* 123 */           I00O0i0ii i00O0i0ii3 = OI1II0.I00100l0;
/* 125 */           map3.put(i00O0i0ii3, "AESWrap");
/* 128 */           I00O0i0ii i00O0i0ii4 = OI1II0.I001IIilI0O;
/* 130 */           map3.put(i00O0i0ii4, "AESWrap");
/* 133 */           I00O0i0ii i00O0i0ii5 = OI1IOOi1.I0000O;
/* 137 */           map3.put(i00O0i0ii5, "CamelliaWrap");
/* 140 */           I00O0i0ii i00O0i0ii6 = OI1IOOi1.I0000oI00;
/* 142 */           map3.put(i00O0i0ii6, "CamelliaWrap");
/* 145 */           I00O0i0ii i00O0i0ii7 = OI1IOOi1.I0001Ioi1lo;
/* 147 */           map3.put(i00O0i0ii7, "CamelliaWrap");
/* 150 */           I00O0i0ii i00O0i0ii8 = O0Iiloil110.I00000oOI;
/* 154 */           map3.put(i00O0i0ii8, "SEEDWrap");
/* 157 */           I00O0i0ii i00O0i0ii9 = OIo0iOol.I000OOo1O;
/* 161 */           map3.put(i00O0i0ii9, "DESede");
/* 170 */           map5.put(i00O0i0ii, 192);
/* 175 */           Integer numValueOf = Integer.valueOf(Barcode.FORMAT_ITF);
/* 179 */           map5.put(i00O0i0ii2, numValueOf);
/* 182 */           map5.put(i00O0i0ii3, 192);
/* 187 */           Integer numValueOf2 = Integer.valueOf(Barcode.FORMAT_QR_CODE);
/* 191 */           map5.put(i00O0i0ii4, numValueOf2);
/* 194 */           map5.put(i00O0i0ii5, numValueOf);
/* 197 */           map5.put(i00O0i0ii6, 192);
/* 200 */           map5.put(i00O0i0ii7, numValueOf2);
/* 203 */           map5.put(i00O0i0ii8, numValueOf);
/* 206 */           map5.put(i00O0i0ii9, 192);
/* 213 */           map4.put(OI1II0.I000OOo1O, "AES");
/* 218 */           map4.put(OI1II0.I000OiO, "AES");
/* 223 */           map4.put(OI1II0.I000oI1ioi, "AES");
/* 228 */           map4.put(OI1II0.I00111O, "AES");
/* 231 */           map4.put(i00O0i0ii9, "DESede");
/* 238 */           map4.put(OIo0iOol.I000OiO, "RC2");
                }

                public static String I0000Il00O(I00O0i0ii i00O0i0ii) {
/* 7 */             String str = (String) I00000oOI.get(i00O0i0ii);
                    return str != null ? str : i00O0i0ii.I00iOIl;
                }

                public final AlgorithmParameters I00000oIO(I0ioOiiIO0 i0ioOiiIO0) {
/* 9 */             if (i0ioOiiIO0.I00iOIl.I0010o(OIo0iOol.I00000oIO)) {
/* 84 */                return null;
                    }
                    try {
/* 16 */                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(i0ioOiiIO0.I00iOIl.I00iOIl);
                        try {
/* 30 */                    algorithmParameters.init(i0ioOiiIO0.I00iiI.I0000O().I000iOII());
/* 33 */                    return algorithmParameters;
                        } catch (IOException e) {
/* 58 */                    throw new OIiiIIilIo("cannot initialise algorithm parameters: " + e.getMessage(), e);
                        }
                    } catch (NoSuchAlgorithmException unused) {
/* 84 */                return null;
                    } catch (NoSuchProviderException e2) {
/* 83 */                throw new OIiiIIilIo("cannot create algorithm parameters: " + e2.getMessage(), e2);
                    }
                }

                public final Cipher I00000oOI(I00O0i0ii i00O0i0ii, HashMap map) {
                    try {
/* 14 */                String str = !map.isEmpty() ? (String) map.get(i00O0i0ii) : null;
/* 15 */                if (str == null) {
/* 23 */                    str = (String) I00000oIO.get(i00O0i0ii);
                        }
/* 25 */                if (str != null) {
                            try {
/* 27 */                        return Cipher.getInstance(str);
                            } catch (NoSuchAlgorithmException unused) {
/* 38 */                        if (str.equals("RSA/ECB/PKCS1Padding")) {
                                    try {
/* 42 */                                return Cipher.getInstance("RSA/NONE/PKCS1Padding");
                                    } catch (NoSuchAlgorithmException unused2) {
                                    }
                                }
                            }
                        }
/* 49 */                return Cipher.getInstance(i00O0i0ii.I00iOIl);
                    } catch (GeneralSecurityException e) {
/* 89 */                throw new OIiiIIilIo("cannot create cipher: " + e.getMessage(), e);
                    }
                }
            }
