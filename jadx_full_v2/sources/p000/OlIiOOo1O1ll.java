            package p000;
            
            public final class OlIiOOo1O1ll {
                public String I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public float I0001Ioi1lo;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OlIiOOo1O1ll)) {
/* 65 */                return false;
                    }
/* 10 */            OlIiOOo1O1ll olIiOOo1O1ll = (OlIiOOo1O1ll) obj;
                    return this.I00000oIO.equals(olIiOOo1O1ll.I00000oIO) && this.I00000oOI.equals(olIiOOo1O1ll.I00000oOI) && this.I0000Il00O == olIiOOo1O1ll.I0000Il00O && this.I0000O == olIiOOo1O1ll.I0000O && this.I0000oI00 == olIiOOo1O1ll.I0000oI00 && Float.compare(this.I0001Ioi1lo, olIiOOo1O1ll.I0001Ioi1lo) == 0;
                }

                public final int hashCode() {
/* 46 */            return Long.hashCode(-1L) + OooioIOo1.I0000O(IIl001iO0Io.I0000O(this.I0000oI00, IIl001iO0Io.I0000O(this.I0000O, IIl001iO0Io.I0000O(this.I0000Il00O, Oi010OO0.I000O01llI0(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI), 31), 31), 31), 31, this.I0001Ioi1lo);
                }

                public final String toString() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             String str2 = this.I00000oOI;
/* 5 */             int i = this.I0000Il00O;
/* 7 */             int i2 = this.I0000O;
/* 9 */             int i3 = this.I0000oI00;
/* 11 */            float f = this.I0001Ioi1lo;
/* 19 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("GenerationParams(prompt=", str, ", negativePrompt=", str2, ", width=");
/* 23 */            sbI00111O.append(i);
/* 28 */            sbI00111O.append(", height=");
/* 31 */            sbI00111O.append(i2);
/* 36 */            sbI00111O.append(", steps=");
/* 39 */            sbI00111O.append(i3);
/* 44 */            sbI00111O.append(", cfgScale=");
/* 47 */            sbI00111O.append(f);
/* 52 */            sbI00111O.append(", seed=-1)");
/* 55 */            return sbI00111O.toString();
                }
            }
