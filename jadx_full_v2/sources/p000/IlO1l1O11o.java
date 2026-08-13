            package p000;
            
            public final class IlO1l1O11o {
                public String I00000oIO;
                public String I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 34 */                return true;
                    }
/* 6 */             if (!(obj instanceof IlO1l1O11o)) {
/* 32 */                return false;
                    }
/* 9 */             IlO1l1O11o ilO1l1O11o = (IlO1l1O11o) obj;
                    return this.I00000oIO.equals(ilO1l1O11o.I00000oIO) && this.I00000oOI.equals(ilO1l1O11o.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
/* 10 */            sb.append(this.I00000oIO);
/* 15 */            sb.append(", model=");
/* 22 */            return IlIi0I0.I000oI1ioi(sb, this.I00000oOI, ')');
                }
            }
