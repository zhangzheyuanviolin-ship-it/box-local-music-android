            package p000;
            
            public final class iil0il1000i0 {
                public String I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public String I0000oI00;

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof iil0il1000i0)) {
/* 54 */                return false;
                    }
/* 8 */             iil0il1000i0 iil0il1000i0Var = (iil0il1000i0) obj;
                    return this.I00000oIO.equals(iil0il1000i0Var.I00000oIO) && this.I00000oOI.equals(iil0il1000i0Var.I00000oOI) && this.I0000Il00O == iil0il1000i0Var.I0000Il00O && this.I0000O == iil0il1000i0Var.I0000O && this.I0000oI00.equals(iil0il1000i0Var.I0000oI00);
                }

                public final int hashCode() {
/* 18 */            int iHashCode = ((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode();
/* 19 */            String str = this.I0000oI00;
/* 34 */            return ((this.I0000O ^ (((iHashCode * 1000003) ^ this.I0000Il00O) * 1000003)) * 1000003) ^ str.hashCode();
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("GpuInfo{rendererName=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", versionString=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", majorVersion=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", minorVersion=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", vendorName=");
/* 52 */            return IIl001iO0Io.I00100l0(sb, this.I0000oI00, "}");
                }
            }
