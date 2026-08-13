            package p000;

            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.ListIterator;
            
            public abstract class IO1oiol extends OooioIIoi0O {
                public final OlO0OIIl1 I00000oOI;
                public final OOli1O I0000Il00O;

                public IO1oiol() {
/* 9 */             Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 15 */            OlO0OIIl1 olO0OIIl1I00000oIO = OlO0iOl0il.I00000oIO(new IO1looOIi(false, false, false, il011I1OiO0I, il011I1OiO0I));
/* 19 */            this.I00000oOI = olO0OIIl1I00000oIO;
/* 25 */            this.I0000Il00O = ilOoiIi101.I00000oIO(olO0OIIl1I00000oIO);
                }

                public final void I0000oI00(O1oIOiI11o0 o1oIOiI11o0, IO1OO01i0 iO1OO01i0) {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 13 */            LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 16 */            String str = o1oIOiI11o0.I00000oIO;
/* 22 */            List list = (List) linkedHashMap.get(str);
/* 36 */            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
/* 39 */            linkedHashMap.put(str, arrayList);
/* 46 */            if (arrayList.size() > 0 && ((IO1OO01i0) IOOi0Ool1i.I00Io1o110i(arrayList)).I00000oIO == IO1iIoo.I00l0OO0IO) {
/* 66 */                arrayList.remove(arrayList.size() - 1);
                    }
/* 69 */            arrayList.add(iO1OO01i0);
/* 99 */            do {
/* 72 */                value = olO0OIIl1.getValue();
/* 99 */            } while (!olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap, 23)));
                }

                public final IO1OO01i0 I0001Ioi1lo(O1oIOiI11o0 o1oIOiI11o0) {
/* 17 */            List list = (List) ((IO1looOIi) this.I00000oOI.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 19 */            if (list == null) {
/* 21 */                list = Il01100l.I00iOIl;
                    }
/* 27 */            return (IO1OO01i0) IOOi0Ool1i.I00IoIO0lI(list);
                }

                public final IO1OO01i0 I000II(O1oIOiI11o0 o1oIOiI11o0) {
                    Object objPrevious;
/* 1 */             IO1iIoo iO1iIoo = IO1iIoo.I00ll1;
/* 19 */            List list = (List) ((IO1looOIi) this.I00000oOI.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 21 */            if (list == null) {
/* 23 */                list = Il01100l.I00iOIl;
                    }
/* 29 */            ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
/* 37 */                if (!listIterator.hasPrevious()) {
/* 51 */                    objPrevious = null;
                            break;
                        }
/* 39 */                objPrevious = listIterator.previous();
/* 48 */                if (((IO1OO01i0) objPrevious).I00000oIO == iO1iIoo) {
                            break;
                        }
                    }
/* 52 */            return (IO1OO01i0) objPrevious;
                }

                public final IO1OO01i0 I000O01llI0(O1oIOiI11o0 o1oIOiI11o0, IO1loo iO1loo) {
                    Object objPrevious;
/* 1 */             IO1iIoo iO1iIoo = IO1iIoo.I00iio;
/* 19 */            List list = (List) ((IO1looOIi) this.I00000oOI.getValue()).I0000O.get(o1oIOiI11o0.I00000oIO);
/* 21 */            if (list == null) {
/* 23 */                list = Il01100l.I00iOIl;
                    }
/* 29 */            ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
/* 37 */                if (!listIterator.hasPrevious()) {
/* 57 */                    objPrevious = null;
                            break;
                        }
/* 39 */                objPrevious = listIterator.previous();
/* 44 */                IO1OO01i0 iO1OO01i0 = (IO1OO01i0) objPrevious;
/* 48 */                if (iO1OO01i0.I00000oIO == iO1iIoo && iO1OO01i0.I0000O() == iO1loo) {
                            break;
                        }
                    }
/* 58 */            return (IO1OO01i0) objPrevious;
                }

                public final void I000OOo1O(O1oIOiI11o0 o1oIOiI11o0) {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 13 */            LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 16 */            String str = o1oIOiI11o0.I00000oIO;
/* 22 */            List list = (List) linkedHashMap.get(str);
/* 36 */            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
/* 43 */            if (arrayList.size() > 0) {
/* 51 */                arrayList.remove(arrayList.size() - 1);
                    }
/* 54 */            linkedHashMap.put(str, arrayList);
/* 84 */            do {
/* 57 */                value = olO0OIIl1.getValue();
/* 84 */            } while (!olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap, 23)));
                }

                public final void I000OiO(O1oIOiI11o0 o1oIOiI11o0, IO1iII iO1iII) {
                    Object value;
                    int iNextIndex;
/* 1 */             IO1iIoo iO1iIoo = IO1iIoo.I00lli11;
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 15 */            LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 18 */            String str = o1oIOiI11o0.I00000oIO;
/* 24 */            List list = (List) linkedHashMap.get(str);
/* 38 */            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
/* 45 */            if (arrayList.size() > 0) {
/* 51 */                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
/* 59 */                    if (!listIterator.hasPrevious()) {
/* 76 */                        iNextIndex = -1;
                                break;
                            } else if (((IO1OO01i0) listIterator.previous()).I00000oIO == iO1iIoo) {
/* 71 */                        iNextIndex = listIterator.nextIndex();
                                break;
                            }
                        }
/* 77 */                if (iNextIndex >= 0) {
/* 79 */                    arrayList.set(iNextIndex, iO1iII);
                        }
                    }
/* 82 */            linkedHashMap.put(str, arrayList);
/* 97 */            IO1looOIi iO1looOIiI00000oIO = IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap, 23);
/* 112 */           do {
/* 101 */               value = olO0OIIl1.getValue();
/* 112 */           } while (!olO0OIIl1.I000iOII(value, iO1looOIiI00000oIO));
                }

                public final void I000iOII(boolean z) {
                    while (true) {
/* 1 */                 OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 22 */                boolean z2 = z;
/* 31 */                if (olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), z2, false, false, null, 30))) {
/* 33 */                    return;
                        } else {
/* 34 */                    z = z2;
                        }
                    }
                }

                public final void I000l1(boolean z) {
                    while (true) {
/* 1 */                 OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 22 */                boolean z2 = z;
/* 31 */                if (olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, z2, false, null, 29))) {
/* 33 */                    return;
                        } else {
/* 34 */                    z = z2;
                        }
                    }
                }

                public final void I000lI(boolean z) {
                    while (true) {
/* 1 */                 OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 3 */                 Object value = olO0OIIl1.getValue();
/* 22 */                boolean z2 = z;
/* 31 */                if (olO0OIIl1.I000iOII(value, IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, z2, null, 27))) {
/* 33 */                    return;
                        } else {
/* 34 */                    z = z2;
                        }
                    }
                }

                public final void I000o00OoI0I(O1oIOiI11o0 o1oIOiI11o0, IO1Oii iO1Oii) {
                    Object value;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 13 */            LinkedHashMap linkedHashMap = new LinkedHashMap(((IO1looOIi) olO0OIIl1.getValue()).I0000O);
/* 16 */            String str = o1oIOiI11o0.I00000oIO;
/* 22 */            List list = (List) linkedHashMap.get(str);
/* 36 */            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
/* 43 */            if (arrayList.size() > 0) {
/* 49 */                IO1OO01i0 iO1OO01i0 = (IO1OO01i0) IOOi0Ool1i.I00Io1o110i(arrayList);
/* 53 */                if (iO1OO01i0 instanceof IO1iI1i) {
/* 58 */                    ((IO1iI1i) iO1OO01i0).I000iOII = iO1Oii;
/* 66 */                    arrayList.remove(arrayList.size() - 1);
/* 69 */                    arrayList.add(iO1OO01i0);
                        }
                    }
/* 72 */            linkedHashMap.put(str, arrayList);
/* 87 */            IO1looOIi iO1looOIiI00000oIO = IO1looOIi.I00000oIO((IO1looOIi) olO0OIIl1.getValue(), false, false, false, linkedHashMap, 23);
/* 102 */           do {
/* 91 */                value = olO0OIIl1.getValue();
/* 102 */           } while (!olO0OIIl1.I000iOII(value, iO1looOIiI00000oIO));
                }
            }
