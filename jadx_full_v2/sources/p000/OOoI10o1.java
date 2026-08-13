            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.Member;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            
            public final class OOoI10o1 extends OOoIOIi implements O00oiIoi {
                public Constructor I00000oIO;

                @Override
                public final Member I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final ArrayList getTypeParameters() {
/* 3 */             TypeVariable[] typeParameters = this.I00000oIO.getTypeParameters();
/* 10 */            ArrayList arrayList = new ArrayList(typeParameters.length);
/* 15 */            for (TypeVariable typeVariable : typeParameters) {
/* 24 */                arrayList.add(new OOoO0OoIIO(typeVariable));
                    }
/* 113 */           return arrayList;
                }
            }
