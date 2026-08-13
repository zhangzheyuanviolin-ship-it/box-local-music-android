            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Properties;
            
            public final class loO01lio0 implements llOo0OilI {
                public final int I00iOIl;
                public i0O1lIi1O0IO I00iiI;

                @Override
                public final llOl001olOi I00000oIO(I1ii1o0 i1ii1o0, o0IOi0io1iOo o0ioi0io1ioo) throws NoSuchMethodException, SecurityException {
                    Class cls;
                    Type[] actualTypeArguments;
/* 3 */             cls = Object.class;
                    switch (this.I00iOIl) {
                        case 0:
/* 129 */                   Type type = o0ioi0io1ioo.I00000oOI;
/* 131 */                   Class cls2 = o0ioi0io1ioo.I00000oIO;
/* 139 */                   if (!Collection.class.isAssignableFrom(cls2)) {
/* 5 */                         return null;
                            }
/* 142 */                   Type typeI000II = iO1lo1I1iI.I000II(type, cls2, Collection.class);
/* 169 */                   o0I100l0o0O o0i100l0o0o = new o0I100l0o0O(i1ii1o0.I00O0i0ii(new o0IOi0io1iOo(typeI000II instanceof ParameterizedType ? ((ParameterizedType) typeI000II).getActualTypeArguments()[0] : Object.class)));
/* 174 */                   lo11I0lO lo11i0loI0000O = this.I00iiI.I0000O(o0ioi0io1ioo, false);
/* 180 */                   loIlOiOii loiloioii = new loIlOiOii(2);
/* 183 */                   loiloioii.I0000Il00O = o0i100l0o0o;
/* 185 */                   loiloioii.I00000oOI = lo11i0loI0000O;
/* 187 */                   VarHandle.storeStoreFence();
/* 190 */                   return loiloioii;
                        default:
/* 11 */                    Type type2 = o0ioi0io1ioo.I00000oOI;
/* 13 */                    Class cls3 = o0ioi0io1ioo.I00000oIO;
/* 21 */                    if (!Map.class.isAssignableFrom(cls3)) {
/* 5 */                         return null;
                            }
/* 31 */                    if (Properties.class.isAssignableFrom(cls3)) {
/* 33 */                        actualTypeArguments = new Type[]{String.class, String.class};
                            } else {
/* 42 */                        Type typeI000II2 = iO1lo1I1iI.I000II(type2, cls3, Map.class);
/* 57 */                        actualTypeArguments = typeI000II2 instanceof ParameterizedType ? ((ParameterizedType) typeI000II2).getActualTypeArguments() : new Type[]{cls, cls};
                            }
/* 63 */                    Type type3 = actualTypeArguments[0];
/* 65 */                    Type type4 = actualTypeArguments[1];
/* 90 */                    o0I100l0o0O o0i100l0o0o2 = new o0I100l0o0O((type3 == Boolean.TYPE || type3 == Boolean.class) ? o01IIliilo.I0000Il00O : i1ii1o0.I00O0i0ii(new o0IOi0io1iOo(type3)));
/* 104 */                   o0I100l0o0O o0i100l0o0o3 = new o0I100l0o0O(i1ii1o0.I00O0i0ii(new o0IOi0io1iOo(type4)));
/* 109 */                   lo11I0lO lo11i0loI0000O2 = this.I00iiI.I0000O(o0ioi0io1ioo, false);
/* 115 */                   loOloI01ioO looloi01ioo = new loOloI01ioO(1);
/* 118 */                   looloi01ioo.I00000oOI = o0i100l0o0o2;
/* 120 */                   looloi01ioo.I0000Il00O = o0i100l0o0o3;
/* 122 */                   looloi01ioo.I0000O = lo11i0loI0000O2;
/* 124 */                   VarHandle.storeStoreFence();
/* 127 */                   return looloi01ioo;
                    }
                }
            }
