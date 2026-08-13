            package p000;
            
            public final class OOlIlO extends IOl0l1l0I1 {
                public final int I00iiI;
                public final IIloOI I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOlIlO(IIloOI iIloOI, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = iIloOI;
                }

                @Override
                public final void I000O01llI0(String[] strArr) {
/* 1 */             int i = this.I00iiI;
/* 3 */             IIloOI iIloOI = this.I00iiO;
                    switch (i) {
                        case 0:
/* 23 */                    if (strArr == null) {
/* 34 */                        I000II.I000iOII("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                                break;
                            } else {
/* 29 */                        ((OOlIll1) iIloOI.I00iiI).I00iio = strArr;
                                break;
                            }
                        default:
/* 8 */                     if (strArr == null) {
/* 19 */                        I000II.I000iOII("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                                break;
                            } else {
/* 14 */                        ((OOlIll1) iIloOI.I00iiI).I00ilI0I1 = strArr;
                                break;
                            }
                    }
                }
            }
