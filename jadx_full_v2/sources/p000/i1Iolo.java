            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.util.Log;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.UUID;
            
            public abstract class i1Iolo {
                public static final byte[] I00000oIO = {-119, 80, 78, 71};

                public static OlOO1i11110 I00000oIO(Context context, File file) {
                    Oi00IilOloo0 oi00IilOloo0I000II;
                    IoIlOo1o0IIl ioIlOo1o0IIlI00Io1o110i;
/* 4 */             O1I1OO o1i1oo = new O1I1OO(context, 7);
/* 7 */             o1i1oo.I001IIilI0O();
/* 10 */            I0OooiI1I i0OooiI1II00000oIO = l1I0IIOiI.I00000oIO(o1i1oo);
/* 14 */            Context applicationContext = context.getApplicationContext();
/* 18 */            String str = i0OooiI1II00000oIO.I00iiI;
/* 20 */            OlOii1oo00.I00000oIO();
/* 25 */            IOiOol0 iOiOol0 = new IOiOol0();
/* 34 */            iOiOol0.I00io1l = l0lI1iI.I00000oIO("AES256_GCM_HKDF_4KB");
/* 40 */            iOiOol0.I00IoiI(applicationContext, "__androidx_security_crypto_encrypted_file_keyset__", "__androidx_security_crypto_encrypted_file_pref__");
/* 57 */            iOiOol0.I00IoO0("android-keystore://" + str);
                    synchronized (iIO0olo1li1O.I00000oIO) {
/* 63 */                oi00IilOloo0I000II = iOiOol0.I000II();
                    }
                    synchronized (oi00IilOloo0I000II) {
/* 73 */                ioIlOo1o0IIlI00Io1o110i = ((IIloOI) oi00IilOloo0I000II.I00iOIl).I00Io1o110i();
                    }
/* 84 */            OlOiOooOO1 olOiOooOO1 = (OlOiOooOO1) ioIlOo1o0IIlI00Io1o110i.I001lIiIIo1O(OlOiOooOO1.class);
/* 90 */            OlOO1i11110 olOO1i11110 = new OlOO1i11110(12);
/* 93 */            olOO1i11110.I00iiI = file;
/* 95 */            olOO1i11110.I00iiO = olOiOooOO1;
/* 97 */            VarHandle.storeStoreFence();
/* 100 */           return olOO1i11110;
                }

                public static String I00000oOI(Context context, Bitmap bitmap) throws IOException {
                    try {
/* 9 */                 File file = new File(context.getFilesDir(), "chat_images");
/* 12 */                file.mkdirs();
/* 38 */                File file2 = new File(file, UUID.randomUUID() + ".png.enc");
/* 43 */                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
/* 50 */                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
/* 53 */                    byte[] byteArray = byteArrayOutputStream.toByteArray();
/* 57 */                    byteArrayOutputStream.close();
/* 64 */                    Il0IOO011iI il0IOO011iII0010I0i = I00000oIO(context, file2).I0010I0i();
                            try {
/* 68 */                        il0IOO011iII0010I0i.write(byteArray);
/* 71 */                        il0IOO011iII0010I0i.close();
/* 74 */                        return file2.getAbsolutePath();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Exception e) {
/* 98 */                Log.e("ChatImageStore", "Failed to save encrypted chat image", e);
/* 101 */               return null;
                    }
                }
            }
