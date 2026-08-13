            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.Collection;
            import java.util.Map;
            import java.util.Properties;
            
            public final class IOOi0I0 implements OoO00iO0OOl0 {
                public final int I00iOIl;
                public IIlio101Io I00iiI;

                public IOOi0I0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) throws NoSuchMethodException, SecurityException {
                    Class cls;
                    Type[] actualTypeArguments;
/* 3 */             cls = Object.class;
                    switch (this.I00iOIl) {
                        case 0:
/* 129 */                   Type type = ooOilO.I00000oOI;
/* 131 */                   Class cls2 = ooOilO.I00000oIO;
/* 139 */                   if (!Collection.class.isAssignableFrom(cls2)) {
/* 5 */                         return null;
                            }
/* 142 */                   Type typeI0001Ioi1lo = iIllolOO.I0001Ioi1lo(type, cls2, Collection.class);
/* 156 */                   cls = typeI0001Ioi1lo instanceof ParameterizedType ? ((ParameterizedType) typeI0001Ioi1lo).getActualTypeArguments()[0] : Object.class;
/* 169 */                   O00o1oIoiO o00o1oIoiO = new O00o1oIoiO(ooIlIoo1oiOo, ooIlIoo1oiOo.I0000O(new OoOilO(cls)), cls);
/* 174 */                   OIOi0l1il oIOi0l1ilI00o0l1o1o0 = this.I00iiI.I00o0l1o1o0(ooOilO, false);
/* 180 */                   O00oI0iiI1 o00oI0iiI1 = new O00oI0iiI1(1);
/* 183 */                   o00oI0iiI1.I00000oOI = o00o1oIoiO;
/* 185 */                   o00oI0iiI1.I0000Il00O = oIOi0l1ilI00o0l1o1o0;
/* 187 */                   VarHandle.storeStoreFence();
/* 190 */                   return o00oI0iiI1;
                        default:
/* 11 */                    Type type2 = ooOilO.I00000oOI;
/* 13 */                    Class cls3 = ooOilO.I00000oIO;
/* 21 */                    if (!Map.class.isAssignableFrom(cls3)) {
/* 5 */                         return null;
                            }
/* 31 */                    if (Properties.class.isAssignableFrom(cls3)) {
/* 33 */                        actualTypeArguments = new Type[]{String.class, String.class};
                            } else {
/* 42 */                        Type typeI0001Ioi1lo2 = iIllolOO.I0001Ioi1lo(type2, cls3, Map.class);
/* 57 */                        actualTypeArguments = typeI0001Ioi1lo2 instanceof ParameterizedType ? ((ParameterizedType) typeI0001Ioi1lo2).getActualTypeArguments() : new Type[]{cls, cls};
                            }
/* 63 */                    Type type3 = actualTypeArguments[0];
/* 65 */                    Type type4 = actualTypeArguments[1];
/* 90 */                    O00o1oIoiO o00o1oIoiO2 = new O00o1oIoiO(ooIlIoo1oiOo, (type3 == Boolean.TYPE || type3 == Boolean.class) ? OoOI01I0lI0.I0000Il00O : ooIlIoo1oiOo.I0000O(new OoOilO(type3)), type3);
/* 104 */                   O00o1oIoiO o00o1oIoiO3 = new O00o1oIoiO(ooIlIoo1oiOo, ooIlIoo1oiOo.I0000O(new OoOilO(type4)), type4);
/* 109 */                   OIOi0l1il oIOi0l1ilI00o0l1o1o02 = this.I00iiI.I00o0l1o1o0(ooOilO, false);
/* 115 */                   O00o1oIoiO o00o1oIoiO4 = new O00o1oIoiO(1);
/* 118 */                   o00o1oIoiO4.I00000oOI = o00o1oIoiO2;
/* 120 */                   o00o1oIoiO4.I0000Il00O = o00o1oIoiO3;
/* 122 */                   o00o1oIoiO4.I0000O = oIOi0l1ilI00o0l1o1o02;
/* 124 */                   VarHandle.storeStoreFence();
/* 127 */                   return o00o1oIoiO4;
                    }
                }
            }
