            package p000;

            import java.util.List;
            
            public final class Oiol1oilllO extends O0iO10011II implements IllOOo00lI {
                public final int I00iOIl;
                public final OiolI10I1oOO I00iiI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oiol1oilllO(OiolI10I1oOO oiolI10I1oOO, int i) {
/* 6 */             super(0);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = oiolI10I1oOO;
                }

                @Override
                public final Object invoke() {
                    IOoil1iiIilo iOoil1iiIilo;
                    Object obj;
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 0;
/* 4 */             OiolI10I1oOO oiolI10I1oOO = this.I00iiI;
                    switch (i) {
                        case 0:
/* 47 */                    boolean z = oiolI10I1oOO.I000II;
/* 49 */                    I10i01 i10i01 = oiolI10I1oOO.I0001Ioi1lo;
/* 51 */                    Oiool011li oiool011li = oiolI10I1oOO.I00000oOI;
/* 53 */                    if (!z && oiool011li.I00000oIO() && i10i01.I0000oI00()) {
/* 67 */                        List listI0000Il00O = oiolI10I1oOO.I0000Il00O();
/* 74 */                        int size = listI0000Il00O.size();
                                while (true) {
/* 78 */                            iOoil1iiIilo = null;
/* 79 */                            if (i2 < size) {
/* 81 */                                obj = listI0000Il00O.get(i2);
/* 92 */                                if (!((OiolIO0Il) obj).I000OOo1O()) {
/* 95 */                                    i2++;
                                        }
                                    } else {
/* 98 */                                obj = null;
                                    }
                                }
/* 99 */                        OiolIO0Il oiolIO0Il = (OiolIO0Il) obj;
/* 101 */                       if (oiolIO0Il != null) {
/* 107 */                           IlIoO1ilo1 ilIoO1ilo1 = oiolIO0Il.I0000Il00O().I0001Ioi1lo;
/* 111 */                           if (ilIoO1ilo1 instanceof OlIOiI1iI1) {
/* 113 */                               OlIOiI1iI1 olIOiI1iI1 = (OlIOiI1iI1) ilIoO1ilo1;
/* 160 */                               iOi1II01i0.I0000O(oiool011li.I00iiI, null, null, new O1iIlllIoo(oiolI10I1oOO, new OlIOiI1iI1(olIOiI1iI1.I00000oIO, olIOiI1iI1.I00000oOI, OIOlIiiioi.I00000oIO((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L))), iOoil1iiIilo, 27), 3);
                                    }
/* 164 */                           oiolI10I1oOO.I000II = true;
                                }
                            }
/* 174 */                   return OIOlIiiioi.I00000oIO(((OIOlIiiioi) i10i01.I0000O()).I00000oIO);
                        default:
/* 9 */                     List listI00000oOI = oiolI10I1oOO.I00000oOI();
/* 16 */                    int size2 = listI00000oOI.size();
/* 20 */                    while (i2 < size2) {
/* 26 */                        OiolIO0Il oiolIO0Il2 = (OiolIO0Il) listI00000oOI.get(i2);
/* 32 */                        if (oiolIO0Il2.I000OOo1O() && oiolIO0Il2.I000iOII()) {
/* 44 */                            return OoiIlOl1iI.I00000oIO;
                                }
/* 41 */                        i2++;
                            }
/* 44 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
