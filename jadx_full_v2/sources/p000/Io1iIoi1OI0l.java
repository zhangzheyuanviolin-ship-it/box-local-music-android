            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Io1iIoi1OI0l {
                public static final Io1iIoi1OI0l I00000oIO;

                static {
/* 3 */             Io1iIoi1OI0l io1iIoi1OI0l = new Io1iIoi1OI0l();
/* 12 */            if (!ilo0IIoO1I1l.I00000oIO("  ") && !ilo0IIoO1I1l.I00000oIO("") && !ilo0IIoO1I1l.I00000oIO("")) {
/* 28 */                ilo0IIoO1I1l.I00000oIO("");
                    }
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            I00000oIO = io1iIoi1OI0l;
                }

                public final void I00000oIO(StringBuilder sb, String str) {
/* 1 */             sb.append(str);
/* 6 */             sb.append("bytesPerLine = ");
/* 12 */            sb.append(Integer.MAX_VALUE);
/* 17 */            sb.append(",");
/* 22 */            sb.append('\n');
/* 25 */            sb.append(str);
/* 30 */            sb.append("bytesPerGroup = ");
/* 33 */            sb.append(Integer.MAX_VALUE);
/* 36 */            sb.append(",");
/* 39 */            sb.append('\n');
/* 42 */            sb.append(str);
/* 47 */            sb.append("groupSeparator = \"");
/* 52 */            sb.append("  ");
/* 57 */            sb.append("\",");
/* 60 */            sb.append('\n');
/* 63 */            sb.append(str);
/* 68 */            sb.append("byteSeparator = \"");
/* 73 */            sb.append("");
/* 76 */            sb.append("\",");
/* 79 */            sb.append('\n');
/* 84 */            IIl001iO0Io.I001lIiIIo1O(sb, str, "bytePrefix = \"", "", "\",");
/* 87 */            sb.append('\n');
/* 90 */            sb.append(str);
/* 95 */            sb.append("byteSuffix = \"");
/* 98 */            sb.append("");
/* 103 */           sb.append("\"");
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("BytesHexFormat(\n");
/* 13 */            I00000oIO(sb, "    ");
/* 18 */            sb.append('\n');
/* 23 */            sb.append(")");
/* 26 */            return sb.toString();
                }
            }
