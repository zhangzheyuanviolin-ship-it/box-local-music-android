            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public final class OiolI10I1oOO {
                public Object I00000oIO;
                public Oiool011li I00000oOI;
                public Ol001oOi1 I0000Il00O;
                public OIooliIO0 I0000O;
                public OIooliIO0 I0000oI00;
                public I10i01 I0001Ioi1lo;
                public boolean I000II;
                public Oiol1oilllO I000O01llI0;
                public Oiol1oilllO I000OOo1O;

                public final boolean I00000oIO() {
/* 1 */             Ol001oOi1 ol001oOi1 = this.I0000Il00O;
                    return ol001oOi1.I00000oIO().I00000oOI() || ol001oOi1.I00000oIO().I0000O() || ol001oOi1.I0000oI00 == OlO01oiI.I00iiI;
                }

                public final List I00000oOI() {
/* 7 */             return (List) this.I0000O.getValue();
                }

                public final List I0000Il00O() {
/* 7 */             return (List) this.I0000oI00.getValue();
                }

                public final boolean I0000O() {
/* 1 */             List listI0000Il00O = I0000Il00O();
/* 8 */             int size = listI0000Il00O.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 26 */                OoI1Oi0l1I0o ooI1Oi0l1I0o = ((OiolIO0Il) listI0000Il00O.get(i)).I0000Il00O().I00000oOI;
                        while (true) {
/* 28 */                    OoI1Oi0l1I0o ooI1Oi0l1I0o2 = ooI1Oi0l1I0o.I00000oOI;
/* 30 */                    if (ooI1Oi0l1I0o2 == null) {
                                break;
                            }
/* 32 */                    ooI1Oi0l1I0o = ooI1Oi0l1I0o2;
                        }
/* 50 */                if (!O0000Ioio00.I0000O(ooI1Oi0l1I0o.I00000oIO.I00olI(), ooI1Oi0l1I0o.I0000O.getValue())) {
/* 52 */                    return true;
                        }
                    }
/* 12 */            return false;
                }

                public final boolean I0000oI00() {
/* 1 */             List listI0000Il00O = I0000Il00O();
/* 8 */             int size = listI0000Il00O.size();
/* 14 */            for (int i = 0; i < size; i++) {
/* 22 */                Oiolo1I oiolo1II00000oIO = ((OiolIO0Il) listI0000Il00O.get(i)).I00000oIO();
/* 26 */                if (oiolo1II00000oIO != null && oiolo1II00000oIO.I0000O()) {
/* 32 */                    return true;
                        }
                    }
/* 12 */            return false;
                }

                public final void I0001Ioi1lo() {
/* 1 */             List listI00000oOI = I00000oOI();
/* 7 */             ArrayList arrayList = new ArrayList();
/* 13 */            int size = listI00000oOI.size();
/* 18 */            boolean z = false;
/* 20 */            for (int i = 0; i < size; i++) {
/* 26 */                OiolIO0Il oiolIO0Il = (OiolIO0Il) listI00000oOI.get(i);
/* 32 */                if (oiolIO0Il.I000iOII()) {
/* 34 */                    arrayList.add(oiolIO0Il);
/* 45 */                    if (oiolIO0Il.I0000Il00O().I00000oOI()) {
/* 47 */                        z = true;
                            }
                        }
                    }
/* 53 */            this.I0000oI00.setValue(arrayList);
/* 56 */            Ol001oOi1 ol001oOi1 = this.I0000Il00O;
/* 58 */            OiolI10I1oOO oiolI10I1oOO = ol001oOi1.I00000oIO;
/* 60 */            OIooi1iOiOol oIooi1iOiOol = ol001oOi1.I0000O;
/* 70 */            if (oiolI10I1oOO.I0000Il00O().size() > 1 && z) {
/* 76 */                ol001oOi1.I0000oI00 = OlO01oiI.I00iiI;
/* 81 */                oIooi1iOiOol.I000O01llI0(ol001oOi1.I0000Il00O + 1);
                    } else if (!oiolI10I1oOO.I00000oOI.I00000oIO()) {
/* 108 */               ol001oOi1.I0000oI00 = OlO01oiI.I00iOIl;
/* 114 */               ol001oOi1.I0000Il00O = oIooi1iOiOol.I000II();
/* 120 */               ol001oOi1.I00000oOI.setValue(OIIl0lOlI.I00000oIO);
                    } else if (!z) {
/* 97 */                ol001oOi1.I0000oI00 = OlO01oiI.I00iiO;
/* 102 */               oIooi1iOiOol.I000O01llI0(ol001oOi1.I0000Il00O + 1);
                    }
/* 123 */           ol001oOi1.I00000oOI();
                }
            }
