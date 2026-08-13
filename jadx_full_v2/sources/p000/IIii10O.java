            package p000;

            import java.lang.reflect.Field;
            import java.lang.reflect.Type;
            
            public abstract class IIii10O extends IIil1l {
                public IIii10O(Field field, boolean z) {
/* 16 */            super(field, field.getGenericType(), z ? field.getDeclaringClass() : null, new Type[0]);
                }

                @Override
                public Object I0000O(Object[] objArr) {
/* 1 */             I0000oI00(objArr);
/* 18 */            return ((Field) this.I00000oIO).get(this.I0000Il00O != null ? I1IoiO1l.I001IO000(objArr) : null);
                }
            }
