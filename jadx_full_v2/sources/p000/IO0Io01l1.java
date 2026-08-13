            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IO0Io01l1 {
                public static final IO0Io01l1 I00iOIl;
                public static final IO0Io01l1[] I00iiI;

                static {
/* 6 */             IO0Io01l1 iO0Io01l1 = new IO0Io01l1("FOR_SUBTYPING", 0);
/* 9 */             I00iOIl = iO0Io01l1;
/* 27 */            IO0Io01l1[] iO0Io01l1Arr = {iO0Io01l1, new IO0Io01l1("FOR_INCORPORATION", 1), new IO0Io01l1("FROM_EXPRESSION", 2)};
/* 31 */            I00iiI = iO0Io01l1Arr;
/* 33 */            ilIII1o11.I00000oIO(iO0Io01l1Arr);
                }

                public static IO0Io01l1 valueOf(String str) {
/* 7 */             return (IO0Io01l1) Enum.valueOf(IO0Io01l1.class, str);
                }

                public static IO0Io01l1[] values() {
/* 7 */             return (IO0Io01l1[]) I00iiI.clone();
                }
            }
