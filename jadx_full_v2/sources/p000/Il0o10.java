            package p000;

            import java.security.GeneralSecurityException;
            import java.security.KeyFactory;
            import java.security.NoSuchAlgorithmException;
            import java.util.HashMap;
            import java.util.HashSet;
            import javax.crypto.Cipher;
            import javax.crypto.KeyAgreement;
            
            public final class Il0o10 {
                public static final HashMap I00000oIO;
                public static final HashMap I00000oOI;

                static {
/* 1 */             int i = IiI11o11.I00000oIO;
/* 5 */             HashSet hashSet = new HashSet();
/* 10 */            HashMap map = new HashMap();
/* 13 */            I00000oIO = map;
/* 17 */            HashMap map2 = new HashMap();
/* 20 */            I00000oOI = map2;
/* 24 */            HashMap map3 = new HashMap();
/* 29 */            HashMap map4 = new HashMap();
/* 32 */            I00O0i0ii i00O0i0ii = IIOlOI.I00000oIO;
/* 36 */            map.put(i00O0i0ii, "DES");
/* 39 */            I00O0i0ii i00O0i0ii2 = IIOlOI.I00000oOI;
/* 43 */            map.put(i00O0i0ii2, "DESEDE");
/* 46 */            I00O0i0ii i00O0i0ii3 = IIOlOI.I0000oI00;
/* 50 */            map.put(i00O0i0ii3, "AES");
/* 53 */            I00O0i0ii i00O0i0ii4 = IIOlOI.I0001Ioi1lo;
/* 55 */            map.put(i00O0i0ii4, "AES");
/* 58 */            I00O0i0ii i00O0i0ii5 = IIOlOI.I000II;
/* 60 */            map.put(i00O0i0ii5, "AES");
/* 63 */            I00O0i0ii i00O0i0ii6 = IIOlOI.I0000Il00O;
/* 67 */            map.put(i00O0i0ii6, "RC2");
/* 70 */            I00O0i0ii i00O0i0ii7 = IIOlOI.I0000O;
/* 74 */            map.put(i00O0i0ii7, "CAST5");
/* 77 */            I00O0i0ii i00O0i0ii8 = IIOlOI.I000O01llI0;
/* 81 */            map.put(i00O0i0ii8, "Camellia");
/* 84 */            I00O0i0ii i00O0i0ii9 = IIOlOI.I000OOo1O;
/* 86 */            map.put(i00O0i0ii9, "Camellia");
/* 89 */            I00O0i0ii i00O0i0ii10 = IIOlOI.I000OiO;
/* 91 */            map.put(i00O0i0ii10, "Camellia");
/* 94 */            I00O0i0ii i00O0i0ii11 = IIOlOI.I000iOII;
/* 100 */           map.put(i00O0i0ii11, "SEED");
/* 103 */           I00O0i0ii i00O0i0ii12 = OIo0iOol.I000iOII;
/* 109 */           map.put(i00O0i0ii12, "RC4");
/* 120 */           map.put(Ii0i0o00.I0000O, "GOST28147");
/* 125 */           map2.put(i00O0i0ii, "DES/CBC/PKCS5Padding");
/* 130 */           map2.put(i00O0i0ii6, "RC2/CBC/PKCS5Padding");
/* 135 */           map2.put(i00O0i0ii2, "DESEDE/CBC/PKCS5Padding");
/* 140 */           map2.put(i00O0i0ii3, "AES/CBC/PKCS5Padding");
/* 143 */           map2.put(i00O0i0ii4, "AES/CBC/PKCS5Padding");
/* 146 */           map2.put(i00O0i0ii5, "AES/CBC/PKCS5Padding");
/* 153 */           map2.put(OIo0iOol.I00000oIO, "RSA/ECB/PKCS1Padding");
/* 158 */           map2.put(i00O0i0ii7, "CAST5/CBC/PKCS5Padding");
/* 163 */           map2.put(i00O0i0ii8, "Camellia/CBC/PKCS5Padding");
/* 166 */           map2.put(i00O0i0ii9, "Camellia/CBC/PKCS5Padding");
/* 169 */           map2.put(i00O0i0ii10, "Camellia/CBC/PKCS5Padding");
/* 174 */           map2.put(i00O0i0ii11, "SEED/CBC/PKCS5Padding");
/* 179 */           map2.put(i00O0i0ii12, "RC4");
/* 186 */           map3.put(i00O0i0ii2, "DESEDEMac");
/* 191 */           map3.put(i00O0i0ii3, "AESMac");
/* 194 */           map3.put(i00O0i0ii4, "AESMac");
/* 197 */           map3.put(i00O0i0ii5, "AESMac");
/* 202 */           map3.put(i00O0i0ii6, "RC2Mac");
/* 213 */           map4.put(OO01o0O000.I00000oOI.I00000oIO, "PBKDF2WITHHMACSHA1");
/* 222 */           map4.put(OO01o0O000.I0000Il00O.I00000oIO, "PBKDF2WITHHMACSHA224");
/* 231 */           map4.put(OO01o0O000.I0000O.I00000oIO, "PBKDF2WITHHMACSHA256");
/* 240 */           map4.put(OO01o0O000.I0000oI00.I00000oIO, "PBKDF2WITHHMACSHA384");
/* 249 */           map4.put(OO01o0O000.I0001Ioi1lo.I00000oIO, "PBKDF2WITHHMACSHA512");
/* 256 */           hashSet.add(OI1II0.I000l1);
/* 261 */           hashSet.add(OI1II0.I00100o1O0lo);
/* 266 */           hashSet.add(OI1II0.I001IO000);
/* 271 */           hashSet.add(OI1II0.I000lI);
/* 276 */           hashSet.add(OI1II0.I0010I0i);
/* 281 */           hashSet.add(OI1II0.I001i1O0Ol);
                }

                public final Cipher I00000oIO(I00O0i0ii i00O0i0ii) {
                    try {
/* 7 */                 String str = (String) I00000oOI.get(i00O0i0ii);
/* 9 */                 if (str != null) {
                            try {
/* 11 */                        return Cipher.getInstance(str);
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
/* 18 */                return Cipher.getInstance(i00O0i0ii.I00iOIl);
                    } catch (GeneralSecurityException e) {
/* 49 */                throw new IIOlio1ol("cannot create cipher: " + e.getMessage(), e);
                    }
                }

                public final KeyAgreement I00000oOI(I00O0i0ii i00O0i0ii) throws IIOlio1ol {
                    try {
/* 7 */                 String str = (String) I00000oIO.get(i00O0i0ii);
/* 9 */                 if (str != null) {
                            try {
/* 11 */                        return KeyAgreement.getInstance(str);
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
/* 18 */                return KeyAgreement.getInstance(i00O0i0ii.I00iOIl);
                    } catch (GeneralSecurityException e) {
/* 49 */                throw new IIOlio1ol("cannot create key agreement: " + e.getMessage(), e);
                    }
                }

                public final KeyFactory I0000Il00O(I00O0i0ii i00O0i0ii) throws IIOlio1ol {
                    try {
/* 7 */                 String str = (String) I00000oIO.get(i00O0i0ii);
/* 9 */                 if (str != null) {
                            try {
/* 11 */                        return KeyFactory.getInstance(str);
                            } catch (NoSuchAlgorithmException unused) {
                            }
                        }
/* 18 */                return KeyFactory.getInstance(i00O0i0ii.I00iOIl);
                    } catch (GeneralSecurityException e) {
/* 49 */                throw new IIOlio1ol("cannot create key factory: " + e.getMessage(), e);
                    }
                }
            }
