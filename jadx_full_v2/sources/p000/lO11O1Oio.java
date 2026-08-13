            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.util.Base64;
            import android.util.Log;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.SecureRandom;
            import java.util.concurrent.CopyOnWriteArrayList;
            
            public abstract class lO11O1Oio {
                public static Il0IoIIl I00000oIO(Context context) {
                    IoIlOo1o0IIl ioIlOo1o0IIlI00Io1o110i;
                    IoIlOo1o0IIl ioIlOo1o0IIlI00Io1o110i2;
/* 3 */             int i = 7;
/* 4 */             O1I1OO o1i1oo = new O1I1OO(context, 7);
/* 7 */             o1i1oo.I001IIilI0O();
/* 16 */            String str = l1I0IIOiI.I00000oIO(o1i1oo).I00iiI;
/* 18 */            int i2 = IiOoi0i0io0l.I00000oIO;
/* 22 */            OOoiolOO0i.I000II(IiOoi0oOo1.I00000oOI);
/* 29 */            if (!Oo11ii010IIO.I00000oIO()) {
/* 53 */                OOoiolOO0i.I0000oI00(new I0Oi0oOOollO(I0i0loloI.class, new I0OO1oilIOl[]{new I0OO1oilIOl(8, IiOoOl0oIOi.class)}, i), true);
                    }
/* 56 */            I0OIlIOI1IO.I00000oIO();
/* 59 */            Context applicationContext = context.getApplicationContext();
/* 65 */            IOiOol0 iOiOol0 = new IOiOol0();
/* 74 */            iOiOol0.I00io1l = l0lI1iI.I00000oIO("AES256_SIV");
/* 78 */            iOiOol0.I00IoiI(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", "box_security_enc");
/* 95 */            iOiOol0.I00IoO0("android-keystore://" + str);
/* 98 */            Oi00IilOloo0 oi00IilOloo0I000II = iOiOol0.I000II();
                    synchronized (oi00IilOloo0I000II) {
/* 107 */               ioIlOo1o0IIlI00Io1o110i = ((IIloOI) oi00IilOloo0I000II.I00iOIl).I00Io1o110i();
                    }
/* 114 */           IOiOol0 iOiOol02 = new IOiOol0();
/* 123 */           iOiOol02.I00io1l = l0lI1iI.I00000oIO("AES256_GCM");
/* 127 */           iOiOol02.I00IoiI(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", "box_security_enc");
/* 142 */           iOiOol02.I00IoO0("android-keystore://" + str);
/* 145 */           Oi00IilOloo0 oi00IilOloo0I000II2 = iOiOol02.I000II();
                    synchronized (oi00IilOloo0I000II2) {
/* 154 */               ioIlOo1o0IIlI00Io1o110i2 = ((IIloOI) oi00IilOloo0I000II2.I00iOIl).I00Io1o110i();
                    }
/* 165 */           IiOoOl0oIOi iiOoOl0oIOi = (IiOoOl0oIOi) ioIlOo1o0IIlI00Io1o110i.I001lIiIIo1O(IiOoOl0oIOi.class);
/* 173 */           I0OIilIIo0 i0OIilIIo0 = (I0OIilIIo0) ioIlOo1o0IIlI00Io1o110i2.I001lIiIIo1O(I0OIilIIo0.class);
/* 178 */           SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("box_security_enc", 0);
/* 182 */           Il0IoIIl il0IoIIl = new Il0IoIIl();
/* 185 */           il0IoIIl.I00000oIO = sharedPreferences;
/* 187 */           il0IoIIl.I0000Il00O = i0OIilIIo0;
/* 189 */           il0IoIIl.I0000O = iiOoOl0oIOi;
/* 196 */           il0IoIIl.I00000oOI = new CopyOnWriteArrayList();
/* 198 */           VarHandle.storeStoreFence();
/* 201 */           return il0IoIIl;
                }

                public static byte[] I00000oOI(Context context) {
/* 1 */             Il0IoIIl il0IoIIlI00000oIO = I00000oIO(context);
/* 8 */             String string = il0IoIIlI00000oIO.getString("db_key", null);
/* 13 */            if (string != null) {
/* 15 */                return Base64.decode(string, 2);
                    }
/* 23 */            SharedPreferences sharedPreferences = context.getSharedPreferences("box_security", 0);
/* 27 */            String string2 = sharedPreferences.getString("db_key", null);
/* 31 */            if (string2 != null) {
/* 37 */                Il0Il1liIo il0Il1liIo = (Il0Il1liIo) il0IoIIlI00000oIO.edit();
/* 39 */                il0Il1liIo.putString("db_key", string2);
/* 42 */                il0Il1liIo.apply();
/* 53 */                sharedPreferences.edit().remove("db_key").apply();
/* 56 */                return Base64.decode(string2, 2);
                    }
/* 63 */            byte[] bArr = new byte[32];
/* 70 */            new SecureRandom().nextBytes(bArr);
/* 81 */            Il0Il1liIo il0Il1liIo2 = (Il0Il1liIo) il0IoIIlI00000oIO.edit();
/* 83 */            il0Il1liIo2.putString("db_key", Base64.encodeToString(bArr, 2));
/* 86 */            il0Il1liIo2.apply();
/* 186 */           return bArr;
                }

                /* JADX WARN: Finally extract failed */
                public static void I0000Il00O(File file) throws IOException {
                    try {
/* 5 */                 if (file.exists()) {
/* 10 */                    SecureRandom secureRandom = new SecureRandom();
/* 15 */                    byte[] bArr = new byte[8192];
/* 17 */                    long length = file.length();
/* 23 */                    FileOutputStream fileOutputStream = new FileOutputStream(file);
/* 26 */                    long j = 0;
/* 33 */                    while (j < length) {
                                try {
/* 35 */                            secureRandom.nextBytes(bArr);
/* 44 */                            int iMin = (int) Math.min(8192L, length - j);
/* 45 */                            fileOutputStream.write(bArr, 0, iMin);
/* 49 */                            j += iMin;
                                } catch (Throwable th) {
                                    try {
/* 149 */                               throw th;
                                    } finally {
                                    }
                                }
                            }
/* 54 */                    fileOutputStream.flush();
/* 57 */                    fileOutputStream.close();
/* 60 */                    byte[] bArr2 = new byte[8192];
/* 64 */                    fileOutputStream = new FileOutputStream(file);
/* 67 */                    long j2 = 0;
/* 71 */                    while (j2 < length) {
                                try {
/* 79 */                            int iMin2 = (int) Math.min(8192L, length - j2);
/* 80 */                            fileOutputStream.write(bArr2, 0, iMin2);
/* 84 */                            j2 += iMin2;
                                } catch (Throwable th2) {
                                    try {
/* 143 */                               throw th2;
                                    } finally {
                                    }
                                }
                            }
/* 89 */                    fileOutputStream.flush();
/* 92 */                    fileOutputStream.close();
/* 97 */                    fileOutputStream = new FileOutputStream(file);
/* 100 */                   long j3 = 0;
/* 104 */                   while (j3 < length) {
                                try {
/* 106 */                           secureRandom.nextBytes(bArr);
/* 115 */                           int iMin3 = (int) Math.min(8192L, length - j3);
/* 116 */                           fileOutputStream.write(bArr, 0, iMin3);
/* 120 */                           j3 += iMin3;
                                } finally {
                                }
                            }
/* 125 */                   fileOutputStream.flush();
/* 128 */                   fileOutputStream.close();
/* 131 */                   file.delete();
                        }
                    } catch (Exception e) {
/* 159 */               Log.e("BoxSecurity", "Secure delete failed", e);
/* 162 */               file.delete();
                    }
                }
            }
