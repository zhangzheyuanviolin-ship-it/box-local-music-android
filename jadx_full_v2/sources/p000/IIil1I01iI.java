            package p000;

            import java.lang.reflect.Method;
            
/* 7 */     public final class IIil1I01iI extends IIiiOiO1 {
                public final int I000II;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIil1I01iI(Method method, int i) {
/* 5 */             super(method, false, 6);
/* 1 */             this.I000II = i;
                }

                @Override
                public final Object I0000O(Object[] objArr) {
                    switch (this.I000II) {
                        case 0:
/* 43 */                    I0000oI00(objArr);
/* 59 */                    return I000O01llI0(objArr.length <= 1 ? new Object[0] : I1IoiO1l.I00100o1O0lo(objArr, 1, objArr.length), objArr[0]);
                        case 1:
/* 17 */                    I0000oI00(objArr);
/* 24 */                    I000II(I1IoiO1l.I001i1O0Ol(objArr));
/* 38 */                    return I000O01llI0(objArr.length <= 1 ? new Object[0] : I1IoiO1l.I00100o1O0lo(objArr, 1, objArr.length), null);
                        default:
/* 9 */                     I0000oI00(objArr);
/* 12 */                    return I000O01llI0(objArr, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 8 */         public IIil1I01iI(Method method) {
/* 9 */             super(method, true, 4);
                    this.I000II = 1;
                }
            }
