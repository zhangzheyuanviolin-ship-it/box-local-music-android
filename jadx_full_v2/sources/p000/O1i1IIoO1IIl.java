            package p000;

            import java.util.List;
            
            public final class O1i1IIoO1IIl {
                public final List I00000oIO;
                public final boolean I00000oOI;
                public final String I0000Il00O;

                public O1i1IIoO1IIl(List list, boolean z, String str) {
/* 4 */             this.I00000oIO = list;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = str;
                }

                public static O1i1IIoO1IIl I00000oIO(O1i1IIoO1IIl o1i1IIoO1IIl, List list, boolean z, String str, int i) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 list = o1i1IIoO1IIl.I00000oIO;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                z = o1i1IIoO1IIl.I00000oOI;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str = o1i1IIoO1IIl.I0000Il00O;
                    }
/* 19 */            o1i1IIoO1IIl.getClass();
/* 24 */            return new O1i1IIoO1IIl(list, z, str);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof O1i1IIoO1IIl)) {
/* 7 */                 return false;
                    }
/* 11 */            O1i1IIoO1IIl o1i1IIoO1IIl = (O1i1IIoO1IIl) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, o1i1IIoO1IIl.I00000oIO) && this.I00000oOI == o1i1IIoO1IIl.I00000oOI && O0000Ioio00.I0000O(this.I0000Il00O, o1i1IIoO1IIl.I0000Il00O);
                }

                public final int hashCode() {
/* 12 */            int iI000OOo1O = Oi010OO0.I000OOo1O(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI);
/* 16 */            String str = this.I0000Il00O;
/* 26 */            return iI000OOo1O + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("McpManagerUiState(mcpServers=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", loadingMcpServer=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", error=");
/* 32 */            return IIl001iO0Io.I00100l0(sb, this.I0000Il00O, ")");
                }
            }
