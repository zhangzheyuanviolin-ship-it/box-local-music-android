            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Io1iO0OololO {
                public static final Io1iO0OololO I0000Il00O;
                public Io1iIoi1OI0l I00000oIO;
                public Io1iO01 I00000oOI;

                static {
/* 3 */             Io1iIoi1OI0l io1iIoi1OI0l = Io1iIoi1OI0l.I00000oIO;
/* 5 */             Io1iO01 io1iO01 = Io1iO01.I00000oOI;
/* 7 */             Io1iO0OololO io1iO0OololO = new Io1iO0OololO();
/* 10 */            io1iO0OololO.I00000oIO = io1iIoi1OI0l;
/* 12 */            io1iO0OololO.I00000oOI = io1iO01;
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I0000Il00O = io1iO0OololO;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("HexFormat(\n    upperCase = false,\n    bytes = BytesHexFormat(\n");
/* 15 */            this.I00000oIO.I00000oIO(sb, "        ");
/* 20 */            sb.append('\n');
/* 25 */            sb.append("    ),");
/* 28 */            sb.append('\n');
/* 33 */            sb.append("    number = NumberHexFormat(");
/* 36 */            sb.append('\n');
/* 41 */            this.I00000oOI.I00000oIO(sb, "        ");
/* 44 */            sb.append('\n');
/* 49 */            sb.append("    )");
/* 52 */            sb.append('\n');
/* 57 */            sb.append(")");
/* 60 */            return sb.toString();
                }
            }
