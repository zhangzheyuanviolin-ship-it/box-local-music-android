            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1l01ooO {
                public int I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public int I000OOo1O;
                public int I000OiO;

                public static I1l01ooO I00000oIO(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
/* 3 */             I1l01ooO i1l01ooO = new I1l01ooO();
/* 6 */             i1l01ooO.I00000oIO = i;
/* 8 */             if (str == null) {
/* 34 */                IOOlIIilOl0.I000II("Null mediaType");
/* 37 */                return null;
                    }
/* 10 */            i1l01ooO.I00000oOI = str;
/* 12 */            i1l01ooO.I0000Il00O = i2;
/* 14 */            i1l01ooO.I0000O = i3;
/* 16 */            i1l01ooO.I0000oI00 = i4;
/* 18 */            i1l01ooO.I0001Ioi1lo = i5;
/* 20 */            i1l01ooO.I000II = i6;
/* 22 */            i1l01ooO.I000O01llI0 = i7;
/* 24 */            i1l01ooO.I000OOo1O = i8;
/* 26 */            i1l01ooO.I000OiO = i9;
/* 28 */            VarHandle.storeStoreFence();
/* 31 */            return i1l01ooO;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l01ooO) {
/* 10 */                I1l01ooO i1l01ooO = (I1l01ooO) obj;
/* 16 */                if (this.I00000oIO == i1l01ooO.I00000oIO && this.I00000oOI.equals(i1l01ooO.I00000oOI) && this.I0000Il00O == i1l01ooO.I0000Il00O && this.I0000O == i1l01ooO.I0000O && this.I0000oI00 == i1l01ooO.I0000oI00 && this.I0001Ioi1lo == i1l01ooO.I0001Ioi1lo && this.I000II == i1l01ooO.I000II && this.I000O01llI0 == i1l01ooO.I000O01llI0 && this.I000OOo1O == i1l01ooO.I000OOo1O && this.I000OiO == i1l01ooO.I000OiO) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 46 */            return this.I000OiO ^ ((((((((((((((((((this.I00000oIO ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O) * 1000003) ^ this.I0000oI00) * 1000003) ^ this.I0001Ioi1lo) * 1000003) ^ this.I000II) * 1000003) ^ this.I000O01llI0) * 1000003) ^ this.I000OOo1O) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("VideoProfileProxy{codec=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", mediaType=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", bitrate=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", frameRate=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", width=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", height=");
/* 60 */            sb.append(this.I0001Ioi1lo);
/* 65 */            sb.append(", profile=");
/* 70 */            sb.append(this.I000II);
/* 75 */            sb.append(", bitDepth=");
/* 80 */            sb.append(this.I000O01llI0);
/* 85 */            sb.append(", chromaSubsampling=");
/* 90 */            sb.append(this.I000OOo1O);
/* 95 */            sb.append(", hdrFormat=");
/* 102 */           return IIl001iO0Io.I000lI(this.I000OiO, "}", sb);
                }
            }
