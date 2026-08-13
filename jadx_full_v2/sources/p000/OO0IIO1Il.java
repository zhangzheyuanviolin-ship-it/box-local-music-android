            package p000;

            import java.io.File;
            import java.util.ArrayList;
            
            public final class OO0IIO1Il implements Comparable {
                public static final String I00iiI = File.separator;
                public final IIOIIi1ilIO I00iOIl;

                public OO0IIO1Il(IIOIIi1ilIO iIOIIi1ilIO) {
/* 4 */             this.I00iOIl = iIOIIi1ilIO;
                }

                public final ArrayList I00000oIO() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int iI0000Il00O = I0000oI00.I0000Il00O(this);
/* 13 */            IIOIIi1ilIO iIOIIi1ilIO = this.I00iOIl;
/* 15 */            if (iI0000Il00O == -1) {
/* 17 */                iI0000Il00O = 0;
                    } else if (iI0000Il00O < iIOIIi1ilIO.I00000oOI() && iIOIIi1ilIO.I000II(iI0000Il00O) == 92) {
/* 31 */                iI0000Il00O++;
                    }
/* 33 */            int iI00000oOI = iIOIIi1ilIO.I00000oOI();
/* 37 */            int i = iI0000Il00O;
/* 38 */            while (iI0000Il00O < iI00000oOI) {
/* 46 */                if (iIOIIi1ilIO.I000II(iI0000Il00O) == 47 || iIOIIi1ilIO.I000II(iI0000Il00O) == 92) {
/* 58 */                    arrayList.add(iIOIIi1ilIO.I000iOII(i, iI0000Il00O));
/* 61 */                    i = iI0000Il00O + 1;
                        }
/* 63 */                iI0000Il00O++;
                    }
/* 70 */            if (i < iIOIIi1ilIO.I00000oOI()) {
/* 80 */                arrayList.add(iIOIIi1ilIO.I000iOII(i, iIOIIi1ilIO.I00000oOI()));
                    }
/* 113 */           return arrayList;
                }

                public final OO0IIO1Il I00000oOI() {
/* 1 */             IIOIIi1ilIO iIOIIi1ilIO = I0000oI00.I0000O;
/* 3 */             IIOIIi1ilIO iIOIIi1ilIO2 = this.I00iOIl;
/* 9 */             if (O0000Ioio00.I0000O(iIOIIi1ilIO2, iIOIIi1ilIO)) {
/* 201 */               return null;
                    }
/* 11 */            IIOIIi1ilIO iIOIIi1ilIO3 = I0000oI00.I00000oIO;
/* 17 */            if (O0000Ioio00.I0000O(iIOIIi1ilIO2, iIOIIi1ilIO3)) {
/* 201 */               return null;
                    }
/* 19 */            IIOIIi1ilIO iIOIIi1ilIO4 = I0000oI00.I00000oOI;
/* 25 */            if (O0000Ioio00.I0000O(iIOIIi1ilIO2, iIOIIi1ilIO4)) {
/* 201 */               return null;
                    }
/* 27 */            IIOIIi1ilIO iIOIIi1ilIO5 = I0000oI00.I0000oI00;
/* 29 */            int iI00000oOI = iIOIIi1ilIO2.I00000oOI();
/* 33 */            byte[] bArr = iIOIIi1ilIO5.I00iOIl;
/* 45 */            if (iIOIIi1ilIO2.I000OOo1O(iI00000oOI - bArr.length, iIOIIi1ilIO5, bArr.length) && (iIOIIi1ilIO2.I00000oOI() == 2 || iIOIIi1ilIO2.I000OOo1O(iIOIIi1ilIO2.I00000oOI() - 3, iIOIIi1ilIO3, 1) || iIOIIi1ilIO2.I000OOo1O(iIOIIi1ilIO2.I00000oOI() - 3, iIOIIi1ilIO4, 1))) {
/* 201 */               return null;
                    }
/* 81 */            iIOIIi1ilIO2.getClass();
/* 88 */            int iI000O01llI0 = iIOIIi1ilIO2.I000O01llI0(iIOIIi1ilIO3.I0001Ioi1lo());
/* 93 */            if (iI000O01llI0 == -1) {
/* 96 */                iIOIIi1ilIO2.getClass();
/* 103 */               iI000O01llI0 = iIOIIi1ilIO2.I000O01llI0(iIOIIi1ilIO4.I0001Ioi1lo());
                    }
/* 108 */           if (iI000O01llI0 == 2 && I0000oI00() != null) {
/* 120 */               if (iIOIIi1ilIO2.I00000oOI() == 3) {
/* 201 */                   return null;
                        }
/* 129 */               return new OO0IIO1Il(IIOIIi1ilIO.I000l1(iIOIIi1ilIO2, 0, 3, 1));
                    }
/* 133 */           if (iI000O01llI0 == 1 && iIOIIi1ilIO2.I000OOo1O(0, iIOIIi1ilIO4, iIOIIi1ilIO4.I00000oOI())) {
/* 201 */               return null;
                    }
/* 146 */           if (iI000O01llI0 != -1 || I0000oI00() == null) {
                        return iI000O01llI0 == -1 ? new OO0IIO1Il(iIOIIi1ilIO) : iI000O01llI0 == 0 ? new OO0IIO1Il(IIOIIi1ilIO.I000l1(iIOIIi1ilIO2, 0, 1, 1)) : new OO0IIO1Il(IIOIIi1ilIO.I000l1(iIOIIi1ilIO2, 0, iI000O01llI0, 1));
                    }
/* 158 */           if (iIOIIi1ilIO2.I00000oOI() == 2) {
/* 201 */               return null;
                    }
/* 167 */           return new OO0IIO1Il(IIOIIi1ilIO.I000l1(iIOIIi1ilIO2, 0, 2, 1));
                }

                public final OO0IIO1Il I0000Il00O(OO0IIO1Il oO0IIO1Il) {
/* 1 */             IIOIIi1ilIO iIOIIi1ilIO = oO0IIO1Il.I00iOIl;
/* 3 */             int iI0000Il00O = I0000oI00.I0000Il00O(this);
/* 7 */             IIOIIi1ilIO iIOIIi1ilIO2 = this.I00iOIl;
/* 22 */            OO0IIO1Il oO0IIO1Il2 = iI0000Il00O == -1 ? null : new OO0IIO1Il(iIOIIi1ilIO2.I000iOII(0, iI0000Il00O));
/* 25 */            int iI0000Il00O2 = I0000oI00.I0000Il00O(oO0IIO1Il);
/* 48 */            if (!O0000Ioio00.I0000O(oO0IIO1Il2, iI0000Il00O2 == -1 ? null : new OO0IIO1Il(iIOIIi1ilIO.I000iOII(0, iI0000Il00O2)))) {
/* 209 */               OIiilo1Ool0o.I000OOo1O("Paths of different roots cannot be relative to each other: ", this, " and ", oO0IIO1Il);
/* 9 */                 return null;
                    }
/* 50 */            ArrayList arrayListI00000oIO = I00000oIO();
/* 54 */            ArrayList arrayListI00000oIO2 = oO0IIO1Il.I00000oIO();
/* 66 */            int iMin = Math.min(arrayListI00000oIO.size(), arrayListI00000oIO2.size());
/* 70 */            int i = 0;
/* 71 */            while (i < iMin && O0000Ioio00.I0000O(arrayListI00000oIO.get(i), arrayListI00000oIO2.get(i))) {
/* 87 */                i++;
                    }
/* 90 */            if (i == iMin && iIOIIi1ilIO2.I00000oOI() == iIOIIi1ilIO.I00000oOI()) {
/* 104 */               return Iioi0lilII.I00lli11(".");
                    }
/* 123 */           if (arrayListI00000oIO2.subList(i, arrayListI00000oIO2.size()).indexOf(I0000oI00.I0000oI00) != -1) {
/* 203 */               OIiilo1Ool0o.I000OOo1O("Impossible relative path to resolve: ", this, " and ", oO0IIO1Il);
/* 9 */                 return null;
                    }
/* 131 */           if (O0000Ioio00.I0000O(iIOIIi1ilIO, I0000oI00.I0000O)) {
/* 133 */               return this;
                    }
/* 136 */           III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 139 */           IIOIIi1ilIO iIOIIi1ilIOI00000oOI = I0000oI00.I00000oOI(oO0IIO1Il);
/* 143 */           if (iIOIIi1ilIOI00000oOI == null && (iIOIIi1ilIOI00000oOI = I0000oI00.I00000oOI(this)) == null) {
/* 153 */               iIOIIi1ilIOI00000oOI = I0000oI00.I0001Ioi1lo(I00iiI);
                    }
/* 157 */           int size = arrayListI00000oIO2.size();
/* 162 */           for (int i2 = i; i2 < size; i2++) {
/* 166 */               iII1o0lOio0.I00l0I0l0lO1(I0000oI00.I0000oI00);
/* 169 */               iII1o0lOio0.I00l0I0l0lO1(iIOIIi1ilIOI00000oOI);
                    }
/* 175 */           int size2 = arrayListI00000oIO.size();
/* 179 */           while (i < size2) {
/* 187 */               iII1o0lOio0.I00l0I0l0lO1((IIOIIi1ilIO) arrayListI00000oIO.get(i));
/* 190 */               iII1o0lOio0.I00l0I0l0lO1(iIOIIi1ilIOI00000oOI);
/* 193 */               i++;
                    }
/* 196 */           return I0000oI00.I0000O(iII1o0lOio0, false);
                }

                public final OO0IIO1Il I0000O(String str) {
/* 3 */             III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 6 */             iII1o0lOio0.I00oo1iO0ll(str);
/* 14 */            return I0000oI00.I00000oIO(this, I0000oI00.I0000O(iII1o0lOio0, false), false);
                }

                public final Character I0000oI00() {
/* 1 */             IIOIIi1ilIO iIOIIi1ilIO = I0000oI00.I00000oIO;
/* 3 */             IIOIIi1ilIO iIOIIi1ilIO2 = this.I00iOIl;
/* 10 */            if (IIOIIi1ilIO.I0000oI00(iIOIIi1ilIO2, iIOIIi1ilIO) != -1 || iIOIIi1ilIO2.I00000oOI() < 2 || iIOIIi1ilIO2.I000II(1) != 58) {
/* 59 */                return null;
                    }
/* 36 */            char cI000II = (char) iIOIIi1ilIO2.I000II(0);
/* 39 */            if (('a' > cI000II || cI000II >= '{') && ('A' > cI000II || cI000II >= '[')) {
/* 59 */                return null;
                    }
/* 54 */            return Character.valueOf(cI000II);
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl.compareTo(((OO0IIO1Il) obj).I00iOIl);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OO0IIO1Il) && O0000Ioio00.I0000O(((OO0IIO1Il) obj).I00iOIl, this.I00iOIl);
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final File toFile() {
/* 9 */             return new File(this.I00iOIl.I000o00OoI0I());
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.I000o00OoI0I();
                }
            }
