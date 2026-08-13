            package p000;
            
            public final class I0l10lIi implements IllOOo00lI {
                public final int I00iOIl;
                public I0l1OOl1l10 I00iiI;

                public I0l10lIi(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 35 */                    Object value = ((OIooliIO0) i0l1OOl1l10.I000OOo1O).getValue();
/* 39 */                    if (value != null) {
/* 106 */                       return value;
                            }
/* 45 */                    float fI000II = ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 51 */                    OIooliIO0 oIooliIO0 = (OIooliIO0) i0l1OOl1l10.I000II;
/* 57 */                    if (Float.isNaN(fI000II)) {
/* 102 */                       return oIooliIO0.getValue();
                            }
/* 67 */                    float fI0001Ioi1lo = i0l1OOl1l10.I0000Il00O().I0001Ioi1lo(oIooliIO0.getValue());
/* 75 */                    if (Float.isNaN(fI0001Ioi1lo) || fI000II == fI0001Ioi1lo) {
/* 97 */                        return oIooliIO0.getValue();
                            }
/* 86 */                    Object objI00000oIO = i0l1OOl1l10.I0000Il00O().I00000oIO(fI000II);
                            return objI00000oIO == null ? oIooliIO0.getValue() : objI00000oIO;
                        case 1:
/* 26 */                    return i0l1OOl1l10.I0000Il00O();
                        default:
/* 22 */                    return new OIoi0IIoi(i0l1OOl1l10.I0000Il00O(), ((IiO0o1I) i0l1OOl1l10.I000iOII).getValue());
                    }
                }
            }
