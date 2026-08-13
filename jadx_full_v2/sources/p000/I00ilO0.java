            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class I00ilO0 {
                public static final I00ilO0 I00iOIl;
                public static final I00ilO0 I00iiI;
                public static final I00ilO0 I00iiO;
                public static final I00ilO0[] I00iio;

                static {
/* 6 */             I00ilO0 i00ilO0 = new I00ilO0("PROPERTY", 0);
/* 9 */             I00iOIl = i00ilO0;
/* 16 */            I00ilO0 i00ilO02 = new I00ilO0("BACKING_FIELD", 1);
/* 19 */            I00iiI = i00ilO02;
/* 26 */            I00ilO0 i00ilO03 = new I00ilO0("DELEGATE_FIELD", 2);
/* 29 */            I00iiO = i00ilO03;
/* 31 */            I00ilO0[] i00ilO0Arr = {i00ilO0, i00ilO02, i00ilO03};
/* 35 */            I00iio = i00ilO0Arr;
/* 37 */            ilIII1o11.I00000oIO(i00ilO0Arr);
                }

                public static I00ilO0 valueOf(String str) {
/* 7 */             return (I00ilO0) Enum.valueOf(I00ilO0.class, str);
                }

                public static I00ilO0[] values() {
/* 7 */             return (I00ilO0[]) I00iio.clone();
                }
            }
