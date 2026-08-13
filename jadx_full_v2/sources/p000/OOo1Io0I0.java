            package p000;

            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public abstract class OOo1Io0I0 {
                public static final List I00000oIO;
                public static final Map I00000oOI;
                public static final Map I0000Il00O;
                public static final Map I0000O;

                static {
/* 1 */             OOoOl1001II oOoOl1001II = OOoOl0i.I00000oIO;
/* 55 */            int i = 0;
/* 79 */            List listI000O01llI0 = IOOi1I.I000O01llI0(oOoOl1001II.I00000oOI(Boolean.TYPE), oOoOl1001II.I00000oOI(Byte.TYPE), oOoOl1001II.I00000oOI(Character.TYPE), oOoOl1001II.I00000oOI(Double.TYPE), oOoOl1001II.I00000oOI(Float.TYPE), oOoOl1001II.I00000oOI(Integer.TYPE), oOoOl1001II.I00000oOI(Long.TYPE), oOoOl1001II.I00000oOI(Short.TYPE));
/* 83 */            I00000oIO = listI000O01llI0;
/* 85 */            List<O0IOli0o0> list = listI000O01llI0;
/* 95 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 106 */           for (O0IOli0o0 o0IOli0o0 : list) {
/* 127 */               arrayList.add(new OIoi0IIoi(l0O00Ol.I00000oOI(o0IOli0o0), l0O00Ol.I0000Il00O(o0IOli0o0)));
                    }
/* 135 */           I00000oOI = O1Oii0O0loo.I000OiO(arrayList);
/* 137 */           List<O0IOli0o0> list2 = I00000oIO;
/* 147 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 158 */           for (O0IOli0o0 o0IOli0o02 : list2) {
/* 179 */               arrayList2.add(new OIoi0IIoi(l0O00Ol.I0000Il00O(o0IOli0o02), l0O00Ol.I00000oOI(o0IOli0o02)));
                    }
/* 187 */           I0000Il00O = O1Oii0O0loo.I000OiO(arrayList2);
/* 239 */           List listI000O01llI02 = IOOi1I.I000O01llI0(IllOOo00lI.class, Function1.class, IlliIl1l11O.class, Function3.class, IlliOIilI.class, IlliOIo0o10.class, IlliOll.class, Illiioi1.class, Illil0Iio.class, Illil0o1o.class, IllOiOo.class, IllOii1Oi0O0.class, IllOlI00O.class, IllOlIollo.class, IllOlO0oo.class, IllOli.class, IllOll1.class, IllOlo.class, IllOlo0i10.class, IllOo0.class, Illi01O0.class, Illi11O0I.class, Illi1lO0.class);
/* 251 */           ArrayList arrayList3 = new ArrayList(IOOi1I.I0000O(listI000O01llI02, 10));
/* 262 */           for (Object obj : listI000O01llI02) {
/* 268 */               int i2 = i + 1;
/* 270 */               if (i < 0) {
/* 288 */                   IOOi1I.I000lI();
/* 292 */                   throw null;
                        }
/* 283 */               arrayList3.add(new OIoi0IIoi((Class) obj, Integer.valueOf(i)));
/* 286 */               i = i2;
                    }
/* 297 */           I0000O = O1Oii0O0loo.I000OiO(arrayList3);
                }

                public static final IOIOill I00000oIO(Class cls) {
/* 6 */             if (cls.isPrimitive()) {
/* 123 */               IioIoO10iOiI.I000OiO("Can't compute ClassId for primitive type: ", cls);
/* 5 */                 return null;
                    }
/* 12 */            if (cls.isArray()) {
/* 117 */               IioIoO10iOiI.I000OiO("Can't compute ClassId for array type: ", cls);
/* 5 */                 return null;
                    }
/* 18 */            if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
/* 91 */                Ill0IO ill0IO = new Ill0IO(cls.getName());
/* 111 */               return new IOIOill(ill0IO.I00000oOI(), ililiol1o0i.I00000oIO(ill0IO.I00000oIO.I000II()), true);
                    }
/* 37 */            Class<?> declaringClass = cls.getDeclaringClass();
/* 41 */            if (declaringClass != null) {
/* 55 */                return I00000oIO(declaringClass).I0000O(OI1Iio0ii1.I0000oI00(cls.getSimpleName()));
                    }
/* 66 */            Ill0IO ill0IO2 = new Ill0IO(cls.getName());
/* 81 */            return new IOIOill(ill0IO2.I00000oOI(), ill0IO2.I00000oIO.I000II());
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                public static final String I00000oOI(Class cls) {
/* 5 */             if (!cls.isPrimitive()) {
/* 133 */               if (cls.isArray()) {
/* 139 */                   return cls.getName().replace('.', '/');
                        }
/* 167 */               return OlIo0Ooi1loI.I001IIilI0O + cls.getName().replace('.', '/') + ';';
                    }
/* 7 */             String name = cls.getName();
                    switch (name.hashCode()) {
                        case -1325958191:
/* 113 */                   if (name.equals("double")) {
/* 115 */                       return OIlOl1.I00iiO;
                            }
                            break;
                        case 104431:
/* 102 */                   if (name.equals("int")) {
/* 104 */                       return "I";
                            }
                            break;
                        case 3039496:
/* 91 */                    if (name.equals("byte")) {
/* 93 */                        return "B";
                            }
                            break;
                        case 3052374:
/* 80 */                    if (name.equals("char")) {
/* 82 */                        return "C";
                            }
                            break;
                        case 3327612:
/* 69 */                    if (name.equals("long")) {
/* 71 */                        return "J";
                            }
                            break;
                        case 3625364:
/* 58 */                    if (name.equals("void")) {
/* 60 */                        return "V";
                            }
                            break;
                        case 64711720:
/* 47 */                    if (name.equals("boolean")) {
/* 49 */                        return "Z";
                            }
                            break;
                        case 97526364:
/* 36 */                    if (name.equals("float")) {
/* 38 */                        return "F";
                            }
                            break;
                        case 109413500:
/* 25 */                    if (name.equals("short")) {
/* 27 */                        return OIlOl1.I00iiI;
                            }
                            break;
                    }
/* 120 */           IioIoO10iOiI.I000OiO("Unsupported primitive type: ", cls);
/* 123 */           return null;
                }

                public static final List I0000Il00O(Type type) {
/* 3 */             if (!(type instanceof ParameterizedType)) {
/* 5 */                 return Il01100l.I00iOIl;
                    }
/* 9 */             ParameterizedType parameterizedType = (ParameterizedType) type;
                    return parameterizedType.getOwnerType() == null ? I1IoiO1l.I00IioO0OiOi(parameterizedType.getActualTypeArguments()) : OilO1oiooiII.I000lI(new IlOIIioI1(OilO1oiooiII.I000OiO(type, IiOi0I1.I00oooO), IiOi0I1.I0100i, OilOOl1Oo00.I00ioIO));
                }

                public static final ClassLoader I0000O(Class cls) {
/* 1 */             ClassLoader classLoader = cls.getClassLoader();
                    return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
                }
            }
