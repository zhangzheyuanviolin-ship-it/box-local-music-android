            package p000;

            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class I111IiO {
                public static final I1111OO10i I00000oIO = new I1111OO10i("");

                public static final List I00000oIO(I1111OO10i i1111OO10i, int i, int i2, I10I0o1ii10 i10I0o1ii10) {
                    List list;
/* 1 */             if (i == i2 || (list = i1111OO10i.I00iOIl) == null) {
/* 8 */                 return null;
                    }
/* 10 */            int i3 = 0;
/* 11 */            if (i == 0 && i2 >= i1111OO10i.I00iiI.length()) {
/* 21 */                if (i10I0o1ii10 == null) {
/* 23 */                    return list;
                        }
/* 30 */                ArrayList arrayList = new ArrayList(list.size());
/* 36 */                int size = list.size();
/* 40 */                while (i3 < size) {
/* 42 */                    Object obj = list.get(i3);
/* 61 */                    if (((Boolean) i10I0o1ii10.invoke(((I11110l0o) obj).I00000oIO)).booleanValue()) {
/* 63 */                        arrayList.add(obj);
                            }
/* 66 */                    i3++;
                        }
/* 69 */                return arrayList;
                    }
/* 76 */            ArrayList arrayList2 = new ArrayList(list.size());
/* 82 */            int size2 = list.size();
/* 86 */            while (i3 < size2) {
/* 92 */                I11110l0o i11110l0o = (I11110l0o) list.get(i3);
/* 110 */               if (i10I0o1ii10 != null ? ((Boolean) i10I0o1ii10.invoke(i11110l0o.I00000oIO)).booleanValue() : true) {
/* 112 */                   int i4 = i11110l0o.I00000oOI;
/* 114 */                   int i5 = i11110l0o.I0000Il00O;
/* 120 */                   if (I00000oOI(i, i2, i4, i5)) {
/* 145 */                       arrayList2.add(new I11110l0o((I1110oO) i11110l0o.I00000oIO, lIiioliIlo.I0000Il00O(i11110l0o.I00000oOI, i, i2) - i, lIiioliIlo.I0000Il00O(i5, i, i2) - i, i11110l0o.I0000O));
                            }
                        }
/* 148 */               i3++;
                    }
/* 204 */           return arrayList2;
                }

                public static final boolean I00000oOI(int i, int i2, int i3, int i4) {
/* 29 */            return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
                }
            }
