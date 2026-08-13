            package p000;

            import android.webkit.ConsoleMessage;
            
            public abstract class I0iO1Ioo {
                public static final int[] I00000oIO;

                static {
/* 6 */             int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
                    try {
/* 15 */                iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
/* 24 */                iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
/* 33 */                iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
/* 35 */            I00000oIO = iArr;
                }
            }
