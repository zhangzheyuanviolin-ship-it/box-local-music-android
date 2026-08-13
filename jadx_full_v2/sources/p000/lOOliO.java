            package p000;

            import java.security.NoSuchAlgorithmException;
            
            public abstract class lOOliO {
                public static String I00000oIO(Io1IOo0o10ol io1IOo0o10ol) throws NoSuchAlgorithmException {
/* 1 */             int iOrdinal = io1IOo0o10ol.ordinal();
/* 6 */             if (iOrdinal == 1) {
/* 52 */                return "HmacSha1";
                    }
/* 9 */             if (iOrdinal == 2) {
/* 49 */                return "HmacSha384";
                    }
/* 12 */            if (iOrdinal == 3) {
/* 46 */                return "HmacSha256";
                    }
/* 15 */            if (iOrdinal == 4) {
/* 43 */                return "HmacSha512";
                    }
/* 18 */            if (iOrdinal == 5) {
/* 20 */                return "HmacSha224";
                    }
/* 42 */            throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + io1IOo0o10ol);
                }
            }
