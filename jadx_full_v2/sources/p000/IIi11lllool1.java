            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IIi11lllool1 {
                public static final IIi11lllool1 I00iiO;
                public static final IIi11lllool1 I00iio;
                public static final IIi11lllool1[] I00ilI0I1;
                public final boolean I00iOIl;
                public final boolean I00iiI;

                static {
/* 7 */             IIi11lllool1 iIi11lllool1 = new IIi11lllool1("ENABLED", 0, true, true);
/* 10 */            I00iiO = iIi11lllool1;
/* 16 */            IIi11lllool1 iIi11lllool12 = new IIi11lllool1("READ_ONLY", 1, true, false);
/* 24 */            IIi11lllool1 iIi11lllool13 = new IIi11lllool1("WRITE_ONLY", 2, false, true);
/* 32 */            IIi11lllool1 iIi11lllool14 = new IIi11lllool1("DISABLED", 3, false, false);
/* 35 */            I00iio = iIi11lllool14;
/* 37 */            IIi11lllool1[] iIi11lllool1Arr = {iIi11lllool1, iIi11lllool12, iIi11lllool13, iIi11lllool14};
/* 41 */            I00ilI0I1 = iIi11lllool1Arr;
/* 43 */            ilIII1o11.I00000oIO(iIi11lllool1Arr);
                }

                public IIi11lllool1(String str, int i, boolean z, boolean z2) {
/* 4 */             this.I00iOIl = z;
/* 6 */             this.I00iiI = z2;
                }

                public static IIi11lllool1 valueOf(String str) {
/* 7 */             return (IIi11lllool1) Enum.valueOf(IIi11lllool1.class, str);
                }

                public static IIi11lllool1[] values() {
/* 7 */             return (IIi11lllool1[]) I00ilI0I1.clone();
                }
            }
