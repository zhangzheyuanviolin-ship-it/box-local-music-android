            package p000;
            
            public final class OoOlII {
                public final IliO1o11o I00000oIO;
                public final IlilIIiIiO I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final Object I0000oI00;

                public OoOlII(IliO1o11o iliO1o11o, IlilIIiIiO ililIIiIiO, int i, int i2, Object obj) {
/* 4 */             this.I00000oIO = iliO1o11o;
/* 6 */             this.I00000oOI = ililIIiIiO;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = i2;
/* 12 */            this.I0000oI00 = obj;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OoOlII)) {
/* 7 */                 return false;
                    }
/* 11 */            OoOlII ooOlII = (OoOlII) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ooOlII.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ooOlII.I00000oOI) && this.I0000Il00O == ooOlII.I0000Il00O && this.I0000O == ooOlII.I0000O && O0000Ioio00.I0000O(this.I0000oI00, ooOlII.I0000oI00);
                }

                public final int hashCode() {
/* 2 */             IliO1o11o iliO1o11o = this.I00000oIO;
/* 29 */            int iI0000O = IIl001iO0Io.I0000O(this.I0000O, IIl001iO0Io.I0000O(this.I0000Il00O, (((iliO1o11o == null ? 0 : iliO1o11o.hashCode()) * 31) + this.I00000oOI.I00iOIl) * 31, 31), 31);
/* 33 */            Object obj = this.I0000oI00;
/* 42 */            return iI0000O + (obj != null ? obj.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             String str = "Invalid";
/* 4 */             int i = this.I0000Il00O;
/* 13 */            String str2 = i == 0 ? OIllioIilO.I01IO1il : i == 1 ? "Italic" : "Invalid";
/* 17 */            int i2 = this.I0000O;
/* 19 */            if (i2 == 0) {
/* 21 */                str = "None";
                    } else if (i2 == 1) {
/* 26 */                str = "Weight";
                    } else if (i2 == 2) {
/* 32 */                str = "Style";
                    } else if (i2 == 65535) {
/* 40 */                str = "All";
                    }
/* 46 */            StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
/* 51 */            sb.append(this.I00000oIO);
/* 56 */            sb.append(", fontWeight=");
/* 61 */            sb.append(this.I00000oOI);
/* 66 */            sb.append(", fontStyle=");
/* 73 */            IIl001iO0Io.I001lIiIIo1O(sb, str2, ", fontSynthesis=", str, ", resourceLoaderCacheKey=");
/* 78 */            sb.append(this.I0000oI00);
/* 83 */            sb.append(")");
/* 86 */            return sb.toString();
                }
            }
