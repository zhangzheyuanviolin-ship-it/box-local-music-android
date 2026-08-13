            package p000;

            import java.lang.reflect.Member;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.List;
            
            public abstract class IIil1l implements IIiOlII {
                public final Member I00000oIO;
                public final Type I00000oOI;
                public final Class I0000Il00O;
                public final List I0000O;

                public IIil1l(Member member, Type type, Class cls, Type[] typeArr) {
                    List listI00IioO0OiOi;
/* 4 */             this.I00000oIO = member;
/* 6 */             this.I00000oOI = type;
/* 8 */             this.I0000Il00O = cls;
/* 10 */            if (cls != null) {
/* 15 */                OlIOOOoi0IlI olIOOOoi0IlI = new OlIOOOoi0IlI(2);
/* 18 */                olIOOOoi0IlI.I00000oIO(cls);
/* 21 */                olIOOOoi0IlI.I00000oOI(typeArr);
/* 24 */                ArrayList arrayList = olIOOOoi0IlI.I00000oIO;
/* 36 */                listI00IioO0OiOi = IOOi1I.I000O01llI0(arrayList.toArray(new Type[arrayList.size()]));
                    } else {
/* 41 */                listI00IioO0OiOi = I1IoiO1l.I00IioO0OiOi(typeArr);
                    }
/* 45 */            this.I0000O = listI00IioO0OiOi;
                }

                @Override
                public final List I00000oIO() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final Member I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return false;
                }

                public void I0000oI00(Object[] objArr) {
/* 6 */             if (iOil0li.I00000oIO(this) == objArr.length) {
/* 8 */                 return;
                    }
/* 13 */            StringBuilder sb = new StringBuilder("Callable expects ");
/* 20 */            sb.append(iOil0li.I00000oIO(this));
/* 25 */            sb.append(" arguments, but ");
/* 35 */            I000II.I000iOII(IIl001iO0Io.I000lI(objArr.length, " were provided.", sb));
                }

                @Override
                public final Type I0001Ioi1lo() {
/* 1 */             return this.I00000oOI;
                }

                public final void I000II(Object obj) {
/* 1 */             if (obj == null || !this.I00000oIO.getDeclaringClass().isInstance(obj)) {
/* 18 */                I000II.I000iOII("An object member requires the object instance passed as the first argument.");
                    }
                }
            }
