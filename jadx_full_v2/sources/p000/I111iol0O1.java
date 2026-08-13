            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* 9 */     public final class I111iol0O1 {
                public static final I111iol0O1 I00iiO;
                public static final I111iol0O1[] I00iio;
                public final boolean I00iOIl;
                public final boolean I00iiI;

                static {
/* 7 */             I111iol0O1 i111iol0O1 = new I111iol0O1("NO_ARGUMENTS", 0, 3);
/* 10 */            I00iiO = i111iol0O1;
/* 28 */            I111iol0O1[] i111iol0O1Arr = {i111iol0O1, new I111iol0O1("UNLESS_EMPTY", 1, 2), new I111iol0O1("ALWAYS_PARENTHESIZED", 2, true, true)};
/* 32 */            I00iio = i111iol0O1Arr;
/* 34 */            ilIII1o11.I00000oIO(i111iol0O1Arr);
                }

                public I111iol0O1(String str, int i, int i2) {
/* 7 */             this(str, i, (i2 & 1) == 0, false);
                }

                public static I111iol0O1 valueOf(String str) {
/* 7 */             return (I111iol0O1) Enum.valueOf(I111iol0O1.class, str);
                }

                public static I111iol0O1[] values() {
/* 7 */             return (I111iol0O1[]) I00iio.clone();
                }

/* 10 */        public I111iol0O1(String str, int i, boolean z, boolean z2) {
/* 12 */            this.I00iOIl = z;
/* 13 */            this.I00iiI = z2;
                }
            }
