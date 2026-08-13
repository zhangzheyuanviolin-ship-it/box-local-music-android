            package p000;

            import java.lang.reflect.Field;
            
            public final class IIiiOO0i11 extends IIiiOiO1 {
                public final int I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIiiOO0i11(Field field, boolean z, boolean z2, int i) {
/* 3 */             super(field, z, z2);
/* 1 */             this.I000II = i;
                }

                @Override
                public void I0000oI00(Object[] objArr) {
                    switch (this.I000II) {
                        case 1:
/* 10 */                    super.I0000oI00(objArr);
/* 17 */                    I000II(I1IoiO1l.I001i1O0Ol(objArr));
                            break;
                        default:
/* 6 */                     super.I0000oI00(objArr);
                            break;
                    }
                }
            }
