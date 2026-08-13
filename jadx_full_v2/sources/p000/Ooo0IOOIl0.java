            package p000;

            import java.util.Collections;
            import java.util.List;
            
            public abstract class Ooo0IOOIl0 extends Ii1i0IO0 implements Ooo0I0lliio0 {
                public O0iIl1 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ooo0IOOIl0(Ii1Ool1 ii1Ool1, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1, O0iIl1 o0iIl1, OlI1o0ooI olI1o0ooI) {
/* 10 */            super(ii1Ool1, i11IlOOO, oI1Iio0ii1, olI1o0ooI);
/* 2 */             if (ii1Ool1 == null) {
/* 32 */                I00l0I0l0lO1(0);
/* 966 */               throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 27 */                I00l0I0l0lO1(1);
/* 30 */                throw null;
                    }
/* 6 */             if (oI1Iio0ii1 == null) {
/* 22 */                I00l0I0l0lO1(2);
/* 25 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 17 */                I00l0I0l0lO1(3);
/* 20 */                throw null;
                    }
/* 13 */            this.I00ilI0I1 = o0iIl1;
                }

                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
/* 15 */                    i2 = 2;
                            break;
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
/* 44 */                    objArr[0] = "annotations";
                            break;
                        case 2:
/* 39 */                    objArr[0] = "name";
                            break;
                        case 3:
/* 34 */                    objArr[0] = "source";
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
/* 29 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                            break;
                        default:
/* 26 */                    objArr[0] = "containingDeclaration";
                            break;
                    }
                    switch (i) {
                        case 4:
/* 85 */                    objArr[1] = "getType";
                            break;
                        case 5:
/* 80 */                    objArr[1] = "getOriginal";
                            break;
                        case 6:
/* 75 */                    objArr[1] = "getValueParameters";
                            break;
                        case 7:
/* 70 */                    objArr[1] = "getOverriddenDescriptors";
                            break;
                        case 8:
/* 65 */                    objArr[1] = "getTypeParameters";
                            break;
                        case 9:
/* 60 */                    objArr[1] = "getContextReceiverParameters";
                            break;
                        case 10:
/* 55 */                    objArr[1] = "getReturnType";
                            break;
                        default:
/* 50 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                            break;
                    }
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
/* 92 */                    objArr[2] = "<init>";
                            break;
                    }
/* 94 */            String str2 = String.format(str, objArr);
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
/* 112 */                   throw new IllegalStateException(str2);
                        default:
/* 112 */                   throw new IllegalArgumentException(str2);
                    }
                }

                public O0iIl1 I0001Ioi1lo() {
/* 1 */             O0iIl1 type = getType();
/* 5 */             if (type != null) {
/* 7 */                 return type;
                    }
/* 10 */            I00l0I0l0lO1(10);
/* 29 */            throw null;
                }

                public boolean I001lloI() {
/* 1 */             return false;
                }

                @Override
                public final List I00Iooi00oi() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I00l0I0l0lO1(6);
/* 29 */            throw null;
                }

                public O0ioOi0Oo1ii I00OI1() {
/* 1 */             return null;
                }

                public O0ioOi0Oo1ii I00OOll1() {
/* 1 */             return null;
                }

                @Override
                public final O0iIl1 getType() {
/* 1 */             O0iIl1 o0iIl1 = this.I00ilI0I1;
/* 3 */             if (o0iIl1 != null) {
/* 5 */                 return o0iIl1;
                    }
/* 7 */             I00l0I0l0lO1(4);
/* 29 */            throw null;
                }

                public List getTypeParameters() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00l0I0l0lO1(8);
/* 29 */            throw null;
                }
            }
