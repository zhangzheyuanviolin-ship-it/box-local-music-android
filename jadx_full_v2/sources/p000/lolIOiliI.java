            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public final class lolIOiliI implements llOo0OilI {
                public i0O1lIi1O0IO I00iOIl;
                public lloI11II0o0 I00iiI;
                public o00010OI0o I00iiO;
                public List I00iio;
                public int I00ilI0I1;

                public static void I0000Il00O(Class cls, String str, Field field, Field field2) {
/* 3 */             String name = cls.getName();
/* 7 */             String strI0000Il00O = o01l0i.I0000Il00O(field);
/* 11 */            String strI0000Il00O2 = o01l0i.I0000Il00O(field2);
/* 15 */            int length = name.length();
/* 23 */            int length2 = String.valueOf(str).length();
/* 48 */            StringBuilder sb = new StringBuilder(length + 44 + length2 + 32 + strI0000Il00O.length() + 5 + strI0000Il00O2.length() + 81);
/* 55 */            IIl001iO0Io.I001lIiIIo1O(sb, "Class ", name, " declares multiple JSON fields named '", str);
/* 62 */            IIl001iO0Io.I001lIiIIo1O(sb, "'; conflict is caused by fields ", strI0000Il00O, " and ", strI0000Il00O2);
/* 67 */            sb.append("\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#duplicate-fields");
/* 204 */           throw new IllegalArgumentException(sb.toString());
                }

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) throws NoSuchMethodException, SecurityException {
/* 1 */             Class cls = o0ioi0io1ioo.I00000oIO;
/* 9 */             if (!Object.class.isAssignableFrom(cls)) {
/* 11 */                return null;
                    }
/* 13 */            ll1I00l ll1i00l = o01l0i.I00000oIO;
/* 24 */            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
/* 41 */                return new loi0OO1oo1o(1);
                    }
/* 47 */            ll10OO0Illl1.I00000oIO(this.I00iio);
/* 50 */            ll1I00l ll1i00l2 = o01l0i.I00000oIO;
/* 57 */            if (!ll1i00l2.I00000oIO(cls)) {
/* 141 */               lo11I0lO lo11i0loI0000O = this.I00iOIl.I0000O(o0ioi0io1ioo, true);
/* 151 */               lol0IlIlOOO lol0ililooo = new lol0IlIlOOO(I0000O(i1ii1o0, o0ioi0io1ioo, cls, false));
/* 154 */               lol0ililooo.I00000oOI = lo11i0loI0000O;
/* 156 */               VarHandle.storeStoreFence();
/* 332 */               return lol0ililooo;
                    }
/* 65 */            lol1Iiii lol1iiii = new lol1Iiii(I0000O(i1ii1o0, o0ioi0io1ioo, cls, true));
/* 73 */            lol1iiii.I0000O = new HashMap();
/* 75 */            Constructor constructorI0000Il00O = ll1i00l2.I0000Il00O(cls);
/* 79 */            lol1iiii.I00000oOI = constructorI0000Il00O;
/* 81 */            o01l0i.I00000oIO(constructorI0000Il00O);
/* 84 */            String[] strArrI00000oOI = ll1i00l2.I00000oOI(cls);
/* 90 */            for (int i = 0; i < strArrI00000oOI.length; i++) {
/* 100 */               lol1iiii.I0000O.put(strArrI00000oOI[i], Integer.valueOf(i));
                    }
/* 108 */           Class<?>[] parameterTypes = lol1iiii.I00000oOI.getParameterTypes();
/* 115 */           lol1iiii.I0000Il00O = new Object[parameterTypes.length];
/* 118 */           for (int i2 = 0; i2 < parameterTypes.length; i2++) {
/* 130 */               lol1iiii.I0000Il00O[i2] = lol1Iiii.I0000oI00.get(parameterTypes[i2]);
                    }
/* 135 */           VarHandle.storeStoreFence();
/* 138 */           return lol1iiii;
                }

                public final boolean I00000oOI(Field field, boolean z) {
/* 1 */             lloI11II0o0 lloi11ii0o0 = this.I00iiI;
/* 3 */             lloi11ii0o0.getClass();
/* 12 */            if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || lloi11ii0o0.I00000oOI(field.getType(), z)) {
/* 32 */                return false;
                    }
/* 39 */            List list = z ? lloi11ii0o0.I00iOIl : lloi11ii0o0.I00iiI;
/* 45 */            if (list.isEmpty()) {
/* 63 */                return true;
                    }
/* 47 */            Iterator it = list.iterator();
/* 55 */            if (it.hasNext()) {
/* 62 */                throw IIlIOloOOO.I000lI(it);
                    }
/* 63 */            return true;
                }

                /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[PHI: r13
                  0x005a: PHI (r13v2 boolean) = (r13v1 boolean), (r13v6 boolean) binds: [B:22:0x004d, B:25:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final lol0ll0lioo I0000O(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo, Class cls, boolean z) throws SecurityException {
                    boolean z2;
                    Method methodI0000O;
                    lli1lOIl11l lli1loil11l;
                    List listAsList;
                    String name;
                    Field[] fieldArr;
                    List<String> listSingletonList;
                    boolean z3;
                    int modifiers;
                    int i;
                    loill0OOio loill0ooio;
/* 1 */             lolIOiliI lolioilii = this;
/* 9 */             if (cls.isInterface()) {
/* 11 */                return lol0ll0lioo.I00000oOI;
                    }
/* 16 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 21 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 24 */            o0IOi0io1iOo o0ioi0io1ioo2 = o0ioi0io1ioo;
/* 26 */            Class cls2 = cls;
                    while (true) {
/* 27 */                Type type = o0ioi0io1ioo2.I00000oOI;
/* 31 */                if (cls2 == Object.class) {
/* 456 */                   new ArrayList(linkedHashMap2.values());
/* 459 */                   return new lol0ll0lioo(linkedHashMap);
                        }
/* 33 */                Field[] declaredFields = cls2.getDeclaredFields();
/* 37 */                if (cls2 != cls && declaredFields.length > 0) {
/* 44 */                    ll10OO0Illl1.I00000oIO(lolioilii.I00iio);
                        }
/* 47 */                int length = declaredFields.length;
/* 48 */                boolean z4 = false;
/* 49 */                int i2 = 0;
/* 50 */                while (i2 < length) {
/* 52 */                    Field field = declaredFields[i2];
/* 55 */                    boolean zI00000oOI = lolioilii.I00000oOI(field, true);
/* 59 */                    boolean zI00000oOI2 = lolioilii.I00000oOI(field, z4);
/* 63 */                    if (zI00000oOI) {
/* 78 */                        if (!z) {
/* 91 */                            z2 = true;
/* 93 */                            methodI0000O = null;
/* 150 */                           if (methodI0000O == null) {
/* 152 */                               o01l0i.I00000oIO(field);
                                    }
/* 166 */                           Type typeI000O01llI0 = iO1lo1I1iI.I000O01llI0(type, cls2, field.getGenericType(), new HashMap());
/* 174 */                           lli1loil11l = (lli1lOIl11l) field.getAnnotation(lli1lOIl11l.class);
/* 176 */                           if (lli1loil11l == null) {
/* 178 */                               int i3 = lolioilii.I00ilI0I1;
/* 180 */                               if (i3 == 0) {
/* 193 */                                   throw null;
                                        }
/* 184 */                               if (i3 - 1 != 0) {
/* 193 */                                   throw null;
                                        }
/* 186 */                               name = field.getName();
/* 190 */                               listAsList = Collections.EMPTY_LIST;
                                    } else {
/* 194 */                               String strZza = lli1loil11l.zza();
/* 202 */                               listAsList = Arrays.asList(lli1loil11l.zzb());
/* 209 */                               name = strZza;
                                    }
/* 215 */                           if (listAsList.isEmpty()) {
/* 217 */                               listSingletonList = Collections.singletonList(name);
/* 221 */                               fieldArr = declaredFields;
/* 223 */                               z3 = z4;
                                    } else {
/* 231 */                               fieldArr = declaredFields;
/* 235 */                               ArrayList arrayList = new ArrayList(listAsList.size() + 1);
/* 238 */                               arrayList.add(name);
/* 241 */                               arrayList.addAll(listAsList);
/* 244 */                               listSingletonList = arrayList;
/* 245 */                               z3 = false;
                                    }
/* 250 */                           String str = (String) listSingletonList.get(z3 ? 1 : 0);
/* 254 */                           o0IOi0io1iOo o0ioi0io1ioo3 = new o0IOi0io1iOo(typeI000O01llI0);
/* 257 */                           Class cls3 = o0ioi0io1ioo3.I00000oIO;
/* 270 */                           boolean z5 = (cls3 == null || !cls3.isPrimitive()) ? z3 ? 1 : 0 : z2;
/* 271 */                           modifiers = field.getModifiers();
/* 279 */                           if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
/* 287 */                               z3 = z2;
                                    }
/* 289 */                           i = length;
/* 299 */                           lli010l0ii lli010l0iiVar = (lli010l0ii) field.getAnnotation(lli010l0ii.class);
/* 322 */                           llOl001olOi llol001oloiI00000oOI = lli010l0iiVar == null ? lolioilii.I00iiO.I00000oOI(lolioilii.I00iOIl, i1ii1o0, o0ioi0io1ioo3, lli010l0iiVar, false) : null;
/* 335 */                           llOl001olOi llol001oloiI00O0i0ii = llol001oloiI00000oOI != null ? i1ii1o0.I00O0i0ii(o0ioi0io1ioo3) : llol001oloiI00000oOI;
/* 338 */                           loill0OOio loill0ooio2 = new loill0OOio();
/* 341 */                           loill0ooio2.I0000Il00O = llol001oloiI00O0i0ii;
/* 343 */                           loill0ooio2.I0000O = z5;
/* 345 */                           loill0ooio2.I0000oI00 = z3;
/* 347 */                           loill0ooio2.I00000oIO = field;
/* 353 */                           loill0ooio2.I00000oOI = field.getName();
/* 355 */                           VarHandle.storeStoreFence();
/* 358 */                           if (zI00000oOI2) {
/* 368 */                               for (String str2 : listSingletonList) {
/* 380 */                                   loill0OOio loill0ooio3 = (loill0OOio) linkedHashMap.put(str2, loill0ooio2);
/* 382 */                                   if (loill0ooio3 != null) {
/* 387 */                                       I0000Il00O(cls, str2, loill0ooio3.I00000oIO, field);
/* 390 */                                       throw null;
                                            }
                                        }
                                    }
/* 391 */                           if (zI00000oOI && (loill0ooio = (loill0OOio) linkedHashMap2.put(str, loill0ooio2)) != null) {
/* 404 */                               I0000Il00O(cls, str, loill0ooio.I00000oIO, field);
/* 407 */                               throw null;
                                    }
                                } else if (Modifier.isStatic(field.getModifiers())) {
/* 90 */                            zI00000oOI2 = z4;
/* 91 */                            z2 = true;
/* 93 */                            methodI0000O = null;
/* 150 */                           if (methodI0000O == null) {
                                    }
/* 166 */                           Type typeI000O01llI02 = iO1lo1I1iI.I000O01llI0(type, cls2, field.getGenericType(), new HashMap());
/* 174 */                           lli1loil11l = (lli1lOIl11l) field.getAnnotation(lli1lOIl11l.class);
/* 176 */                           if (lli1loil11l == null) {
                                    }
/* 215 */                           if (listAsList.isEmpty()) {
                                    }
/* 250 */                           String str3 = (String) listSingletonList.get(z3 ? 1 : 0);
/* 254 */                           o0IOi0io1iOo o0ioi0io1ioo32 = new o0IOi0io1iOo(typeI000O01llI02);
/* 257 */                           Class cls32 = o0ioi0io1ioo32.I00000oIO;
/* 270 */                           if (cls32 == null) {
/* 271 */                               modifiers = field.getModifiers();
/* 279 */                               if (Modifier.isStatic(modifiers)) {
/* 287 */                                   z3 = z2;
                                        }
/* 289 */                               i = length;
/* 299 */                               lli010l0ii lli010l0iiVar2 = (lli010l0ii) field.getAnnotation(lli010l0ii.class);
/* 322 */                               if (lli010l0iiVar2 == null) {
                                        }
/* 335 */                               if (llol001oloiI00000oOI != null) {
                                        }
/* 338 */                               loill0OOio loill0ooio22 = new loill0OOio();
/* 341 */                               loill0ooio22.I0000Il00O = llol001oloiI00O0i0ii;
/* 343 */                               loill0ooio22.I0000O = z5;
/* 345 */                               loill0ooio22.I0000oI00 = z3;
/* 347 */                               loill0ooio22.I00000oIO = field;
/* 353 */                               loill0ooio22.I00000oOI = field.getName();
/* 355 */                               VarHandle.storeStoreFence();
/* 358 */                               if (zI00000oOI2) {
                                        }
/* 391 */                               if (zI00000oOI) {
                                            continue;
                                        }
                                    }
                                } else {
/* 95 */                            z2 = true;
/* 99 */                            methodI0000O = o01l0i.I00000oIO.I0000O(cls2, field);
/* 103 */                           o01l0i.I00000oIO(methodI0000O);
/* 110 */                           if (methodI0000O.getAnnotation(lli1lOIl11l.class) != null && field.getAnnotation(lli1lOIl11l.class) == null) {
/* 119 */                               String strI00000oOI = o01l0i.I00000oOI(methodI0000O, z4);
/* 149 */                               throw new llIIooI0iolO(IIlIOloOOO.I0010I0i(new StringBuilder(strI00000oOI.length() + 36), "@SerializedName on ", strI00000oOI, " is not supported"), 25);
                                    }
/* 150 */                           if (methodI0000O == null) {
                                    }
/* 166 */                           Type typeI000O01llI022 = iO1lo1I1iI.I000O01llI0(type, cls2, field.getGenericType(), new HashMap());
/* 174 */                           lli1loil11l = (lli1lOIl11l) field.getAnnotation(lli1lOIl11l.class);
/* 176 */                           if (lli1loil11l == null) {
                                    }
/* 215 */                           if (listAsList.isEmpty()) {
                                    }
/* 250 */                           String str32 = (String) listSingletonList.get(z3 ? 1 : 0);
/* 254 */                           o0IOi0io1iOo o0ioi0io1ioo322 = new o0IOi0io1iOo(typeI000O01llI022);
/* 257 */                           Class cls322 = o0ioi0io1ioo322.I00000oIO;
/* 270 */                           if (cls322 == null) {
                                    }
                                }
                            } else if (zI00000oOI2) {
/* 75 */                        zI00000oOI2 = true;
/* 78 */                        if (!z) {
                                }
                            } else {
/* 69 */                        fieldArr = declaredFields;
/* 71 */                        i = length;
                            }
/* 408 */                   i2++;
/* 410 */                   z4 = false;
/* 411 */                   lolioilii = this;
/* 413 */                   length = i;
/* 415 */                   declaredFields = fieldArr;
                        }
/* 436 */               o0IOi0io1iOo o0ioi0io1ioo4 = new o0IOi0io1iOo(iO1lo1I1iI.I000O01llI0(type, cls2, cls2.getGenericSuperclass(), new HashMap()));
/* 439 */               cls2 = o0ioi0io1ioo4.I00000oIO;
/* 443 */               o0ioi0io1ioo2 = o0ioi0io1ioo4;
/* 444 */               lolioilii = this;
                    }
                }
            }
