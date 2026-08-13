            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class OlilIOi1ooi {
                public static final OlilIOi1ooi I00iOIl;
                public static final OlilIOi1ooi I00iiI;
                public static final OlilIOi1ooi I00iiO;
                public static final OlilIOi1ooi I00iio;
                public static final OlilIOi1ooi I00ilI0I1;
                public static final OlilIOi1ooi[] I00ilO0;

                static {
/* 6 */             OlilIOi1ooi olilIOi1ooi = new OlilIOi1ooi("END", 0);
/* 9 */             I00iOIl = olilIOi1ooi;
/* 16 */            OlilIOi1ooi olilIOi1ooi2 = new OlilIOi1ooi("ROLLBACK", 1);
/* 19 */            I00iiI = olilIOi1ooi2;
/* 26 */            OlilIOi1ooi olilIOi1ooi3 = new OlilIOi1ooi("BEGIN_EXCLUSIVE", 2);
/* 29 */            I00iiO = olilIOi1ooi3;
/* 36 */            OlilIOi1ooi olilIOi1ooi4 = new OlilIOi1ooi("BEGIN_IMMEDIATE", 3);
/* 39 */            I00iio = olilIOi1ooi4;
/* 46 */            OlilIOi1ooi olilIOi1ooi5 = new OlilIOi1ooi("BEGIN_DEFERRED", 4);
/* 49 */            I00ilI0I1 = olilIOi1ooi5;
/* 51 */            OlilIOi1ooi[] olilIOi1ooiArr = {olilIOi1ooi, olilIOi1ooi2, olilIOi1ooi3, olilIOi1ooi4, olilIOi1ooi5};
/* 55 */            I00ilO0 = olilIOi1ooiArr;
/* 57 */            ilIII1o11.I00000oIO(olilIOi1ooiArr);
                }

                public static OlilIOi1ooi valueOf(String str) {
/* 7 */             return (OlilIOi1ooi) Enum.valueOf(OlilIOi1ooi.class, str);
                }

                public static OlilIOi1ooi[] values() {
/* 7 */             return (OlilIOi1ooi[]) I00ilO0.clone();
                }
            }
