            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            
            public abstract class li0ol1IO {
                public static final ArrayList I00000oIO(ArrayList arrayList, Collection collection, Illlil illlil) {
                    O0iIl1 o0iIl1I0001Ioi1lo;
/* 1 */             arrayList.size();
/* 4 */             collection.size();
/* 13 */            ArrayList arrayListI00ilO0 = IOOi0Ool1i.I00ilO0(arrayList, collection);
/* 25 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayListI00ilO0, 10));
/* 28 */            Iterator it = arrayListI00ilO0.iterator();
/* 36 */            while (it.hasNext()) {
/* 42 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it.next();
/* 47 */                O0iIl1 o0iIl1 = (O0iIl1) oIoi0IIoi.I00iOIl;
/* 51 */                Ooo00oi0O ooo00oi0O = (Ooo00oi0O) oIoi0IIoi.I00iiI;
/* 55 */                int i = ooo00oi0O.I00ilO0;
/* 57 */                I11IlOOO annotations = ooo00oi0O.getAnnotations();
/* 61 */                OI1Iio0ii1 name = ooo00oi0O.getName();
/* 65 */                boolean zI010ioo = ooo00oi0O.I010ioo();
/* 69 */                boolean z = ooo00oi0O.I00ioIO;
/* 71 */                boolean z2 = ooo00oi0O.I00l0I0l0lO1;
/* 75 */                if (ooo00oi0O.I00l0OO0IO != null) {
/* 77 */                    int i2 = IiOiOOIo.I00000oIO;
/* 87 */                    o0iIl1I0001Ioi1lo = IiOiIO0i1Oil.I0000Il00O(illlil).I0000O().I0001Ioi1lo(o0iIl1);
                        } else {
/* 93 */                    o0iIl1I0001Ioi1lo = null;
                        }
/* 105 */               arrayList2.add(new Ooo00oi0O(illlil, null, i, annotations, name, o0iIl1, zI010ioo, z, z2, o0iIl1I0001Ioi1lo, ooo00oi0O.I0010I0i()));
                    }
/* 215 */           return arrayList2;
                }

                public static final O0lO0l1iOO I00000oOI(OI000ilOol oI000ilOol) {
                    OI000ilOol oI000ilOol2;
                    IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo;
/* 1 */             int i = IiOiOOIo.I00000oIO;
/* 15 */            Iterator it = oI000ilOol.I00Ol10().I00iOIl().I0000oI00().iterator();
                    while (true) {
/* 24 */                if (!it.hasNext()) {
/* 67 */                    oI000ilOol2 = null;
                            break;
                        }
/* 30 */                O0iIl1 o0iIl1 = (O0iIl1) it.next();
/* 36 */                if (!O0i1lI0o1io.I001i1lo1io(o0iIl1)) {
/* 42 */                    iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 46 */                    int i2 = IiOiIO0i1Oil.I00000oIO;
/* 54 */                    if (IiOiIO0i1Oil.I000l1(iOIiO1lIl0lI00100o1O0lo, IOIOllO1oli.I00iOIl) || IiOiIO0i1Oil.I000l1(iOIiO1lIl0lI00100o1O0lo, IOIOllO1oli.I00iiO)) {
                                break;
                            }
                        }
                    }
/* 64 */            oI000ilOol2 = (OI000ilOol) iOIiO1lIl0lI00100o1O0lo;
/* 68 */            if (oI000ilOol2 == null) {
/* 23 */                return null;
                    }
/* 71 */            O1iil1I01o o1iil1I01oI00iOIl = oI000ilOol2.I00iOIl();
/* 80 */            O0lO0l1iOO o0lO0l1iOO = o1iil1I01oI00iOIl instanceof O0lO0l1iOO ? (O0lO0l1iOO) o1iil1I01oI00iOIl : null;
                    return o0lO0l1iOO == null ? I00000oOI(oI000ilOol2) : o0lO0l1iOO;
                }
            }
