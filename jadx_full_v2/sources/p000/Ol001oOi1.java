            package p000;

            import java.util.List;
            
            public final class Ol001oOi1 {
                public OiolI10I1oOO I00000oIO;
                public OIooliIO0 I00000oOI;
                public int I0000Il00O;
                public OIooi1iOiOol I0000O;
                public OlO01oiI I0000oI00;
                public Oiol1OoI I0001Ioi1lo;
                public OIooi1iOiOol I000II;
                public int I000O01llI0;

                public final Ol0010iliOO1 I00000oIO() {
/* 7 */             return (Ol0010iliOO1) this.I00000oOI.getValue();
                }

                public final void I00000oOI() {
                    Object obj;
/* 3 */             List listI0000Il00O = this.I00000oIO.I0000Il00O();
/* 10 */            int size = listI0000Il00O.size();
/* 14 */            int i = 0;
                    while (true) {
/* 16 */                if (i >= size) {
/* 35 */                    obj = null;
                            break;
                        }
/* 18 */                obj = listI0000Il00O.get(i);
/* 29 */                if (((OiolIO0Il) obj).I000OOo1O()) {
                            break;
                        } else {
/* 32 */                    i++;
                        }
                    }
/* 36 */            OiolIO0Il oiolIO0Il = (OiolIO0Il) obj;
/* 38 */            if (oiolIO0Il == null && this.I0001Ioi1lo == null) {
/* 57 */                return;
                    }
/* 55 */            if (O0000Ioio00.I0000O(oiolIO0Il != null ? oiolIO0Il.I00lli11 : null, this.I0001Ioi1lo)) {
/* 57 */                return;
                    }
/* 64 */            this.I000II.I000O01llI0(this.I000O01llI0 + 1);
                }

                public final void I0000Il00O() {
                    Object obj;
                    Object obj2;
                    Ol0010iliOO1 ol0010iliOO1I00000oIO;
/* 1 */             OiolI10I1oOO oiolI10I1oOO = this.I00000oIO;
/* 3 */             OIooi1iOiOol oIooi1iOiOol = this.I0000O;
/* 11 */            int i = 0;
/* 12 */            if (oIooi1iOiOol.I000II() != this.I0000Il00O) {
/* 18 */                this.I0000Il00O = oIooi1iOiOol.I000II();
/* 22 */                int iOrdinal = this.I0000oI00.ordinal();
/* 26 */                if (iOrdinal == 0) {
/* 98 */                    ol0010iliOO1I00000oIO = I00000oIO();
                        } else if (iOrdinal != 1) {
/* 32 */                    ol0010iliOO1I00000oIO = OIIl0lOlI.I00000oIO;
/* 34 */                    if (iOrdinal == 2) {
/* 44 */                        List listI0000Il00O = oiolI10I1oOO.I0000Il00O();
/* 51 */                        int size = listI0000Il00O.size();
/* 55 */                        int i2 = 0;
                                while (true) {
/* 56 */                            if (i2 >= size) {
/* 82 */                                ol0010iliOO1I00000oIO = I00000oIO().I000O01llI0();
                                        break;
                                    } else if (O0000Ioio00.I0000O(((OiolIO0Il) listI0000Il00O.get(i2)).I00lli11, this.I0001Ioi1lo)) {
                                        break;
                                    } else {
/* 75 */                                i2++;
                                    }
                                }
                            } else if (iOrdinal != 3) {
/* 40 */                        I000II.I00000oIO();
/* 43 */                        return;
                            }
                        } else {
/* 93 */                    ol0010iliOO1I00000oIO = I00000oIO().I000II(this.I0001Ioi1lo);
                        }
/* 104 */               this.I00000oOI.setValue(ol0010iliOO1I00000oIO);
/* 109 */               this.I0000oI00 = OlO01oiI.I00iOIl;
                    }
/* 111 */           OIooi1iOiOol oIooi1iOiOol2 = this.I000II;
/* 119 */           if (oIooi1iOiOol2.I000II() != this.I000O01llI0) {
/* 127 */               Oiol1OoI oiol1OoI = null;
/* 128 */               if (oiolI10I1oOO.I00000oOI.I00000oIO()) {
/* 130 */                   List listI0000Il00O2 = oiolI10I1oOO.I0000Il00O();
/* 137 */                   int size2 = listI0000Il00O2.size();
                            while (true) {
/* 141 */                       if (i >= size2) {
/* 160 */                           obj2 = null;
                                    break;
                                }
/* 143 */                       obj2 = listI0000Il00O2.get(i);
/* 154 */                       if (((OiolIO0Il) obj2).I000OOo1O()) {
                                    break;
                                } else {
/* 157 */                           i++;
                                }
                            }
/* 161 */                   OiolIO0Il oiolIO0Il = (OiolIO0Il) obj2;
/* 163 */                   if (oiolIO0Il != null) {
/* 165 */                       oiol1OoI = oiolIO0Il.I00lli11;
                            }
                        } else {
/* 168 */                   List listI00000oOI = oiolI10I1oOO.I00000oOI();
/* 175 */                   int size3 = listI00000oOI.size();
                            while (true) {
/* 179 */                       if (i >= size3) {
/* 198 */                           obj = null;
                                    break;
                                }
/* 181 */                       obj = listI00000oOI.get(i);
/* 192 */                       if (((OiolIO0Il) obj).I000OOo1O()) {
                                    break;
                                } else {
/* 195 */                           i++;
                                }
                            }
/* 199 */                   OiolIO0Il oiolIO0Il2 = (OiolIO0Il) obj;
/* 201 */                   if (oiolIO0Il2 != null) {
/* 203 */                       oiol1OoI = oiolIO0Il2.I00lli11;
                            }
                        }
/* 211 */               if (!O0000Ioio00.I0000O(oiol1OoI, this.I0001Ioi1lo)) {
/* 213 */                   this.I0001Ioi1lo = oiol1OoI;
                        }
/* 219 */               this.I000O01llI0 = oIooi1iOiOol2.I000II();
                    }
                }
            }
