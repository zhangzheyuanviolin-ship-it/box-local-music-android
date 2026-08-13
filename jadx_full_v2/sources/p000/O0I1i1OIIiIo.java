            package p000;
            
/* 36 */    public final class O0I1i1OIIiIo implements Comparable {
                public final int I00iOIl;
                public final int I00iiI;
                public final int I00iiO;

                static {
/* 7 */             new O0I1i1OIIiIo(O1lili011o.I000II.I00000oIO);
/* 16 */            new O0I1i1OIIiIo(O1lili011o.I000O01llI0.I00000oIO);
                }

                public O0I1i1OIIiIo(int i, int i2, int i3) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i3;
/* 10 */            if (i < 0) {
/* 33 */                I000II.I000iOII("Major version should be not less than 0");
/* 215 */               throw null;
                    }
/* 12 */            if (i2 < 0) {
/* 26 */                I000II.I000iOII("Minor version should be not less than 0");
/* 30 */                throw null;
                    }
/* 14 */            if (i3 >= 0) {
/* 16 */                return;
                    }
/* 19 */            I000II.I000iOII("Patch version should be not less than 0");
/* 23 */            throw null;
                }

                @Override
                public final int compareTo(O0I1i1OIIiIo o0I1i1OIIiIo) {
/* 5 */             int iI0000oI00 = O0000Ioio00.I0000oI00(this.I00iOIl, o0I1i1OIIiIo.I00iOIl);
/* 9 */             if (iI0000oI00 != 0) {
/* 11 */                return iI0000oI00;
                    }
/* 16 */            int iI0000oI002 = O0000Ioio00.I0000oI00(this.I00iiI, o0I1i1OIIiIo.I00iiI);
                    return iI0000oI002 != 0 ? iI0000oI002 : O0000Ioio00.I0000oI00(this.I00iiO, o0I1i1OIIiIo.I00iiO);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 20 */            if (!O0I1i1OIIiIo.class.equals(obj != null ? obj.getClass() : null)) {
/* 19 */                return false;
                    }
/* 23 */            O0I1i1OIIiIo o0I1i1OIIiIo = (O0I1i1OIIiIo) obj;
                    return this.I00iOIl == o0I1i1OIIiIo.I00iOIl && this.I00iiI == o0I1i1OIIiIo.I00iiI && this.I00iiO == o0I1i1OIIiIo.I00iiO;
                }

                public final int hashCode() {
/* 12 */            return (((this.I00iOIl * 31) + this.I00iiI) * 31) + this.I00iiO;
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append(this.I00iOIl);
/* 13 */            sb.append('.');
/* 18 */            sb.append(this.I00iiI);
/* 21 */            sb.append('.');
/* 26 */            sb.append(this.I00iiO);
/* 29 */            return sb.toString();
                }

/* 37 */        public O0I1i1OIIiIo(int[] iArr) {
/* 38 */            this(iArr[0], iArr[1], iArr[2]);
                }
            }
