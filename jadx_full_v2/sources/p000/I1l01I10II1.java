            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1l01I10II1 {
                public int I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;

                public static I1l01I10II1 I00000oIO(int i, String str, int i2, int i3, int i4, int i5) {
/* 3 */             I1l01I10II1 i1l01I10II1 = new I1l01I10II1();
/* 6 */             i1l01I10II1.I00000oIO = i;
/* 8 */             if (str == null) {
/* 26 */                IOOlIIilOl0.I000II("Null mediaType");
/* 29 */                return null;
                    }
/* 10 */            i1l01I10II1.I00000oOI = str;
/* 12 */            i1l01I10II1.I0000Il00O = i2;
/* 14 */            i1l01I10II1.I0000O = i3;
/* 16 */            i1l01I10II1.I0000oI00 = i4;
/* 18 */            i1l01I10II1.I0001Ioi1lo = i5;
/* 20 */            VarHandle.storeStoreFence();
/* 23 */            return i1l01I10II1;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof I1l01I10II1) {
/* 10 */                I1l01I10II1 i1l01I10II1 = (I1l01I10II1) obj;
/* 16 */                if (this.I00000oIO == i1l01I10II1.I00000oIO && this.I00000oOI.equals(i1l01I10II1.I00000oOI) && this.I0000Il00O == i1l01I10II1.I0000Il00O && this.I0000O == i1l01I10II1.I0000O && this.I0000oI00 == i1l01I10II1.I0000oI00 && this.I0001Ioi1lo == i1l01I10II1.I0001Ioi1lo) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 30 */            return this.I0001Ioi1lo ^ ((((((((((this.I00000oIO ^ 1000003) * 1000003) ^ this.I00000oOI.hashCode()) * 1000003) ^ this.I0000Il00O) * 1000003) ^ this.I0000O) * 1000003) ^ this.I0000oI00) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", mediaType=");
/* 20 */            sb.append(this.I00000oOI);
/* 25 */            sb.append(", bitrate=");
/* 30 */            sb.append(this.I0000Il00O);
/* 35 */            sb.append(", sampleRate=");
/* 40 */            sb.append(this.I0000O);
/* 45 */            sb.append(", channels=");
/* 50 */            sb.append(this.I0000oI00);
/* 55 */            sb.append(", profile=");
/* 62 */            return IIl001iO0Io.I000lI(this.I0001Ioi1lo, "}", sb);
                }
            }
