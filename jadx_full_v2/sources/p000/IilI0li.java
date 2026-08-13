            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IilI0li {
                public static final IilI0li I00iOIl;
                public static final IilI0li I00iiI;
                public static final IilI0li I00iiO;
                public static final IilI0li[] I00iio;

                static {
/* 6 */             IilI0li iilI0li = new IilI0li("Yes", 0);
/* 9 */             I00iOIl = iilI0li;
/* 16 */            IilI0li iilI0li2 = new IilI0li("No", 1);
/* 19 */            I00iiI = iilI0li2;
/* 26 */            IilI0li iilI0li3 = new IilI0li("NotInitialized", 2);
/* 29 */            I00iiO = iilI0li3;
/* 31 */            IilI0li[] iilI0liArr = {iilI0li, iilI0li2, iilI0li3};
/* 35 */            I00iio = iilI0liArr;
/* 37 */            ilIII1o11.I00000oIO(iilI0liArr);
                }

                public static IilI0li valueOf(String str) {
/* 7 */             return (IilI0li) Enum.valueOf(IilI0li.class, str);
                }

                public static IilI0li[] values() {
/* 7 */             return (IilI0li[]) I00iio.clone();
                }
            }
