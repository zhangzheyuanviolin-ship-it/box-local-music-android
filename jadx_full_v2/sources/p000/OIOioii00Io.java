            package p000;

            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.Type;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OIOioii00Io implements TypeVariable, Type {
                public O0O0OIOO I00iOIl;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof TypeVariable) || !O0000Ioio00.I0000O(this.I00iOIl.getName(), ((TypeVariable) obj).getName())) {
/* 29 */                return false;
                    }
/* 24 */            getGenericDeclaration();
/* 28 */            throw null;
                }

                @Override
                public final Type[] getBounds() {
/* 3 */             List upperBounds = this.I00iOIl.getUpperBounds();
/* 17 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(upperBounds, 10));
/* 20 */            Iterator it = upperBounds.iterator();
/* 28 */            while (it.hasNext()) {
/* 41 */                arrayList.add(OoOo1IIiiO.I00000oOI((O0O01O0o) it.next(), true));
                    }
/* 52 */            return (Type[]) arrayList.toArray(new Type[0]);
                }

                @Override
                public final GenericDeclaration getGenericDeclaration() {
/* 29 */            throw new UnsupportedOperationException("getGenericDeclaration() is not supported for type variables created from KType: " + this.I00iOIl + ".\nUpdate kotlin-reflect dependency to 2.3.20+.");
                }

                @Override
                public final String getName() {
/* 3 */             return this.I00iOIl.getName();
                }

                @Override
                public final String getTypeName() {
/* 3 */             return this.I00iOIl.getName();
                }

                public final int hashCode() {
/* 7 */             this.I00iOIl.getName().getClass();
/* 10 */            getGenericDeclaration();
/* 29 */            throw null;
                }

                public final String toString() {
/* 3 */             return this.I00iOIl.getName();
                }
            }
