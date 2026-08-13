            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public abstract class I01l00l extends Ii1i0IO0 implements OoOOiO {
                public final Ooo0Ioii0o0 I00ilI0I1;
                public final boolean I00ilO0;
                public final int I00io1l;
                public final O1I0II11i I00ioIO;
                public final O1I0II11i I00l0I0l0lO1;
                public final O1I0OloI I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01l00l(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, O1I0OloI o1I0OloI, OI1Iio0ii1 oI1Iio0ii1, Ooo0Ioii0o0 ooo0Ioii0o0, boolean z) {
/* 16 */            super(ii1Ool1, i11IlOOO, oI1Iio0ii1, OlI1o0ooI.I00IO1);
/* 1 */             int i2 = 0;
/* 3 */             if (o1I0OloI == null) {
/* 85 */                I00l0I0l0lO1(0);
/* 429 */               throw null;
                    }
/* 5 */             int i3 = 1;
/* 6 */             if (ii1Ool1 == null) {
/* 81 */                I00l0I0l0lO1(1);
/* 84 */                throw null;
                    }
/* 8 */             if (i11IlOOO == null) {
/* 77 */                I00l0I0l0lO1(2);
/* 80 */                throw null;
                    }
/* 10 */            if (oI1Iio0ii1 == null) {
/* 72 */                I00l0I0l0lO1(3);
/* 75 */                throw null;
                    }
/* 12 */            if (ooo0Ioii0o0 == null) {
/* 67 */                I00l0I0l0lO1(4);
/* 70 */                throw null;
                    }
/* 19 */            this.I00ilI0I1 = ooo0Ioii0o0;
/* 21 */            this.I00ilO0 = z;
/* 23 */            this.I00io1l = i;
/* 27 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(i2);
/* 30 */            i01illiil1Oo.I00iiI = this;
/* 32 */            i01illiil1Oo.I00iiO = o1I0OloI;
/* 34 */            VarHandle.storeStoreFence();
/* 42 */            this.I00ioIO = new O1I0II11i(o1I0OloI, i01illiil1Oo);
/* 46 */            I01illiil1Oo i01illiil1Oo2 = new I01illiil1Oo(i3);
/* 49 */            i01illiil1Oo2.I00iiI = this;
/* 51 */            i01illiil1Oo2.I00iiO = oI1Iio0ii1;
/* 53 */            VarHandle.storeStoreFence();
/* 61 */            this.I00l0I0l0lO1 = new O1I0II11i(o1I0OloI, i01illiil1Oo2);
/* 63 */            this.I00l0OO0IO = o1I0OloI;
                }

                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        case 12:
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
/* 15 */                    i2 = 2;
                            break;
                        case 12:
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
/* 64 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 2:
/* 59 */                    objArr[0] = "annotations";
                            break;
                        case 3:
/* 54 */                    objArr[0] = "name";
                            break;
                        case 4:
/* 49 */                    objArr[0] = "variance";
                            break;
                        case 5:
/* 44 */                    objArr[0] = "source";
                            break;
                        case 6:
/* 39 */                    objArr[0] = "supertypeLoopChecker";
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
/* 34 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                            break;
                        case 12:
/* 31 */                    objArr[0] = "bounds";
                            break;
                        default:
/* 26 */                    objArr[0] = "storageManager";
                            break;
                    }
                    switch (i) {
                        case 7:
/* 105 */                   objArr[1] = "getVariance";
                            break;
                        case 8:
/* 100 */                   objArr[1] = "getUpperBounds";
                            break;
                        case 9:
/* 95 */                    objArr[1] = "getTypeConstructor";
                            break;
                        case 10:
/* 90 */                    objArr[1] = "getDefaultType";
                            break;
                        case 11:
/* 85 */                    objArr[1] = "getOriginal";
                            break;
                        case 12:
                        default:
/* 72 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                            break;
                        case 13:
/* 80 */                    objArr[1] = "processBoundsWithoutCycles";
                            break;
                        case 14:
/* 77 */                    objArr[1] = "getStorageManager";
                            break;
                    }
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                            break;
                        case 12:
/* 115 */                   objArr[2] = "processBoundsWithoutCycles";
                            break;
                        default:
/* 112 */                   objArr[2] = "<init>";
                            break;
                    }
/* 117 */           String str2 = String.format(str, objArr);
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 13:
                        case 14:
/* 135 */                   throw new IllegalStateException(str2);
                        case 12:
                        default:
/* 135 */                   throw new IllegalArgumentException(str2);
                    }
                }

                @Override
                public final OoOIOoO1I I000OOo1O() {
/* 7 */             OoOIOoO1I ooOIOoO1I = (OoOIOoO1I) this.I00ioIO.invoke();
/* 9 */             if (ooOIOoO1I != null) {
/* 11 */                return ooOIOoO1I;
                    }
/* 14 */            I00l0I0l0lO1(9);
/* 29 */            throw null;
                }

                @Override
                public final Ooo0Ioii0o0 I000l1() {
/* 1 */             Ooo0Ioii0o0 ooo0Ioii0o0 = this.I00ilI0I1;
/* 3 */             if (ooo0Ioii0o0 != null) {
/* 5 */                 return ooo0Ioii0o0;
                    }
/* 7 */             I00l0I0l0lO1(7);
/* 29 */            throw null;
                }

                @Override
                public final boolean I001lllioOl() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I000OiO(this, obj);
                }

                @Override
                public final O1I0OloI I00OIO1() {
/* 1 */             O1I0OloI o1I0OloI = this.I00l0OO0IO;
/* 3 */             if (o1I0OloI != null) {
/* 5 */                 return o1I0OloI;
                    }
/* 8 */             I00l0I0l0lO1(14);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00Oio() {
/* 1 */             return false;
                }

                @Override
                public final Ol0O0iI0l0O I00Ol10() {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) this.I00l0I0l0lO1.invoke();
/* 9 */             if (ol0O0iI0l0O != null) {
/* 11 */                return ol0O0iI0l0O;
                    }
/* 14 */            I00l0I0l0lO1(10);
/* 29 */            throw null;
                }

                public abstract List I010ioo();

                @Override
                public final int getIndex() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final List getUpperBounds() {
/* 7 */             return ((I01io11il) I000OOo1O()).I0000oI00();
                }

                @Override
/* 1 */         public final Ii1Ool1 I010i10l() {
/* 2 */             return this;
                }

                @Override
/* 2 */         public final OoOOiO I010i10l() {
/* 3 */             return this;
                }

                @Override
/* 28 */        public final IOIiO1lIl0l I010i10l() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final Ii1i01oO10 I010i10l() {
/* 29 */            return this;
                }

/* 48 */        public List I010iIIOlo(List list) {
/* 49 */            return list;
                }
            }
