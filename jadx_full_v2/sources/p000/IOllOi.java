            package p000;

            import com.google.ai.edge.gallery.data.ValueType;
            
            public abstract class IOllOi {
                public static final int[] I00000oIO;

                static {
/* 6 */             int[] iArr = new int[ValueType.values().length];
                    try {
/* 15 */                iArr[ValueType.INT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
/* 24 */                iArr[ValueType.FLOAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
/* 33 */                iArr[ValueType.DOUBLE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
/* 42 */                iArr[ValueType.BOOLEAN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
/* 51 */                iArr[ValueType.STRING.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
/* 53 */            I00000oIO = iArr;
                }
            }
