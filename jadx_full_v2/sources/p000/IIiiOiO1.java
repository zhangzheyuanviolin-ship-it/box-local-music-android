            package p000;

            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.util.Arrays;
            
/* 27 */    public abstract class IIiiOiO1 extends IIil1l {
                public final int I0000oI00 = 0;
                public final boolean I0001Ioi1lo;

                public IIiiOiO1(Field field, boolean z, boolean z2) {
/* 23 */            super(field, Void.TYPE, z2 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()});
/* 26 */            this.I0001Ioi1lo = z;
                }

                @Override
                public Object I0000O(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
/* 1 */             I0000oI00(objArr);
/* 22 */            ((Field) this.I00000oIO).set(this.I0000Il00O != null ? I1IoiO1l.I001IO000(objArr) : null, I1IoiO1l.I001lloI(objArr));
/* 25 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public void I0000oI00(Object[] objArr) {
                    switch (this.I0000oI00) {
                        case 0:
/* 10 */                    super.I0000oI00(objArr);
/* 15 */                    if (this.I0001Ioi1lo && I1IoiO1l.I001lloI(objArr) == null) {
/* 26 */                        I000II.I000iOII("null is not allowed as a value for this property.");
                                break;
                            }
                            break;
                        default:
/* 6 */                     super.I0000oI00(objArr);
                            break;
                    }
                }

                public Object I000O01llI0(Object[] objArr, Object obj) {
                    return this.I0001Ioi1lo ? OoiIlOl1iI.I00000oIO : ((Method) this.I00000oIO).invoke(obj, Arrays.copyOf(objArr, objArr.length));
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 28 */        public IIiiOiO1(Method method, boolean z, Type[] typeArr) {
/* 29 */            Type genericReturnType = method.getGenericReturnType();
/* 31 */            super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
/* 32 */            this.I0001Ioi1lo = O0000Ioio00.I0000O(genericReturnType, Void.TYPE);
                }

/* 32 */        public IIiiOiO1(Method method, boolean z, int i) {
/* 35 */            this(method, (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z, method.getGenericParameterTypes());
                }
            }
