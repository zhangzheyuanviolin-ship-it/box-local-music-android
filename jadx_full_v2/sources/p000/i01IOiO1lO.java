            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class i01IOiO1lO {
                public static final i01IOiO1lO I00iOIl;
                public static final i01IOiO1lO I00iiI;
                public static final i01IOiO1lO I00iiO;
                public static final i01IOiO1lO I00iio;
                public static final i01IOiO1lO I00ilI0I1;
                public static final i01IOiO1lO I00ilO0;
                public static final i01IOiO1lO[] I00io1l;

                static {
/* 6 */             i01IOiO1lO i01ioio1lo = new i01IOiO1lO("ENQUEUED", 0);
/* 9 */             I00iOIl = i01ioio1lo;
/* 16 */            i01IOiO1lO i01ioio1lo2 = new i01IOiO1lO("RUNNING", 1);
/* 19 */            I00iiI = i01ioio1lo2;
/* 26 */            i01IOiO1lO i01ioio1lo3 = new i01IOiO1lO("SUCCEEDED", 2);
/* 29 */            I00iiO = i01ioio1lo3;
/* 36 */            i01IOiO1lO i01ioio1lo4 = new i01IOiO1lO("FAILED", 3);
/* 39 */            I00iio = i01ioio1lo4;
/* 46 */            i01IOiO1lO i01ioio1lo5 = new i01IOiO1lO("BLOCKED", 4);
/* 49 */            I00ilI0I1 = i01ioio1lo5;
/* 56 */            i01IOiO1lO i01ioio1lo6 = new i01IOiO1lO("CANCELLED", 5);
/* 59 */            I00ilO0 = i01ioio1lo6;
/* 61 */            i01IOiO1lO[] i01ioio1loArr = {i01ioio1lo, i01ioio1lo2, i01ioio1lo3, i01ioio1lo4, i01ioio1lo5, i01ioio1lo6};
/* 65 */            I00io1l = i01ioio1loArr;
/* 67 */            ilIII1o11.I00000oIO(i01ioio1loArr);
                }

                public static i01IOiO1lO valueOf(String str) {
/* 7 */             return (i01IOiO1lO) Enum.valueOf(i01IOiO1lO.class, str);
                }

                public static i01IOiO1lO[] values() {
/* 7 */             return (i01IOiO1lO[]) I00io1l.clone();
                }

                public final boolean I00000oIO() {
                    return this == I00iiO || this == I00iio || this == I00ilO0;
                }
            }
