            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Set;
            
            public final class O0I1iO11I0l implements OI1IlOlol {
                public static final List I0000O;
                public String[] I00000oIO;
                public Set I00000oOI;
                public ArrayList I0000Il00O;

                static {
/* 55 */            String strI00IlilI0i0i = IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
/* 327 */           List listI000O01llI0 = IOOi1I.I000O01llI0(strI00IlilI0i0i.concat("/Any"), strI00IlilI0i0i.concat("/Nothing"), strI00IlilI0i0i.concat("/Unit"), strI00IlilI0i0i.concat("/Throwable"), strI00IlilI0i0i.concat("/Number"), strI00IlilI0i0i.concat("/Byte"), strI00IlilI0i0i.concat("/Double"), strI00IlilI0i0i.concat("/Float"), strI00IlilI0i0i.concat("/Int"), strI00IlilI0i0i.concat("/Long"), strI00IlilI0i0i.concat("/Short"), strI00IlilI0i0i.concat("/Boolean"), strI00IlilI0i0i.concat("/Char"), strI00IlilI0i0i.concat("/CharSequence"), strI00IlilI0i0i.concat("/String"), strI00IlilI0i0i.concat("/Comparable"), strI00IlilI0i0i.concat("/Enum"), strI00IlilI0i0i.concat("/Array"), strI00IlilI0i0i.concat("/ByteArray"), strI00IlilI0i0i.concat("/DoubleArray"), strI00IlilI0i0i.concat("/FloatArray"), strI00IlilI0i0i.concat("/IntArray"), strI00IlilI0i0i.concat("/LongArray"), strI00IlilI0i0i.concat("/ShortArray"), strI00IlilI0i0i.concat("/BooleanArray"), strI00IlilI0i0i.concat("/CharArray"), strI00IlilI0i0i.concat("/Cloneable"), strI00IlilI0i0i.concat("/Annotation"), strI00IlilI0i0i.concat("/collections/Iterable"), strI00IlilI0i0i.concat("/collections/MutableIterable"), strI00IlilI0i0i.concat("/collections/Collection"), strI00IlilI0i0i.concat("/collections/MutableCollection"), strI00IlilI0i0i.concat("/collections/List"), strI00IlilI0i0i.concat("/collections/MutableList"), strI00IlilI0i0i.concat("/collections/Set"), strI00IlilI0i0i.concat("/collections/MutableSet"), strI00IlilI0i0i.concat("/collections/Map"), strI00IlilI0i0i.concat("/collections/MutableMap"), strI00IlilI0i0i.concat("/collections/Map.Entry"), strI00IlilI0i0i.concat("/collections/MutableMap.MutableEntry"), strI00IlilI0i0i.concat("/collections/Iterator"), strI00IlilI0i0i.concat("/collections/MutableIterator"), strI00IlilI0i0i.concat("/collections/ListIterator"), strI00IlilI0i0i.concat("/collections/MutableListIterator"));
/* 331 */           I0000O = listI000O01llI0;
/* 335 */           I1IollOi01 i1IollOi01I00ilI0I1 = IOOi0Ool1i.I00ilI0I1(listI000O01llI0);
/* 345 */           int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(i1IollOi01I00ilI0I1, 10));
/* 351 */           if (iI00000oIO < 16) {
/* 353 */               iI00000oIO = 16;
                    }
/* 356 */           LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 359 */           Iterator it = i1IollOi01I00ilI0I1.iterator();
                    while (true) {
/* 364 */               Iio0IIOo iio0IIOo = (Iio0IIOo) it;
/* 372 */               if (!iio0IIOo.I00iiI.hasNext()) {
/* 541 */                   return;
                        }
/* 378 */               Iol0oIiIOI iol0oIiIOI = (Iol0oIiIOI) iio0IIOo.next();
/* 390 */               linkedHashMap.put((String) iol0oIiIOI.I00000oOI, Integer.valueOf(iol0oIiIOI.I00000oIO));
                    }
                }

                @Override
                public final String I00000oIO(int i) {
/* 1 */             return getString(i);
                }

                @Override
                public final boolean I00000oOI(int i) {
/* 7 */             return this.I00000oOI.contains(Integer.valueOf(i));
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String getString(int i) {
                    String strSubstring;
/* 7 */             O0IIiil00lI o0IIiil00lI = (O0IIiil00lI) this.I0000Il00O.get(i);
/* 9 */             int i2 = o0IIiil00lI.I00iiI;
/* 15 */            if ((i2 & 4) == 4) {
/* 17 */                Object obj = o0IIiil00lI.I00ilI0I1;
/* 21 */                if (obj instanceof String) {
/* 23 */                    strSubstring = (String) obj;
                        } else {
/* 26 */                    IIOII1 iioii1 = (IIOII1) obj;
/* 28 */                    String strI0010o = iioii1.I0010o();
/* 36 */                    if (iioii1.I000iOII()) {
/* 38 */                        o0IIiil00lI.I00ilI0I1 = strI0010o;
                            }
/* 40 */                    strSubstring = strI0010o;
                        }
                    } else if ((i2 & 2) == 2) {
/* 45 */                List list = I0000O;
/* 50 */                int size = list.size();
/* 54 */                int i3 = o0IIiil00lI.I00iio;
/* 69 */                strSubstring = (i3 < 0 || i3 >= size) ? this.I00000oIO[i] : (String) list.get(i3);
                    }
/* 79 */            if (o0IIiil00lI.I00io1l.size() >= 2) {
/* 81 */                List list2 = o0IIiil00lI.I00io1l;
/* 87 */                Integer num = (Integer) list2.get(0);
/* 93 */                Integer num2 = (Integer) list2.get(1);
/* 99 */                if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
/* 129 */                   strSubstring = strSubstring.substring(num.intValue(), num2.intValue());
                        }
                    }
/* 139 */           if (o0IIiil00lI.I00l0I0l0lO1.size() >= 2) {
/* 141 */               List list3 = o0IIiil00lI.I00l0I0l0lO1;
/* 165 */               strSubstring = strSubstring.replace((char) ((Integer) list3.get(0)).intValue(), (char) ((Integer) list3.get(1)).intValue());
                    }
/* 169 */           O0IIiO1iiio0 o0IIiO1iiio0 = o0IIiil00lI.I00ilO0;
/* 171 */           if (o0IIiO1iiio0 == null) {
/* 173 */               o0IIiO1iiio0 = O0IIiO1iiio0.NONE;
                    }
/* 175 */           int iOrdinal = o0IIiO1iiio0.ordinal();
/* 179 */           if (iOrdinal == 0) {
/* 966 */               return strSubstring;
                    }
/* 185 */           if (iOrdinal == 1) {
/* 214 */               return strSubstring.replace('$', '.');
                    }
/* 187 */           if (iOrdinal != 2) {
/* 209 */               I000II.I00000oIO();
/* 212 */               return null;
                    }
/* 193 */           if (strSubstring.length() >= 2) {
/* 200 */               strSubstring = strSubstring.substring(1, strSubstring.length() - 1);
                    }
/* 204 */           return strSubstring.replace('$', '.');
                }
            }
