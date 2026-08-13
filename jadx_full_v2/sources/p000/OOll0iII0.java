            package p000;

            import java.net.Proxy;
            
            public abstract class OOll0iII0 {
                public static final int[] I00000oIO;

                static {
/* 6 */             int[] iArr = new int[Proxy.Type.values().length];
                    try {
/* 15 */                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
/* 24 */                iArr[Proxy.Type.HTTP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
/* 26 */            I00000oIO = iArr;
                }
            }
