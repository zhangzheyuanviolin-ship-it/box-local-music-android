            package p000;
            
            public final class ii00Il000 extends iOli1OIoI0o {
                public String I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof iOli1OIoI0o) {
/* 14 */                ii00Il000 ii00il000 = (ii00Il000) ((iOli1OIoI0o) obj);
/* 22 */                if (this.I00000oIO.equals(ii00il000.I00000oIO) && this.I00000oOI.equals(ii00il000.I00000oOI) && this.I0000Il00O == ii00il000.I0000Il00O && this.I0000O == ii00il000.I0000O && this.I0000oI00 == ii00il000.I0000oI00 && this.I0001Ioi1lo == ii00il000.I0001Ioi1lo) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 34 */            return this.I0001Ioi1lo ^ ((((((((((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O) * 1000003) ^ this.I0000oI00) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AiFeature{name=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", modelName=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", type=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", variant=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", id=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", version=");
/* 62 */            return IIl001iO0Io.I000lI(this.I0001Ioi1lo, "}", sb);
                }
            }
