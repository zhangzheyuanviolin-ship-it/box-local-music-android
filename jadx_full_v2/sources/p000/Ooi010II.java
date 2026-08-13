            package p000;
            
/* 10 */    public final class Ooi010II extends IooOoIOoIii {
                public final int I00000oOI = 0;

                public Ooi010II(byte b) {
/* 8 */             super(Byte.valueOf(b));
                }

                @Override
                public final O0iIl1 I00000oIO(OI0010oo1o oI0010oo1o) {
                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol10;
                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol102;
                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol103;
                    Ol0O0iI0l0O ol0O0iI0l0OI00Ol104;
                    switch (this.I00000oOI) {
                        case 0:
/* 92 */                    OI000ilOol oI000ilOolI00000oIO = ilOOOOloO.I00000oIO(oI0010oo1o, OlIllOO11lOl.I00O10llo);
                            return (oI000ilOolI00000oIO == null || (ol0O0iI0l0OI00Ol10 = oI000ilOolI00000oIO.I00Ol10()) == null) ? Il0ooiloI.I00000oOI(Il0ooO1IO.I00oliIiO01i, "UByte") : ol0O0iI0l0OI00Ol10;
                        case 1:
/* 64 */                    OI000ilOol oI000ilOolI00000oIO2 = ilOOOOloO.I00000oIO(oI0010oo1o, OlIllOO11lOl.I00OIO1);
                            return (oI000ilOolI00000oIO2 == null || (ol0O0iI0l0OI00Ol102 = oI000ilOolI00000oIO2.I00Ol10()) == null) ? Il0ooiloI.I00000oOI(Il0ooO1IO.I00oliIiO01i, "UInt") : ol0O0iI0l0OI00Ol102;
                        case 2:
/* 36 */                    OI000ilOol oI000ilOolI00000oIO3 = ilOOOOloO.I00000oIO(oI0010oo1o, OlIllOO11lOl.I00OIl);
                            return (oI000ilOolI00000oIO3 == null || (ol0O0iI0l0OI00Ol103 = oI000ilOolI00000oIO3.I00Ol10()) == null) ? Il0ooiloI.I00000oOI(Il0ooO1IO.I00oliIiO01i, "ULong") : ol0O0iI0l0OI00Ol103;
                        default:
/* 8 */                     OI000ilOol oI000ilOolI00000oIO4 = ilOOOOloO.I00000oIO(oI0010oo1o, OlIllOO11lOl.I00OI1);
                            return (oI000ilOolI00000oIO4 == null || (ol0O0iI0l0OI00Ol104 = oI000ilOolI00000oIO4.I00Ol10()) == null) ? Il0ooiloI.I00000oOI(Il0ooO1IO.I00oliIiO01i, "UShort") : ol0O0iI0l0OI00Ol104;
                    }
                }

                @Override
                public final String toString() {
/* 1 */             int i = this.I00000oOI;
/* 3 */             Object obj = this.I00000oIO;
                    switch (i) {
                        case 0:
/* 99 */                    return ((Number) obj).intValue() + ".toUByte()";
                        case 1:
/* 75 */                    return ((Number) obj).intValue() + ".toUInt()";
                        case 2:
/* 51 */                    return ((Number) obj).longValue() + ".toULong()";
                        default:
/* 27 */                    return ((Number) obj).intValue() + ".toUShort()";
                    }
                }

/* 11 */        public Ooi010II(short s) {
/* 13 */            super(Short.valueOf(s));
                }

/* 13 */        public Ooi010II(int i) {
/* 15 */            super(Integer.valueOf(i));
                }

/* 15 */        public Ooi010II(long j) {
/* 17 */            super(Long.valueOf(j));
                }
            }
