            package p000;
            
            public final class ilOiOOII0I0 {
                public String I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public String I000O01llI0;

                public final lOiIOoIi11I I00000oIO() {
/* 19 */            return new lOiIOoIi11I(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II, this.I000O01llI0);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ilOiOOII0I0) {
/* 10 */                ilOiOOII0I0 iloiooii0i0 = (ilOiOOII0I0) obj;
/* 20 */                if (this.I00000oIO.equals(iloiooii0i0.I00000oIO) && this.I00000oOI.equals(iloiooii0i0.I00000oOI) && this.I0000Il00O == iloiooii0i0.I0000Il00O && this.I0000O == iloiooii0i0.I0000O && this.I0000oI00 == iloiooii0i0.I0000oI00 && this.I0001Ioi1lo == iloiooii0i0.I0001Ioi1lo && this.I000II == iloiooii0i0.I000II && this.I000O01llI0.equals(iloiooii0i0.I000O01llI0)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 18 */            int iHashCode = ((this.I00000oIO.hashCode() ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode();
/* 19 */            String str = this.I000O01llI0;
/* 46 */            return ((this.I000II ^ (((((((((iHashCode * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O) * 1000003) ^ this.I0000oI00) * 1000003) ^ this.I0001Ioi1lo) * 1000003)) * 1000003) ^ str.hashCode();
                }

                public final String toString() {
/* 1 */             int i = this.I0000Il00O;
/* 7 */             int length = String.valueOf(i).length();
/* 11 */            int i2 = this.I0000O;
/* 17 */            int length2 = String.valueOf(i2).length();
/* 21 */            int i3 = this.I0000oI00;
/* 27 */            int length3 = String.valueOf(i3).length();
/* 31 */            int i4 = this.I0001Ioi1lo;
/* 37 */            int length4 = String.valueOf(i4).length();
/* 41 */            int i5 = this.I000II;
/* 47 */            int length5 = String.valueOf(i5).length();
/* 53 */            String str = this.I00000oIO;
/* 55 */            int length6 = str.length();
/* 59 */            String str2 = this.I00000oOI;
/* 63 */            int length7 = str2.length();
/* 83 */            String str3 = this.I000O01llI0;
/* 94 */            StringBuilder sb = new StringBuilder(str3.length() + length7 + length6 + 27 + 7 + length + 10 + length2 + 5 + length3 + 10 + length4 + 13 + length5 + 14 + 1);
/* 101 */           IIl001iO0Io.I001lIiIIo1O(sb, "AiFeature{name=", str, ", modelName=", str2);
/* 108 */           IIlIOloOOO.I001l0I00(sb, ", type=", i, ", variant=", i2);
/* 115 */           IIlIOloOOO.I001l0I00(sb, ", id=", i3, ", version=", i4);
/* 120 */           sb.append(", customerId=");
/* 123 */           sb.append(i5);
/* 128 */           sb.append(", description=");
/* 131 */           sb.append(str3);
/* 136 */           sb.append("}");
/* 139 */           return sb.toString();
                }
            }
