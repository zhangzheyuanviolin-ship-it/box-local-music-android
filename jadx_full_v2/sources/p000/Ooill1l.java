            package p000;
            
            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Ooill1l {
                public static final Ooill1l[] I00iio;
                public final IOIOill I00iOIl;
                public final OI1Iio0ii1 I00iiI;
                public final IOIOill I00iiO;

                static {
/* 57 */            Ooill1l[] ooill1lArr = {new Ooill1l("UBYTE", 0, o0iOli.I0000oI00("kotlin/UByte", false)), new Ooill1l("USHORT", 1, o0iOli.I0000oI00("kotlin/UShort", false)), new Ooill1l("UINT", 2, o0iOli.I0000oI00("kotlin/UInt", false)), new Ooill1l("ULONG", 3, o0iOli.I0000oI00("kotlin/ULong", false))};
/* 61 */            I00iio = ooill1lArr;
/* 63 */            ilIII1o11.I00000oIO(ooill1lArr);
                }

                public Ooill1l(String str, int i, IOIOill iOIOill) {
/* 4 */             this.I00iOIl = iOIOill;
/* 6 */             OI1Iio0ii1 oI1Iio0ii1I0001Ioi1lo = iOIOill.I0001Ioi1lo();
/* 10 */            this.I00iiI = oI1Iio0ii1I0001Ioi1lo;
/* 44 */            this.I00iiO = new IOIOill(iOIOill.I00000oIO, OI1Iio0ii1.I0000oI00(oI1Iio0ii1I0001Ioi1lo.I00000oOI() + "Array"));
                }

                public static Ooill1l valueOf(String str) {
/* 7 */             return (Ooill1l) Enum.valueOf(Ooill1l.class, str);
                }

                public static Ooill1l[] values() {
/* 7 */             return (Ooill1l[]) I00iio.clone();
                }
            }
