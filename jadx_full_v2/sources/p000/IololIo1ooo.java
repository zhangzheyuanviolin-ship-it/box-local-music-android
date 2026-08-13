            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IololIo1ooo {
                public static final IololIo1ooo I00iOIl;
                public static final IololIo1ooo I00iiI;
                public static final IololIo1ooo I00iiO;
                public static final IololIo1ooo[] I00iio;

                static {
/* 6 */             IololIo1ooo iololIo1ooo = new IololIo1ooo("Focused", 0);
/* 9 */             I00iOIl = iololIo1ooo;
/* 16 */            IololIo1ooo iololIo1ooo2 = new IololIo1ooo("UnfocusedEmpty", 1);
/* 19 */            I00iiI = iololIo1ooo2;
/* 26 */            IololIo1ooo iololIo1ooo3 = new IololIo1ooo("UnfocusedNotEmpty", 2);
/* 29 */            I00iiO = iololIo1ooo3;
/* 31 */            IololIo1ooo[] iololIo1oooArr = {iololIo1ooo, iololIo1ooo2, iololIo1ooo3};
/* 35 */            I00iio = iololIo1oooArr;
/* 37 */            ilIII1o11.I00000oIO(iololIo1oooArr);
                }

                public static IololIo1ooo valueOf(String str) {
/* 7 */             return (IololIo1ooo) Enum.valueOf(IololIo1ooo.class, str);
                }

                public static IololIo1ooo[] values() {
/* 7 */             return (IololIo1ooo[]) I00iio.clone();
                }
            }
