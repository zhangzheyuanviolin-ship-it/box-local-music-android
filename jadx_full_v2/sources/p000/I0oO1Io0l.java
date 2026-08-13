            package p000;

            import android.security.keystore.KeyGenParameterSpec;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.KeyStore;
            import java.security.KeyStoreException;
            import java.security.NoSuchAlgorithmException;
            import java.security.NoSuchProviderException;
            import java.security.cert.CertificateException;
            import java.util.Arrays;
            import javax.crypto.KeyGenerator;
            import javax.crypto.SecretKey;
            
            public final class I0oO1Io0l {
                public static final Object I00000oOI = new Object();
                public KeyStore I00000oIO;

                public I0oO1Io0l() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
                    try {
/* 4 */                 KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 8 */                 keyStore.load(null);
/* 14 */                this.I00000oIO = keyStore;
                    } catch (IOException | GeneralSecurityException e) {
/* 18 */                OoOil11Ol1o.I000oI1ioi(e);
/* 55 */                throw null;
                    }
                }

                public static boolean I00000oIO(String str) {
/* 3 */             I0oO1Io0l i0oO1Io0l = new I0oO1Io0l();
                    synchronized (I00000oOI) {
                        try {
/* 13 */                    if (i0oO1Io0l.I0000O(str)) {
/* 23 */                        return false;
                            }
/* 15 */                    I00000oOI(str);
/* 18 */                    return true;
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
                }

                public static void I00000oOI(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
/* 1 */             String strI00000oOI = Oolo11o0IIio.I00000oOI(str);
/* 9 */             KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
/* 49 */            keyGenerator.init(new KeyGenParameterSpec.Builder(strI00000oOI, 3).setKeySize(Barcode.FORMAT_QR_CODE).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
/* 52 */            keyGenerator.generateKey();
                }

                public final synchronized I0Ooii0oll I0000Il00O(String str) {
                    I0Ooii0oll i0Ooii0oll;
/* 6 */             String strI00000oOI = Oolo11o0IIio.I00000oOI(str);
/* 10 */            KeyStore keyStore = this.I00000oIO;
/* 13 */            i0Ooii0oll = new I0Ooii0oll(1);
/* 21 */            SecretKey secretKey = (SecretKey) keyStore.getKey(strI00000oOI, null);
/* 23 */            i0Ooii0oll.I00000oOI = secretKey;
/* 25 */            if (secretKey == null) {
/* 72 */                throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(strI00000oOI));
                    }
/* 27 */            VarHandle.storeStoreFence();
/* 32 */            byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(10);
/* 37 */            byte[] bArr = new byte[0];
/* 51 */            if (!Arrays.equals(bArrI00000oIO, i0Ooii0oll.I00000oOI(i0Ooii0oll.I00000oIO(bArrI00000oIO, bArr), bArr))) {
/* 62 */                throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                    }
/* 54 */            return i0Ooii0oll;
                }

                public final synchronized boolean I0000O(String str) {
                    String strI00000oOI;
/* 2 */             strI00000oOI = Oolo11o0IIio.I00000oOI(str);
                    try {
                    } catch (NullPointerException unused) {
/* 20 */                Log.w("I0oO1Io0l", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                        try {
                            try {
/* 32 */                        Thread.sleep((int) (Math.random() * 40.0d));
                            } catch (InterruptedException unused2) {
                            }
/* 37 */                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 41 */                    this.I00000oIO = keyStore;
/* 44 */                    keyStore.load(null);
/* 49 */                    return this.I00000oIO.containsAlias(strI00000oOI);
                        } catch (IOException e) {
/* 61 */                    throw new GeneralSecurityException(e);
                        }
                    }
/* 8 */             return this.I00000oIO.containsAlias(strI00000oOI);
                }
            }
