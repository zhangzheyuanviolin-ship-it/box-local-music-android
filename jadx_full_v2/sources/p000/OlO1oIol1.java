            package p000;

            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            
            public abstract class OlO1oIol1 {
                public static final int[] I00000oIO;

                static {
/* 6 */             int[] iArr = new int[ModelDownloadStatusType.values().length];
                    try {
/* 15 */                iArr[ModelDownloadStatusType.NOT_DOWNLOADED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
/* 24 */                iArr[ModelDownloadStatusType.SUCCEEDED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
/* 33 */                iArr[ModelDownloadStatusType.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
/* 42 */                iArr[ModelDownloadStatusType.IN_PROGRESS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
/* 44 */            I00000oIO = iArr;
                }
            }
