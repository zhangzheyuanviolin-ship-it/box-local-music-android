            package p000;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            
            public final class Olill00lIoo {
                public final ArrayList I00000oIO = new ArrayList();

                public static void I00000oOI(ArrayList arrayList, int i, int[] iArr, int i2) {
/* 2 */             if (i2 >= iArr.length) {
/* 10 */                arrayList.add((int[]) iArr.clone());
/* 13 */                return;
                    }
/* 16 */            for (int i3 = 0; i3 < i; i3++) {
/* 18 */                int i4 = 0;
                        while (true) {
/* 19 */                    if (i4 >= i2) {
/* 29 */                        iArr[i2] = i3;
/* 33 */                        I00000oOI(arrayList, i, iArr, i2 + 1);
                                break;
                            } else if (i3 == iArr[i4]) {
                                break;
                            } else {
/* 26 */                        i4++;
                            }
                        }
                    }
                }

                public final void I00000oIO(Olio00O olio00O) {
/* 3 */             this.I00000oIO.add(olio00O);
                }

                public final List I0000Il00O(ArrayList arrayList) {
                    OlOOI001 olOOI001;
                    OlOOI001 olOOI0012;
                    OlOOI001 olOOI0013;
/* 5 */             if (arrayList.isEmpty()) {
/* 9 */                 return new ArrayList();
                    }
/* 13 */            int size = arrayList.size();
/* 17 */            ArrayList arrayList2 = this.I00000oIO;
/* 23 */            if (size != arrayList2.size()) {
/* 155 */               return null;
                    }
/* 27 */            int size2 = arrayList2.size();
/* 33 */            ArrayList arrayList3 = new ArrayList();
/* 39 */            I00000oOI(arrayList3, size2, new int[size2], 0);
/* 46 */            Olio00O[] olio00OArr = new Olio00O[arrayList.size()];
/* 48 */            Iterator it = arrayList3.iterator();
/* 56 */            while (it.hasNext()) {
/* 62 */                int[] iArr = (int[]) it.next();
/* 66 */                boolean z = true;
/* 71 */                for (int i = 0; i < arrayList2.size(); i++) {
/* 79 */                    if (iArr[i] < arrayList.size()) {
/* 85 */                        Olio00O olio00O = (Olio00O) arrayList2.get(i);
/* 93 */                        Olio00O olio00O2 = (Olio00O) arrayList.get(iArr[i]);
/* 95 */                        olio00O.getClass();
/* 131 */                       z &= olio00O2.I00000oOI.I00iOIl <= olio00O.I00000oOI.I00iOIl && olio00O2.I00000oIO == olio00O.I00000oIO && ((olOOI001 = olio00O.I0000Il00O) == (olOOI0012 = OlOOI001.I00iiI) || (olOOI0013 = olio00O2.I0000Il00O) == olOOI0012 || olOOI0013 == olOOI001);
/* 132 */                       if (!z) {
                                    break;
                                }
/* 143 */                       olio00OArr[iArr[i]] = (Olio00O) arrayList2.get(i);
                            }
                        }
/* 148 */               if (z) {
/* 150 */                   return Arrays.asList(olio00OArr);
                        }
                    }
/* 155 */           return null;
                }
            }
