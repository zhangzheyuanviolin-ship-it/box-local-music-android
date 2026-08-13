            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.util.Locale;
            import java.util.regex.Pattern;
            
            public abstract class Oolo11o0IIio {
                static {
/* 4 */             Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
/* 9 */             Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
                }

                public static void I00000oIO(int i) {
/* 3 */             if (i != 16 && i != 32) {
/* 31 */                throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
                    }
                }

                public static String I00000oOI(String str) {
/* 13 */            if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
/* 17 */                return str.substring(19);
                    }
/* 24 */            I000II.I000iOII("key URI must start with android-keystore://");
/* 27 */            return null;
                }

                public static void I0000Il00O(int i) throws GeneralSecurityException {
/* 1 */             if (i < 0 || i > 0) {
/* 49 */                throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(i), 0));
                    }
                }
            }
