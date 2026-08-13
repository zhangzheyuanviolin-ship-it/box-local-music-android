            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Array;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class iioOllll1 {
                public static final O0IOli0o0 I00000oIO(ClassLoader classLoader, String str) {
/* 6 */             Class clsI0001Ioi1lo = Oolli0oi0.I0001Ioi1lo(classLoader, I0000O(str), 0);
/* 10 */            if (clsI0001Ioi1lo != null) {
/* 14 */                return OOoOl0i.I00000oIO.I00000oOI(clsI0001Ioi1lo);
                    }
/* 19 */            return null;
                }

                public static final Annotation I00000oOI(O0OiOolO0i o0OiOolO0i, ClassLoader classLoader) {
/* 1 */             String str = o0OiOolO0i.I00000oIO;
/* 8 */             Class clsI0001Ioi1lo = Oolli0oi0.I0001Ioi1lo(classLoader, I0000O(str), 0);
/* 12 */            if (clsI0001Ioi1lo == null) {
/* 551 */               throw new Ii01OOool("Annotation class not found: ".concat(str));
                    }
/* 14 */            Map map = o0OiOolO0i.I00000oOI;
/* 26 */            LinkedHashMap linkedHashMap = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(map.size()));
/* 43 */            for (Map.Entry entry : map.entrySet()) {
/* 71 */                linkedHashMap.put(entry.getKey(), I0000Il00O((O0OoI01Oo000) entry.getValue(), str, (String) entry.getKey(), classLoader));
                    }
/* 79 */            return (Annotation) iOO0O10.I00000oOI(clsI0001Ioi1lo, linkedHashMap);
                }

                /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
                
                    r5 = null;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(O0OoI01Oo000 o0OoI01Oo000, String str, String str2, ClassLoader classLoader) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
                    List listI000II;
/* 3 */             if (o0OoI01Oo000 instanceof O0Oil0i) {
/* 9 */                 return I00000oOI(((O0Oil0i) o0OoI01Oo000).I00000oIO, classLoader);
                    }
/* 18 */            int i = 0;
/* 19 */            if (o0OoI01Oo000 instanceof O0Oil1) {
/* 21 */                O0Oil1 o0Oil1 = (O0Oil1) o0OoI01Oo000;
/* 23 */                String str3 = o0Oil1.I00000oIO;
/* 25 */                O0IOli0o0 o0IOli0o0I00000oIO = I00000oIO(classLoader, str3);
/* 29 */                if (o0IOli0o0I00000oIO == null) {
/* 63 */                    throw new Ii01OOool("Unresolved class: ".concat(str3));
                        }
/* 33 */                Class<?> clsI001l0I00 = ((IOIO10iOi1) o0IOli0o0I00000oIO).I001l0I00();
/* 37 */                int i2 = o0Oil1.I00000oOI;
/* 40 */                for (int i3 = 0; i3 < i2; i3++) {
/* 46 */                    clsI001l0I00 = Array.newInstance(clsI001l0I00, 0).getClass();
                        }
/* 53 */                return clsI001l0I00;
                    }
/* 67 */            Object obj = null;
/* 68 */            if (!(o0OoI01Oo000 instanceof O0OiliII1IlO)) {
/* 279 */               if (!(o0OoI01Oo000 instanceof O0Ol0O)) {
/* 378 */                   if (!(o0OoI01Oo000 instanceof O0OlO01OiiI)) {
/* 407 */                       if (o0OoI01Oo000 instanceof O0Oli0OO) {
/* 411 */                           return ((O0Oli0OO) o0OoI01Oo000).I00000oIO();
                                }
/* 416 */                       I000II.I00000oIO();
/* 67 */                        return null;
                            }
/* 382 */                   String str4 = ((O0OlO01OiiI) o0OoI01Oo000).I00000oIO;
/* 388 */                   Class clsI0001Ioi1lo = Oolli0oi0.I0001Ioi1lo(classLoader, I0000O(str4), 0);
/* 392 */                   if (clsI0001Ioi1lo != null) {
/* 394 */                       return clsI0001Ioi1lo;
                            }
/* 404 */                   throw new Ii01OOool("Unresolved class: ".concat(str4));
                        }
/* 281 */               O0Ol0O o0Ol0O = (O0Ol0O) o0OoI01Oo000;
/* 283 */               String str5 = o0Ol0O.I00000oOI;
/* 285 */               String str6 = o0Ol0O.I00000oIO;
/* 291 */               Class clsI0001Ioi1lo2 = Oolli0oi0.I0001Ioi1lo(classLoader, I0000O(str6), 0);
/* 295 */               if (clsI0001Ioi1lo2 == null) {
/* 375 */                   throw new Ii01OOool("Unresolved enum class: ".concat(str6));
                        }
/* 297 */               Object[] enumConstants = clsI0001Ioi1lo2.getEnumConstants();
/* 301 */               int length = enumConstants.length;
/* 302 */               boolean z = false;
/* 303 */               Object obj2 = null;
                        while (true) {
/* 304 */                   if (i < length) {
/* 306 */                       Object obj3 = enumConstants[i];
/* 319 */                       if (O0000Ioio00.I0000O(((Enum) obj3).name(), str5)) {
/* 321 */                           if (z) {
                                        break;
                                    }
/* 324 */                           z = true;
/* 325 */                           obj2 = obj3;
                                }
/* 326 */                       i++;
                            } else if (z) {
/* 332 */                       obj = obj2;
                            }
                        }
/* 333 */               if (obj != null) {
/* 335 */                   return obj;
                        }
/* 363 */               throw new Ii01OOool("Unresolved enum entry: " + str6 + '.' + str5);
                    }
/* 70 */            O0IOli0o0 o0IOli0o0I00000oIO2 = I00000oIO(classLoader, str);
/* 74 */            if (o0IOli0o0I00000oIO2 != null) {
/* 87 */                if (!((IOIO10iOi1) o0IOli0o0I00000oIO2).I001l0I00().isAnnotation()) {
/* 90 */                    o0IOli0o0I00000oIO2 = null;
                        }
/* 91 */                if (o0IOli0o0I00000oIO2 != null) {
/* 103 */                   O0Iill o0Iill = (O0Iill) IOOi0Ool1i.I00Oio(o0IOli0o0I00000oIO2.I000OiO());
/* 105 */                   if (o0Iill != null && (listI000II = o0Iill.I000II()) != null) {
/* 115 */                       Iterator it = listI000II.iterator();
/* 119 */                       boolean z2 = false;
/* 120 */                       Object obj4 = null;
                                while (true) {
/* 125 */                           if (it.hasNext()) {
/* 127 */                               Object next = it.next();
/* 144 */                               if (O0000Ioio00.I0000O(((IiO1l1i) ((O0IooIIl00) next)).getName(), str2)) {
/* 146 */                                   if (z2) {
                                                break;
                                            }
/* 150 */                                   z2 = true;
/* 151 */                                   obj4 = next;
                                        }
                                    } else if (!z2) {
                                        break;
                                    }
                                }
/* 156 */                       O0IooIIl00 o0IooIIl00 = (O0IooIIl00) obj4;
/* 158 */                       if (o0IooIIl00 != null) {
/* 162 */                           IiOOIlll iiOOIlllI000l1 = ((IiO1l1i) o0IooIIl00).I000l1();
/* 166 */                           O0IiIl0il o0IiIl0ilI001IIilI0O = iiOOIlllI000l1.I001IIilI0O();
/* 177 */                           O0IOli0o0 o0IOli0o0 = o0IiIl0ilI001IIilI0O instanceof O0IOli0o0 ? (O0IOli0o0) o0IiIl0ilI001IIilI0O : null;
/* 178 */                           if (o0IOli0o0 == null) {
/* 247 */                               IoOOl0iOl1io.I001IIilI0O("Array parameter type is not a class: ", iiOOIlllI000l1);
/* 67 */                                return null;
                                    }
/* 182 */                           Class clsI001l0I002 = ((IOIO10iOi1) o0IOli0o0).I001l0I00();
/* 201 */                           Class<?> componentType = O0000Ioio00.I0000O(clsI001l0I002.getComponentType(), O0IOli0o0.class) ? Class.class : clsI001l0I002.getComponentType();
/* 207 */                           ArrayList arrayList = ((O0OiliII1IlO) o0OoI01Oo000).I00000oIO;
/* 213 */                           Object objNewInstance = Array.newInstance(componentType, arrayList.size());
/* 217 */                           Iterator it2 = arrayList.iterator();
/* 225 */                           while (it2.hasNext()) {
/* 239 */                               Array.set(objNewInstance, i, I0000Il00O((O0OoI01Oo000) it2.next(), str, null, classLoader));
/* 227 */                               i++;
                                    }
/* 244 */                           return objNewInstance;
                                }
                            }
/* 264 */                   throw new Ii01OOool(IIl001iO0Io.I000oI1ioi("No parameter ", str2, " found in annotation constructor of ", str));
                        }
                    }
/* 276 */           throw new Ii01OOool("Not an annotation class: ".concat(str));
                }

                public static final IOIOill I0000O(String str) {
/* 4 */             boolean zI000l1 = OlOolloIIOl0.I000l1(str, ".", false);
/* 8 */             if (zI000l1) {
/* 11 */                str = str.substring(1);
                    }
/* 22 */            int iI001lllioOl = OlOoOIi0o.I001lllioOl(str, '/', 0, 6);
/* 54 */            return new IOIOill(new Ill0IO((iI001lllioOl == -1 ? "" : str.substring(0, iI001lllioOl)).replace('/', '.')), new Ill0IO(OlOoOIi0o.I00O0i0ii('/', str, str)), zI000l1);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00ed A[LOOP:0: B:25:0x00e7->B:27:0x00ed, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0105  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0120  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x013c  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x013f  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Ol0IlIlo1lo1 I0000oI00(O0i0iioIlO o0i0iioIlO, ClassLoader classLoader, OoOOoo11 ooOOoo11, IllOOo00lI illOOo00lI) {
                    O0IiIl0il o0O01o1i;
                    O0IiIl0il o0IiIl0ilI00000oOI;
                    Iterator it;
                    O0OoOl10 o0OoOl10;
                    String str;
                    IOIOill iOIOillI0000O;
/* 9 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 24 */            IlOIIioI1 ilOIIioI1 = new IlOIIioI1(OilO1oiooiII.I000OiO(o0i0iioIlO, I0ollliOo0.I00oliIiO01i), I0ollliOo0.I00oo1iO0ll, OilOOii.I00ioIO);
/* 30 */            II01il0l iI01il0l = new II01il0l(1);
/* 33 */            iI01il0l.I00iiI = classLoader;
/* 35 */            iI01il0l.I00iiO = ooOOoo11;
/* 39 */            iI01il0l.I00iio = illOOo00lI;
/* 41 */            iI01il0l.I00ilI0I1 = oOo0ooi;
/* 43 */            VarHandle.storeStoreFence();
/* 49 */            IlIl0l ilIl0l = new IlIl0l(3);
/* 52 */            ilIl0l.I00000oOI = ilOIIioI1;
/* 54 */            ilIl0l.I0000Il00O = iI01il0l;
/* 56 */            VarHandle.storeStoreFence();
/* 59 */            List listI000lI = OilO1oiooiII.I000lI(ilIl0l);
/* 63 */            l0lOoI l0looiI00000oIO = o0i0iioIlO.I00000oIO();
/* 69 */            OI0l0000lOo oI0l0000lOoI00000oIO = null;
/* 70 */            if (l0looiI00000oIO instanceof O0OoOl10) {
/* 74 */                String str2 = ((O0OoOl10) l0looiI00000oIO).I00000oIO;
/* 82 */                if (O0000Ioio00.I0000O(str2, "kotlin/Array")) {
/* 90 */                    O0O01O0o o0O01O0o = ((O0O0o1io) IOOi0Ool1i.I00OilO00Il(listI000lI)).I00000oOI;
/* 92 */                    if (o0O01O0o == null) {
/* 94 */                        o0O01O0o = OlIlOIi.I00000oIO;
                            }
/* 102 */                   Class clsI001l0I00 = ((IOIO10iOi1) l0ii0ooi.I00000oOI(o0O01O0o)).I001l0I00();
/* 106 */                   Ill0IO ill0IO = Oolli0oi0.I00000oIO;
/* 119 */                   o0IiIl0ilI00000oOI = OOoOl0i.I00000oIO.I00000oOI(Array.newInstance((Class<?>) clsI001l0I00, 0).getClass());
/* 193 */                   I00Ol00 i00Ol00 = I1i11o.I000II;
/* 199 */                   O0O00I1Ili o0O00I1Ili = I1i11o.I00000oIO[46];
/* 201 */                   boolean zI000OiO = i00Ol00.I000OiO(o0i0iioIlO);
/* 215 */                   ArrayList arrayList = ((O0IOi1) ilO01lO.I00000oIO(o0i0iioIlO.I000II, O0IOi1.I0000Il00O)).I00000oOI;
/* 225 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 228 */                   it = arrayList.iterator();
/* 236 */                   while (it.hasNext()) {
/* 248 */                       arrayList2.add(I00000oOI((O0OiOolO0i) it.next(), classLoader));
                            }
/* 252 */                   O0i0iioIlO o0i0iioIlO2 = o0i0iioIlO.I0000O;
/* 262 */                   Ol0IlIlo1lo1 ol0IlIlo1lo1I0000oI00 = o0i0iioIlO2 == null ? I0000oI00(o0i0iioIlO2, classLoader, ooOOoo11, null) : null;
/* 263 */                   I00Ol00 i00Ol002 = I1i11o.I000OOo1O;
/* 265 */                   O0O00I1Ili[] o0O00I1IliArr = I1i11o.I00000oIO;
/* 269 */                   O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[48];
/* 271 */                   boolean zI000OiO2 = i00Ol002.I000OiO(o0i0iioIlO);
/* 275 */                   l0lOoI l0looiI00000oIO2 = o0i0iioIlO.I00000oIO();
/* 286 */                   O0OoOl10 o0OoOl102 = !(l0looiI00000oIO2 instanceof O0OoOl10) ? (O0OoOl10) l0looiI00000oIO2 : null;
/* 295 */                   boolean zI0000O = O0000Ioio00.I0000O(o0OoOl102 == null ? o0OoOl102.I00000oIO : null, "kotlin/Nothing");
/* 299 */                   I00Ol00 i00Ol003 = I1i11o.I000O01llI0;
/* 303 */                   O0O00I1Ili o0O00I1Ili3 = o0O00I1IliArr[47];
/* 305 */                   boolean zI000OiO3 = i00Ol003.I000OiO(o0i0iioIlO);
/* 309 */                   l0lOoI l0looiI00000oIO3 = o0i0iioIlO.I00000oIO();
/* 320 */                   o0OoOl10 = !(l0looiI00000oIO3 instanceof O0OoOl10) ? (O0OoOl10) l0looiI00000oIO3 : null;
/* 321 */                   if (o0OoOl10 != null && (str = o0OoOl10.I00000oIO) != null) {
/* 327 */                       iOIOillI0000O = I0000O(str);
/* 337 */                       if (O00oO0liO11.I000l1.containsKey(iOIOillI0000O)) {
/* 349 */                           oI0l0000lOoI00000oIO = l1i1iiO0OII.I00000oIO(iOIOillI0000O.I00000oIO(), (O0IOli0o0) o0IiIl0ilI00000oOI);
                                }
                            }
/* 358 */                   Ol0IlIlo1lo1 ol0IlIlo1lo1 = new Ol0IlIlo1lo1(o0IiIl0ilI00000oOI, listI000lI, zI000OiO, arrayList2, ol0IlIlo1lo1I0000oI00, zI000OiO2, zI0000O, zI000OiO3, oI0l0000lOoI00000oIO, illOOo00lI);
/* 361 */                   oOo0ooi.I00iOIl = ol0IlIlo1lo1;
/* 363 */                   return ol0IlIlo1lo1;
                        }
/* 125 */               O0IiIl0il o0IiIl0ilI00000oIO = I00000oIO(classLoader, str2);
                        o0O01o1i = o0IiIl0ilI00000oIO;
/* 129 */               if (o0IiIl0ilI00000oIO == null) {
/* 144 */                   throw new Ii01OOool("Class not found: ".concat(str2));
                        }
                    } else if (l0looiI00000oIO instanceof O0Ooi10o0000) {
/* 163 */               o0O01o1i = new O0O01o1i(I0000O(((O0Ooi10o0000) l0looiI00000oIO).I00000oIO).I00000oIO());
                    } else {
/* 169 */               if (!(l0looiI00000oIO instanceof O0OoiOIOI)) {
/* 364 */                   I000II.I00000oIO();
/* 69 */                    return null;
                        }
/* 173 */               int i = ((O0OoiOIOI) l0looiI00000oIO).I00000oIO;
/* 175 */               O0IiIl0il o0IiIl0ilI00000oIO2 = ooOOoo11.I00000oIO(i);
                        o0O01o1i = o0IiIl0ilI00000oIO2;
/* 179 */               if (o0IiIl0ilI00000oIO2 == null) {
/* 184 */                   Il0ooOI il0ooOI = new Il0ooOI();
/* 187 */                   il0ooOI.I00iOIl = i;
/* 189 */                   VarHandle.storeStoreFence();
                            o0O01o1i = il0ooOI;
                        }
                    }
/* 131 */           o0IiIl0ilI00000oOI = o0O01o1i;
/* 193 */           I00Ol00 i00Ol004 = I1i11o.I000II;
/* 199 */           O0O00I1Ili o0O00I1Ili4 = I1i11o.I00000oIO[46];
/* 201 */           boolean zI000OiO4 = i00Ol004.I000OiO(o0i0iioIlO);
/* 215 */           ArrayList arrayList3 = ((O0IOi1) ilO01lO.I00000oIO(o0i0iioIlO.I000II, O0IOi1.I0000Il00O)).I00000oOI;
/* 225 */           ArrayList arrayList22 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 228 */           it = arrayList3.iterator();
/* 236 */           while (it.hasNext()) {
                    }
/* 252 */           O0i0iioIlO o0i0iioIlO22 = o0i0iioIlO.I0000O;
/* 262 */           if (o0i0iioIlO22 == null) {
                    }
/* 263 */           I00Ol00 i00Ol0022 = I1i11o.I000OOo1O;
/* 265 */           O0O00I1Ili[] o0O00I1IliArr2 = I1i11o.I00000oIO;
/* 269 */           O0O00I1Ili o0O00I1Ili22 = o0O00I1IliArr2[48];
/* 271 */           boolean zI000OiO22 = i00Ol0022.I000OiO(o0i0iioIlO);
/* 275 */           l0lOoI l0looiI00000oIO22 = o0i0iioIlO.I00000oIO();
/* 286 */           if (!(l0looiI00000oIO22 instanceof O0OoOl10)) {
                    }
/* 295 */           boolean zI0000O2 = O0000Ioio00.I0000O(o0OoOl102 == null ? o0OoOl102.I00000oIO : null, "kotlin/Nothing");
/* 299 */           I00Ol00 i00Ol0032 = I1i11o.I000O01llI0;
/* 303 */           O0O00I1Ili o0O00I1Ili32 = o0O00I1IliArr2[47];
/* 305 */           boolean zI000OiO32 = i00Ol0032.I000OiO(o0i0iioIlO);
/* 309 */           l0lOoI l0looiI00000oIO32 = o0i0iioIlO.I00000oIO();
/* 320 */           if (!(l0looiI00000oIO32 instanceof O0OoOl10)) {
                    }
/* 321 */           if (o0OoOl10 != null) {
/* 327 */               iOIOillI0000O = I0000O(str);
/* 337 */               if (O00oO0liO11.I000l1.containsKey(iOIOillI0000O)) {
                        }
                    }
/* 358 */           Ol0IlIlo1lo1 ol0IlIlo1lo12 = new Ol0IlIlo1lo1(o0IiIl0ilI00000oOI, listI000lI, zI000OiO4, arrayList22, ol0IlIlo1lo1I0000oI00, zI000OiO22, zI0000O2, zI000OiO32, oI0l0000lOoI00000oIO, illOOo00lI);
/* 361 */           oOo0ooi.I00iOIl = ol0IlIlo1lo12;
/* 363 */           return ol0IlIlo1lo12;
                }
            }
