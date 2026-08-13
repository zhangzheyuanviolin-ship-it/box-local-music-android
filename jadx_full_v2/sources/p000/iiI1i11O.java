            package p000;

            import android.view.accessibility.AccessibilityNodeInfo;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class iiI1i11O {
                public static final boolean I00000oIO(ArrayList arrayList) {
                    List list;
                    long j;
/* 7 */             if (arrayList.size() >= 2) {
/* 23 */                if (arrayList.size() <= 1) {
/* 25 */                    list = Il01100l.I00iOIl;
                        } else {
/* 31 */                    ArrayList arrayList2 = new ArrayList();
/* 34 */                    Object obj = arrayList.get(0);
/* 38 */                    int iI000II = IOOi1I.I000II(arrayList);
/* 42 */                    int i = 0;
/* 43 */                    while (i < iI000II) {
/* 45 */                        i++;
/* 47 */                        Object obj2 = arrayList.get(i);
/* 52 */                        Oil000 oil000 = (Oil000) obj2;
/* 54 */                        Oil000 oil0002 = (Oil000) obj;
/* 85 */                        float fAbs = Math.abs(Float.intBitsToFloat((int) (oil0002.I000II().I0000Il00O() >> 32)) - Float.intBitsToFloat((int) (oil000.I000II().I0000Il00O() >> 32)));
/* 118 */                       float fAbs2 = Math.abs(Float.intBitsToFloat((int) (oil0002.I000II().I0000Il00O() & 4294967295L)) - Float.intBitsToFloat((int) (oil000.I000II().I0000Il00O() & 4294967295L)));
/* 139 */                       arrayList2.add(OIOlIiiioi.I00000oIO((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & 4294967295L)));
/* 142 */                       obj = obj2;
                            }
/* 144 */                   list = arrayList2;
                        }
/* 152 */               if (list.size() == 1) {
/* 160 */                   j = ((OIOlIiiioi) IOOi0Ool1i.I001lllioOl(list)).I00000oIO;
                        } else {
/* 167 */                   if (list.isEmpty()) {
/* 171 */                       O10lllI0o0.I0000Il00O("Empty collection can't be reduced.");
                            }
/* 174 */                   Object objI001lllioOl = IOOi0Ool1i.I001lllioOl(list);
/* 178 */                   int iI000II2 = IOOi1I.I000II(list);
/* 182 */                   if (1 <= iI000II2) {
/* 184 */                       int i2 = 1;
                                while (true) {
/* 201 */                           objI001lllioOl = OIOlIiiioi.I00000oIO(OIOlIiiioi.I000II(((OIOlIiiioi) objI001lllioOl).I00000oIO, ((OIOlIiiioi) list.get(i2)).I00000oIO));
/* 205 */                           if (i2 == iI000II2) {
                                        break;
                                    }
/* 207 */                           i2++;
                                }
                            }
/* 212 */                   j = ((OIOlIiiioi) objI001lllioOl).I00000oIO;
                        }
/* 229 */               if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
/* 15 */                    return false;
                        }
                    }
/* 6 */             return true;
                }

                public static final void I00000oOI(I01oII0IOOO i01oII0IOOO, Oil000 oil000) {
/* 9 */             Object objI000II = oil000.I000iOII().I00iOIl.I000II(Oil0I1O.I000II);
/* 14 */            if (objI000II == null) {
/* 16 */                objI000II = null;
                    }
/* 17 */            if (objI000II != null) {
/* 209 */               OIiilo1Ool0o.I00000oIO();
/* 332 */               return;
                    }
/* 19 */            Oil000 oil000I000l1 = oil000.I000l1();
/* 23 */            if (oil000I000l1 == null) {
/* 208 */               return;
                    }
/* 35 */            Object objI000II2 = oil000I000l1.I000iOII().I00iOIl.I000II(Oil0I1O.I0000oI00);
/* 39 */            if (objI000II2 == null) {
/* 41 */                objI000II2 = null;
                    }
/* 42 */            if (objI000II2 != null) {
/* 52 */                Object objI000II3 = oil000I000l1.I000iOII().I00iOIl.I000II(Oil0I1O.I0001Ioi1lo);
/* 60 */                IOOOoII1O iOOOoII1O = (IOOOoII1O) (objI000II3 != null ? objI000II3 : null);
/* 62 */                if (iOOOoII1O == null || (iOOOoII1O.I00000oIO >= 0 && iOOOoII1O.I00000oOI >= 0)) {
/* 86 */                    if (oil000.I000iOII().I00iOIl.I0000Il00O(Oil0I1O.I00Io1lO)) {
/* 92 */                        ArrayList arrayList = new ArrayList();
/* 18 */                        List listI000OOo1O = oil000I000l1.I000OOo1O((4 & 1) != 0 ? !oil000I000l1.I00000oOI : false, (4 & 2) == 0);
/* 103 */                       int size = listI000OOo1O.size();
/* 109 */                       int i = 0;
/* 110 */                       for (int i2 = 0; i2 < size; i2++) {
/* 116 */                           Oil000 oil0002 = (Oil000) listI000OOo1O.get(i2);
/* 130 */                           if (oil0002.I000iOII().I00iOIl.I0000Il00O(Oil0I1O.I00Io1lO)) {
/* 132 */                               arrayList.add(oil0002);
/* 147 */                               if (oil0002.I0000Il00O.I001i1O0Ol() < oil000.I0000Il00O.I001i1O0Ol()) {
/* 149 */                                   i++;
                                        }
                                    }
                                }
/* 158 */                       if (arrayList.isEmpty()) {
/* 208 */                           return;
                                }
/* 160 */                       boolean zI00000oIO = I00000oIO(arrayList);
/* 168 */                       int i3 = zI00000oIO ? 0 : i;
/* 173 */                       int i4 = zI00000oIO ? i : 0;
/* 182 */                       Object objI000II4 = oil000.I000iOII().I00iOIl.I000II(Oil0I1O.I00Io1lO);
/* 186 */                       if (objI000II4 == null) {
/* 188 */                           objI000II4 = Boolean.FALSE;
                                }
/* 205 */                       i01oII0IOOO.I00000oIO.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objI000II4).booleanValue()));
                            }
                        }
                    }
                }
            }
