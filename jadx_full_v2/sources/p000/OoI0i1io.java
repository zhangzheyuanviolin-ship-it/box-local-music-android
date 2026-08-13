            package p000;
            
/* 182 */   public final class OoI0i1io {
                public final double I00000oIO;
                public final double I00000oOI;
                public final double I0000Il00O;
                public final double I0000O;
                public final double I0000oI00;
                public final double I0001Ioi1lo;
                public final double I000II;

                public OoI0i1io(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
/* 4 */             this.I00000oIO = d;
/* 6 */             this.I00000oOI = d2;
/* 8 */             this.I0000Il00O = d3;
/* 10 */            this.I0000O = d4;
/* 12 */            this.I0000oI00 = d5;
/* 14 */            this.I0001Ioi1lo = d6;
/* 16 */            this.I000II = d7;
/* 22 */            if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d)) {
/* 179 */               I000II.I000iOII("Parameters cannot be NaN");
/* 965 */               throw null;
                    }
/* 64 */            if (d == -2.0d || d == -3.0d) {
/* 73 */                return;
                    }
/* 78 */            if (d5 < 0.0d || d5 > 1.0d) {
/* 172 */               IoOOl0iOl1io.I000II("Parameter d must be in the range [0..1], was ", d5);
/* 176 */               throw null;
                    }
/* 88 */            if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
/* 101 */               I000II.I000iOII("Parameter a or g is zero, the transfer function is constant");
/* 105 */               throw null;
                    }
/* 108 */           if (d5 >= 1.0d && d4 == 0.0d) {
/* 117 */               I000II.I000iOII("Parameter c is zero, the transfer function is constant");
/* 121 */               throw null;
                    }
/* 124 */           if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
/* 138 */               I000II.I000iOII("Parameter a or g is zero, and c is zero, the transfer function is constant");
/* 142 */               throw null;
                    }
/* 145 */           if (d4 < 0.0d) {
/* 165 */               I000II.I000iOII("The transfer function must be increasing");
/* 169 */               throw null;
                    }
/* 149 */           if (d2 < 0.0d || d < 0.0d) {
/* 158 */               I000II.I000iOII("The transfer function must be positive or increasing");
/* 162 */               throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OoI0i1io)) {
/* 7 */                 return false;
                    }
/* 11 */            OoI0i1io ooI0i1io = (OoI0i1io) obj;
                    return Double.compare(this.I00000oIO, ooI0i1io.I00000oIO) == 0 && Double.compare(this.I00000oOI, ooI0i1io.I00000oOI) == 0 && Double.compare(this.I0000Il00O, ooI0i1io.I0000Il00O) == 0 && Double.compare(this.I0000O, ooI0i1io.I0000O) == 0 && Double.compare(this.I0000oI00, ooI0i1io.I0000oI00) == 0 && Double.compare(this.I0001Ioi1lo, ooI0i1io.I0001Ioi1lo) == 0 && Double.compare(this.I000II, ooI0i1io.I000II) == 0;
                }

                public final int hashCode() {
/* 60 */            return Double.hashCode(this.I000II) + ((Double.hashCode(this.I0001Ioi1lo) + ((Double.hashCode(this.I0000oI00) + ((Double.hashCode(this.I0000O) + ((Double.hashCode(this.I0000Il00O) + ((Double.hashCode(this.I00000oOI) + (Double.hashCode(this.I00000oIO) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
                }

                public final String toString() {
/* 78 */            return "TransferParameters(gamma=" + this.I00000oIO + ", a=" + this.I00000oOI + ", b=" + this.I0000Il00O + ", c=" + this.I0000O + ", d=" + this.I0000oI00 + ", e=" + this.I0001Ioi1lo + ", f=" + this.I000II + ")";
                }

/* 183 */       public OoI0i1io(double d, double d2, double d3, double d4, double d5) {
/* 184 */           this(d, d2, d3, d4, d5, 0.0d, 0.0d);
                }
            }
