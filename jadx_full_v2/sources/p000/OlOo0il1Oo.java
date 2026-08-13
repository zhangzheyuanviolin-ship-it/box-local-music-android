            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            
            public class OlOo0il1Oo implements OlOo0II {
                public final boolean I0000Il00O;
                public final String[] I0000O;
                public final List[] I0000oI00;
                public final int I0001Ioi1lo;
                public final int[] I000II;
                public final int[] I000O01llI0;

                public OlOo0il1Oo(Map map, boolean z) {
/* 4 */             this.I0000Il00O = z;
/* 11 */            if (map.isEmpty()) {
/* 13 */                this.I0001Ioi1lo = 0;
/* 17 */                this.I0000O = new String[0];
/* 21 */                this.I0000oI00 = new List[0];
/* 25 */                this.I000II = new int[0];
/* 29 */                this.I000O01llI0 = new int[0];
/* 31 */                return;
                    }
/* 33 */            if (!z) {
/* 35 */                int size = map.size();
/* 39 */                this.I0001Ioi1lo = size;
/* 43 */                this.I0000O = new String[size];
/* 47 */                this.I0000oI00 = new List[size];
/* 49 */                int iI00000oIO = lOi01o.I00000oIO(size);
/* 53 */                int[] iArr = new int[iI00000oIO];
/* 56 */                for (int i = 0; i < iI00000oIO; i++) {
/* 58 */                    iArr[i] = -1;
                        }
/* 63 */                this.I000II = iArr;
/* 65 */                int i2 = this.I0001Ioi1lo;
/* 67 */                int[] iArr2 = new int[i2];
/* 70 */                for (int i3 = 0; i3 < i2; i3++) {
/* 72 */                    iArr2[i3] = -1;
                        }
/* 77 */                this.I000O01llI0 = iArr2;
/* 87 */                int i4 = 0;
/* 92 */                for (Map.Entry entry : map.entrySet()) {
/* 104 */                   String str = (String) entry.getKey();
/* 110 */                   List list = (List) entry.getValue();
/* 114 */                   this.I0000O[i4] = str;
/* 116 */                   List[] listArr = this.I0000oI00;
/* 118 */                   int size2 = list.size();
/* 124 */                   ArrayList arrayList = new ArrayList(size2);
/* 128 */                   for (int i5 = 0; i5 < size2; i5++) {
/* 136 */                       arrayList.add((String) list.get(i5));
                            }
/* 142 */                   listArr[i4] = arrayList;
/* 150 */                   int iI00000oIO2 = I00000oIO(str) & (iI00000oIO - 1);
/* 151 */                   int[] iArr3 = this.I000O01llI0;
/* 153 */                   int[] iArr4 = this.I000II;
/* 157 */                   iArr3[i4] = iArr4[iI00000oIO2];
/* 159 */                   iArr4[iI00000oIO2] = i4;
/* 161 */                   i4++;
                        }
/* 551 */               return;
                    }
/* 166 */           IO0l0Il0lO0 iO0l0Il0lO0 = new IO0l0Il0lO0();
/* 171 */           iO0l0Il0lO0.I00iOIl = IO0l0Il0lO0.I00l0I0l0lO1;
/* 175 */           iO0l0Il0lO0.I00iiI = IO0l0Il0lO0.I00l0OO0IO;
/* 179 */           iO0l0Il0lO0.I00iio = IO0l0Il0lO0.I00li1OI;
/* 193 */           for (Map.Entry entry2 : map.entrySet()) {
/* 205 */               String str2 = (String) entry2.getKey();
/* 211 */               List list2 = (List) entry2.getValue();
/* 217 */               List list3 = (List) iO0l0Il0lO0.get(str2);
/* 219 */               if (list3 != null) {
/* 229 */                   iO0l0Il0lO0.put(str2, IOOi0Ool1i.I00O10llo(list3, list2));
                        } else {
/* 233 */                   iO0l0Il0lO0.put(str2, list2);
                        }
                    }
/* 237 */           int i6 = iO0l0Il0lO0.I00iiO;
/* 239 */           this.I0001Ioi1lo = i6;
/* 243 */           this.I0000O = new String[i6];
/* 247 */           this.I0000oI00 = new List[i6];
/* 249 */           int iI00000oIO3 = lOi01o.I00000oIO(i6);
/* 253 */           int[] iArr5 = new int[iI00000oIO3];
/* 256 */           for (int i7 = 0; i7 < iI00000oIO3; i7++) {
/* 258 */               iArr5[i7] = -1;
                    }
/* 263 */           this.I000II = iArr5;
/* 265 */           int i8 = this.I0001Ioi1lo;
/* 267 */           int[] iArr6 = new int[i8];
/* 270 */           for (int i9 = 0; i9 < i8; i9++) {
/* 272 */               iArr6[i9] = -1;
                    }
/* 277 */           this.I000O01llI0 = iArr6;
/* 285 */           Iterator it = ((IO0iil) iO0l0Il0lO0.entrySet()).iterator();
/* 289 */           int i10 = 0;
/* 294 */           while (it.hasNext()) {
/* 300 */               Map.Entry entry3 = (Map.Entry) it.next();
/* 306 */               String str3 = (String) entry3.getKey();
/* 312 */               List list4 = (List) entry3.getValue();
/* 316 */               this.I0000O[i10] = str3;
/* 318 */               List[] listArr2 = this.I0000oI00;
/* 320 */               int size3 = list4.size();
/* 326 */               ArrayList arrayList2 = new ArrayList(size3);
/* 330 */               for (int i11 = 0; i11 < size3; i11++) {
/* 338 */                   arrayList2.add((String) list4.get(i11));
                        }
/* 344 */               listArr2[i10] = arrayList2;
/* 352 */               int iI00000oIO4 = I00000oIO(str3) & (iI00000oIO3 - 1);
/* 353 */               int[] iArr7 = this.I000O01llI0;
/* 355 */               int[] iArr8 = this.I000II;
/* 359 */               iArr7[i10] = iArr8[iI00000oIO4];
/* 361 */               iArr8[iI00000oIO4] = i10;
/* 363 */               i10++;
                    }
                }

                public final int I00000oIO(String str) {
/* 3 */             if (!this.I0000Il00O) {
/* 28 */                return str.hashCode();
                    }
/* 5 */             int length = str.length();
/* 10 */            int lowerCase = 0;
/* 11 */            for (int i = 0; i < length; i++) {
/* 23 */                lowerCase = (lowerCase * 31) + Character.toLowerCase(str.charAt(i));
                    }
/* 27 */            return lowerCase;
                }

                public final List I00000oOI(String str) {
/* 3 */             if (this.I0001Ioi1lo == 0) {
/* 42 */                return null;
                    }
/* 6 */             int iI00000oIO = I00000oIO(str);
/* 16 */            int i = this.I000II[iI00000oIO & (r1.length - 1)];
/* 18 */            while (i >= 0) {
/* 30 */                if (OlOolloIIOl0.I000O01llI0(this.I0000O[i], str, this.I0000Il00O)) {
/* 34 */                    return this.I0000oI00[i];
                        }
/* 39 */                i = this.I000O01llI0[i];
                    }
/* 42 */            return null;
                }

                @Override
                public final Set I000II() {
/* 1 */             int i = this.I0001Ioi1lo;
/* 3 */             if (i == 0) {
/* 5 */                 return Il01llIol0.I00iOIl;
                    }
/* 10 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 14 */            for (int i2 = 0; i2 < i; i2++) {
/* 20 */                String str = this.I0000O[i2];
/* 24 */                List list = this.I0000oI00[i2];
/* 27 */                O1OOO0IoIIi o1OOO0IoIIi = new O1OOO0IoIIi(3);
/* 30 */                o1OOO0IoIIi.I00iiI = str;
/* 32 */                o1OOO0IoIIi.I00iiO = list;
/* 34 */                VarHandle.storeStoreFence();
/* 37 */                linkedHashSet.add(o1OOO0IoIIi);
                    }
/* 113 */           return linkedHashSet;
                }

                @Override
                public final boolean I000O01llI0() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final void I000OOo1O(IlliIl1l11O illiIl1l11O) {
/* 4 */             for (int i = 0; i < this.I0001Ioi1lo; i++) {
/* 14 */                illiIl1l11O.invoke(this.I0000O[i], this.I0000oI00[i]);
                    }
                }

                @Override
                public final List I000OiO(String str) {
/* 1 */             return I00000oOI(str);
                }

                @Override
                public final String I000iOII(String str) {
/* 1 */             List listI00000oOI = I00000oOI(str);
/* 5 */             if (listI00000oOI != null) {
/* 11 */                return (String) IOOi0Ool1i.I00II0Ol1O0l(listI00000oOI);
                    }
/* 14 */            return null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof OlOo0II)) {
/* 20 */                return false;
                    }
/* 10 */            OlOo0II olOo0II = (OlOo0II) obj;
/* 18 */            if (this.I0000Il00O != olOo0II.I000O01llI0()) {
/* 20 */                return false;
                    }
/* 30 */            return I000II().equals(olOo0II.I000II());
                }

                public final int hashCode() {
/* 1 */             Set setI000II = I000II();
/* 17 */            return setI000II.hashCode() + (Boolean.hashCode(this.I0000Il00O) * 961);
                }

                @Override
                public final boolean isEmpty() {
                    return this.I0001Ioi1lo == 0;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StringValues(case=");
/* 12 */            sb.append(!this.I0000Il00O);
/* 17 */            sb.append(") ");
/* 24 */            sb.append(I000II());
/* 27 */            return sb.toString();
                }
            }
