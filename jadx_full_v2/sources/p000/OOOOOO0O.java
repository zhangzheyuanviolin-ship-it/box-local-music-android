            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOOOO0O extends OOOIoo1o1 {
                public Ooo00oi0O I00lli11;
                public final OOOOOO0O I00lll10;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOOOOO0O(OOOO01l oOOO01l, I11IlOOO i11IlOOO, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, boolean z, boolean z2, boolean z3, int i, OOOOOO0O oooooo0o, OlI1o0ooI olI1o0ooI) {
/* 55 */            super(o1oIIloii0, iiOiOloo0, oOOO01l, i11IlOOO, OI1Iio0ii1.I000II("<set-" + oOOO01l.getName() + ">"), z, z2, z3, i, olI1o0ooI);
/* 2 */             if (i11IlOOO == null) {
/* 88 */                I00l0I0l0lO1(1);
/* 92 */                throw null;
                    }
/* 4 */             if (o1oIIloii0 == null) {
/* 83 */                I00l0I0l0lO1(2);
/* 86 */                throw null;
                    }
/* 6 */             if (iiOiOloo0 == null) {
/* 78 */                I00l0I0l0lO1(3);
/* 81 */                throw null;
                    }
/* 8 */             if (i == 0) {
/* 73 */                I00l0I0l0lO1(4);
/* 76 */                throw null;
                    }
/* 10 */            if (olI1o0ooI == null) {
/* 68 */                I00l0I0l0lO1(5);
/* 71 */                throw null;
                    }
/* 64 */            this.I00lll10 = oooooo0o != null ? oooooo0o : this;
                }

                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
/* 15 */                    i2 = 2;
                            break;
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 9:
/* 69 */                    objArr[0] = "annotations";
                            break;
                        case 2:
/* 64 */                    objArr[0] = "modality";
                            break;
                        case 3:
/* 59 */                    objArr[0] = "visibility";
                            break;
                        case 4:
/* 54 */                    objArr[0] = "kind";
                            break;
                        case 5:
/* 49 */                    objArr[0] = "source";
                            break;
                        case 6:
/* 44 */                    objArr[0] = "parameter";
                            break;
                        case 7:
/* 39 */                    objArr[0] = "setterDescriptor";
                            break;
                        case 8:
/* 34 */                    objArr[0] = "type";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
/* 29 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                            break;
                        default:
/* 26 */                    objArr[0] = "correspondingProperty";
                            break;
                    }
                    switch (i) {
                        case 10:
/* 95 */                    objArr[1] = "getOverriddenDescriptors";
                            break;
                        case 11:
/* 90 */                    objArr[1] = "getValueParameters";
                            break;
                        case 12:
/* 85 */                    objArr[1] = "getReturnType";
                            break;
                        case 13:
/* 80 */                    objArr[1] = "getOriginal";
                            break;
                        default:
/* 75 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                            break;
                    }
                    switch (i) {
                        case 6:
/* 112 */                   objArr[2] = "initialize";
                            break;
                        case 7:
                        case 8:
                        case 9:
/* 107 */                   objArr[2] = "createSetterParameter";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
/* 102 */                   objArr[2] = "<init>";
                            break;
                    }
/* 114 */           String str2 = String.format(str, objArr);
                    switch (i) {
                        case 10:
                        case 11:
                        case 12:
                        case 13:
/* 132 */                   throw new IllegalStateException(str2);
                        default:
/* 132 */                   throw new IllegalArgumentException(str2);
                    }
                }

                public static Ooo00oi0O I010ioo(OOOOOO0O oooooo0o, O0iIl1 o0iIl1, I11IlOOO i11IlOOO) {
/* 2 */             if (o0iIl1 == null) {
/* 33 */                I00l0I0l0lO1(8);
/* 215 */               throw null;
                    }
/* 4 */             if (i11IlOOO != null) {
/* 21 */                return new Ooo00oi0O(oooooo0o, null, 0, i11IlOOO, OlIIoO0Ol0o1.I000II, o0iIl1, false, false, false, null, OlI1o0ooI.I00IO1);
                    }
/* 27 */            I00l0I0l0lO1(9);
/* 30 */            throw null;
                }

                @Override
                public final O0iIl1 I0001Ioi1lo() {
/* 5 */             return IiOiOOIo.I0000oI00(this).I001i1O0Ol();
                }

                @Override
                public final Collection I000o00OoI0I() {
/* 2 */             return I010iIIOlo(false);
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I00100l0(this, obj);
                }

                @Override
                public final List I00Iooi00oi() {
/* 1 */             Ooo00oi0O ooo00oi0O = this.I00lli11;
/* 3 */             if (ooo00oi0O == null) {
/* 19 */                IOOlIIilOl0.I000iOII();
/* 22 */                return null;
                    }
/* 5 */             List listSingletonList = Collections.singletonList(ooo00oi0O);
/* 9 */             if (listSingletonList != null) {
/* 11 */                return listSingletonList;
                    }
/* 14 */            I00l0I0l0lO1(11);
/* 18 */            throw null;
                }

                @Override
                public final OOOOOO0O I010i10l() {
/* 1 */             OOOOOO0O oooooo0o = this.I00lll10;
/* 3 */             if (oooooo0o != null) {
/* 5 */                 return oooooo0o;
                    }
/* 8 */             I00l0I0l0lO1(13);
/* 29 */            throw null;
                }
            }
