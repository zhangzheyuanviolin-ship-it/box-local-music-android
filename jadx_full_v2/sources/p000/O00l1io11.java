            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class O00l1io11 extends IOIO10lo implements O00l1iI0ol {
                public Boolean I0100i;
                public Boolean I0100o111I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O00l1io11(OI000ilOol oI000ilOol, O00l1io11 o00l1io11, I11IlOOO i11IlOOO, boolean z, int i, OlI1o0ooI olI1o0ooI) {
/* 10 */            super(oI000ilOol, o00l1io11, i11IlOOO, z, i, olI1o0ooI);
/* 2 */             if (oI000ilOol == null) {
/* 34 */                I00l0I0l0lO1(0);
/* 1294 */              throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 29 */                I00l0I0l0lO1(1);
/* 32 */                throw null;
                    }
/* 6 */             if (i == 0) {
/* 24 */                I00l0I0l0lO1(2);
/* 27 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 19 */                I00l0I0l0lO1(3);
/* 22 */                throw null;
                    }
/* 13 */            this.I0100i = null;
/* 15 */            this.I0100o111I = null;
                }

                public static void I00l0I0l0lO1(int i) {
/* 12 */            String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 22 */            Object[] objArr = new Object[(i == 11 || i == 18) ? 2 : 3];
                    switch (i) {
                        case 1:
                        case 5:
                        case 9:
                        case 15:
/* 70 */                    objArr[0] = "annotations";
                            break;
                        case 2:
                        case 8:
                        case 13:
/* 65 */                    objArr[0] = "kind";
                            break;
                        case 3:
                        case 6:
                        case 10:
/* 60 */                    objArr[0] = "source";
                            break;
                        case 4:
                        default:
/* 32 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 7:
                        case 12:
/* 55 */                    objArr[0] = "newOwner";
                            break;
                        case 11:
                        case PoseLandmark.RIGHT_PINKY:
/* 50 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                            break;
                        case 14:
/* 47 */                    objArr[0] = "sourceElement";
                            break;
                        case 16:
/* 42 */                    objArr[0] = "enhancedValueParameterTypes";
                            break;
                        case 17:
/* 37 */                    objArr[0] = "enhancedReturnType";
                            break;
                    }
/* 77 */            if (i == 11) {
/* 87 */                objArr[1] = "createSubstitutedCopy";
                    } else if (i != 18) {
/* 81 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                    } else {
/* 84 */                objArr[1] = "enhance";
                    }
                    switch (i) {
                        case 4:
                        case 5:
                        case 6:
/* 110 */                   objArr[2] = "createJavaConstructor";
                            break;
                        case 7:
                        case 8:
                        case 9:
                        case 10:
/* 105 */                   objArr[2] = "createSubstitutedCopy";
                            break;
                        case 11:
                        case PoseLandmark.RIGHT_PINKY:
                            break;
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 102 */                   objArr[2] = "createDescriptor";
                            break;
                        case 16:
                        case 17:
/* 97 */                    objArr[2] = "enhance";
                            break;
                        default:
/* 94 */                    objArr[2] = "<init>";
                            break;
                    }
/* 112 */           String str2 = String.format(str, objArr);
/* 116 */           if (i != 11 && i != 18) {
/* 131 */               throw new IllegalArgumentException(str2);
                    }
/* 131 */           throw new IllegalStateException(str2);
                }

                public static O00l1io11 I011Io0I1ioi(OI000ilOol oI000ilOol, I11IlOOO i11IlOOO, boolean z, OiII0Oi oiII0Oi) {
/* 1 */             if (oI000ilOol != null) {
/* 11 */                return new O00l1io11(oI000ilOol, null, i11IlOOO, z, 1, oiII0Oi);
                    }
/* 16 */            I00l0I0l0lO1(4);
/* 483 */           throw null;
                }

                @Override
                public final boolean I001lloI() {
/* 3 */             return this.I0100o111I.booleanValue();
                }

                @Override
                public final O00l1iI0ol I00ilO0(O0iIl1 o0iIl1, ArrayList arrayList, O0iIl1 o0iIl12, OIoi0IIoi oIoi0IIoi) {
/* 24 */            O00l1io11 o00l1io11I011Ol0 = I011Ol0(I000lI(), null, I000oI1ioi(), getAnnotations(), I0010I0i());
/* 70 */            o00l1io11I011Ol0.I010lI0oi(o0iIl1 == null ? null : il0ol10l.I000O01llI0(o00l1io11I011Ol0, o0iIl1, i1i0olI.I00iiO), this.I00l0OO0IO, Il01100l.I00iOIl, getTypeParameters(), li0ol1IO.I00000oIO(arrayList, I00Iooi00oi(), o00l1io11I011Ol0), o0iIl12, I001IO000(), I000OiO());
/* 73 */            if (oIoi0IIoi != null) {
/* 77 */                IiOlOI0o iiOlOI0o = (IiOlOI0o) oIoi0IIoi.I00iOIl;
/* 79 */                Object obj = oIoi0IIoi.I00iiI;
/* 81 */                Map linkedHashMap = o00l1io11I011Ol0.I00ooiO1I;
/* 83 */                if (linkedHashMap == null) {
/* 87 */                    linkedHashMap = new LinkedHashMap();
/* 90 */                    o00l1io11I011Ol0.I00ooiO1I = linkedHashMap;
                        }
/* 92 */                linkedHashMap.put(iiOlOI0o, obj);
                    }
/* 483 */           return o00l1io11I011Ol0;
                }

                @Override
                public final Illll0i I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 8 */             return I011Ol0(ii1Ool1, illlil, i, i11IlOOO, olI1o0ooI);
                }

                @Override
                public final void I010oio1OO0(boolean z) {
/* 5 */             this.I0100i = Boolean.valueOf(z);
                }

                @Override
                public final void I01101IOlO(boolean z) {
/* 5 */             this.I0100o111I = Boolean.valueOf(z);
                }

                @Override
                public final IOIO10lo I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 8 */             return I011Ol0(ii1Ool1, illlil, i, i11IlOOO, olI1o0ooI);
                }

                public final O00l1io11 I011Ol0(Ii1Ool1 ii1Ool1, Illlil illlil, int i, I11IlOOO i11IlOOO, OlI1o0ooI olI1o0ooI) {
/* 2 */             if (ii1Ool1 == null) {
/* 103 */               I00l0I0l0lO1(7);
/* 966 */               throw null;
                    }
/* 4 */             if (i == 0) {
/* 98 */                I00l0I0l0lO1(8);
/* 101 */               throw null;
                    }
/* 6 */             if (i11IlOOO == null) {
/* 92 */                I00l0I0l0lO1(9);
/* 95 */                throw null;
                    }
/* 8 */             if (olI1o0ooI == null) {
/* 86 */                I00l0I0l0lO1(10);
/* 89 */                throw null;
                    }
/* 11 */            if (i != 1 && i != 4) {
/* 21 */                StringBuilder sb = new StringBuilder("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
/* 24 */                sb.append(this);
/* 29 */                sb.append("\nnewOwner: ");
/* 32 */                sb.append(ii1Ool1);
/* 41 */                IoOOl0iOl1io.I000lI(sb, "\nkind: ", IIlIOloOOO.I001lllioOl(i));
/* 1 */                 return null;
                    }
/* 46 */            OI000ilOol oI000ilOol = (OI000ilOol) ii1Ool1;
/* 49 */            O00l1io11 o00l1io11 = (O00l1io11) illlil;
/* 51 */            if (i == 0) {
/* 80 */                I00l0I0l0lO1(13);
/* 83 */                throw null;
                    }
/* 60 */            O00l1io11 o00l1io112 = new O00l1io11(oI000ilOol, o00l1io11, i11IlOOO, this.I00oooO, i, olI1o0ooI);
/* 63 */            Boolean bool = this.I0100i;
/* 65 */            bool.getClass();
/* 68 */            o00l1io112.I0100i = bool;
/* 70 */            Boolean bool2 = this.I0100o111I;
/* 72 */            bool2.getClass();
/* 75 */            o00l1io112.I0100o111I = bool2;
/* 77 */            return o00l1io112;
                }
            }
