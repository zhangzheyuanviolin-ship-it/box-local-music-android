            package p000;
            
            public final class I1ili1lI0O {
                public long I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;

                public static boolean I00000oIO(Oo0iil0o0oI oo0iil0o0oI) {
/* 1 */             OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 3 */             long j = oo0iil0o0oI.I0000Il00O;
/* 7 */             int i = oo0iil0o0oI.I00000oIO.I0001Ioi1lo;
/* 13 */            if (i == 1 || i == 3) {
                        return ((float) ((int) (j >> 32))) < oI0OIIiOi.I0000O || oo0iil0o0oI.I0000O();
                    }
/* 40 */            if (i != 4 && i != 5 && i != 2) {
/* 103 */               I000II.I000iOII(IlIi0I0.I000lI("TextOverflow type ", lOliIoOili.I00000oIO(i), " is not supported."));
/* 11 */                return false;
                    }
/* 48 */            int i2 = oI0OIIiOi.I0001Ioi1lo;
/* 50 */            if (i2 != 0) {
/* 52 */                if (i2 == 1) {
/* 85 */                    return oo0iil0o0oI.I000l1(0);
                        }
/* 54 */                if (i == 4 || i == 5) {
                            return ((float) ((int) (j >> 32))) < oI0OIIiOi.I0000O || oo0iil0o0oI.I0000O();
                        }
/* 77 */                if (i == 2) {
/* 80 */                    return oo0iil0o0oI.I000l1(i2 - 1);
                        }
                    }
/* 11 */            return false;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj == null || !(obj instanceof I1ili1lI0O)) {
/* 5 */                 return false;
                    }
/* 14 */            I1ili1lI0O i1ili1lI0O = (I1ili1lI0O) obj;
                    return Oo0o1OiIo.I00000oOI(i1ili1lI0O.I00000oIO, this.I00000oIO) && Oo0o1OiIo.I00000oOI(i1ili1lI0O.I00000oOI, this.I00000oOI) && Oo0o1OiIo.I00000oOI(i1ili1lI0O.I0000Il00O, this.I0000Il00O);
                }

                public final int hashCode() {
/* 1 */             long j = this.I00000oIO;
/* 3 */             Oo0o1iioOiO[] oo0o1iioOiOArr = Oo0o1OiIo.I00000oOI;
/* 24 */            return Long.hashCode(this.I0000Il00O) + IIlIOloOOO.I0000O(this.I00000oOI, Long.hashCode(j) * 31, 31);
                }
            }
