            package p000;

            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            
            public final class OOoIlIOlOI extends OOoIOIi {
                public Object I00000oIO;

                @Override
                public final Member I00000oOI() {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             IoloOio0I ioloOio0I = l0101li.I00000oIO;
/* 6 */             if (ioloOio0I == null) {
/* 8 */                 Class<?> cls = obj.getClass();
/* 12 */                int i = 16;
                        try {
/* 28 */                    ioloOio0I = new IoloOio0I(i, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
                        } catch (NoSuchMethodException unused) {
/* 35 */                    ioloOio0I = new IoloOio0I(i, method, method);
                        }
/* 38 */                l0101li.I00000oIO = ioloOio0I;
                    }
/* 42 */            Method method = (Method) ioloOio0I.I00iiO;
/* 52 */            method = method != null ? (Method) method.invoke(obj, null) : null;
/* 54 */            if (method != null) {
/* 56 */                return method;
                    }
/* 113 */           throw new NoSuchMethodError("Can't find `getAccessor` method");
                }

                public final OOoIlii I0001Ioi1lo() {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             IoloOio0I ioloOio0I = l0101li.I00000oIO;
/* 6 */             if (ioloOio0I == null) {
/* 8 */                 Class<?> cls = obj.getClass();
/* 12 */                int i = 16;
                        try {
/* 28 */                    ioloOio0I = new IoloOio0I(i, cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
                        } catch (NoSuchMethodException unused) {
/* 35 */                    ioloOio0I = new IoloOio0I(i, cls, cls);
                        }
/* 38 */                l0101li.I00000oIO = ioloOio0I;
                    }
/* 42 */            Method method = (Method) ioloOio0I.I00iiI;
/* 52 */            cls = method != null ? (Class) method.invoke(obj, null) : null;
/* 54 */            if (cls != null) {
/* 58 */                return new OOoI10lllo(cls);
                    }
/* 113 */           throw new NoSuchMethodError("Can't find `getType` method");
                }
            }
