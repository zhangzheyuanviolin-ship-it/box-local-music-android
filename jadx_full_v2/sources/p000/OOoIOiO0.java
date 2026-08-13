            package p000;

            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class OOoIOiO0 extends OOoIOIi implements O00oiIoi {
                public Method I00000oIO;

                @Override
                public final Member I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                public final List I0001Ioi1lo() {
/* 1 */             Method method = this.I00000oIO;
/* 17 */            return I0000O(method.getGenericParameterTypes(), method.getParameterAnnotations(), method.isVarArgs());
                }

                @Override
                public final ArrayList getTypeParameters() {
/* 3 */             TypeVariable<Method>[] typeParameters = this.I00000oIO.getTypeParameters();
/* 10 */            ArrayList arrayList = new ArrayList(typeParameters.length);
/* 15 */            for (TypeVariable<Method> typeVariable : typeParameters) {
/* 24 */                arrayList.add(new OOoO0OoIIO(typeVariable));
                    }
/* 113 */           return arrayList;
                }
            }
