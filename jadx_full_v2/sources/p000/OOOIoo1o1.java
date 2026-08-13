            package p000;

            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
/* 8 */     public abstract class OOOIoo1o1 extends Ii1i0IO0 implements Illlil {
                public boolean I00ilI0I1;
                public final boolean I00ilO0;
                public final O1oIIloii0 I00io1l;
                public final OOOO01l I00ioIO;
                public final boolean I00l0I0l0lO1;
                public final int I00l0OO0IO;
                public IiOiOloo0 I00li1OI;
                public Illlil I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOOIoo1o1(O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, OOOO01l oOOO01l, I11IlOOO i11IlOOO, OI1Iio0ii1 oI1Iio0ii1, boolean z, boolean z2, boolean z3, int i, OlI1o0ooI olI1o0ooI) {
/* 14 */            super(oOOO01l.I000lI(), i11IlOOO, oI1Iio0ii1, olI1o0ooI);
/* 2 */             if (o1oIIloii0 == null) {
/* 50 */                I00l0I0l0lO1(0);
/* 92 */                throw null;
                    }
/* 4 */             if (iiOiOloo0 == null) {
/* 45 */                I00l0I0l0lO1(1);
/* 48 */                throw null;
                    }
/* 6 */             if (i11IlOOO == null) {
/* 40 */                I00l0I0l0lO1(3);
/* 43 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 35 */                I00l0I0l0lO1(5);
/* 38 */                throw null;
                    }
/* 17 */            this.I00ll1 = null;
/* 19 */            this.I00io1l = o1oIIloii0;
/* 21 */            this.I00li1OI = iiOiOloo0;
/* 23 */            this.I00ioIO = oOOO01l;
/* 25 */            this.I00ilI0I1 = z;
/* 27 */            this.I00ilO0 = z2;
/* 29 */            this.I00l0I0l0lO1 = z3;
/* 31 */            this.I00l0OO0IO = i;
                }

                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        case 7:
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 15 */                    i2 = 2;
                            break;
                        case 7:
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
/* 64 */                    objArr[0] = "visibility";
                            break;
                        case 2:
/* 59 */                    objArr[0] = "correspondingProperty";
                            break;
                        case 3:
/* 54 */                    objArr[0] = "annotations";
                            break;
                        case 4:
/* 49 */                    objArr[0] = "name";
                            break;
                        case 5:
/* 44 */                    objArr[0] = "source";
                            break;
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 39 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                            break;
                        case 7:
/* 36 */                    objArr[0] = "substitutor";
                            break;
                        case 16:
/* 31 */                    objArr[0] = "overriddenDescriptors";
                            break;
                        default:
/* 26 */                    objArr[0] = "modality";
                            break;
                    }
                    switch (i) {
                        case 6:
/* 115 */                   objArr[1] = "getKind";
                            break;
                        case 7:
                        default:
/* 72 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                            break;
                        case 8:
/* 110 */                   objArr[1] = "substitute";
                            break;
                        case 9:
/* 107 */                   objArr[1] = "getTypeParameters";
                            break;
                        case 10:
/* 102 */                   objArr[1] = "getModality";
                            break;
                        case 11:
/* 97 */                    objArr[1] = "getVisibility";
                            break;
                        case 12:
/* 92 */                    objArr[1] = "getCorrespondingVariable";
                            break;
                        case 13:
/* 87 */                    objArr[1] = "getCorrespondingProperty";
                            break;
                        case 14:
/* 82 */                    objArr[1] = "getContextReceiverParameters";
                            break;
                        case 15:
/* 77 */                    objArr[1] = "getOverriddenDescriptors";
                            break;
                    }
                    switch (i) {
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 7:
/* 130 */                   objArr[2] = "substitute";
                            break;
                        case 16:
/* 127 */                   objArr[2] = "setOverriddenDescriptors";
                            break;
                        default:
/* 122 */                   objArr[2] = "<init>";
                            break;
                    }
/* 132 */           String str2 = String.format(str, objArr);
                    switch (i) {
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 150 */                   throw new IllegalStateException(str2);
                        case 7:
                        default:
/* 150 */                   throw new IllegalArgumentException(str2);
                    }
                }

                @Override
                public final Illlil I0000oI00(OoOilII0 ooOilII0) {
/* 1 */             if (ooOilII0 != null) {
/* 3 */                 return this;
                    }
/* 5 */             I00l0I0l0lO1(7);
/* 49 */            throw null;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             IiOiOloo0 iiOiOloo0 = this.I00li1OI;
/* 3 */             if (iiOiOloo0 != null) {
/* 5 */                 return iiOiOloo0;
                    }
/* 8 */             I00l0I0l0lO1(11);
/* 29 */            throw null;
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             int i = this.I00l0OO0IO;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 7 */             I00l0I0l0lO1(6);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00100l0() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final Object I00111O(IiOlOI0o iiOlOI0o) {
/* 1 */             return null;
                }

                @Override
                public final boolean I001IIilI0O() {
/* 1 */             return this.I00ilO0;
                }

                @Override
                public final O1oIIloii0 I001IO000() {
/* 1 */             O1oIIloii0 o1oIIloii0 = this.I00io1l;
/* 3 */             if (o1oIIloii0 != null) {
/* 5 */                 return o1oIIloii0;
                    }
/* 8 */             I00l0I0l0lO1(10);
/* 29 */            throw null;
                }

                @Override
                public final boolean I001lloI() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00IO1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00IOO() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00IioO0OiOi() {
/* 1 */             return false;
                }

                @Override
                public final IIiO00o1o I00Io1o110i(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 215 */           throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
                }

                @Override
                public final Illlil I00O10llo() {
/* 1 */             return this.I00ll1;
                }

                @Override
                public final O0ioOi0Oo1ii I00OI1() {
/* 3 */             return this.I00ioIO.I00OI1();
                }

                @Override
                public final O0ioOi0Oo1ii I00OOll1() {
/* 3 */             return this.I00ioIO.I00OOll1();
                }

                @Override
                public final List I00Ol1ll1() {
/* 3 */             List listI00Ol1ll1 = this.I00ioIO.I00Ol1ll1();
/* 7 */             if (listI00Ol1ll1 != null) {
/* 9 */                 return listI00Ol1ll1;
                    }
/* 12 */            I00l0I0l0lO1(14);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00iIO() {
/* 1 */             return false;
                }

                @Override
                public final void I00iIi0i1o(Collection collection) {
/* 1 */             if (collection != null) {
/* 3 */                 return;
                    }
/* 6 */             I00l0I0l0lO1(16);
/* 49 */            throw null;
                }

                @Override
                public final boolean I00iiO() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00ilI0I1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00ioIO() {
/* 1 */             return false;
                }

                public final ArrayList I010iIIOlo(boolean z) {
/* 4 */             ArrayList arrayList = new ArrayList(0);
/* 21 */            for (OOOO01l oOOO01l : this.I00ioIO.I000o00OoI0I()) {
/* 36 */                Ii1i01oO10 ii1i01oO10I00000oOI = z ? oOOO01l.I00000oOI() : oOOO01l.I0000Il00O();
/* 40 */                if (ii1i01oO10I00000oOI != null) {
/* 42 */                    arrayList.add(ii1i01oO10I00000oOI);
                        }
                    }
/* 49 */            return arrayList;
                }

                @Override
                public final List getTypeParameters() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00l0I0l0lO1(9);
/* 29 */            throw null;
                }

                @Override
/* 9 */         public final Ii1i01oO10 I0000oI00(OoOilII0 ooOilII0) {
/* 10 */            I0000oI00(ooOilII0);
                    return this;
                }
            }
