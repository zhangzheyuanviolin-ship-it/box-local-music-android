            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.lang.reflect.TypeVariable;
            import java.util.ArrayList;
            import java.util.Collection;
            
            public final class OOo1oliI extends OOoI1O implements O00l0Oi0o, O00lI00ll, O00oiIoi {
                public final Class I00000oIO;

                public OOo1oliI(Class cls) {
/* 4 */             this.I00000oIO = cls;
                }

                @Override
                public final OOo1O1i I00000oIO(Ill0IO ill0IO) {
/* 3 */             Annotation[] declaredAnnotations = this.I00000oIO.getDeclaredAnnotations();
/* 7 */             if (declaredAnnotations != null) {
/* 9 */                 return lIlIi0Ii1.I00000oIO(declaredAnnotations, ill0IO);
                    }
/* 14 */            return null;
                }

                public final Collection I00000oOI() {
/* 26 */            return OilO1oiooiII.I000lI(new OoI10o0iO11O(new IlIo0o(I1IoiO1l.I0000Il00O(this.I00000oIO.getDeclaredFields()), false, OOo1l1o.I00ioIO), OOo1lo.I00ioIO));
                }

                public final Ill0IO I0000Il00O() {
/* 7 */             return OOo1Io0I0.I00000oIO(this.I00000oIO).I00000oIO();
                }

                public final Collection I0000O() {
/* 7 */             OilO0iOl oilO0iOlI0000Il00O = I1IoiO1l.I0000Il00O(this.I00000oIO.getDeclaredMethods());
/* 15 */            I00iiI i00iiI = new I00iiI(28);
/* 18 */            i00iiI.I00iiI = this;
/* 20 */            VarHandle.storeStoreFence();
/* 34 */            return OilO1oiooiII.I000lI(new OoI10o0iO11O(OilO1oiooiII.I0001Ioi1lo(oilO0iOlI0000Il00O, i00iiI), OOo1oOOlO.I00ioIO));
                }

                public final OI1Iio0ii1 I0000oI00() {
/* 1 */             Class cls = this.I00000oIO;
                    return cls.isAnonymousClass() ? OI1Iio0ii1.I0000oI00(OlOoOIi0o.I00O0o1oo(cls.getName())) : OI1Iio0ii1.I0000oI00(cls.getSimpleName());
                }

                public final ArrayList I0001Ioi1lo() {
/* 1 */             OillOo0 oillOo0 = l010lllOii.I00000oIO;
/* 4 */             if (oillOo0 == null) {
                        try {
/* 36 */                    oillOo0 = new OillOo0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 8);
                        } catch (NoSuchMethodException unused) {
/* 48 */                    oillOo0 = new OillOo0(objArr, objArr, objArr, objArr, 8);
                        }
/* 52 */                l010lllOii.I00000oIO = oillOo0;
                    }
/* 56 */            Method method = (Method) oillOo0.I00ilI0I1;
/* 68 */            objArr = method != null ? (Object[]) method.invoke(this.I00000oIO, null) : null;
/* 71 */            if (objArr == null) {
/* 73 */                objArr = new Object[0];
                    }
/* 78 */            ArrayList arrayList = new ArrayList(objArr.length);
/* 82 */            for (Object obj : objArr) {
/* 88 */                OOoIlIOlOI oOoIlIOlOI = new OOoIlIOlOI();
/* 91 */                oOoIlIOlOI.I00000oIO = obj;
/* 93 */                VarHandle.storeStoreFence();
/* 96 */                arrayList.add(oOoIlIOlOI);
                    }
/* 113 */           return arrayList;
                }

                public final boolean I000II() {
/* 1 */             OillOo0 oillOo0 = l010lllOii.I00000oIO;
/* 4 */             if (oillOo0 == null) {
                        try {
/* 36 */                    oillOo0 = new OillOo0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 8);
                        } catch (NoSuchMethodException unused) {
/* 48 */                    oillOo0 = new OillOo0(bool, bool, bool, bool, 8);
                        }
/* 52 */                l010lllOii.I00000oIO = oillOo0;
                    }
/* 56 */            Method method = (Method) oillOo0.I00iio;
/* 68 */            bool = method != null ? (Boolean) method.invoke(this.I00000oIO, null) : null;
/* 70 */            if (bool != null) {
/* 72 */                return bool.booleanValue();
                    }
/* 77 */            return false;
                }

                public final boolean I000O01llI0() {
/* 1 */             OillOo0 oillOo0 = l010lllOii.I00000oIO;
/* 4 */             if (oillOo0 == null) {
                        try {
/* 36 */                    oillOo0 = new OillOo0(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 8);
                        } catch (NoSuchMethodException unused) {
/* 48 */                    oillOo0 = new OillOo0(bool, bool, bool, bool, 8);
                        }
/* 52 */                l010lllOii.I00000oIO = oillOo0;
                    }
/* 56 */            Method method = (Method) oillOo0.I00iiI;
/* 68 */            bool = method != null ? (Boolean) method.invoke(this.I00000oIO, null) : null;
/* 70 */            if (bool != null) {
/* 72 */                return bool.booleanValue();
                    }
/* 77 */            return false;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OOo1oliI) {
                        return this.I00000oIO.equals(((OOo1oliI) obj).I00000oIO);
                    }
/* 19 */            return false;
                }

                @Override
                public final Collection getAnnotations() {
/* 3 */             Annotation[] declaredAnnotations = this.I00000oIO.getDeclaredAnnotations();
/* 14 */            return declaredAnnotations != null ? lIlIi0Ii1.I00000oOI(declaredAnnotations) : Il01100l.I00iOIl;
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

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 22 */            return OOo1oliI.class.getName() + ": " + this.I00000oIO;
                }
            }
