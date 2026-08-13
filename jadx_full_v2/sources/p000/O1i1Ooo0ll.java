            package p000;
            
            public final class O1i1Ooo0ll {
                public final O1i1OolO I00000oIO;
                public final IOIo001i1o I00000oOI;
                public final String I0000Il00O;

                public O1i1Ooo0ll(O1i1OolO o1i1OolO, IOIo001i1o iOIo001i1o, String str) {
/* 4 */             this.I00000oIO = o1i1OolO;
/* 6 */             this.I00000oOI = iOIo001i1o;
/* 8 */             this.I0000Il00O = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 45 */                return true;
                    }
/* 6 */             if (!(obj instanceof O1i1Ooo0ll)) {
/* 43 */                return false;
                    }
/* 9 */             O1i1Ooo0ll o1i1Ooo0ll = (O1i1Ooo0ll) obj;
                    return this.I00000oIO.equals(o1i1Ooo0ll.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, o1i1Ooo0ll.I00000oOI) && O0000Ioio00.I0000O(this.I0000Il00O, o1i1Ooo0ll.I0000Il00O);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00000oIO.hashCode() * 31;
/* 10 */            IOIo001i1o iOIo001i1o = this.I00000oOI;
/* 21 */            int iHashCode2 = (iHashCode + (iOIo001i1o == null ? 0 : iOIo001i1o.hashCode())) * 31;
/* 23 */            String str = this.I0000Il00O;
/* 32 */            return iHashCode2 + (str != null ? str.hashCode() : 0);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("McpServerState(mcpServer=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", client=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", error=");
/* 32 */            return IIl001iO0Io.I00100l0(sb, this.I0000Il00O, ")");
                }
            }
