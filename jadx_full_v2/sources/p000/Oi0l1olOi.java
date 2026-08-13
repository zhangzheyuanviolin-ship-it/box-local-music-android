            package p000;
            
            public final class Oi0l1olOi {
                public int I00000oIO;
                public IlilIIiIiO I00000oOI;
                public int I0000Il00O;
                public Ilil1I I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Oi0l1olOi)) {
/* 48 */                return false;
                    }
/* 12 */            Oi0l1olOi oi0l1olOi = (Oi0l1olOi) obj;
                    return this.I00000oIO == oi0l1olOi.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, oi0l1olOi.I00000oOI) && this.I0000Il00O == oi0l1olOi.I0000Il00O && this.I0000O.equals(oi0l1olOi.I0000O);
                }

                public final int hashCode() {
/* 31 */            return this.I0000O.I00000oIO.hashCode() + IIl001iO0Io.I0000O(0, IIl001iO0Io.I0000O(this.I0000Il00O, ((this.I00000oIO * 31) + this.I00000oOI.I00iOIl) * 31, 31), 31);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             IlilIIiIiO ililIIiIiO = this.I00000oOI;
/* 5 */             int i2 = this.I0000Il00O;
/* 18 */            String str = i2 == 0 ? OIllioIilO.I01IO1il : i2 == 1 ? "Italic" : "Invalid";
/* 24 */            StringBuilder sb = new StringBuilder("ResourceFont(resId=");
/* 27 */            sb.append(i);
/* 32 */            sb.append(", weight=");
/* 35 */            sb.append(ililIIiIiO);
/* 40 */            sb.append(", style=");
/* 45 */            return IIl001iO0Io.I00100l0(sb, str, ", loadingStrategy=Blocking)");
                }
            }
