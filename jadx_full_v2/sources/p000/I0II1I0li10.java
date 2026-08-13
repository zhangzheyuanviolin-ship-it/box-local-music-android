            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class I0II1I0li10 extends Ol0010iliOO1 {
                public Oiol1OoI I00000oIO;
                public OIooliIO0 I00000oOI;

                @Override
                public final Ol0010iliOO1 I00000oIO(OiolI10I1oOO oiolI10I1oOO, Oiol1OoI oiol1OoI, long j, long j2, long j3) {
                    Object obj;
/* 3 */             long jI0001Ioi1lo = OIOlIiiioi.I0001Ioi1lo(j2, j3);
/* 9 */             OillOo0 oillOo0 = new OillOo0(14);
/* 20 */            oillOo0.I00iiI = lOO00IiI0li.I00000oIO(Ol0i1I.I00000oIO(j));
/* 30 */            oillOo0.I00iiO = lOO00IiI0li.I00000oIO(OIOlIiiioi.I00000oIO(jI0001Ioi1lo));
/* 40 */            oillOo0.I00iio = lOO00IiI0li.I00000oIO(OIOlIiiioi.I00000oIO(j3));
/* 50 */            oillOo0.I00ilI0I1 = lOO00IiI0li.I00000oIO(OIOlIiiioi.I00000oIO(jI0001Ioi1lo));
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            OOo0IO oOo0IOI0000Il00O = I0000Il00O();
/* 59 */            if (oOo0IOI0000Il00O == null) {
/* 61 */                Oiol1OoI oiol1OoI2 = this.I00000oIO;
/* 63 */                if (oiol1OoI2 == null) {
/* 65 */                    List listI00000oOI = oiolI10I1oOO.I00000oOI();
/* 72 */                    int size = listI00000oOI.size();
/* 76 */                    int i = 0;
                            while (true) {
/* 78 */                        if (i >= size) {
/* 101 */                           obj = null;
                                    break;
                                }
/* 80 */                        obj = listI00000oOI.get(i);
/* 95 */                        if (oiolI10I1oOO.I0000Il00O().contains((OiolIO0Il) obj)) {
                                    break;
                                }
/* 98 */                        i++;
                            }
/* 102 */                   OiolIO0Il oiolIO0Il = (OiolIO0Il) obj;
/* 109 */                   oiol1OoI2 = oiolIO0Il != null ? oiolIO0Il.I00lli11 : null;
                        }
/* 110 */               oOo0IOI0000Il00O = lOII11ol.I00000oOI(oiolI10I1oOO, oiol1OoI2);
/* 114 */               if (oOo0IOI0000Il00O == null) {
/* 116 */                   oOo0IOI0000Il00O = lIl0looO.I00000oIO(j2, j);
                        }
                    }
/* 125 */           lOII11ol.I0000Il00O(oillOo0, j, j2, j3, true);
/* 130 */           I0II110 i0ii110 = new I0II110();
/* 133 */           i0ii110.I00000oIO = oillOo0;
/* 139 */           i0ii110.I00000oOI = lOO00IiI0li.I00000oIO(oiol1OoI);
/* 145 */           i0ii110.I0000Il00O = lOO00IiI0li.I00000oIO(oOo0IOI0000Il00O);
/* 147 */           VarHandle.storeStoreFence();
/* 399 */           return i0ii110;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             return true;
                }

                @Override
                public final OOo0IO I0000Il00O() {
/* 7 */             return (OOo0IO) this.I00000oOI.getValue();
                }

                @Override
                public final OillOo0 I0000oI00() {
/* 1 */             return null;
                }

                @Override
                public final OOo0IO I0001Ioi1lo(OiolI10I1oOO oiolI10I1oOO) {
                    Object obj;
/* 1 */             OOo0IO oOo0IOI0000Il00O = I0000Il00O();
/* 5 */             if (oOo0IOI0000Il00O != null) {
/* 7 */                 return oOo0IOI0000Il00O;
                    }
/* 12 */            if (I0000Il00O() == null) {
/* 14 */                Oiol1OoI oiol1OoI = this.I00000oIO;
/* 16 */                if (oiol1OoI == null) {
/* 18 */                    List listI00000oOI = oiolI10I1oOO.I00000oOI();
/* 25 */                    int size = listI00000oOI.size();
/* 29 */                    int i = 0;
                            while (true) {
/* 31 */                        if (i >= size) {
/* 54 */                            obj = null;
                                    break;
                                }
/* 33 */                        obj = listI00000oOI.get(i);
/* 48 */                        if (oiolI10I1oOO.I0000Il00O().contains((OiolIO0Il) obj)) {
                                    break;
                                }
/* 51 */                        i++;
                            }
/* 55 */                    OiolIO0Il oiolIO0Il = (OiolIO0Il) obj;
/* 62 */                    oiol1OoI = oiolIO0Il != null ? oiolIO0Il.I00lli11 : null;
                        }
/* 63 */                OOo0IO oOo0IOI00000oOI = lOII11ol.I00000oOI(oiolI10I1oOO, oiol1OoI);
/* 67 */                if (oOo0IOI00000oOI != null) {
/* 71 */                    this.I00000oOI.setValue(oOo0IOI00000oOI);
                        }
                    }
/* 74 */            return I0000Il00O();
                }

                @Override
                public final Ol0010iliOO1 I000II(Oiol1OoI oiol1OoI) {
/* 3 */             if (this.I00000oIO == null) {
/* 5 */                 this.I00000oIO = oiol1OoI;
                    }
/* 29 */            return this;
                }

                @Override
                public final Ol0010iliOO1 I000O01llI0() {
/* 1 */             return OIIl0lOlI.I00000oIO;
                }

                @Override
                public final void I000OOo1O(OOo0IO oOo0IO) {
/* 3 */             this.I00000oOI.setValue(oOo0IO);
                }
            }
