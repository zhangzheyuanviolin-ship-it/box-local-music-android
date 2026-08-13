            package p000;

            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class OlOoOOooiIll {
                public static void I00000oIO(Appendable appendable, Object obj, Function1 function1) throws IOException {
/* 1 */             if (function1 != null) {
/* 9 */                 appendable.append((CharSequence) function1.invoke(obj));
/* 12 */                return;
                    }
/* 19 */            if (obj == null ? true : obj instanceof CharSequence) {
/* 23 */                appendable.append((CharSequence) obj);
                    } else if (obj instanceof Character) {
/* 37 */                appendable.append(((Character) obj).charValue());
                    } else {
/* 45 */                appendable.append(obj.toString());
                    }
                }

                public static String I00000oOI(String str) {
/* 4 */             I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(6);
/* 7 */             i1Iolliil0i.I00000oOI = str;
/* 9 */             VarHandle.storeStoreFence();
/* 15 */            OlOoOOIIi olOoOOIIi = new OlOoOOIIi(0);
/* 20 */            olOoOOIIi.I00iiI = "    ";
/* 22 */            VarHandle.storeStoreFence();
/* 32 */            return OilO1oiooiII.I000iOII(new OoI10o0iO11O(i1Iolliil0i, olOoOOIIi), "\n");
                }

                public static String I0000Il00O(String str) throws IOException {
                    int length;
/* 1 */             List listI00II0Ol1O0l = OlOoOIi0o.I00II0Ol1O0l(str);
/* 6 */             List list = listI00II0Ol1O0l;
/* 10 */            ArrayList arrayList = new ArrayList();
/* 21 */            for (Object obj : list) {
/* 34 */                if (!OlOoOIi0o.I001l0I00((String) obj)) {
/* 36 */                    arrayList.add(obj);
                        }
                    }
/* 48 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 51 */            Iterator it = arrayList.iterator();
                    while (true) {
/* 59 */                length = 0;
/* 60 */                if (!it.hasNext()) {
                            break;
                        }
/* 66 */                String str2 = (String) it.next();
/* 68 */                int length2 = str2.length();
                        while (true) {
/* 73 */                    if (length >= length2) {
/* 89 */                        length = -1;
                                break;
                            }
/* 83 */                    if (!iOlI1lIi0.I0000Il00O(str2.charAt(length))) {
                                break;
                            }
/* 86 */                    length++;
                        }
/* 90 */                if (length == -1) {
/* 92 */                    length = str2.length();
                        }
/* 100 */               arrayList2.add(Integer.valueOf(length));
                    }
/* 108 */           Integer num = (Integer) IOOi0Ool1i.I00IoiI(arrayList2);
/* 117 */           int iIntValue = num != null ? num.intValue() : 0;
/* 118 */           int length3 = str.length();
/* 122 */           listI00II0Ol1O0l.size();
/* 125 */           int iI000II = IOOi1I.I000II(listI00II0Ol1O0l);
/* 131 */           ArrayList arrayList3 = new ArrayList();
/* 142 */           for (Object obj2 : list) {
/* 148 */               int i = length + 1;
/* 150 */               String strSubstring = null;
/* 151 */               if (length < 0) {
/* 199 */                   IOOi1I.I000lI();
/* 202 */                   throw null;
                        }
/* 153 */               String str3 = (String) obj2;
/* 155 */               if ((length != 0 && length != iI000II) || !OlOoOIi0o.I001l0I00(str3)) {
/* 166 */                   if (iIntValue < 0) {
/* 195 */                       I000II.I0010I0i(IIlIOloOOO.I00100l0("Requested character count ", iIntValue, " is less than zero."));
/* 150 */                       return null;
                            }
/* 168 */                   int length4 = str3.length();
/* 172 */                   if (iIntValue <= length4) {
/* 175 */                       length4 = iIntValue;
                            }
/* 176 */                   strSubstring = str3.substring(length4);
                        }
/* 180 */               if (strSubstring != null) {
/* 182 */                   arrayList3.add(strSubstring);
                        }
/* 185 */               length = i;
                    }
/* 205 */           StringBuilder sb = new StringBuilder(length3);
/* 215 */           IOOi0Ool1i.I00IioO0OiOi(arrayList3, sb, "\n", null, null, null, 124);
/* 218 */           return sb.toString();
                }

                public static String I0000O(String str) throws IOException {
/* 8 */             if (OlOoOIi0o.I001l0I00("|")) {
/* 144 */               I000II.I000iOII("marginPrefix must be non-blank string.");
/* 7 */                 return null;
                    }
/* 10 */            List listI00II0Ol1O0l = OlOoOIi0o.I00II0Ol1O0l(str);
/* 14 */            int length = str.length();
/* 18 */            listI00II0Ol1O0l.size();
/* 21 */            int iI000II = IOOi1I.I000II(listI00II0Ol1O0l);
/* 29 */            ArrayList arrayList = new ArrayList();
/* 37 */            int i = 0;
/* 42 */            for (Object obj : listI00II0Ol1O0l) {
/* 48 */                int i2 = i + 1;
/* 50 */                if (i < 0) {
/* 118 */                   IOOi1I.I000lI();
/* 121 */                   throw null;
                        }
/* 52 */                String str2 = (String) obj;
/* 54 */                if ((i == 0 || i == iI000II) && OlOoOIi0o.I001l0I00(str2)) {
/* 64 */                    str2 = null;
                        } else {
/* 66 */                    int length2 = str2.length();
/* 70 */                    int i3 = 0;
                            while (true) {
/* 72 */                        if (i3 >= length2) {
/* 88 */                            i3 = -1;
                                    break;
                                }
/* 82 */                        if (!iOlI1lIi0.I0000Il00O(str2.charAt(i3))) {
                                    break;
                                }
/* 85 */                        i3++;
                            }
/* 104 */                   String strSubstring = (i3 != -1 && str2.startsWith("|", i3)) ? str2.substring("|".length() + i3) : null;
/* 108 */                   if (strSubstring != null) {
/* 110 */                       str2 = strSubstring;
                            }
                        }
/* 111 */               if (str2 != null) {
/* 113 */                   arrayList.add(str2);
                        }
/* 116 */               i = i2;
                    }
/* 124 */           StringBuilder sb = new StringBuilder(length);
/* 134 */           IOOi0Ool1i.I00IioO0OiOi(arrayList, sb, "\n", null, null, null, 124);
/* 137 */           return sb.toString();
                }
            }
