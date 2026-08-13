            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 182 */   public final class I1111OO10i implements CharSequence {
                public static final IoloOio0I I00ilI0I1 = OiO0O10ii001.I00000oIO;
                public final List I00iOIl;
                public final String I00iiI;
                public final ArrayList I00iiO;
                public final ArrayList I00iio;

                public I1111OO10i(List list, String str) {
                    ArrayList arrayList;
                    ArrayList arrayList2;
/* 4 */             this.I00iOIl = list;
/* 6 */             this.I00iiI = str;
/* 9 */             if (list != null) {
/* 14 */                int size = list.size();
/* 19 */                arrayList = null;
/* 20 */                arrayList2 = null;
/* 21 */                for (int i = 0; i < size; i++) {
/* 27 */                    I11110l0o i11110l0o = (I11110l0o) list.get(i);
/* 29 */                    Object obj = i11110l0o.I00000oIO;
/* 33 */                    if (obj instanceof OlIIi1oIIOlo) {
/* 39 */                        arrayList = arrayList == null ? new ArrayList() : arrayList;
/* 42 */                        arrayList.add(i11110l0o);
                            } else if (obj instanceof OIoioI0OIiI) {
/* 54 */                        arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
/* 57 */                        arrayList2.add(i11110l0o);
                            }
                        }
                    } else {
/* 63 */                arrayList = null;
/* 64 */                arrayList2 = null;
                    }
/* 65 */            this.I00iiO = arrayList;
/* 67 */            this.I00iio = arrayList2;
/* 78 */            List listI00Ol1ll1 = arrayList2 != null ? IOOi0Ool1i.I00Ol1ll1(arrayList2, new IliIiio1(8)) : null;
/* 83 */            List list2 = listI00Ol1ll1;
/* 85 */            if (list2 == null || list2.isEmpty()) {
/* 332 */               return;
                    }
/* 100 */           int i2 = ((I11110l0o) IOOi0Ool1i.I001lllioOl(listI00Ol1ll1)).I0000Il00O;
/* 102 */           OI0l1iiooO oI0l1iiooO = IooIo0.I00000oIO;
/* 107 */           OI0l1iiooO oI0l1iiooO2 = new OI0l1iiooO(1);
/* 110 */           oI0l1iiooO2.I00000oIO(i2);
/* 113 */           int size2 = listI00Ol1ll1.size();
/* 118 */           for (int i3 = 1; i3 < size2; i3++) {
/* 124 */               I11110l0o i11110l0o2 = (I11110l0o) listI00Ol1ll1.get(i3);
                        while (true) {
/* 128 */                   if (oI0l1iiooO2.I00000oOI == 0) {
                                break;
                            }
/* 130 */                   int iI0000O = oI0l1iiooO2.I0000O();
/* 136 */                   if (i11110l0o2.I00000oOI >= iI0000O) {
/* 141 */                       oI0l1iiooO2.I0000oI00(oI0l1iiooO2.I00000oOI - 1);
                            } else {
/* 145 */                       int i4 = i11110l0o2.I0000Il00O;
/* 147 */                       if (i4 > iI0000O) {
/* 172 */                           Ioliol.I00000oIO("Paragraph overlap not allowed, end " + i4 + " should be less than or equal to " + iI0000O);
                                }
                            }
                        }
/* 177 */               oI0l1iiooO2.I00000oIO(i11110l0o2.I0000Il00O);
                    }
                }

                public final List I00000oIO(int i) {
/* 1 */             List list = this.I00iOIl;
/* 3 */             if (list == null) {
/* 55 */                return Il01100l.I00iOIl;
                    }
/* 11 */            ArrayList arrayList = new ArrayList(list.size());
/* 17 */            int size = list.size();
/* 23 */            for (int i2 = 0; i2 < size; i2++) {
/* 25 */                Object obj = list.get(i2);
/* 30 */                I11110l0o i11110l0o = (I11110l0o) obj;
/* 36 */                if ((i11110l0o.I00000oIO instanceof O0ooioI1) && I111IiO.I00000oOI(0, i, i11110l0o.I00000oOI, i11110l0o.I0000Il00O)) {
/* 48 */                    arrayList.add(obj);
                        }
                    }
/* 54 */            return arrayList;
                }

                public final List I00000oOI(int i, String str) {
/* 1 */             List list = this.I00iOIl;
/* 3 */             if (list == null) {
/* 73 */                return Il01100l.I00iOIl;
                    }
/* 11 */            ArrayList arrayList = new ArrayList(list.size());
/* 17 */            int size = list.size();
/* 23 */            for (int i2 = 0; i2 < size; i2++) {
/* 29 */                I11110l0o i11110l0o = (I11110l0o) list.get(i2);
/* 31 */                Object obj = i11110l0o.I00000oIO;
/* 33 */                int i3 = i11110l0o.I0000Il00O;
/* 35 */                int i4 = i11110l0o.I00000oOI;
/* 37 */                String str2 = i11110l0o.I0000O;
/* 41 */                if ((obj instanceof OlOli0o) && O0000Ioio00.I0000O(str, str2) && I111IiO.I00000oOI(0, i, i4, i3)) {
/* 66 */                    arrayList.add(new I11110l0o(((OlOli0o) i11110l0o.I00000oIO).I00000oIO, i4, i3, str2));
                        }
                    }
/* 72 */            return arrayList;
                }

                public final I1111OO10i I0000Il00O(Function1 function1) {
/* 3 */             I11110OIl i11110OIl = new I11110OIl(this);
/* 6 */             ArrayList arrayList = i11110OIl.I00iiO;
/* 8 */             int size = arrayList.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 31 */                I11110l0o i11110l0o = (I11110l0o) function1.invoke(((I111101Olo00) arrayList.get(i)).I00000oIO(Integer.MIN_VALUE));
/* 46 */                arrayList.set(i, new I111101Olo00(i11110l0o.I00000oIO, i11110l0o.I00000oOI, i11110l0o.I0000Il00O, i11110l0o.I0000O));
                    }
/* 52 */            return i11110OIl.I000OiO();
                }

                @Override
                public final I1111OO10i subSequence(int i, int i2) {
/* 5 */             if (i > i2) {
/* 31 */                Ioliol.I00000oIO("start (" + i + ") should be less or equal to end (" + i2 + ")");
                    }
/* 34 */            String str = this.I00iiI;
/* 36 */            if (i == 0 && i2 == str.length()) {
/* 44 */                return this;
                    }
/* 45 */            String strSubstring = str.substring(i, i2);
/* 49 */            I1111OO10i i1111OO10i = I111IiO.I00000oIO;
/* 51 */            if (i > i2) {
/* 77 */                Ioliol.I00000oIO("start (" + i + ") should be less than or equal to end (" + i2 + ")");
                    }
/* 80 */            List list = this.I00iOIl;
/* 82 */            ArrayList arrayList = null;
/* 83 */            if (list != null) {
/* 92 */                ArrayList arrayList2 = new ArrayList(list.size());
/* 98 */                int size = list.size();
/* 103 */               for (int i3 = 0; i3 < size; i3++) {
/* 109 */                   I11110l0o i11110l0o = (I11110l0o) list.get(i3);
/* 111 */                   int i4 = i11110l0o.I00000oOI;
/* 113 */                   int i5 = i11110l0o.I0000Il00O;
/* 119 */                   if (I111IiO.I00000oOI(i, i2, i4, i5)) {
/* 142 */                       arrayList2.add(new I11110l0o(i11110l0o.I00000oIO, Math.max(i, i11110l0o.I00000oOI) - i, Math.min(i2, i5) - i, i11110l0o.I0000O));
                            }
                        }
/* 152 */               if (!arrayList2.isEmpty()) {
/* 155 */                   arrayList = arrayList2;
                        }
                    }
/* 158 */           return new I1111OO10i(arrayList, strSubstring);
                }

                @Override
                public final char charAt(int i) {
/* 3 */             return this.I00iiI.charAt(i);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof I1111OO10i)) {
/* 7 */                 return false;
                    }
/* 11 */            I1111OO10i i1111OO10i = (I1111OO10i) obj;
                    return O0000Ioio00.I0000O(this.I00iiI, i1111OO10i.I00iiI) && O0000Ioio00.I0000O(this.I00iOIl, i1111OO10i.I00iOIl);
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.I00iiI.hashCode() * 31;
/* 9 */             List list = this.I00iOIl;
/* 19 */            return iHashCode + (list != null ? list.hashCode() : 0);
                }

                @Override
                public final int length() {
/* 3 */             return this.I00iiI.length();
                }

                @Override
                public final String toString() {
/* 1 */             return this.I00iiI;
                }

/* 183 */       public I1111OO10i(String str) {
/* 185 */           this(str, Il01100l.I00iOIl);
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 185 */       public I1111OO10i(String str, List list) {
/* 186 */           List list2 = list;
                    this(list2.isEmpty() ? null : list2, str);
                }
            }
