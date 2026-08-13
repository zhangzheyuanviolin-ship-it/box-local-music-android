            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.WildcardType;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class IOoliil1Il implements IllOOo00lI {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public IOoliil1Il(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    Class componentType;
                    switch (this.I00iOIl) {
                        case 0:
/* 54 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 56 */                    int i = this.I00iiI;
/* 62 */                    I011olOoO i011olOoO = (I011olOoO) illOOo00lI.invoke();
/* 64 */                    O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 70 */                    I01iiIii10O i01iiIii10O = new I01iiIii10O(9);
/* 73 */                    i01iiIii10O.I00iiI = i011olOoO;
/* 75 */                    VarHandle.storeStoreFence();
/* 78 */                    O0ioIllo0i1 o0ioIllo0i1I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01iiIii10O);
/* 82 */                    OOoOiOo01lo oOoOiOo01lo = i011olOoO.I00iOIl;
/* 94 */                    Type type = oOoOiOo01lo != null ? (Type) oOoOiOo01lo.invoke() : null;
/* 97 */                    if (type instanceof Class) {
/* 99 */                        Class cls = (Class) type;
/* 113 */                       componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                            } else {
/* 118 */                       if (type instanceof GenericArrayType) {
/* 120 */                           if (i == 0) {
/* 124 */                               return ((GenericArrayType) type).getGenericComponentType();
                                    }
/* 131 */                           IoOOl0iOl1io.I001IIilI0O("Array type has been queried for a non-0th argument: ", i011olOoO);
/* 84 */                            return null;
                                }
/* 137 */                       if (!(type instanceof ParameterizedType)) {
/* 184 */                           IoOOl0iOl1io.I001IIilI0O("Non-generic type has been queried for arguments: ", i011olOoO);
/* 84 */                            return null;
                                }
/* 150 */                       Type type2 = (Type) ((List) o0ioIllo0i1I00000oIO.getValue()).get(i);
/* 154 */                       if (!(type2 instanceof WildcardType)) {
/* 187 */                           return type2;
                                }
/* 157 */                       WildcardType wildcardType = (WildcardType) type2;
/* 167 */                       componentType = (Type) I1IoiO1l.I001i1O0Ol(wildcardType.getLowerBounds());
/* 169 */                       if (componentType == null) {
/* 179 */                           componentType = (Type) I1IoiO1l.I001IO000(wildcardType.getUpperBounds());
                                }
                            }
/* 111 */                   return componentType;
                        case 1:
/* 49 */                    return (OIoioOli1I) ((IIiO00o1o) this.I00iiO).I00Iooi00oi().get(this.I00iiI);
                        case 2:
/* 32 */                    return (OIoioOli1I) ((List) this.I00iiO).get(this.I00iiI);
                        default:
/* 16 */                    ((Function1) this.I00iiO).invoke(Integer.valueOf(this.I00iiI));
/* 19 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
