            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Field;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.Type;
            import java.sql.Time;
            import java.sql.Timestamp;
            import java.text.DateFormat;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.Locale;
            
            public final class loIiOOlI0oI1 implements llOo0OilI {
                public final int I00iOIl;

                public loIiOOlI0oI1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) throws SecurityException {
                    Type genericComponentType;
/* 5 */             int i = 1;
/* 6 */             int i2 = 0;
/* 7 */             loIlOiOii loiloioii = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 337 */                   Type type = o0ioi0io1ioo.I00000oOI;
/* 341 */                   if (type instanceof GenericArrayType) {
/* 362 */                       genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                            } else {
/* 345 */                       if (!(type instanceof Class)) {
/* 7 */                             return null;
                                }
/* 347 */                       Class cls = (Class) type;
/* 353 */                       if (!cls.isArray()) {
/* 7 */                             return null;
                                }
/* 355 */                       genericComponentType = cls.getComponentType();
                            }
/* 371 */                   llOl001olOi llol001oloiI00O0i0ii = i1ii1o0.I00O0i0ii(new o0IOi0io1iOo(genericComponentType));
/* 377 */                   Class clsI00000oOI = iO1lo1I1iI.I00000oOI(genericComponentType);
/* 381 */                   loIlOiOii loiloioii2 = new loIlOiOii(i2);
/* 389 */                   loiloioii2.I0000Il00O = new o0I100l0o0O(llol001oloiI00O0i0ii);
/* 391 */                   loiloioii2.I00000oOI = clsI00000oOI;
/* 393 */                   VarHandle.storeStoreFence();
/* 396 */                   return loiloioii2;
                        case 1:
/* 272 */                   if (o0ioi0io1ioo.I00000oIO == Date.class) {
/* 276 */                       i1O01Ill i1o01ill = i1O01Ill.I00l0OO0IO;
/* 278 */                       loiloioii = new loIlOiOii(i);
/* 283 */                       ArrayList arrayList = new ArrayList();
/* 286 */                       loiloioii.I0000Il00O = arrayList;
/* 288 */                       loiloioii.I00000oOI = i1o01ill;
/* 290 */                       Locale locale = Locale.US;
/* 297 */                       arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
/* 308 */                       if (!Locale.getDefault().equals(locale)) {
/* 314 */                           arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                                }
/* 321 */                       if (llolill.I00000oIO >= 9) {
/* 330 */                           arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
                                }
/* 333 */                       VarHandle.storeStoreFence();
                            }
/* 336 */                   return loiloioii;
                        case 2:
/* 93 */                    Class superclass = o0ioi0io1ioo.I00000oIO;
/* 101 */                   if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
/* 7 */                         return null;
                            }
/* 111 */                   if (!superclass.isEnum()) {
/* 113 */                       superclass = superclass.getSuperclass();
                            }
/* 119 */                   loOloI01ioO looloi01ioo = new loOloI01ioO(i2);
                            try {
/* 122 */                       Field[] declaredFields = superclass.getDeclaredFields();
/* 128 */                       int i3 = 0;
/* 129 */                       for (Field field : declaredFields) {
/* 137 */                           if (field.isEnumConstant()) {
/* 141 */                               declaredFields[i3] = field;
/* 139 */                               i3++;
                                    }
                                }
/* 155 */                       Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i3);
/* 166 */                       int iCeil = (int) Math.ceil(i3 / 0.75f);
/* 169 */                       HashMap map = new HashMap(iCeil);
/* 172 */                       looloi01ioo.I00000oOI = map;
/* 179 */                       looloi01ioo.I0000Il00O = new HashMap(iCeil);
/* 186 */                       looloi01ioo.I0000O = new HashMap(iCeil);
/* 188 */                       AccessibleObject.setAccessible(fieldArr, true);
/* 193 */                       for (Field field2 : fieldArr) {
/* 201 */                           Enum r5 = (Enum) field2.get(null);
/* 203 */                           String strName = r5.name();
/* 207 */                           String string = r5.toString();
/* 217 */                           lli1lOIl11l lli1loil11l = (lli1lOIl11l) field2.getAnnotation(lli1lOIl11l.class);
/* 219 */                           if (lli1loil11l != null) {
/* 221 */                               strName = lli1loil11l.zza();
/* 231 */                               for (String str : lli1loil11l.zzb()) {
/* 235 */                                   map.put(str, r5);
                                        }
                                    }
/* 241 */                           map.put(strName, r5);
/* 248 */                           ((HashMap) looloi01ioo.I0000Il00O).put(string, r5);
/* 255 */                           ((HashMap) looloi01ioo.I0000O).put(r5, strName);
                                }
/* 261 */                       VarHandle.storeStoreFence();
/* 264 */                       return looloi01ioo;
                            } catch (IllegalAccessException e) {
/* 266 */                       I000II.I000O01llI0(e);
/* 7 */                         return null;
                            }
                        case 3:
/* 92 */                    throw new AssertionError("Factory should not be used");
                        case 4:
/* 65 */                    if (o0ioi0io1ioo.I00000oIO != java.sql.Date.class) {
/* 7 */                         return null;
                            }
/* 69 */                    o01o01o00I o01o01o00i = new o01o01o00I(i2);
/* 79 */                    o01o01o00i.I00000oOI = new SimpleDateFormat("MMM d, yyyy");
/* 81 */                    VarHandle.storeStoreFence();
/* 84 */                    return o01o01o00i;
                        case 5:
/* 41 */                    if (o0ioi0io1ioo.I00000oIO != Time.class) {
/* 7 */                         return null;
                            }
/* 45 */                    o01o01o00I o01o01o00i2 = new o01o01o00I(i);
/* 55 */                    o01o01o00i2.I00000oOI = new SimpleDateFormat("hh:mm:ss a");
/* 57 */                    VarHandle.storeStoreFence();
/* 60 */                    return o01o01o00i2;
                        default:
/* 15 */                    if (o0ioi0io1ioo.I00000oIO != Timestamp.class) {
/* 7 */                         return null;
                            }
/* 22 */                    llOl001olOi llol001oloiI00O0i0ii2 = i1ii1o0.I00O0i0ii(new o0IOi0io1iOo(Date.class));
/* 28 */                    o0I100l0o0O o0i100l0o0o = new o0I100l0o0O(i2);
/* 31 */                    o0i100l0o0o.I00000oOI = llol001oloiI00O0i0ii2;
/* 33 */                    VarHandle.storeStoreFence();
/* 36 */                    return o0i100l0o0o;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 1:
/* 11 */                    return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
