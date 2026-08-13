            package p000;

            import java.util.Collection;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOOI1ioIo extends OOOIoo1o1 {
                public O0iIl1 I00lli11;
                public final OOOOI1ioIo I00lll10;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OOOOI1ioIo(OOOO01l oOOO01l, I11IlOOO i11IlOOO, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, boolean z, boolean z2, boolean z3, int i, OOOOI1ioIo oOOOI1ioIo, OlI1o0ooI olI1o0ooI) {
/* 55 */            super(o1oIIloii0, iiOiOloo0, oOOO01l, i11IlOOO, OI1Iio0ii1.I000II("<get-" + oOOO01l.getName() + ">"), z, z2, z3, i, olI1o0ooI);
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
/* 64 */            this.I00lll10 = oOOOI1ioIo != null ? oOOOI1ioIo : this;
                }

                public static void I00l0I0l0lO1(int i) {
/* 14 */            String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 26 */            Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
                    switch (i) {
                        case 1:
/* 64 */                    objArr[0] = "annotations";
                            break;
                        case 2:
/* 59 */                    objArr[0] = "modality";
                            break;
                        case 3:
/* 54 */                    objArr[0] = "visibility";
                            break;
                        case 4:
/* 49 */                    objArr[0] = "kind";
                            break;
                        case 5:
/* 44 */                    objArr[0] = "source";
                            break;
                        case 6:
                        case 7:
                        case 8:
/* 39 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                            break;
                        default:
/* 36 */                    objArr[0] = "correspondingProperty";
                            break;
                    }
/* 67 */            if (i == 6) {
/* 88 */                objArr[1] = "getOverriddenDescriptors";
                    } else if (i == 7) {
/* 83 */                objArr[1] = "getValueParameters";
                    } else if (i != 8) {
/* 73 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                    } else {
/* 78 */                objArr[1] = "getOriginal";
                    }
/* 90 */            if (i != 6 && i != 7 && i != 8) {
/* 98 */                objArr[2] = "<init>";
                    }
/* 100 */           String str2 = String.format(str, objArr);
/* 104 */           if (i != 6 && i != 7 && i != 8) {
/* 121 */               throw new IllegalArgumentException(str2);
                    }
/* 121 */           throw new IllegalStateException(str2);
                }

                @Override
                public final O0iIl1 I0001Ioi1lo() {
/* 1 */             return this.I00lli11;
                }

                @Override
                public final Collection I000o00OoI0I() {
/* 2 */             return I010iIIOlo(true);
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I000II(this, obj);
                }

                @Override
                public final List I00Iooi00oi() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I00l0I0l0lO1(7);
/* 29 */            throw null;
                }

                @Override
                public final OOOOI1ioIo I010i10l() {
/* 1 */             OOOOI1ioIo oOOOI1ioIo = this.I00lll10;
/* 3 */             if (oOOOI1ioIo != null) {
/* 5 */                 return oOOOI1ioIo;
                    }
/* 8 */             I00l0I0l0lO1(8);
/* 29 */            throw null;
                }

                public final void I010l10O(O0iIl1 o0iIl1) {
/* 1 */             if (o0iIl1 == null) {
/* 5 */                 o0iIl1 = this.I00ioIO.getType();
                    }
/* 9 */             this.I00lli11 = o0iIl1;
                }
            }
