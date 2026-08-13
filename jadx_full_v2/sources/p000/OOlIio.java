            package p000;
            
            public final class OOlIio extends IOl0l1l0I1 {
                public final int I00iiI;
                public final O0iI0IlO0iI I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOlIio(O0iI0IlO0iI o0iI0IlO0iI, int i) {
/* 6 */             super(1);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00iiO = o0iI0IlO0iI;
                }

                @Override
                public final void I000O01llI0(String[] strArr) {
/* 1 */             int i = this.I00iiI;
/* 3 */             O0iI0IlO0iI o0iI0IlO0iI = this.I00iiO;
                    switch (i) {
                        case 0:
/* 42 */                    if (strArr == null) {
/* 55 */                        I000II.I000iOII("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                                break;
                            } else {
/* 50 */                        ((OOlIll1) ((IIOOoll) o0iI0IlO0iI).I00iiI).I00iio = strArr;
                                break;
                            }
                        case 1:
/* 25 */                    if (strArr == null) {
/* 38 */                        I000II.I000iOII("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                                break;
                            } else {
/* 33 */                        ((OOlIll1) ((IIOOoll) o0iI0IlO0iI).I00iiI).I00ilI0I1 = strArr;
                                break;
                            }
                        default:
/* 8 */                     if (strArr == null) {
/* 21 */                        I000II.I000iOII("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                                break;
                            } else {
/* 16 */                        ((OOlIll1) ((O1OIll00i) o0iI0IlO0iI).I00iiI).I00ioIO = strArr;
                                break;
                            }
                    }
                }
            }
