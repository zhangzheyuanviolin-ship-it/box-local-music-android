            package p000;

            import java.lang.reflect.Method;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            
            public final class IIiio1 extends IIiiOiO1 implements II1Oloo00lil {
                public final boolean I000II;
                public final Object I000O01llI0;

                /* JADX WARN: Illegal instructions before constructor call */
                public IIiio1(Method method, boolean z, Object obj) {
/* 1 */             Type[] genericParameterTypes = method.getGenericParameterTypes();
/* 20 */            super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : I1IoiO1l.I00100o1O0lo(genericParameterTypes, 1, genericParameterTypes.length)));
/* 23 */            this.I000II = z;
/* 25 */            this.I000O01llI0 = obj;
                }

                @Override
                public final Object I0000O(Object[] objArr) {
/* 1 */             I0000oI00(objArr);
/* 7 */             OlIOOOoi0IlI olIOOOoi0IlI = new OlIOOOoi0IlI(2);
/* 12 */            olIOOOoi0IlI.I00000oIO(this.I000O01llI0);
/* 15 */            olIOOOoi0IlI.I00000oOI(objArr);
/* 18 */            ArrayList arrayList = olIOOOoi0IlI.I00000oIO;
/* 31 */            return I000O01llI0(arrayList.toArray(new Object[arrayList.size()]), null);
                }
            }
