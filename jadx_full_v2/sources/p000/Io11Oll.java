            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Io11Oll {
                public static final Io11Oll I00iOIl;
                public static final Io11Oll I00iiI;
                public static final Io11Oll I00iiO;
                public static final Io11Oll[] I00iio;

                static {
/* 6 */             Io11Oll io11Oll = new Io11Oll("Cursor", 0);
/* 9 */             I00iOIl = io11Oll;
/* 16 */            Io11Oll io11Oll2 = new Io11Oll("SelectionStart", 1);
/* 19 */            I00iiI = io11Oll2;
/* 26 */            Io11Oll io11Oll3 = new Io11Oll("SelectionEnd", 2);
/* 29 */            I00iiO = io11Oll3;
/* 31 */            Io11Oll[] io11OllArr = {io11Oll, io11Oll2, io11Oll3};
/* 35 */            I00iio = io11OllArr;
/* 37 */            ilIII1o11.I00000oIO(io11OllArr);
                }

                public static Io11Oll valueOf(String str) {
/* 7 */             return (Io11Oll) Enum.valueOf(Io11Oll.class, str);
                }

                public static Io11Oll[] values() {
/* 7 */             return (Io11Oll[]) I00iio.clone();
                }
            }
