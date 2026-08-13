            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Io1iO01 {
                public static final Io1iO01 I00000oOI;
                public boolean I00000oIO;

                static {
/* 3 */             Io1iO01 io1iO01 = new Io1iO01();
/* 7 */             io1iO01.I00000oIO = true;
/* 15 */            if (!ilo0IIoO1I1l.I00000oIO("")) {
/* 17 */                ilo0IIoO1I1l.I00000oIO("");
                    }
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            I00000oOI = io1iO01;
                }

                public final void I00000oIO(StringBuilder sb, String str) {
/* 7 */             IIl001iO0Io.I001lIiIIo1O(sb, str, "prefix = \"", "", "\",");
/* 12 */            sb.append('\n');
/* 15 */            sb.append(str);
/* 20 */            sb.append("suffix = \"");
/* 23 */            sb.append("");
/* 26 */            sb.append("\",");
/* 29 */            sb.append('\n');
/* 32 */            sb.append(str);
/* 37 */            sb.append("removeLeadingZeros = ");
/* 41 */            sb.append(false);
/* 46 */            sb.append(',');
/* 49 */            sb.append('\n');
/* 52 */            sb.append(str);
/* 57 */            sb.append("minLength = ");
/* 61 */            sb.append(1);
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("NumberHexFormat(\n");
/* 13 */            I00000oIO(sb, "    ");
/* 18 */            sb.append('\n');
/* 23 */            sb.append(")");
/* 26 */            return sb.toString();
                }
            }
