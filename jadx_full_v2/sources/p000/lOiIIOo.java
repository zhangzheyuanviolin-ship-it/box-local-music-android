            package p000;

            import java.util.List;
            
            public final class lOiIIOo extends iIIoIiOoOoiO {
                public final int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public lOiIIOo(String str, int i) {
/* 3 */             super(str);
/* 1 */             this.I00iiO = i;
                }

                @Override
                public final iO0iIIoO11 I00000oIO(OillOo0 oillOo0, List list) {
/* 1 */             int i = this.I00iiO;
/* 3 */             iOOl1i1 iool1i1 = iO0iIIoO11.I00Ol1ll1;
                    switch (i) {
                        case 0:
/* 21 */                    return iool1i1;
                        case 1:
                        case 2:
/* 20 */                    return this;
                        case 3:
/* 17 */                    return new iII01l(Double.valueOf(0.0d));
                        default:
/* 8 */                     return iool1i1;
                    }
                }
            }
