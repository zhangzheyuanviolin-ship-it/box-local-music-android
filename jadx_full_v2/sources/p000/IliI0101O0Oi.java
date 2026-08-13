            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class IliI0101O0Oi {
                public static final IliI0101O0Oi I00iOIl;
                public static final IliI0101O0Oi I00iiI;
                public static final IliI0101O0Oi I00iiO;
                public static final IliI0101O0Oi[] I00iio;

                static {
/* 6 */             IliI0101O0Oi iliI0101O0Oi = new IliI0101O0Oi("Active", 0);
/* 9 */             I00iOIl = iliI0101O0Oi;
/* 16 */            IliI0101O0Oi iliI0101O0Oi2 = new IliI0101O0Oi("ActiveParent", 1);
/* 19 */            I00iiI = iliI0101O0Oi2;
/* 26 */            IliI0101O0Oi iliI0101O0Oi3 = new IliI0101O0Oi("Captured", 2);
/* 34 */            IliI0101O0Oi iliI0101O0Oi4 = new IliI0101O0Oi("Inactive", 3);
/* 37 */            I00iiO = iliI0101O0Oi4;
/* 39 */            IliI0101O0Oi[] iliI0101O0OiArr = {iliI0101O0Oi, iliI0101O0Oi2, iliI0101O0Oi3, iliI0101O0Oi4};
/* 43 */            I00iio = iliI0101O0OiArr;
/* 45 */            ilIII1o11.I00000oIO(iliI0101O0OiArr);
                }

                public static IliI0101O0Oi valueOf(String str) {
/* 7 */             return (IliI0101O0Oi) Enum.valueOf(IliI0101O0Oi.class, str);
                }

                public static IliI0101O0Oi[] values() {
/* 7 */             return (IliI0101O0Oi[]) I00iio.clone();
                }

                public final boolean I00000oIO() {
/* 1 */             int iOrdinal = ordinal();
/* 6 */             if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
/* 5 */                 return true;
                    }
/* 14 */            if (iOrdinal == 3) {
/* 16 */                return false;
                    }
/* 18 */            I000II.I00000oIO();
/* 21 */            return false;
                }

                public final boolean I00000oOI() {
/* 1 */             int iOrdinal = ordinal();
/* 6 */             if (iOrdinal != 0) {
/* 8 */                 if (iOrdinal == 1) {
/* 22 */                    return false;
                        }
/* 11 */                if (iOrdinal != 2) {
/* 14 */                    if (iOrdinal == 3) {
/* 22 */                        return false;
                            }
/* 17 */                    I000II.I00000oIO();
/* 20 */                    return false;
                        }
                    }
/* 5 */             return true;
                }
            }
