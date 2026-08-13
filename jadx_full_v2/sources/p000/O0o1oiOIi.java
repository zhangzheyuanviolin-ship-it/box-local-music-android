            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class O0o1oiOIi extends OI000ilOol {
                public final OI000ilOol I00iOIl;
                public final OoOilII0 I00iiI;
                public OoOilII0 I00iiO;
                public ArrayList I00iio;
                public ArrayList I00ilI0I1;
                public IOIi10o I00ilO0;

                public O0o1oiOIi(OI000ilOol oI000ilOol, OoOilII0 ooOilII0) {
/* 4 */             this.I00iOIl = oI000ilOol;
/* 6 */             this.I00iiI = ooOilII0;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00oI0i(int i) {
/* 32 */            String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 53 */            Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
/* 58 */            if (i == 2) {
/* 94 */                objArr[0] = "typeArguments";
                    } else if (i == 3) {
/* 89 */                objArr[0] = "kotlinTypeRefiner";
                    } else if (i == 5) {
/* 84 */                objArr[0] = "typeSubstitution";
                    } else if (i != 6) {
/* 66 */                if (i != 8) {
/* 68 */                    if (i != 10) {
/* 70 */                        if (i != 13) {
/* 72 */                            if (i != 23) {
/* 74 */                                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                                    } else {
/* 79 */                                objArr[0] = "substitutor";
                                    }
                                }
                            }
                        }
                    }
                    switch (i) {
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 10:
                        case 13:
                        case PoseLandmark.LEFT_HIP:
/* 195 */                   objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                            break;
                        case 4:
                        case 7:
                        case 9:
                        case 11:
/* 192 */                   objArr[1] = "getMemberScope";
                            break;
                        case 12:
                        case 14:
/* 189 */                   objArr[1] = "getUnsubstitutedMemberScope";
                            break;
                        case 15:
/* 186 */                   objArr[1] = "getStaticScope";
                            break;
                        case 16:
/* 181 */                   objArr[1] = "getDefaultType";
                            break;
                        case 17:
/* 176 */                   objArr[1] = "getContextReceivers";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 171 */                   objArr[1] = "getConstructors";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 166 */                   objArr[1] = "getAnnotations";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 161 */                   objArr[1] = "getName";
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 156 */                   objArr[1] = "getOriginal";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 151 */                   objArr[1] = "getContainingDeclaration";
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 146 */                   objArr[1] = "substitute";
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 143 */                   objArr[1] = "getKind";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 138 */                   objArr[1] = "getModality";
                            break;
                        case 27:
/* 133 */                   objArr[1] = "getVisibility";
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
/* 128 */                   objArr[1] = "getUnsubstitutedInnerClassesScope";
                            break;
                        case PoseLandmark.LEFT_HEEL:
/* 123 */                   objArr[1] = "getSource";
                            break;
                        case 30:
/* 118 */                   objArr[1] = "getDeclaredTypeParameters";
                            break;
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 113 */                   objArr[1] = "getSealedSubclasses";
                            break;
                        default:
/* 108 */                   objArr[1] = "getTypeConstructor";
                            break;
                    }
/* 197 */           if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
/* 220 */               objArr[2] = "getMemberScope";
                    } else if (i == 13) {
/* 217 */               objArr[2] = "getUnsubstitutedMemberScope";
                    } else if (i == 23) {
/* 214 */               objArr[2] = "substitute";
                    }
/* 222 */           String str2 = String.format(str, objArr);
/* 226 */           if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
/* 253 */               throw new IllegalStateException(str2);
                    }
/* 253 */           throw new IllegalArgumentException(str2);
                }

                @Override
                public final Ii1i01oO10 I0000oI00(OoOilII0 ooOilII0) {
/* 1 */             if (ooOilII0 != null) {
/* 3 */                 OoOiiO01illo ooOiiO01illo = ooOilII0.I00000oIO;
                        return ooOiiO01illo.I0000oI00() ? this : new O0o1oiOIi(this, OoOilII0.I0000oI00(ooOiiO01illo, I00oII().I00000oIO));
                    }
/* 30 */            I00oI0i(23);
/* 49 */            throw null;
                }

                @Override
                public final Collection I000II() {
/* 3 */             Collection<IOIO10lo> collectionI000II = this.I00iOIl.I000II();
/* 13 */            ArrayList arrayList = new ArrayList(collectionI000II.size());
/* 24 */            for (IOIO10lo iOIO10lo : collectionI000II) {
/* 32 */                iOIO10lo.getClass();
/* 37 */                IllliloOi illliloOiI010o0o0oO = iOIO10lo.I010o0o0oO(OoOilII0.I00000oOI);
/* 45 */                illliloOiI010o0o0oO.I00ilI0I1 = iOIO10lo.I010i10l();
/* 51 */                illliloOiI010o0o0oO.I000iOII(iOIO10lo.I001IO000());
/* 58 */                illliloOiI010o0o0oO.I000OOo1O(iOIO10lo.I000OiO());
/* 65 */                illliloOiI010o0o0oO.I00000oOI(iOIO10lo.I000oI1ioi());
/* 69 */                illliloOiI010o0o0oO.I00lli11 = false;
/* 87 */                arrayList.add(((IOIO10lo) illliloOiI010o0o0oO.I00olI.I010l1O(illliloOiI010o0o0oO)).I0000oI00(I00oII()));
                    }
/* 113 */           return arrayList;
                }

                @Override
                public final OoOIOoO1I I000OOo1O() {
/* 3 */             OoOIOoO1I ooOIOoO1II000OOo1O = this.I00iOIl.I000OOo1O();
/* 15 */            if (this.I00iiI.I00000oIO.I0000oI00()) {
/* 17 */                if (ooOIOoO1II000OOo1O != null) {
/* 19 */                    return ooOIOoO1II000OOo1O;
                        }
/* 21 */                I00oI0i(0);
/* 25 */                throw null;
                    }
/* 26 */            IOIi10o iOIi10o = this.I00ilO0;
/* 28 */            if (iOIi10o != null) {
/* 113 */               return iOIi10o;
                    }
/* 30 */            OoOilII0 ooOilII0I00oII = I00oII();
/* 34 */            Collection collectionI0000oI00 = ooOIOoO1II000OOo1O.I0000oI00();
/* 44 */            ArrayList arrayList = new ArrayList(collectionI0000oI00.size());
/* 47 */            Iterator it = collectionI0000oI00.iterator();
/* 55 */            while (it.hasNext()) {
/* 69 */                arrayList.add(ooOilII0I00oII.I000O01llI0((O0iIl1) it.next(), Ooo0Ioii0o0.I00iiO));
                    }
/* 79 */            IOIi10o iOIi10o2 = new IOIi10o(this, this.I00iio, arrayList, O1I0OloI.I0000oI00);
/* 82 */            this.I00ilO0 = iOIi10o2;
/* 84 */            return iOIi10o2;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 3 */             IiOiOloo0 iiOiOloo0I000OiO = this.I00iOIl.I000OiO();
/* 7 */             if (iiOiOloo0I000OiO != null) {
/* 9 */                 return iiOiOloo0I000OiO;
                    }
/* 12 */            I00oI0i(27);
/* 29 */            throw null;
                }

                @Override
                public final boolean I000iOII() {
/* 3 */             return this.I00iOIl.I000iOII();
                }

                @Override
                public final Ii1Ool1 I000lI() {
/* 3 */             Ii1Ool1 ii1Ool1I000lI = this.I00iOIl.I000lI();
/* 7 */             if (ii1Ool1I000lI != null) {
/* 9 */                 return ii1Ool1I000lI;
                    }
/* 12 */            I00oI0i(22);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00100o1O0lo() {
/* 3 */             return this.I00iOIl.I00100o1O0lo();
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             return OlI1o0ooI.I00IO1;
                }

                @Override
                public final boolean I001IIilI0O() {
/* 3 */             return this.I00iOIl.I001IIilI0O();
                }

                @Override
                public final O1oIIloii0 I001IO000() {
/* 3 */             O1oIIloii0 o1oIIloii0I001IO000 = this.I00iOIl.I001IO000();
/* 7 */             if (o1oIIloii0I001IO000 != null) {
/* 9 */                 return o1oIIloii0I001IO000;
                    }
/* 12 */            I00oI0i(26);
/* 29 */            throw null;
                }

                @Override
                public final List I001i1O0Ol() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00oI0i(17);
/* 29 */            throw null;
                }

                @Override
                public final IOIOllO1oli I00II0oii1o() {
/* 3 */             IOIOllO1oli iOIOllO1oliI00II0oii1o = this.I00iOIl.I00II0oii1o();
/* 7 */             if (iOIOllO1oliI00II0oii1o != null) {
/* 9 */                 return iOIOllO1oliI00II0oii1o;
                    }
/* 12 */            I00oI0i(25);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00IO1() {
/* 3 */             return this.I00iOIl.I00IO1();
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I00II0Ol1O0l(this, obj);
                }

                @Override
                public final O1iil1I01o I00IoO0(OoOiiO01illo ooOiiO01illo) {
/* 5 */             IiOiOOIo.I000O01llI0(IiOiIO0i1Oil.I0000Il00O(this));
/* 10 */            return I00OIl(ooOiiO01illo, O0iIoIOO0O0.I00000oIO);
                }

                @Override
                public final O1iil1I01o I00OIl(OoOiiO01illo ooOiiO01illo, O0iIoIOO0O0 o0iIoIOO0O0) {
/* 3 */             O1iil1I01o o1iil1I01oI00OIl = this.I00iOIl.I00OIl(ooOiiO01illo, o0iIoIOO0O0);
/* 15 */            if (!this.I00iiI.I00000oIO.I0000oI00()) {
/* 32 */                return new OliOiiiII(o1iil1I01oI00OIl, I00oII());
                    }
/* 17 */            if (o1iil1I01oI00OIl != null) {
/* 19 */                return o1iil1I01oI00OIl;
                    }
/* 21 */            I00oI0i(7);
/* 25 */            throw null;
                }

                @Override
                public final Ol0O0iI0l0O I00Ol10() {
                    OoOI1i1i ooOI1i1iI00ll1;
/* 9 */             List listI0000O = OoOilo0Oliii.I0000O(I000OOo1O().I000II());
/* 13 */            I11IlOOO annotations = getAnnotations();
/* 21 */            if (annotations.isEmpty()) {
/* 25 */                OoOI1i1i.I00iiI.getClass();
/* 28 */                ooOI1i1iI00ll1 = OoOI1i1i.I00iiO;
                    } else {
/* 31 */                IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 38 */                List listSingletonList = Collections.singletonList(new I11O0Ol(annotations));
/* 42 */                iIlio101Io.getClass();
/* 45 */                ooOI1i1iI00ll1 = IIlio101Io.I00ll1(listSingletonList);
                    }
/* 58 */            return l0loOIIo0iOo.I0000O(ooOI1i1iI00ll1, I000OOo1O(), listI0000O, false, I00l0OO0IO());
                }

                @Override
                public final OI000ilOol I010i10l() {
/* 3 */             OI000ilOol oI000ilOolI010i10l = this.I00iOIl.I010i10l();
/* 7 */             if (oI000ilOolI010i10l != null) {
/* 9 */                 return oI000ilOolI010i10l;
                    }
/* 12 */            I00oI0i(21);
/* 29 */            throw null;
                }

                @Override
                public final O1iil1I01o I00iOIl() {
/* 3 */             O1iil1I01o o1iil1I01oI00iOIl = this.I00iOIl.I00iOIl();
/* 7 */             if (o1iil1I01oI00iOIl != null) {
/* 9 */                 return o1iil1I01oI00iOIl;
                    }
/* 12 */            I00oI0i(15);
/* 29 */            throw null;
                }

                @Override
                public final O0ioOi0Oo1ii I00iiI() {
/* 29 */            throw new UnsupportedOperationException();
                }

                @Override
                public final boolean I00ilI0I1() {
/* 3 */             return this.I00iOIl.I00ilI0I1();
                }

                @Override
                public final List I00io1l() {
/* 1 */             I00oII();
/* 4 */             ArrayList arrayList = this.I00ilI0I1;
/* 6 */             if (arrayList != null) {
/* 8 */                 return arrayList;
                    }
/* 11 */            I00oI0i(30);
/* 29 */            throw null;
                }

                @Override
                public final O1iil1I01o I00l0I0l0lO1() {
/* 3 */             O1iil1I01o o1iil1I01oI00l0I0l0lO1 = this.I00iOIl.I00l0I0l0lO1();
/* 7 */             if (o1iil1I01oI00l0I0l0lO1 != null) {
/* 9 */                 return o1iil1I01oI00l0I0l0lO1;
                    }
/* 12 */            I00oI0i(28);
/* 29 */            throw null;
                }

                @Override
                public final O1iil1I01o I00l0OO0IO() {
/* 7 */             IiOiOOIo.I000O01llI0(IiOiIO0i1Oil.I0000Il00O(this.I00iOIl));
/* 12 */            return I00li1OI(O0iIoIOO0O0.I00000oIO);
                }

                @Override
                public final O1iil1I01o I00li1OI(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 3 */             O1iil1I01o o1iil1I01oI00li1OI = this.I00iOIl.I00li1OI(o0iIoIOO0O0);
/* 15 */            if (!this.I00iiI.I00000oIO.I0000oI00()) {
/* 33 */                return new OliOiiiII(o1iil1I01oI00li1OI, I00oII());
                    }
/* 17 */            if (o1iil1I01oI00li1OI != null) {
/* 19 */                return o1iil1I01oI00li1OI;
                    }
/* 22 */            I00oI0i(14);
/* 26 */            throw null;
                }

                @Override
                public final IOIO10lo I00ll1() {
/* 3 */             return this.I00iOIl.I00ll1();
                }

                @Override
                public final OoloOii00O I00lli11() {
/* 3 */             OoloOii00O ooloOii00OI00lli11 = this.I00iOIl.I00lli11();
/* 8 */             if (ooloOii00OI00lli11 == null) {
/* 7 */                 return null;
                    }
/* 11 */            boolean z = ooloOii00OI00lli11 instanceof Ioll0i;
/* 13 */            OoOilII0 ooOilII0 = this.I00iiI;
/* 15 */            if (z) {
/* 19 */                Ioll0i ioll0i = (Ioll0i) ooloOii00OI00lli11;
/* 21 */                OI1Iio0ii1 oI1Iio0ii1 = ioll0i.I00000oIO;
/* 25 */                Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) ioll0i.I00000oOI;
/* 27 */                if (ol0O0iI0l0O != null && !ooOilII0.I00000oIO.I0000oI00()) {
/* 49 */                    ol0O0iI0l0O = (Ol0O0iI0l0O) I00oII().I000O01llI0(ol0O0iI0l0O, Ooo0Ioii0o0.I00iiO);
                        }
/* 51 */                return new Ioll0i(oI1Iio0ii1, ol0O0iI0l0O);
                    }
/* 57 */            if (!(ooloOii00OI00lli11 instanceof OI0O10)) {
/* 138 */               I000II.I00000oIO();
/* 7 */                 return null;
                    }
/* 61 */            ArrayList<OIoi0IIoi> arrayList = ((OI0O10) ooloOii00OI00lli11).I00000oIO;
/* 71 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(arrayList, 10));
/* 82 */            for (OIoi0IIoi oIoi0IIoi : arrayList) {
/* 92 */                OI1Iio0ii1 oI1Iio0ii12 = (OI1Iio0ii1) oIoi0IIoi.I00iOIl;
/* 98 */                Ol0O0iI0l0O ol0O0iI0l0O2 = (Ol0O0iI0l0O) ((Oi1iIiI1) oIoi0IIoi.I00iiI);
/* 100 */               if (ol0O0iI0l0O2 != null && !ooOilII0.I00000oIO.I0000oI00()) {
/* 121 */                   ol0O0iI0l0O2 = (Ol0O0iI0l0O) I00oII().I000O01llI0(ol0O0iI0l0O2, Ooo0Ioii0o0.I00iiO);
                        }
/* 128 */               arrayList2.add(new OIoi0IIoi(oI1Iio0ii12, ol0O0iI0l0O2));
                    }
/* 134 */           return new OI0O10(arrayList2);
                }

                @Override
                public final boolean I00lll10() {
/* 3 */             return this.I00iOIl.I00lll10();
                }

                @Override
                public final boolean I00o0iI0io1() {
/* 3 */             return this.I00iOIl.I00o0iI0io1();
                }

                @Override
                public final boolean I00o0l1o1o0() {
/* 3 */             return this.I00iOIl.I00o0l1o1o0();
                }

                @Override
                public final boolean I00o101lO() {
/* 3 */             return this.I00iOIl.I00o101lO();
                }

                public final OoOilII0 I00oII() {
/* 3 */             if (this.I00iiO == null) {
/* 5 */                 OoOilII0 ooOilII0 = this.I00iiI;
/* 13 */                if (ooOilII0.I00000oIO.I0000oI00()) {
/* 15 */                    this.I00iiO = ooOilII0;
                        } else {
/* 24 */                    List listI000II = this.I00iOIl.I000OOo1O().I000II();
/* 34 */                    ArrayList arrayList = new ArrayList(listI000II.size());
/* 37 */                    this.I00iio = arrayList;
/* 45 */                    this.I00iiO = il10o1I1iI1.I00000oOI(listI000II, ooOilII0.I00000oIO, this, arrayList);
/* 47 */                    ArrayList arrayList2 = this.I00iio;
/* 51 */                    ArrayList arrayList3 = new ArrayList();
/* 54 */                    Iterator it = arrayList2.iterator();
/* 62 */                    while (it.hasNext()) {
/* 64 */                        Object next = it.next();
/* 75 */                        if (!((OoOOiO) next).I00Oio()) {
/* 77 */                            arrayList3.add(next);
                                }
                            }
/* 81 */                    this.I00ilI0I1 = arrayList3;
                        }
                    }
/* 83 */            return this.I00iiO;
                }

                @Override
                public final I11IlOOO getAnnotations() {
/* 3 */             I11IlOOO annotations = this.I00iOIl.getAnnotations();
/* 7 */             if (annotations != null) {
/* 9 */                 return annotations;
                    }
/* 12 */            I00oI0i(19);
/* 29 */            throw null;
                }

                @Override
                public final OI1Iio0ii1 getName() {
/* 3 */             OI1Iio0ii1 name = this.I00iOIl.getName();
/* 7 */             if (name != null) {
/* 9 */                 return name;
                    }
/* 12 */            I00oI0i(20);
/* 29 */            throw null;
                }
            }
