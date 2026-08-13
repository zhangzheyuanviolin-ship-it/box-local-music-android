            package p000;

            import java.util.List;
            
            public abstract class lOII11ol {
                public static final OOo0IO I00000oIO(OillOo0 oillOo0) {
/* 41 */            return lIl0looO.I00000oIO(OIOlIiiioi.I000II(((OIOlIiiioi) ((OIooliIO0) oillOo0.I00iiO).getValue()).I00000oIO, ((OIOlIiiioi) ((OIooliIO0) oillOo0.I00iio).getValue()).I00000oIO), ((Ol0i1I) ((OIooliIO0) oillOo0.I00iiI).getValue()).I00000oIO);
                }

                public static final OOo0IO I00000oOI(OiolI10I1oOO oiolI10I1oOO, Oiol1OoI oiol1OoI) {
/* 1 */             if (oiol1OoI == null) {
/* 74 */                return null;
                    }
/* 3 */             List listI00000oOI = oiolI10I1oOO.I00000oOI();
/* 10 */            int size = listI00000oOI.size();
/* 15 */            for (int i = 0; i < size; i++) {
/* 29 */                if (O0000Ioio00.I0000O(((OiolIO0Il) listI00000oOI.get(i)).I00lli11, oiol1OoI)) {
/* 33 */                    if (oiol1OoI.I00lll10) {
                                return !oiol1OoI.I00oI0i ? oiol1OoI.I00o101lO : lIl0looO.I00000oIO(O0iOOo0Ii.I000II(oiol1OoI.I010lI0oi(), il0lI1i1olii.I000II(oiol1OoI), 6), l000O1l.I00000oOI(il0lI1i1olii.I000II(oiol1OoI).I00iiO));
                            }
/* 74 */                    return null;
                        }
                    }
/* 74 */            return null;
                }

                public static final void I0000Il00O(OillOo0 oillOo0, long j, long j2, long j3, boolean z) {
/* 3 */             OIooliIO0 oIooliIO0 = (OIooliIO0) oillOo0.I00iiO;
/* 7 */             OIooliIO0 oIooliIO02 = (OIooliIO0) oillOo0.I00ilI0I1;
/* 11 */            OIooliIO0 oIooliIO03 = (OIooliIO0) oillOo0.I00iiI;
/* 15 */            OIooliIO0 oIooliIO04 = (OIooliIO0) oillOo0.I00iio;
/* 29 */            if (!OIOlIiiioi.I0000O(((OIOlIiiioi) oIooliIO04.getValue()).I00000oIO, j3) || !Ol0i1I.I00000oOI(((Ol0i1I) oIooliIO03.getValue()).I00000oIO, j) || z) {
/* 51 */                oIooliIO03.setValue(Ol0i1I.I00000oIO(j));
/* 58 */                oIooliIO04.setValue(OIOlIiiioi.I00000oIO(j3));
/* 61 */                if (z) {
/* 95 */                    oIooliIO0.setValue(OIOlIiiioi.I00000oIO(OIOlIiiioi.I0001Ioi1lo(OIOlIiiioi.I0001Ioi1lo(j2, j3), OIOlIiiioi.I0001Ioi1lo(((OIOlIiiioi) oIooliIO02.getValue()).I00000oIO, ((OIOlIiiioi) oIooliIO0.getValue()).I00000oIO))));
                        }
                    }
/* 106 */           oIooliIO02.setValue(OIOlIiiioi.I00000oIO(OIOlIiiioi.I0001Ioi1lo(j2, j3)));
                }
            }
