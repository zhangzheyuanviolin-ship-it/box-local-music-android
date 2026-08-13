            package p000;

            import org.conscrypt.Conscrypt;
            
            public abstract class IOo00I1IO {
                public static boolean I00000oIO() {
/* 1 */             Conscrypt.Version version = Conscrypt.version();
/* 11 */            if (version.major() != 2) {
/* 17 */                if (version.major() <= 2) {
/* 40 */                    return false;
                        }
                    } else if (version.minor() != 1) {
/* 30 */                if (version.minor() <= 1) {
/* 40 */                    return false;
                        }
                    } else if (version.patch() < 0) {
/* 40 */                return false;
                    }
/* 10 */            return true;
                }
            }
