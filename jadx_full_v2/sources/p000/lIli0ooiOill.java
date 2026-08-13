            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.Type;
            import java.lang.reflect.WildcardType;
            
            public abstract class lIli0ooiOill {
                public static OOoIlii I00000oIO(Type type) {
                    OOoIlii oOoIliiI00000oIO;
/* 1 */             boolean z = type instanceof Class;
/* 3 */             if (z) {
/* 6 */                 Class cls = (Class) type;
/* 12 */                if (cls.isPrimitive()) {
/* 16 */                    OOoIiOOIIiII oOoIiOOIIiII = new OOoIiOOIIiII();
/* 19 */                    oOoIiOOIIiII.I00000oIO = cls;
/* 21 */                    VarHandle.storeStoreFence();
/* 24 */                    return oOoIiOOIIiII;
                        }
                    }
/* 25 */            boolean z2 = type instanceof GenericArrayType;
/* 27 */            if (!z2 && (!z || !((Class) type).isArray())) {
/* 43 */                if (!(type instanceof WildcardType)) {
/* 60 */                    return new OOoI10lllo(type);
                        }
/* 49 */                OOoOI01iOoI oOoOI01iOoI = new OOoOI01iOoI();
/* 52 */                oOoOI01iOoI.I00000oIO = (WildcardType) type;
/* 54 */                VarHandle.storeStoreFence();
/* 57 */                return oOoOI01iOoI;
                    }
/* 66 */            OOo1i1O01oI oOo1i1O01oI = new OOo1i1O01oI();
/* 69 */            oOo1i1O01oI.I00000oIO = type;
/* 71 */            if (!z2) {
/* 84 */                if (z) {
/* 87 */                    Class cls2 = (Class) type;
/* 93 */                    if (cls2.isArray()) {
/* 99 */                        oOoIliiI00000oIO = I00000oIO(cls2.getComponentType());
                            }
                        }
/* 186 */               throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
                    }
/* 79 */            oOoIliiI00000oIO = I00000oIO(((GenericArrayType) type).getGenericComponentType());
/* 103 */           oOo1i1O01oI.I00000oOI = oOoIliiI00000oIO;
/* 105 */           VarHandle.storeStoreFence();
/* 108 */           return oOo1i1O01oI;
                }
            }
