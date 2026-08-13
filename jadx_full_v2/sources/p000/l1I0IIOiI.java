            package p000;

            import android.security.keystore.KeyGenParameterSpec;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.KeyStore;
            import java.security.ProviderException;
            import java.util.Arrays;
            import javax.crypto.KeyGenerator;
            
            public abstract class l1I0IIOiI {
                public static I0OooiI1I I00000oIO(O1I1OO o1i1oo) {
/* 1 */             int i = o1i1oo.I00iiI;
/* 4 */             if (i == 0 && ((KeyGenParameterSpec) o1i1oo.I00iiO) == null) {
/* 15 */                I000II.I000iOII("build() called before setKeyGenParameterSpec or setKeyScheme.");
/* 3 */                 return null;
                    }
/* 23 */            if (i == 1) {
/* 60 */                o1i1oo.I00iiO = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(Barcode.FORMAT_QR_CODE).build();
                    }
/* 64 */            KeyGenParameterSpec keyGenParameterSpec = (KeyGenParameterSpec) o1i1oo.I00iiO;
/* 66 */            if (keyGenParameterSpec == null) {
/* 270 */               IOOlIIilOl0.I000II("KeyGenParameterSpec was null after build() check");
/* 3 */                 return null;
                    }
/* 68 */            Object obj = O1OlI0O.I00000oIO;
/* 74 */            if (keyGenParameterSpec.getKeySize() != 256) {
/* 267 */               throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
                    }
/* 90 */            if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
/* 235 */               IoOOl0iOl1io.I001l0I00("invalid block mode, want GCM got ", Arrays.toString(keyGenParameterSpec.getBlockModes()));
/* 3 */                 return null;
                    }
/* 96 */            if (keyGenParameterSpec.getPurposes() != 3) {
/* 221 */               IioIoO10iOiI.I0001Ioi1lo(keyGenParameterSpec.getPurposes(), "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
/* 3 */                 return null;
                    }
/* 112 */           if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
/* 211 */               IoOOl0iOl1io.I001l0I00("invalid padding mode, want NoPadding got ", Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
/* 3 */                 return null;
                    }
/* 118 */           if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
/* 129 */               I000II.I000iOII("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
/* 3 */                 return null;
                    }
                    synchronized (O1OlI0O.I00000oIO) {
/* 136 */               String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
/* 142 */               KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
/* 146 */               keyStore.load(null);
/* 153 */               if (!keyStore.containsAlias(keystoreAlias)) {
                            try {
/* 159 */                       KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
/* 163 */                       keyGenerator.init(keyGenParameterSpec);
/* 166 */                       keyGenerator.generateKey();
                            } catch (ProviderException e) {
/* 180 */                       throw new GeneralSecurityException(e.getMessage(), e);
                            }
                        }
                    }
/* 182 */           String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
/* 189 */           I0OooiI1I i0OooiI1I = new I0OooiI1I(2);
/* 192 */           i0OooiI1I.I00iiI = keystoreAlias2;
/* 194 */           VarHandle.storeStoreFence();
/* 197 */           return i0OooiI1I;
                }
            }
