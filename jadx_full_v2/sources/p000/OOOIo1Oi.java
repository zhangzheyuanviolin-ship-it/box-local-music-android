            package p000;

            import java.security.PrivilegedAction;
            import java.security.Security;
            
            public final class OOOIo1Oi implements PrivilegedAction {
                public final int I00000oIO;
                public String I00000oOI;

                @Override
                public final Object run() {
                    switch (this.I00000oIO) {
                        case 0:
/* 15 */                    return Security.getProperty(this.I00000oOI);
                        default:
/* 8 */                     return System.getProperty(this.I00000oOI);
                    }
                }
            }
