            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            import java.util.Set;
            
            public final class O0ioOi0Oo1ii extends Ii1Ooli implements OIoioOli1I {
                public final int I00iiO = 0;
                public Ii1Ool1 I00iio;
                public OOlo0i0 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0ioOi0Oo1ii(Ii1Ool1 ii1Ool1, I01O1lIi i01O1lIi, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1) {
/* 11 */            super(i11IlOOO, oI1Iio0ii1);
/* 5 */             if (ii1Ool1 == null) {
/* 30 */                I00l0OO0IO(3);
/* 483 */               throw null;
                    }
/* 7 */             if (i11IlOOO == null) {
/* 25 */                I00l0OO0IO(5);
/* 28 */                throw null;
                    }
/* 9 */             if (oI1Iio0ii1 == null) {
/* 20 */                I00l0OO0IO(6);
/* 23 */                throw null;
                    }
/* 14 */            this.I00iio = ii1Ool1;
/* 16 */            this.I00ilI0I1 = i01O1lIi;
                }

                public static void I00l0I0l0lO1(int i) {
/* 10 */            String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 20 */            Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
/* 25 */            if (i == 1 || i == 2) {
/* 41 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
                    } else if (i != 3) {
/* 33 */                objArr[0] = "descriptor";
                    } else {
/* 38 */                objArr[0] = "newOwner";
                    }
/* 43 */            if (i == 1) {
/* 57 */                objArr[1] = "getValue";
                    } else if (i != 2) {
/* 47 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
                    } else {
/* 52 */                objArr[1] = "getContainingDeclaration";
                    }
/* 59 */            if (i != 1 && i != 2) {
/* 63 */                if (i != 3) {
/* 67 */                    objArr[2] = "<init>";
                        } else {
/* 72 */                    objArr[2] = "copy";
                        }
                    }
/* 74 */            String str2 = String.format(str, objArr);
/* 78 */            if (i != 1 && i != 2) {
/* 186 */               throw new IllegalArgumentException(str2);
                    }
/* 186 */           throw new IllegalStateException(str2);
                }

                public static void I00l0OO0IO(int i) {
/* 11 */            String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 21 */            Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 4:
/* 59 */                    objArr[0] = "value";
                            break;
                        case 2:
                        case 5:
/* 54 */                    objArr[0] = "annotations";
                            break;
                        case 3:
                        default:
/* 31 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 6:
/* 49 */                    objArr[0] = "name";
                            break;
                        case 7:
                        case 8:
/* 44 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                            break;
                        case 9:
/* 41 */                    objArr[0] = "newOwner";
                            break;
                        case 10:
/* 36 */                    objArr[0] = "outType";
                            break;
                    }
/* 62 */            if (i == 7) {
/* 76 */                objArr[1] = "getValue";
                    } else if (i != 8) {
/* 66 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                    } else {
/* 71 */                objArr[1] = "getContainingDeclaration";
                    }
                    switch (i) {
                        case 7:
                        case 8:
                            break;
                        case 9:
/* 93 */                    objArr[2] = "copy";
                            break;
                        case 10:
/* 88 */                    objArr[2] = "setOutType";
                            break;
                        default:
/* 83 */                    objArr[2] = "<init>";
                            break;
                    }
/* 95 */            String str2 = String.format(str, objArr);
/* 99 */            if (i != 7 && i != 8) {
/* 114 */               throw new IllegalArgumentException(str2);
                    }
/* 114 */           throw new IllegalStateException(str2);
                }

                public static void I010i10l(int i) {
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
                        case 11:
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
                        case 11:
/* 15 */                    i2 = 2;
                            break;
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 2:
/* 39 */                    objArr[0] = "name";
                            break;
                        case 3:
/* 34 */                    objArr[0] = "substitutor";
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 29 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                            break;
                        default:
/* 26 */                    objArr[0] = "annotations";
                            break;
                    }
                    switch (i) {
                        case 4:
/* 85 */                    objArr[1] = "getContextReceiverParameters";
                            break;
                        case 5:
/* 80 */                    objArr[1] = "getTypeParameters";
                            break;
                        case 6:
/* 75 */                    objArr[1] = "getType";
                            break;
                        case 7:
/* 70 */                    objArr[1] = "getValueParameters";
                            break;
                        case 8:
/* 65 */                    objArr[1] = "getOverriddenDescriptors";
                            break;
                        case 9:
/* 60 */                    objArr[1] = "getVisibility";
                            break;
                        case 10:
/* 55 */                    objArr[1] = "getOriginal";
                            break;
                        case 11:
/* 50 */                    objArr[1] = "getSource";
                            break;
                        default:
/* 45 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                            break;
                    }
                    switch (i) {
                        case 3:
/* 97 */                    objArr[2] = "substitute";
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                            break;
                        default:
/* 92 */                    objArr[2] = "<init>";
                            break;
                    }
/* 99 */            String str2 = String.format(str, objArr);
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 117 */                   throw new IllegalStateException(str2);
                        default:
/* 117 */                   throw new IllegalArgumentException(str2);
                    }
                }

                @Override
                public final O0iIl1 I0001Ioi1lo() {
/* 1 */             return getType();
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             return IiOiioI.I0001Ioi1lo;
                }

                @Override
                public final Ii1Ool1 I000lI() {
                    switch (this.I00iiO) {
                        case 0:
/* 20 */                    OI000ilOol oI000ilOol = (OI000ilOol) this.I00iio;
/* 22 */                    if (oI000ilOol != null) {
/* 24 */                        return oI000ilOol;
                            }
/* 26 */                    I00l0I0l0lO1(2);
/* 29 */                    throw null;
                        default:
/* 7 */                     Ii1Ool1 ii1Ool1 = this.I00iio;
/* 9 */                     if (ii1Ool1 != null) {
/* 11 */                        return ii1Ool1;
                            }
/* 14 */                    I00l0OO0IO(8);
/* 17 */                    throw null;
                    }
                }

                @Override
                public final Collection I000o00OoI0I() {
/* 1 */             Set set = Collections.EMPTY_SET;
/* 3 */             if (set != null) {
/* 5 */                 return set;
                    }
/* 8 */             I010i10l(8);
/* 29 */            throw null;
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             return OlI1o0ooI.I00IO1;
                }

                @Override
                public final boolean I001lloI() {
/* 1 */             return false;
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I000iOII(this, obj);
                }

                @Override
                public final List I00Iooi00oi() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I010i10l(7);
/* 29 */            throw null;
                }

                @Override
                public final O0ioOi0Oo1ii I00OI1() {
/* 1 */             return null;
                }

                @Override
                public final O0ioOi0Oo1ii I00OOll1() {
/* 1 */             return null;
                }

                public final OOlo0i0 I010iIIOlo() {
                    switch (this.I00iiO) {
                        case 0:
/* 21 */                    IoioOiO1 ioioOiO1 = (IoioOiO1) this.I00ilI0I1;
/* 23 */                    if (ioioOiO1 != null) {
/* 25 */                        return ioioOiO1;
                            }
/* 27 */                    I00l0I0l0lO1(1);
/* 30 */                    throw null;
                        default:
/* 9 */                     I01O1lIi i01O1lIi = (I01O1lIi) this.I00ilI0I1;
/* 11 */                    if (i01O1lIi != null) {
/* 13 */                        return i01O1lIi;
                            }
/* 15 */                    I00l0OO0IO(7);
/* 18 */                    throw null;
                    }
                }

                @Override
                public final O0ioOi0Oo1ii I0000oI00(OoOilII0 ooOilII0) {
/* 2 */             if (ooOilII0 == null) {
/* 72 */                I010i10l(3);
/* 186 */               throw null;
                    }
/* 10 */            if (!ooOilII0.I00000oIO.I0000oI00()) {
/* 38 */                O0iIl1 o0iIl1I000O01llI0 = I000lI() instanceof OI000ilOol ? ooOilII0.I000O01llI0(getType(), Ooo0Ioii0o0.I00ilI0I1) : ooOilII0.I000O01llI0(getType(), Ooo0Ioii0o0.I00iiO);
/* 42 */                if (o0iIl1I000O01llI0 == null) {
/* 1 */                     return null;
                        }
/* 49 */                if (o0iIl1I000O01llI0 != getType()) {
/* 67 */                    return new O0ioOi0Oo1ii(I000lI(), new OoI10o10o(o0iIl1I000O01llI0), getAnnotations());
                        }
                    }
/* 51 */            return this;
                }

                @Override
                public final O0iIl1 getType() {
/* 5 */             O0iIl1 type = I010iIIOlo().getType();
/* 9 */             if (type != null) {
/* 11 */                return type;
                    }
/* 13 */            I010i10l(6);
/* 29 */            throw null;
                }

                @Override
                public final List getTypeParameters() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I010i10l(5);
/* 29 */            throw null;
                }

                @Override
                public String toString() {
                    switch (this.I00iiO) {
                        case 0:
/* 34 */                    return "class " + ((OI000ilOol) this.I00iio).getName() + "::this";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
/* 1 */         public final Ii1Ool1 I010i10l() {
/* 2 */             return this;
                }

                @Override
/* 28 */        public final IIiIoIl11IO I010i10l() {
/* 29 */            return this;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 33 */        public O0ioOi0Oo1ii(Ii1Ool1 ii1Ool1, I01O1lIi i01O1lIi, I11IlOOO i11IlOOO) {
/* 34 */            this(ii1Ool1, i01O1lIi, i11IlOOO, OlIIoO0Ol0o1.I0000O);
                    if (ii1Ool1 == null) {
                        I00l0OO0IO(0);
                        throw null;
                    }
                    if (i11IlOOO != null) {
                    } else {
/* 35 */                I00l0OO0IO(2);
                        throw null;
                    }
                }

/* 35 */        public O0ioOi0Oo1ii(I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1) {
                    super(i11IlOOO, oI1Iio0ii1);
                }
            }
