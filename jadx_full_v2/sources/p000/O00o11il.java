            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            
/* 47 */    public class O00o11il extends OOOO1o implements O00l1iI0ol {
                public final boolean I00oo1iO0ll;
                public final OIoi0IIoi I00ooIo0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O00o11il(Ii1Ool1 ii1Ool1, I11IlOOO i11IlOOO, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, boolean z, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI, OOOO01l oOOO01l, int i, boolean z2, OIoi0IIoi oIoi0IIoi) {
/* 40 */            super(ii1Ool1, oOOO01l, i11IlOOO, o1oIIloii0, iiOiOloo0, z, oI1Iio0ii1, i, olI1o0ooI, false, false, false, false, false);
/* 2 */             if (ii1Ool1 == null) {
/* 83 */                I00l0I0l0lO1(0);
/* 204 */               throw null;
                    }
/* 4 */             if (i11IlOOO == null) {
/* 78 */                I00l0I0l0lO1(1);
/* 81 */                throw null;
                    }
/* 6 */             if (o1oIIloii0 == null) {
/* 73 */                I00l0I0l0lO1(2);
/* 76 */                throw null;
                    }
/* 8 */             if (iiOiOloo0 == null) {
/* 68 */                I00l0I0l0lO1(3);
/* 71 */                throw null;
                    }
/* 10 */            if (oI1Iio0ii1 == null) {
/* 63 */                I00l0I0l0lO1(4);
/* 66 */                throw null;
                    }
/* 12 */            if (olI1o0ooI == null) {
/* 58 */                I00l0I0l0lO1(5);
/* 61 */                throw null;
                    }
/* 14 */            if (i == 0) {
/* 53 */                I00l0I0l0lO1(6);
/* 56 */                throw null;
                    }
/* 45 */            this.I00oo1iO0ll = z2;
/* 49 */            this.I00ooIo0 = oIoi0IIoi;
                }

                public static void I00l0I0l0lO1(int i) {
/* 8 */             String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 16 */            Object[] objArr = new Object[i != 21 ? 3 : 2];
                    switch (i) {
                        case 1:
                        case 8:
/* 94 */                    objArr[0] = "annotations";
                            break;
                        case 2:
                        case 9:
/* 89 */                    objArr[0] = "modality";
                            break;
                        case 3:
                        case 10:
/* 84 */                    objArr[0] = "visibility";
                            break;
                        case 4:
                        case 11:
/* 79 */                    objArr[0] = "name";
                            break;
                        case 5:
                        case 12:
                        case PoseLandmark.RIGHT_PINKY:
/* 74 */                    objArr[0] = "source";
                            break;
                        case 6:
                        case 16:
/* 69 */                    objArr[0] = "kind";
                            break;
                        case 7:
                        default:
/* 26 */                    objArr[0] = "containingDeclaration";
                            break;
                        case 13:
/* 64 */                    objArr[0] = "newOwner";
                            break;
                        case 14:
/* 59 */                    objArr[0] = "newModality";
                            break;
                        case 15:
/* 54 */                    objArr[0] = "newVisibility";
                            break;
                        case 17:
/* 49 */                    objArr[0] = "newName";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 44 */                    objArr[0] = "enhancedValueParameterTypes";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 39 */                    objArr[0] = "enhancedReturnType";
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 34 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 31 */                    objArr[0] = "inType";
                            break;
                    }
/* 99 */            if (i != 21) {
/* 101 */               objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                    } else {
/* 104 */               objArr[1] = "enhance";
                    }
                    switch (i) {
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
/* 129 */                   objArr[2] = "create";
                            break;
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case PoseLandmark.RIGHT_PINKY:
/* 124 */                   objArr[2] = "createSubstitutedCopy";
                            break;
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
/* 119 */                   objArr[2] = "enhance";
                            break;
                        case PoseLandmark.LEFT_THUMB:
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 116 */                   objArr[2] = "setInType";
                            break;
                        default:
/* 111 */                   objArr[2] = "<init>";
                            break;
                    }
/* 131 */           String str2 = String.format(str, objArr);
/* 135 */           if (i == 21) {
/* 148 */               throw new IllegalStateException(str2);
                    }
                }

                public static O00o11il I01101olii(Ii1Ool1 ii1Ool1, O0l1Ol1o o0l1Ol1o, IiOiOloo0 iiOiOloo0, boolean z, OI1Iio0ii1 oI1Iio0ii1, OiII0Oi oiII0Oi, boolean z2) {
/* 1 */             O1oIIloii0 o1oIIloii0 = O1oIIloii0.I00iiI;
/* 4 */             if (ii1Ool1 == null) {
/* 34 */                I00l0I0l0lO1(7);
/* 429 */               throw null;
                    }
/* 6 */             if (oI1Iio0ii1 != null) {
/* 23 */                return new O00o11il(ii1Ool1, o0l1Ol1o, o1oIIloii0, iiOiOloo0, z, oI1Iio0ii1, oiII0Oi, null, 1, z2, null);
                    }
/* 29 */            I00l0I0l0lO1(11);
/* 32 */            throw null;
                }

                @Override
                public final Object I00111O(IiOlOI0o iiOlOI0o) {
/* 1 */             OIoi0IIoi oIoi0IIoi = this.I00ooIo0;
/* 3 */             if (oIoi0IIoi == null || !((IiOlOI0o) oIoi0IIoi.I00iOIl).equals(iiOlOI0o)) {
/* 18 */                return null;
                    }
/* 15 */            return oIoi0IIoi.I00iiI;
                }

                @Override
                public final boolean I001i1lo1io() {
/* 1 */             O0iIl1 type = getType();
/* 7 */             if (!this.I00oo1iO0ll) {
/* 57 */                return false;
                    }
/* 13 */            if (((!O0i1lI0o1io.I00IO1(type) && !OoillIolOoll.I00000oIO(type)) || OoOilo0Oliii.I0000oI00(type)) && !O0i1lI0o1io.I00IO1oi11O(type)) {
/* 57 */                return false;
                    }
/* 33 */            I11Io0oil0i0 i11Io0oil0i0 = OoOO00ol0.I00000oIO;
/* 35 */            o0llIi o0llii = o0llIi.I00io1l;
                    return !type.getAnnotations().I001l0I00(O0I01I.I00100l0) || O0i1lI0o1io.I00IO1oi11O(type);
                }

                @Override
                public final boolean I001lloI() {
/* 1 */             return false;
                }

                @Override
                public final O00l1iI0ol I00ilO0(O0iIl1 o0iIl1, ArrayList arrayList, O0iIl1 o0iIl12, OIoi0IIoi oIoi0IIoi) {
                    O0iIl1 o0iIl13;
                    OOOOI1ioIo oOOOI1ioIo;
                    OOOOOO0O oooooo0o;
/* 14 */            OOOO01l oOOO01lI010i10l = I010i10l() == this ? null : I010i10l();
/* 56 */            O00o11il o00o11il = new O00o11il(I000lI(), getAnnotations(), I001IO000(), I000OiO(), this.I00ilO0, getName(), I0010I0i(), oOOO01lI010i10l, I000oI1ioi(), this.I00oo1iO0ll, oIoi0IIoi);
/* 59 */            OOOOI1ioIo oOOOI1ioIo2 = this.I00ol1;
/* 61 */            if (oOOOI1ioIo2 != null) {
/* 109 */               OOOOI1ioIo oOOOI1ioIo3 = new OOOOI1ioIo(o00o11il, oOOOI1ioIo2.getAnnotations(), oOOOI1ioIo2.I001IO000(), oOOOI1ioIo2.I000OiO(), oOOOI1ioIo2.I00ilI0I1, oOOOI1ioIo2.I00ilO0, oOOOI1ioIo2.I00l0I0l0lO1, I000oI1ioi(), oOOO01lI010i10l == null ? null : oOOO01lI010i10l.I00000oOI(), oOOOI1ioIo2.I0010I0i());
/* 114 */               oOOOI1ioIo3.I00ll1 = oOOOI1ioIo2.I00ll1;
/* 116 */               o0iIl13 = o0iIl12;
/* 118 */               oOOOI1ioIo3.I00lli11 = o0iIl13;
/* 120 */               oOOOI1ioIo = oOOOI1ioIo3;
                    } else {
/* 122 */               o0iIl13 = o0iIl12;
/* 124 */               oOOOI1ioIo = null;
                    }
/* 125 */           OOOOOO0O oooooo0o2 = this.I00olI;
/* 127 */           if (oooooo0o2 != null) {
/* 175 */               oooooo0o = new OOOOOO0O(o00o11il, oooooo0o2.getAnnotations(), oooooo0o2.I001IO000(), oooooo0o2.I000OiO(), oooooo0o2.I00ilI0I1, oooooo0o2.I00ilO0, oooooo0o2.I00l0I0l0lO1, I000oI1ioi(), oOOO01lI010i10l == null ? null : oOOO01lI010i10l.I0000Il00O(), oooooo0o2.I0010I0i());
/* 180 */               oooooo0o.I00ll1 = oooooo0o.I00ll1;
/* 191 */               Ooo00oi0O ooo00oi0O = (Ooo00oi0O) oooooo0o2.I00Iooi00oi().get(0);
/* 193 */               if (ooo00oi0O == null) {
/* 199 */                   OOOOOO0O.I00l0I0l0lO1(6);
/* 202 */                   throw null;
                        }
/* 195 */               oooooo0o.I00lli11 = ooo00oi0O;
                    } else {
/* 203 */               oooooo0o = null;
                    }
/* 208 */           o00o11il.I010l1ol111(oOOOI1ioIo, oooooo0o, this.I00oli, this.I00oliIiO01i);
/* 211 */           IllOOo00lI illOOo00lI = this.I00ioIO;
/* 213 */           if (illOOo00lI != null) {
/* 217 */               o00o11il.I010o0o0oO(this.I00io1l, illOOo00lI);
                    }
/* 224 */           o00o11il.I00iIi0i1o(I000o00OoI0I());
/* 246 */           o00o11il.I01101IOlO(o0iIl13, getTypeParameters(), this.I00oIiI10, o0iIl1 != null ? il0ol10l.I000O01llI0(this, o0iIl1, i1i0olI.I00iiO) : null, Il01100l.I00iOIl);
/* 49 */            return o00o11il;
                }

                @Override
                public final OOOO1o I010l10O(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0, OOOO01l oOOO01l, int i, OI1Iio0ii1 oI1Iio0ii1) {
/* 2 */             if (ii1Ool1 == null) {
/* 66 */                I00l0I0l0lO1(13);
/* 1294 */              throw null;
                    }
/* 4 */             if (o1oIIloii0 == null) {
/* 60 */                I00l0I0l0lO1(14);
/* 63 */                throw null;
                    }
/* 6 */             if (iiOiOloo0 == null) {
/* 54 */                I00l0I0l0lO1(15);
/* 57 */                throw null;
                    }
/* 8 */             if (i == 0) {
/* 48 */                I00l0I0l0lO1(16);
/* 51 */                throw null;
                    }
/* 10 */            if (oI1Iio0ii1 == null) {
/* 42 */                I00l0I0l0lO1(17);
/* 45 */                throw null;
                    }
/* 36 */            return new O00o11il(ii1Ool1, getAnnotations(), o1oIIloii0, iiOiOloo0, this.I00ilO0, oI1Iio0ii1, OlI1o0ooI.I00IO1, oOOO01l, i, this.I00oo1iO0ll, this.I00ooIo0);
                }

                @Override
/* 48 */        public final void I010oio1OO0(O0iIl1 o0iIl1) {
                }
            }
