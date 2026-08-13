            package p000;

            import java.util.Arrays;
            
            public final class IO1I0lIl0l extends IooOoIOoIii {
                @Override
                public final O0iIl1 I00000oIO(OI0010oo1o oI0010oo1o) {
/* 1 */             O0i1lI0o1io o0i1lI0o1ioI0000O = oI0010oo1o.I0000O();
/* 5 */             o0i1lI0o1ioI0000O.getClass();
/* 10 */            return o0i1lI0o1ioI0000O.I0010o(OOIil01OI.I00io1l);
                }

                @Override
                public final String toString() {
                    String strValueOf;
/* 1 */             Object obj = this.I00000oIO;
/* 10 */            Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
/* 16 */            char cCharValue = ((Character) obj).charValue();
                    switch (cCharValue) {
                        case '\b':
/* 74 */                    strValueOf = "\\b";
                            break;
                        case '\t':
/* 71 */                    strValueOf = "\\t";
                            break;
                        case '\n':
/* 68 */                    strValueOf = "\\n";
                            break;
                        case 11:
                        default:
/* 27 */                    byte type = (byte) Character.getType(cCharValue);
/* 28 */                    if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
/* 54 */                        strValueOf = String.valueOf(cCharValue);
                                break;
                            } else {
/* 59 */                        strValueOf = "?";
                                break;
                            }
                        case '\f':
/* 65 */                    strValueOf = "\\f";
                            break;
                        case '\r':
/* 62 */                    strValueOf = "\\r";
                            break;
                    }
/* 87 */            return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
                }
            }
