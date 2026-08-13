            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.GenericArrayType;
            import java.lang.reflect.Type;
            
            public class I1Io1oi implements OoO00iO0OOl0 {
                @Override
                public final OoO00O1IiOl I00000oIO(OoIlIoo1oiOo ooIlIoo1oiOo, OoOilO ooOilO) {
/* 1 */             Type type = ooOilO.I00000oOI;
/* 3 */             boolean z = type instanceof GenericArrayType;
/* 5 */             if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
/* 20 */                return null;
                    }
/* 33 */            Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
/* 42 */            OoO00O1IiOl ooO00O1IiOlI0000O = ooIlIoo1oiOo.I0000O(new OoOilO(genericComponentType));
/* 48 */            Class clsI0000oI00 = iIllolOO.I0000oI00(genericComponentType);
/* 52 */            I1IoI0o1 i1IoI0o1 = new I1IoI0o1();
/* 60 */            i1IoI0o1.I00000oOI = new O00o1oIoiO(ooIlIoo1oiOo, ooO00O1IiOlI0000O, clsI0000oI00);
/* 62 */            i1IoI0o1.I00000oIO = clsI0000oI00;
/* 64 */            VarHandle.storeStoreFence();
/* 89 */            return i1IoI0o1;
                }
            }
