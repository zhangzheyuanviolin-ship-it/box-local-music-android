            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class OII111OO1 {
                public OlO0OIIl1 I00000oIO;
                public OlO0OIIl1 I00000oOI;
                public OOli1O I0000Il00O;
                public I1Il0loi I0000O;
                public I1Il0loi I0000oI00;
                public OII0l01IIOi I0001Ioi1lo;
                public int I000II;
                public OII10o1l1IO I000O01llI0;
                public LinkedHashSet I000OOo1O;
                public LinkedHashSet I000OiO;
                public LinkedHashSet I000iOII;
                public boolean I000l1;
                public boolean I000lI;
                public boolean I000o00OoI0I;

                public final void I00000oIO(iOliil ioliil, OII10o1l1IO oII10o1l1IO, int i) {
/* 3 */             if (oII10o1l1IO.I00000oIO == null) {
/* 18 */                (i != 0 ? i != 1 ? this.I000OOo1O : this.I000OiO : this.I000iOII).add(oII10o1l1IO);
/* 21 */                oII10o1l1IO.I00000oIO = ioliil;
/* 45 */                oII10o1l1IO.I00000oOI(i != 0 ? i != 1 ? this.I000o00OoI0I : this.I000l1 : this.I000lI);
/* 48 */                return;
                    }
/* 53 */            StringBuilder sb = new StringBuilder("Input '");
/* 56 */            sb.append(oII10o1l1IO);
/* 59 */            iOliil ioliil2 = oII10o1l1IO.I00000oIO;
/* 63 */            sb.append("' is already added to dispatcher ");
/* 66 */            sb.append(ioliil2);
/* 71 */            sb.append('.');
/* 98 */            throw new IllegalArgumentException(sb.toString().toString());
                }

                public final void I00000oOI() {
                    boolean z;
                    boolean z2;
/* 1 */             I1Il0loi i1Il0loi = this.I0000O;
/* 5 */             if (i1Il0loi == null || !i1Il0loi.isEmpty()) {
/* 15 */                Iterator it = i1Il0loi.iterator();
/* 23 */                while (it.hasNext()) {
/* 29 */                    OII0l01IIOi oII0l01IIOi = (OII0l01IIOi) it.next();
/* 33 */                    if (oII0l01IIOi.I0000oI00 || oII0l01IIOi.I0001Ioi1lo) {
/* 39 */                        z = true;
                                break;
                            }
                        }
/* 13 */                z = false;
                    } else {
/* 13 */                z = false;
                    }
/* 40 */            I1Il0loi i1Il0loi2 = this.I0000oI00;
/* 42 */            if (i1Il0loi2 == null || !i1Il0loi2.isEmpty()) {
/* 52 */                Iterator it2 = i1Il0loi2.iterator();
/* 60 */                while (it2.hasNext()) {
/* 66 */                    OII0l01IIOi oII0l01IIOi2 = (OII0l01IIOi) it2.next();
/* 70 */                    if (oII0l01IIOi2.I0000oI00 || oII0l01IIOi2.I0001Ioi1lo) {
/* 76 */                        z2 = true;
                                break;
                            }
                        }
/* 50 */                z2 = false;
                    } else {
/* 50 */                z2 = false;
                    }
/* 84 */            boolean z3 = z || z2;
/* 91 */            boolean z4 = this.I000lI != z;
/* 98 */            boolean z5 = this.I000l1 != z2;
/* 101 */           boolean z6 = this.I000o00OoI0I != z3;
/* 105 */           if (z4) {
/* 109 */               Iterator it3 = this.I000iOII.iterator();
/* 117 */               while (it3.hasNext()) {
/* 125 */                   ((OII10o1l1IO) it3.next()).I00000oOI(z);
                        }
                    }
/* 129 */           if (z5) {
/* 133 */               Iterator it4 = this.I000OiO.iterator();
/* 141 */               while (it4.hasNext()) {
/* 149 */                   ((OII10o1l1IO) it4.next()).I00000oOI(z2);
                        }
                    }
/* 153 */           if (z6) {
/* 157 */               Iterator it5 = this.I000OOo1O.iterator();
/* 165 */               while (it5.hasNext()) {
/* 173 */                   ((OII10o1l1IO) it5.next()).I00000oOI(z3);
                        }
                    }
/* 177 */           this.I000lI = z;
/* 179 */           this.I000l1 = z2;
/* 181 */           this.I000o00OoI0I = z3;
/* 183 */           OII0l01IIOi oII0l01IIOiI0000Il00O = this.I0001Ioi1lo;
/* 185 */           if (oII0l01IIOiI0000Il00O == null) {
/* 187 */               oII0l01IIOiI0000Il00O = I0000Il00O(0);
                    }
/* 191 */           I0000O(oII0l01IIOiI0000Il00O);
                }

                public final OII0l01IIOi I0000Il00O(int i) {
                    Object next;
                    Object next2;
                    Object next3;
/* 1 */             I1Il0loi i1Il0loi = this.I0000oI00;
/* 3 */             I1Il0loi i1Il0loi2 = this.I0000O;
/* 6 */             Object obj = null;
/* 7 */             if (i == -1) {
/* 157 */               Iterator it = i1Il0loi2.iterator();
                        while (true) {
/* 165 */                   if (!it.hasNext()) {
/* 179 */                       next = null;
                                break;
                            }
/* 167 */                   next = it.next();
/* 176 */                   if (((OII0l01IIOi) next).I0000oI00) {
                                break;
                            }
                        }
/* 180 */               OII0l01IIOi oII0l01IIOi = (OII0l01IIOi) next;
/* 182 */               if (oII0l01IIOi != null) {
/* 437 */                   return oII0l01IIOi;
                        }
/* 184 */               Iterator it2 = i1Il0loi.iterator();
                        while (true) {
/* 192 */                   if (!it2.hasNext()) {
                                break;
                            }
/* 194 */                   Object next4 = it2.next();
/* 203 */                   if (((OII0l01IIOi) next4).I0000oI00) {
/* 205 */                       obj = next4;
                                break;
                            }
                        }
/* 206 */               return (OII0l01IIOi) obj;
                    }
/* 9 */             if (i == 0) {
/* 96 */                Iterator it3 = i1Il0loi2.iterator();
                        while (true) {
/* 104 */                   if (!it3.hasNext()) {
/* 122 */                       next2 = null;
                                break;
                            }
/* 106 */                   next2 = it3.next();
/* 111 */                   OII0l01IIOi oII0l01IIOi2 = (OII0l01IIOi) next2;
/* 115 */                   if (oII0l01IIOi2.I0000oI00 || oII0l01IIOi2.I0001Ioi1lo) {
                                break;
                            }
                        }
/* 123 */               OII0l01IIOi oII0l01IIOi3 = (OII0l01IIOi) next2;
/* 125 */               if (oII0l01IIOi3 != null) {
/* 156 */                   return oII0l01IIOi3;
                        }
/* 127 */               Iterator it4 = i1Il0loi.iterator();
/* 135 */               while (it4.hasNext()) {
/* 137 */                   Object next5 = it4.next();
/* 142 */                   OII0l01IIOi oII0l01IIOi4 = (OII0l01IIOi) next5;
/* 146 */                   if (oII0l01IIOi4.I0000oI00 || oII0l01IIOi4.I0001Ioi1lo) {
/* 152 */                       obj = next5;
                                break;
                            }
                        }
/* 153 */               return (OII0l01IIOi) obj;
                    }
/* 12 */            if (i != 1) {
/* 95 */                throw new IllegalStateException(("Unsupported direction: '" + i + "'.").toString());
                    }
/* 14 */            Iterator it5 = i1Il0loi2.iterator();
                    while (true) {
/* 22 */                if (!it5.hasNext()) {
/* 36 */                    next3 = null;
                            break;
                        }
/* 24 */                next3 = it5.next();
/* 33 */                if (((OII0l01IIOi) next3).I0001Ioi1lo) {
                            break;
                        }
                    }
/* 37 */            OII0l01IIOi oII0l01IIOi5 = (OII0l01IIOi) next3;
/* 39 */            if (oII0l01IIOi5 != null) {
/* 66 */                return oII0l01IIOi5;
                    }
/* 41 */            Iterator it6 = i1Il0loi.iterator();
                    while (true) {
/* 49 */                if (!it6.hasNext()) {
                            break;
                        }
/* 51 */                Object next6 = it6.next();
/* 60 */                if (((OII0l01IIOi) next6).I0001Ioi1lo) {
/* 62 */                    obj = next6;
                            break;
                        }
                    }
/* 63 */            return (OII0l01IIOi) obj;
                }

                public final void I0000O(OII0l01IIOi oII0l01IIOi) {
                    OII10l11loo oII10l11loo;
/* 1 */             OlO0OIIl1 olO0OIIl1 = this.I00000oOI;
/* 3 */             OII0l01IIOi oII0l01IIOiI0000Il00O = this.I0001Ioi1lo;
/* 5 */             if (oII0l01IIOiI0000Il00O == null) {
/* 8 */                 oII0l01IIOiI0000Il00O = I0000Il00O(0);
                    }
/* 16 */            if (O0000Ioio00.I0000O(oII0l01IIOiI0000Il00O, oII0l01IIOi)) {
/* 20 */                if (oII0l01IIOiI0000Il00O == null) {
/* 24 */                    oII10l11loo = new OII10l11loo();
                        } else {
/* 31 */                    ArrayList arrayList = new ArrayList();
/* 36 */                    Iterator<E> it = this.I0000O.iterator();
/* 44 */                    while (it.hasNext()) {
/* 50 */                        OII0l01IIOi oII0l01IIOi2 = (OII0l01IIOi) it.next();
/* 54 */                        if (oII0l01IIOi2.I0000oI00 && !oII0l01IIOi2.I00000oOI.isEmpty()) {
/* 70 */                            arrayList.addAll(oII0l01IIOi2.I00000oOI);
                                }
                            }
/* 76 */                    Iterator<E> it2 = this.I0000oI00.iterator();
/* 84 */                    while (it2.hasNext()) {
/* 90 */                        OII0l01IIOi oII0l01IIOi3 = (OII0l01IIOi) it2.next();
/* 94 */                        if (oII0l01IIOi3.I0000oI00 && !oII0l01IIOi3.I00000oOI.isEmpty()) {
/* 110 */                           arrayList.addAll(oII0l01IIOi3.I00000oOI);
                                }
                            }
/* 114 */                   OII10lO0 oII10lO0 = oII0l01IIOiI0000Il00O.I00000oIO;
/* 116 */                   List list = oII0l01IIOiI0000Il00O.I0000Il00O;
/* 120 */                   O101lO1 o101lO1I0000oI00 = IOOi1I.I0000oI00();
/* 124 */                   IOOii0O10Io0.I00100l0(o101lO1I0000oI00, arrayList);
/* 127 */                   o101lO1I0000oI00.add(oII10lO0);
/* 132 */                   IOOii0O10Io0.I00100l0(o101lO1I0000oI00, list);
/* 143 */                   oII10l11loo = new OII10l11loo(arrayList.size(), IOOi1I.I0000Il00O(o101lO1I0000oI00));
                        }
/* 157 */               if (O0000Ioio00.I0000O((OII10l11loo) olO0OIIl1.getValue(), oII10l11loo)) {
/* 437 */                   return;
                        }
/* 161 */               olO0OIIl1.I000lI(null, oII10l11loo);
/* 166 */               Iterator it3 = this.I000iOII.iterator();
/* 174 */               while (it3.hasNext()) {
/* 182 */                   ((OII10o1l1IO) it3.next()).getClass();
                        }
/* 188 */               Iterator it4 = this.I000OiO.iterator();
/* 196 */               while (it4.hasNext()) {
/* 204 */                   ((OII10o1l1IO) it4.next()).getClass();
                        }
/* 210 */               Iterator it5 = this.I000OOo1O.iterator();
/* 218 */               while (it5.hasNext()) {
/* 226 */                   ((OII10o1l1IO) it5.next()).getClass();
                        }
                    }
                }
            }
