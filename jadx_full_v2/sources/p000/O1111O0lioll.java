            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O1111O0lioll implements IlOil1iooOO0 {
                public final StringBuilder I00iOIl;
                public final int I00iiI;
                public final List I00iiO;
                public final OOo0l0ii10l I00iio;
                public final OOo0ll111 I00ilI0I1;
                public final OOo0ooi I00ilO0;
                public final O0l0IlolloIO I00io1l;

                public O1111O0lioll(StringBuilder sb, int i, List list, OOo0l0ii10l oOo0l0ii10l, OOo0ll111 oOo0ll111, O1111l o1111l, OOo0ooi oOo0ooi, O0l0IlolloIO o0l0IlolloIO) {
/* 4 */             this.I00iOIl = sb;
/* 6 */             this.I00iiI = i;
/* 8 */             this.I00iiO = list;
/* 10 */            this.I00iio = oOo0l0ii10l;
/* 12 */            this.I00ilI0I1 = oOo0ll111;
/* 14 */            this.I00ilO0 = oOo0ooi;
/* 16 */            this.I00io1l = o0l0IlolloIO;
                }

                @Override
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             StringBuilder sb = this.I00iOIl;
/* 5 */             int length = sb.length();
/* 9 */             sb.append((String) obj);
/* 16 */            int i = length - (this.I00iiI - 1);
/* 18 */            if (i < 0) {
/* 20 */                i = 0;
                    }
/* 21 */            String strSubstring = sb.substring(i);
/* 25 */            List list = this.I00iiO;
/* 31 */            ArrayList arrayList = new ArrayList();
/* 34 */            Iterator it = list.iterator();
                    while (true) {
/* 43 */                if (!it.hasNext()) {
                            break;
                        }
/* 58 */                Integer num = new Integer(OlOoOIi0o.I001i1lo1io(strSubstring, (String) it.next(), 0, false, 6));
/* 65 */                Integer num2 = num.intValue() >= 0 ? num : null;
/* 68 */                if (num2 != null) {
/* 70 */                    arrayList.add(num2);
                        }
                    }
/* 78 */            Integer num3 = (Integer) IOOi0Ool1i.I00IoiI(arrayList);
/* 80 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 82 */            if (num3 != null) {
/* 89 */                sb.setLength(num3.intValue() + i);
/* 94 */                this.I00iio.I00iOIl = true;
/* 96 */                return ooiIlOl1iI;
                    }
/* 97 */            OOo0ll111 oOo0ll111 = this.I00ilI0I1;
/* 101 */           int i2 = oOo0ll111.I00iOIl + 1;
/* 102 */           oOo0ll111.I00iOIl = i2;
/* 105 */           if (i2 >= 3) {
/* 108 */               oOo0ll111.I00iOIl = 0;
/* 114 */               String strI00000oIO = O1111l.I00000oIO(sb.toString(), false);
/* 118 */               int length2 = strI00000oIO.length();
/* 122 */               OOo0ooi oOo0ooi = this.I00ilO0;
/* 147 */               String strSubstring2 = length2 > ((String) oOo0ooi.I00iOIl).length() ? strI00000oIO.substring(((String) oOo0ooi.I00iOIl).length()) : "";
/* 149 */               oOo0ooi.I00iOIl = strI00000oIO;
/* 155 */               if (strSubstring2.length() > 0) {
/* 157 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 168 */                   Object objI0000oI00 = iOi1II01i0.I0000oI00(O1OI1l011OO1.I00000oIO, new O1111Io1o(this.I00io1l, strSubstring2, null, 1), iOoil1iiIilo);
/* 174 */                   if (objI0000oI00 == Ii0111o.I00iOIl) {
/* 176 */                       return objI0000oI00;
                            }
                        }
                    }
/* 332 */           return ooiIlOl1iI;
                }
            }
