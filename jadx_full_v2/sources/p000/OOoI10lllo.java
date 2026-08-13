            package p000;

            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OOoI10lllo extends OOoIlii {
                public final Type I00000oIO;
                public final O00lI00ll I00000oOI;

                public OOoI10lllo(Type type) {
                    O00lI00ll oOo1oliI;
/* 4 */             this.I00000oIO = type;
/* 8 */             if (type instanceof Class) {
/* 14 */                oOo1oliI = new OOo1oliI((Class) type);
                    } else if (type instanceof TypeVariable) {
/* 26 */                oOo1oliI = new OOoO0OoIIO((TypeVariable) type);
                    } else {
/* 32 */                if (!(type instanceof ParameterizedType)) {
/* 58 */                    OoOil11Ol1o.I000l1("Not a classifier type (", type.getClass(), "): ", type);
/* 186 */                   throw null;
                        }
/* 44 */                oOo1oliI = new OOo1oliI((Class) ((ParameterizedType) type).getRawType());
                    }
/* 47 */            this.I00000oOI = oOo1oliI;
                }

                @Override
                public final OOo1O1i I00000oIO(Ill0IO ill0IO) {
/* 1 */             return null;
                }

                @Override
                public final Type I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                public final ArrayList I0000Il00O() {
/* 3 */             List listI0000Il00O = OOo1Io0I0.I0000Il00O(this.I00000oIO);
/* 17 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI0000Il00O, 10));
/* 20 */            Iterator it = listI0000Il00O.iterator();
/* 28 */            while (it.hasNext()) {
/* 40 */                arrayList.add(lIli0ooiOill.I00000oIO((Type) it.next()));
                    }
/* 113 */           return arrayList;
                }

                public final boolean I0000O() {
/* 1 */             Type type = this.I00000oIO;
/* 6 */             if (type instanceof Class) {
/* 21 */                if (!(((Class) type).getTypeParameters().length == 0)) {
/* 15 */                    return true;
                        }
                    }
/* 5 */             return false;
                }

                @Override
                public final Collection getAnnotations() {
/* 1 */             return Il01100l.I00iOIl;
                }
            }
