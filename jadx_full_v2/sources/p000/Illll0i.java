            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            public abstract class Illll0i extends Ii1i0IO0 implements Illlil {
                public List I00ilI0I1;
                public List I00ilO0;
                public O0iIl1 I00io1l;
                public List I00ioIO;
                public O0ioOi0Oo1ii I00l0I0l0lO1;
                public O0ioOi0Oo1ii I00l0OO0IO;
                public O1oIIloii0 I00li1OI;
                public IiOiOloo0 I00ll1;
                public boolean I00lli11;
                public boolean I00lll10;
                public boolean I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public boolean I00o101lO;
                public boolean I00oI0i;
                public boolean I00oII;
                public boolean I00oIiI10;
                public boolean I00oO101o;
                public boolean I00oOio10iI1;
                public boolean I00ol1;
                public Collection I00olI;
                public volatile I01illiil1Oo I00oli;
                public final Illlil I00oliIiO01i;
                public final int I00oo1iO0ll;
                public Illlil I00ooIo0;
                public Map I00ooiO1I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Illll0i(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI) {
/* 14 */            super(ii1Ool1, i11IlOOO, oI1Iio0ii1, olI1o0ooI);
/* 3 */             if (ii1Ool1 == null) {
/* 78 */                I00l0I0l0lO1(0);
/* 1294 */              throw null;
                    }
/* 6 */             if (i11IlOOO == null) {
/* 74 */                I00l0I0l0lO1(1);
/* 77 */                throw null;
                    }
/* 8 */             if (oI1Iio0ii1 == null) {
/* 70 */                I00l0I0l0lO1(2);
/* 73 */                throw null;
                    }
/* 10 */            if (i == 0) {
/* 65 */                I00l0I0l0lO1(3);
/* 68 */                throw null;
                    }
/* 12 */            if (olI1o0ooI == null) {
/* 60 */                I00l0I0l0lO1(4);
/* 63 */                throw null;
                    }
/* 19 */            this.I00ll1 = IiOiioI.I000OOo1O;
/* 21 */            this.I00lli11 = false;
/* 23 */            this.I00lll10 = false;
/* 25 */            this.I00o0iI0io1 = false;
/* 27 */            this.I00o0l1o1o0 = false;
/* 29 */            this.I00o101lO = false;
/* 31 */            this.I00oI0i = false;
/* 33 */            this.I00oII = false;
/* 35 */            this.I00oIiI10 = false;
/* 37 */            this.I00oO101o = false;
/* 39 */            this.I00oOio10iI1 = true;
/* 41 */            this.I00ol1 = false;
/* 43 */            this.I00olI = null;
/* 45 */            this.I00oli = null;
/* 47 */            this.I00ooIo0 = null;
/* 49 */            this.I00ooiO1I = null;
/* 54 */            this.I00oliIiO01i = illlil == null ? this : illlil;
/* 56 */            this.I00oo1iO0ll = i;
                }

                public static void I00l0I0l0lO1(int i) {
                    String str;
                    int i2;
                    switch (i) {
                        case 9:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
/* 7 */                     str = "@NotNull method %s.%s must not return null";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 17:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        default:
/* 4 */                     str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                            break;
                    }
                    switch (i) {
                        case 9:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
/* 15 */                    i2 = 2;
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 17:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        default:
/* 13 */                    i2 = 3;
                            break;
                    }
/* 16 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
/* 99 */                    objArr[0] = "annotations";
                            break;
                        case 2:
/* 94 */                    objArr[0] = "name";
                            break;
                        case 3:
/* 89 */                    objArr[0] = "kind";
                            break;
                        case 4:
/* 84 */                    objArr[0] = "source";
                            break;
                        case 5:
/* 79 */                    objArr[0] = "contextReceiverParameters";
                            break;
                        case 6:
/* 74 */                    objArr[0] = "typeParameters";
                            break;
                        case 7:
                        case PoseLandmark.RIGHT_ANKLE:
                        case 30:
/* 69 */                    objArr[0] = "unsubstitutedValueParameters";
                            break;
                        case 8:
                        case 10:
/* 64 */                    objArr[0] = "visibility";
                            break;
                        case 9:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
/* 59 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                            break;
                        case 11:
/* 56 */                    objArr[0] = "unsubstitutedReturnType";
                            break;
                        case 12:
/* 51 */                    objArr[0] = "extensionReceiverParameter";
                            break;
                        case 17:
/* 46 */                    objArr[0] = "overriddenDescriptors";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 41 */                    objArr[0] = "originalSubstitutor";
                            break;
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_HEEL:
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 36 */                    objArr[0] = "substitutor";
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 31 */                    objArr[0] = "configuration";
                            break;
                        default:
/* 26 */                    objArr[0] = "containingDeclaration";
                            break;
                    }
                    switch (i) {
                        case 9:
/* 165 */                   objArr[1] = "initialize";
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 17:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        default:
/* 109 */                   objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                            break;
                        case 13:
/* 162 */                   objArr[1] = "getContextReceiverParameters";
                            break;
                        case 14:
/* 157 */                   objArr[1] = "getOverriddenDescriptors";
                            break;
                        case 15:
/* 152 */                   objArr[1] = "getModality";
                            break;
                        case 16:
/* 147 */                   objArr[1] = "getVisibility";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 142 */                   objArr[1] = "getTypeParameters";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 137 */                   objArr[1] = "getValueParameters";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 132 */                   objArr[1] = "getOriginal";
                            break;
                        case PoseLandmark.LEFT_THUMB:
/* 127 */                   objArr[1] = "getKind";
                            break;
                        case PoseLandmark.LEFT_HIP:
/* 122 */                   objArr[1] = "newCopyBuilder";
                            break;
                        case PoseLandmark.RIGHT_KNEE:
/* 119 */                   objArr[1] = "copy";
                            break;
                        case 27:
/* 114 */                   objArr[1] = "getSourceToUseForCopy";
                            break;
                    }
                    switch (i) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
/* 213 */                   objArr[2] = "initialize";
                            break;
                        case 9:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
                            break;
                        case 10:
/* 210 */                   objArr[2] = "setVisibility";
                            break;
                        case 11:
/* 205 */                   objArr[2] = "setReturnType";
                            break;
                        case 12:
/* 200 */                   objArr[2] = "setExtensionReceiverParameter";
                            break;
                        case 17:
/* 195 */                   objArr[2] = "setOverriddenDescriptors";
                            break;
                        case PoseLandmark.RIGHT_THUMB:
/* 190 */                   objArr[2] = "substitute";
                            break;
                        case PoseLandmark.RIGHT_HIP:
/* 185 */                   objArr[2] = "newCopyBuilder";
                            break;
                        case PoseLandmark.LEFT_KNEE:
/* 182 */                   objArr[2] = "doSubstitute";
                            break;
                        case PoseLandmark.RIGHT_ANKLE:
                        case PoseLandmark.LEFT_HEEL:
                        case 30:
                        case PoseLandmark.LEFT_FOOT_INDEX:
/* 177 */                   objArr[2] = "getSubstitutedValueParameters";
                            break;
                        default:
/* 172 */                   objArr[2] = "<init>";
                            break;
                    }
/* 215 */           String str2 = String.format(str, objArr);
                    switch (i) {
                        case 9:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case PoseLandmark.RIGHT_PINKY:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                        case PoseLandmark.LEFT_THUMB:
                        case PoseLandmark.LEFT_HIP:
                        case PoseLandmark.RIGHT_KNEE:
                        case 27:
/* 233 */                   throw new IllegalStateException(str2);
                        case 10:
                        case 11:
                        case 12:
                        case 17:
                        case PoseLandmark.RIGHT_THUMB:
                        case PoseLandmark.RIGHT_HIP:
                        case PoseLandmark.LEFT_KNEE:
                        default:
/* 233 */                   throw new IllegalArgumentException(str2);
                    }
                }

                public static ArrayList I010l1ol111(Illlil illlil, List list, OoOilII0 ooOilII0, boolean z, boolean z2, boolean[] zArr) {
                    I01i01iOOOIo i01i01iOOOIo;
/* 4 */             if (list == null) {
/* 166 */               I00l0I0l0lO1(30);
/* 1294 */              throw null;
                    }
/* 12 */            ArrayList arrayList = new ArrayList(list.size());
/* 15 */            Iterator it = list.iterator();
/* 23 */            while (it.hasNext()) {
/* 29 */                Ooo00oi0O ooo00oi0O = (Ooo00oi0O) it.next();
/* 31 */                O0iIl1 type = ooo00oi0O.getType();
/* 35 */                Ooo0Ioii0o0 ooo0Ioii0o0 = Ooo0Ioii0o0.I00iio;
/* 37 */                O0iIl1 o0iIl1I000O01llI0 = ooOilII0.I000O01llI0(type, ooo0Ioii0o0);
/* 41 */                O0iIl1 o0iIl1 = ooo00oi0O.I00l0OO0IO;
/* 47 */                O0iIl1 o0iIl1I000O01llI02 = o0iIl1 == null ? null : ooOilII0.I000O01llI0(o0iIl1, ooo0Ioii0o0);
/* 51 */                if (o0iIl1I000O01llI0 == null) {
/* 3 */                     return null;
                        }
/* 58 */                int i = 1;
/* 59 */                if ((o0iIl1I000O01llI0 != ooo00oi0O.getType() || o0iIl1 != o0iIl1I000O01llI02) && zArr != null) {
/* 66 */                    zArr[0] = true;
                        }
/* 70 */                if (ooo00oi0O instanceof Ooo00O1o1Oii) {
/* 81 */                    List list2 = (List) ((Ooo00O1o1Oii) ooo00oi0O).I00ll1.getValue();
/* 85 */                    I01i01iOOOIo i01i01iOOOIo2 = new I01i01iOOOIo(i);
/* 88 */                    i01i01iOOOIo2.I00iiI = list2;
/* 90 */                    VarHandle.storeStoreFence();
/* 93 */                    i01i01iOOOIo = i01i01iOOOIo2;
                        } else {
/* 96 */                    i01i01iOOOIo = null;
                        }
/* 102 */               Ooo00oi0O ooo00oi0O2 = z ? null : ooo00oi0O;
/* 103 */               int i2 = ooo00oi0O.I00ilO0;
/* 105 */               I11IlOOO annotations = ooo00oi0O.getAnnotations();
/* 109 */               OI1Iio0ii1 name = ooo00oi0O.getName();
/* 113 */               boolean zI010ioo = ooo00oi0O.I010ioo();
/* 117 */               boolean z3 = ooo00oi0O.I00ioIO;
/* 119 */               boolean z4 = ooo00oi0O.I00l0I0l0lO1;
/* 130 */               OlI1o0ooI olI1o0ooII0010I0i = z2 ? ooo00oi0O.I0010I0i() : OlI1o0ooI.I00IO1;
/* 158 */               arrayList.add(i01i01iOOOIo == null ? new Ooo00oi0O(illlil, ooo00oi0O2, i2, annotations, name, o0iIl1I000O01llI0, zI010ioo, z3, z4, o0iIl1I000O01llI02, olI1o0ooII0010I0i) : new Ooo00O1o1Oii(illlil, ooo00oi0O2, i2, annotations, name, o0iIl1I000O01llI0, zI010ioo, z3, z4, o0iIl1I000O01llI02, olI1o0ooII0010I0i, i01i01iOOOIo));
                    }
/* 163 */           return arrayList;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [Illlil] */
                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r1v6 */
                @Override
                public Illlil I010i10l() {
/* 1 */             Illlil illlil = this.I00oliIiO01i;
                    ?? I010i10l = this;
/* 3 */             if (illlil != this) {
/* 6 */                 I010i10l = illlil.I010i10l();
                    }
/* 10 */            if (I010i10l != 0) {
/* 12 */                return I010i10l;
                    }
/* 15 */            I00l0I0l0lO1(20);
/* 29 */            throw null;
                }

                @Override
                public Illlil I0000oI00(OoOilII0 ooOilII0) {
/* 1 */             if (ooOilII0 == null) {
/* 36 */                I00l0I0l0lO1(22);
/* 49 */                throw null;
                    }
/* 9 */             if (ooOilII0.I00000oIO.I0000oI00()) {
/* 11 */                return this;
                    }
/* 12 */            IllliloOi illliloOiI010o0o0oO = I010o0o0oO(ooOilII0);
/* 20 */            illliloOiI010o0o0oO.I00ilI0I1 = I010i10l();
/* 23 */            illliloOiI010o0o0oO.I00o0iI0io1 = true;
/* 25 */            illliloOiI010o0o0oO.I00ol1 = true;
/* 29 */            return illliloOiI010o0o0oO.I00olI.I010l1O(illliloOiI010o0o0oO);
                }

                @Override
                public O0iIl1 I0001Ioi1lo() {
/* 1 */             return this.I00io1l;
                }

                @Override
                public final IiOiOloo0 I000OiO() {
/* 1 */             IiOiOloo0 iiOiOloo0 = this.I00ll1;
/* 3 */             if (iiOiOloo0 != null) {
/* 5 */                 return iiOiOloo0;
                    }
/* 8 */             I00l0I0l0lO1(16);
/* 29 */            throw null;
                }

                public Collection I000o00OoI0I() {
/* 1 */             I01illiil1Oo i01illiil1Oo = this.I00oli;
/* 4 */             if (i01illiil1Oo != null) {
/* 12 */                this.I00olI = (Collection) i01illiil1Oo.invoke();
/* 14 */                this.I00oli = null;
                    }
/* 16 */            Collection collection = this.I00olI;
/* 18 */            if (collection == null) {
/* 21 */                collection = Collections.EMPTY_LIST;
                    }
/* 23 */            if (collection != null) {
/* 25 */                return collection;
                    }
/* 28 */            I00l0I0l0lO1(14);
/* 113 */           throw null;
                }

                @Override
                public final int I000oI1ioi() {
/* 1 */             int i = this.I00oo1iO0ll;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 8 */             I00l0I0l0lO1(21);
/* 29 */            throw null;
                }

                public boolean I00100l0() {
/* 1 */             return this.I00oO101o;
                }

                public boolean I00100o1O0lo() {
/* 1 */             return this.I00o0l1o1o0;
                }

                public Object I00111O(IiOlOI0o iiOlOI0o) {
/* 1 */             Map map = this.I00ooiO1I;
/* 3 */             if (map == null) {
/* 5 */                 return null;
                    }
/* 7 */             return map.get(iiOlOI0o);
                }

                public boolean I001IIilI0O() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final O1oIIloii0 I001IO000() {
/* 1 */             O1oIIloii0 o1oIIloii0 = this.I00li1OI;
/* 3 */             if (o1oIIloii0 != null) {
/* 5 */                 return o1oIIloii0;
                    }
/* 8 */             I00l0I0l0lO1(15);
/* 29 */            throw null;
                }

                @Override
                public boolean I001lloI() {
/* 1 */             return this.I00ol1;
                }

                @Override
                public final boolean I00IO1() {
/* 1 */             return this.I00oI0i;
                }

                public boolean I00IOO() {
/* 1 */             return this.I00o101lO;
                }

                @Override
                public final boolean I00IioO0OiOi() {
/* 3 */             if (this.I00lli11) {
/* 36 */                return true;
                    }
/* 14 */            Iterator it = I010i10l().I000o00OoI0I().iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                if (((Illlil) it.next()).I00IioO0OiOi()) {
/* 36 */                    return true;
                        }
                    }
/* 38 */            return false;
                }

                public Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I001lloI(this, obj);
                }

                @Override
                public final List I00Iooi00oi() {
/* 1 */             List list = this.I00ilO0;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00l0I0l0lO1(19);
/* 29 */            throw null;
                }

                @Override
                public final Illlil I00O10llo() {
/* 1 */             return this.I00ooIo0;
                }

                @Override
                public final O0ioOi0Oo1ii I00OI1() {
/* 1 */             return this.I00l0OO0IO;
                }

                @Override
                public final O0ioOi0Oo1ii I00OOll1() {
/* 1 */             return this.I00l0I0l0lO1;
                }

                @Override
                public final List I00Ol1ll1() {
/* 1 */             List list = this.I00ioIO;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             I00l0I0l0lO1(13);
/* 29 */            throw null;
                }

                @Override
                public final boolean I00iIO() {
/* 1 */             return this.I00oII;
                }

                public void I00iIi0i1o(Collection collection) {
/* 1 */             if (collection == null) {
/* 33 */                I00l0I0l0lO1(17);
/* 49 */                throw null;
                    }
/* 3 */             this.I00olI = collection;
/* 5 */             Iterator it = collection.iterator();
/* 13 */            while (it.hasNext()) {
/* 25 */                if (((Illlil) it.next()).I00iiO()) {
/* 28 */                    this.I00oIiI10 = true;
/* 30 */                    return;
                        }
                    }
                }

                @Override
                public final boolean I00iiO() {
/* 1 */             return this.I00oIiI10;
                }

                public Illli0oiOOi I00iio() {
/* 3 */             return I010o0o0oO(OoOilII0.I00000oOI);
                }

                @Override
                public final boolean I00ilI0I1() {
/* 1 */             return false;
                }

                @Override
                public final boolean I00ioIO() {
/* 3 */             if (this.I00lll10) {
/* 36 */                return true;
                    }
/* 14 */            Iterator it = I010i10l().I000o00OoI0I().iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                if (((Illlil) it.next()).I00ioIO()) {
/* 36 */                    return true;
                        }
                    }
/* 38 */            return false;
                }

                public final Illlil I010iIIOlo(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 26 */            Illlil illlilBuild = I00iio().I00100l0(ii1Ool1).I000iOII(o1oIIloii0).I000OOo1O(iiOiOloo0).I00000oOI(2).I000OiO().build();
/* 30 */            if (illlilBuild != null) {
/* 32 */                return illlilBuild;
                    }
/* 35 */            I00l0I0l0lO1(26);
/* 215 */           throw null;
                }

                @Override
                public Ol0IioOo I00Io1o110i(Ii1Ool1 ii1Ool1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 5 */             return (Ol0IioOo) I010iIIOlo(ii1Ool1, o1oIIloii0, iiOiOloo0);
                }

                public abstract Illll0i I010l10O(int i, I11IlOOO i11IlOOO, Ii1Ool1 ii1Ool1, Illlil illlil, OI1Iio0ii1 oI1Iio0ii1, OlI1o0ooI olI1o0ooI);

                /* JADX WARN: Removed duplicated region for block: B:103:0x020c  */
                /* JADX WARN: Removed duplicated region for block: B:106:0x0211  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x0232  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0241  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x012e  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x019c  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x01e3  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0202  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Illll0i I010l1O(IllliloOi illliloOi) {
                    I11IlOOO annotations;
                    O0ioOi0Oo1ii o0ioOi0Oo1ii;
                    ArrayList arrayList;
                    O0ioOi0Oo1ii o0ioOi0Oo1ii2;
                    O0ioOi0Oo1ii o0ioOi0Oo1ii3;
                    O0ioOi0Oo1ii o0ioOi0Oo1ii4;
                    ArrayList arrayListI010l1ol111;
                    O0iIl1 o0iIl1I000O01llI0;
                    boolean z;
                    LinkedHashMap linkedHashMap;
                    Map map;
                    Illlil illlil;
/* 4 */             boolean[] zArr = new boolean[1];
/* 9 */             if (illliloOi.I00oII != null) {
/* 11 */                annotations = getAnnotations();
/* 15 */                I11IlOOO i11IlOOO = illliloOi.I00oII;
/* 21 */                if (annotations.isEmpty()) {
/* 23 */                    annotations = i11IlOOO;
                        } else if (!i11IlOOO.isEmpty()) {
/* 41 */                    annotations = new I11Io0oil0i0(new I11IlOOO[]{annotations, i11IlOOO});
                        }
                    } else {
/* 47 */                annotations = getAnnotations();
                    }
/* 45 */            I11IlOOO i11IlOOO2 = annotations;
/* 52 */            Ii1Ool1 ii1Ool1 = illliloOi.I00iiI;
/* 54 */            Illlil illlil2 = illliloOi.I00ilI0I1;
/* 56 */            int i = illliloOi.I00ilO0;
/* 58 */            OI1Iio0ii1 oI1Iio0ii1 = illliloOi.I00ll1;
/* 80 */            OlI1o0ooI olI1o0ooII0010I0i = illliloOi.I00o0iI0io1 ? ((Ii1i0IO0) (illlil2 != null ? illlil2 : I010i10l())).I0010I0i() : OlI1o0ooI.I00IO1;
/* 84 */            if (olI1o0ooII0010I0i == null) {
/* 597 */               I00l0I0l0lO1(27);
/* 966 */               throw null;
                    }
/* 88 */            Illll0i illll0iI010l10O = I010l10O(i, i11IlOOO2, ii1Ool1, illlil2, oI1Iio0ii1, olI1o0ooII0010I0i);
/* 93 */            List typeParameters = illliloOi.I00oI0i;
/* 95 */            if (typeParameters == null) {
/* 97 */                typeParameters = getTypeParameters();
                    }
/* 109 */           zArr[0] = zArr[0] | (!typeParameters.isEmpty());
/* 117 */           ArrayList arrayList2 = new ArrayList(typeParameters.size());
/* 122 */           OoOilII0 ooOilII0I0000Il00O = il10o1I1iI1.I0000Il00O(typeParameters, illliloOi.I00iOIl, illll0iI010l10O, arrayList2, zArr);
/* 126 */           if (ooOilII0I0000Il00O != null) {
/* 132 */               ArrayList arrayList3 = new ArrayList();
/* 141 */               if (illliloOi.I00ioIO.isEmpty()) {
/* 216 */                   o0ioOi0Oo1ii = illliloOi.I00l0I0l0lO1;
/* 218 */                   if (o0ioOi0Oo1ii == null) {
                            }
/* 278 */                   o0ioOi0Oo1ii3 = illliloOi.I00l0OO0IO;
/* 280 */                   if (o0ioOi0Oo1ii3 == null) {
                            }
/* 312 */                   arrayListI010l1ol111 = I010l1ol111(illll0iI010l10O, illliloOi.I00io1l, ooOilII0I0000Il00O, illliloOi.I00o0l1o1o0, illliloOi.I00o0iI0io1, zArr);
/* 316 */                   if (arrayListI010l1ol111 != null) {
/* 339 */                       z = zArr[0] | (o0iIl1I000O01llI0 == illliloOi.I00li1OI);
/* 340 */                       zArr[0] = z;
/* 342 */                       if (z) {
                                }
/* 360 */                       illll0iI010l10O.I010lI0oi(o0ioOi0Oo1ii2, o0ioOi0Oo1ii4, arrayList3, arrayList, arrayListI010l1ol111, o0iIl1I000O01llI0, illliloOi.I00iiO, illliloOi.I00iio);
/* 365 */                       illll0iI010l10O.I00lli11 = this.I00lli11;
/* 369 */                       illll0iI010l10O.I00lll10 = this.I00lll10;
/* 373 */                       illll0iI010l10O.I00o0iI0io1 = this.I00o0iI0io1;
/* 377 */                       illll0iI010l10O.I00o0l1o1o0 = this.I00o0l1o1o0;
/* 381 */                       illll0iI010l10O.I00o101lO = this.I00o101lO;
/* 385 */                       illll0iI010l10O.I00oO101o = this.I00oO101o;
/* 389 */                       illll0iI010l10O.I00oI0i = this.I00oI0i;
/* 393 */                       illll0iI010l10O.I010oio1OO0(this.I00oOio10iI1);
/* 398 */                       illll0iI010l10O.I00oII = illliloOi.I00o101lO;
/* 402 */                       illll0iI010l10O.I00oIiI10 = illliloOi.I00oIiI10;
/* 404 */                       Boolean bool = illliloOi.I00oOio10iI1;
/* 415 */                       illll0iI010l10O.I01101IOlO(bool == null ? bool.booleanValue() : this.I00ol1);
/* 424 */                       if (illliloOi.I00oO101o.isEmpty()) {
/* 430 */                           linkedHashMap = illliloOi.I00oO101o;
/* 432 */                           map = this.I00ooiO1I;
/* 434 */                           if (map != null) {
                                    }
/* 482 */                           if (linkedHashMap.size() != 1) {
                                    }
                                }
/* 519 */                       if (!illliloOi.I00lll10) {
/* 525 */                           illlil = this.I00ooIo0;
/* 527 */                           if (illlil == null) {
                                    }
/* 535 */                           illll0iI010l10O.I00ooIo0 = illlil.I0000oI00(ooOilII0I0000Il00O);
                                }
/* 539 */                       if (illliloOi.I00lli11) {
/* 561 */                           if (!illliloOi.I00iOIl.I0000oI00()) {
                                    }
                                }
/* 311 */                       return illll0iI010l10O;
                            }
                        } else {
/* 149 */                   int i2 = 0;
/* 154 */                   for (O0ioOi0Oo1ii o0ioOi0Oo1ii5 : illliloOi.I00ioIO) {
/* 168 */                       O0iIl1 o0iIl1I000O01llI02 = ooOilII0I0000Il00O.I000O01llI0(o0ioOi0Oo1ii5.getType(), Ooo0Ioii0o0.I00iio);
/* 172 */                       if (o0iIl1I000O01llI02 == null) {
                                    break;
                                }
/* 190 */                       int i3 = i2 + 1;
/* 196 */                       arrayList3.add(il0ol10l.I00000oOI(illll0iI010l10O, o0iIl1I000O01llI02, ((IOoi1I11) o0ioOi0Oo1ii5.I010iIIOlo()).I010OIo1l(), o0ioOi0Oo1ii5.getAnnotations(), i2));
/* 211 */                       zArr[0] = zArr[0] | (o0iIl1I000O01llI02 != o0ioOi0Oo1ii5.getType());
/* 213 */                       i2 = i3;
                            }
/* 216 */                   o0ioOi0Oo1ii = illliloOi.I00l0I0l0lO1;
/* 218 */                   if (o0ioOi0Oo1ii == null) {
/* 226 */                       O0iIl1 o0iIl1I000O01llI03 = ooOilII0I0000Il00O.I000O01llI0(o0ioOi0Oo1ii.getType(), Ooo0Ioii0o0.I00iio);
/* 230 */                       if (o0iIl1I000O01llI03 != null) {
/* 240 */                           illliloOi.I00l0I0l0lO1.I010iIIOlo();
/* 252 */                           O0ioOi0Oo1ii o0ioOi0Oo1ii6 = new O0ioOi0Oo1ii(illll0iI010l10O, new Il1lIi(illll0iI010l10O, o0iIl1I000O01llI03), illliloOi.I00l0I0l0lO1.getAnnotations());
/* 269 */                           zArr[0] = (o0iIl1I000O01llI03 != illliloOi.I00l0I0l0lO1.getType()) | zArr[0];
/* 271 */                           arrayList = arrayList2;
/* 273 */                           o0ioOi0Oo1ii2 = o0ioOi0Oo1ii6;
                                }
                            } else {
/* 275 */                       arrayList = arrayList2;
/* 277 */                       o0ioOi0Oo1ii2 = null;
                            }
/* 278 */                   o0ioOi0Oo1ii3 = illliloOi.I00l0OO0IO;
/* 280 */                   if (o0ioOi0Oo1ii3 == null) {
/* 282 */                       O0ioOi0Oo1ii o0ioOi0Oo1iiI0000oI00 = o0ioOi0Oo1ii3.I0000oI00(ooOilII0I0000Il00O);
/* 286 */                       if (o0ioOi0Oo1iiI0000oI00 != null) {
/* 299 */                           zArr[0] = zArr[0] | (o0ioOi0Oo1iiI0000oI00 != illliloOi.I00l0OO0IO);
/* 301 */                           o0ioOi0Oo1ii4 = o0ioOi0Oo1iiI0000oI00;
                                }
                            } else {
/* 303 */                       o0ioOi0Oo1ii4 = null;
                            }
/* 312 */                   arrayListI010l1ol111 = I010l1ol111(illll0iI010l10O, illliloOi.I00io1l, ooOilII0I0000Il00O, illliloOi.I00o0l1o1o0, illliloOi.I00o0iI0io1, zArr);
/* 316 */                   if (arrayListI010l1ol111 != null && (o0iIl1I000O01llI0 = ooOilII0I0000Il00O.I000O01llI0(illliloOi.I00li1OI, Ooo0Ioii0o0.I00ilI0I1)) != null) {
/* 339 */                       z = zArr[0] | (o0iIl1I000O01llI0 == illliloOi.I00li1OI);
/* 340 */                       zArr[0] = z;
/* 342 */                       if (z && illliloOi.I00ol1) {
/* 92 */                            return this;
                                }
/* 360 */                       illll0iI010l10O.I010lI0oi(o0ioOi0Oo1ii2, o0ioOi0Oo1ii4, arrayList3, arrayList, arrayListI010l1ol111, o0iIl1I000O01llI0, illliloOi.I00iiO, illliloOi.I00iio);
/* 365 */                       illll0iI010l10O.I00lli11 = this.I00lli11;
/* 369 */                       illll0iI010l10O.I00lll10 = this.I00lll10;
/* 373 */                       illll0iI010l10O.I00o0iI0io1 = this.I00o0iI0io1;
/* 377 */                       illll0iI010l10O.I00o0l1o1o0 = this.I00o0l1o1o0;
/* 381 */                       illll0iI010l10O.I00o101lO = this.I00o101lO;
/* 385 */                       illll0iI010l10O.I00oO101o = this.I00oO101o;
/* 389 */                       illll0iI010l10O.I00oI0i = this.I00oI0i;
/* 393 */                       illll0iI010l10O.I010oio1OO0(this.I00oOio10iI1);
/* 398 */                       illll0iI010l10O.I00oII = illliloOi.I00o101lO;
/* 402 */                       illll0iI010l10O.I00oIiI10 = illliloOi.I00oIiI10;
/* 404 */                       Boolean bool2 = illliloOi.I00oOio10iI1;
/* 415 */                       illll0iI010l10O.I01101IOlO(bool2 == null ? bool2.booleanValue() : this.I00ol1);
/* 424 */                       if (illliloOi.I00oO101o.isEmpty() || this.I00ooiO1I != null) {
/* 430 */                           linkedHashMap = illliloOi.I00oO101o;
/* 432 */                           map = this.I00ooiO1I;
/* 434 */                           if (map != null) {
/* 448 */                               for (Map.Entry entry : map.entrySet()) {
/* 464 */                                   if (!linkedHashMap.containsKey(entry.getKey())) {
/* 474 */                                       linkedHashMap.put(entry.getKey(), entry.getValue());
                                            }
                                        }
                                    }
/* 482 */                           if (linkedHashMap.size() != 1) {
/* 512 */                               illll0iI010l10O.I00ooiO1I = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                                    } else {
/* 515 */                               illll0iI010l10O.I00ooiO1I = linkedHashMap;
                                    }
                                }
/* 519 */                       if (!illliloOi.I00lll10 || this.I00ooIo0 != null) {
/* 525 */                           illlil = this.I00ooIo0;
/* 527 */                           if (illlil == null) {
/* 530 */                               illlil = this;
                                    }
/* 535 */                           illll0iI010l10O.I00ooIo0 = illlil.I0000oI00(ooOilII0I0000Il00O);
                                }
/* 539 */                       if (illliloOi.I00lli11 && !I010i10l().I000o00OoI0I().isEmpty()) {
/* 561 */                           if (!illliloOi.I00iOIl.I0000oI00()) {
/* 563 */                               I01illiil1Oo i01illiil1Oo = this.I00oli;
/* 565 */                               if (i01illiil1Oo != null) {
/* 567 */                                   illll0iI010l10O.I00oli = i01illiil1Oo;
/* 311 */                                   return illll0iI010l10O;
                                        }
/* 574 */                               illll0iI010l10O.I00iIi0i1o(I000o00OoI0I());
/* 311 */                               return illll0iI010l10O;
                                    }
/* 582 */                           I01illiil1Oo i01illiil1Oo2 = new I01illiil1Oo(13);
/* 585 */                           i01illiil1Oo2.I00iiI = this;
/* 587 */                           i01illiil1Oo2.I00iiO = ooOilII0I0000Il00O;
/* 589 */                           VarHandle.storeStoreFence();
/* 592 */                           illll0iI010l10O.I00oli = i01illiil1Oo2;
                                }
/* 311 */                       return illll0iI010l10O;
                            }
                        }
                    }
/* 83 */            return null;
                }

                public void I010lI0oi(O0ioOi0Oo1ii o0ioOi0Oo1ii, O0ioOi0Oo1ii o0ioOi0Oo1ii2, List list, List list2, List list3, O0iIl1 o0iIl1, O1oIIloii0 o1oIIloii0, IiOiOloo0 iiOiOloo0) {
/* 2 */             if (list == null) {
/* 166 */               I00l0I0l0lO1(5);
/* 294 */               throw null;
                    }
/* 4 */             if (list2 == null) {
/* 161 */               I00l0I0l0lO1(6);
/* 164 */               throw null;
                    }
/* 6 */             if (list3 == null) {
/* 156 */               I00l0I0l0lO1(7);
/* 159 */               throw null;
                    }
/* 8 */             if (iiOiOloo0 == null) {
/* 151 */               I00l0I0l0lO1(8);
/* 154 */               throw null;
                    }
/* 14 */            this.I00ilI0I1 = IOOi0Ool1i.I00iIi0i1o(list2);
/* 20 */            this.I00ilO0 = IOOi0Ool1i.I00iIi0i1o(list3);
/* 22 */            this.I00io1l = o0iIl1;
/* 24 */            this.I00li1OI = o1oIIloii0;
/* 26 */            this.I00ll1 = iiOiOloo0;
/* 28 */            this.I00l0I0l0lO1 = o0ioOi0Oo1ii;
/* 30 */            this.I00l0OO0IO = o0ioOi0Oo1ii2;
/* 32 */            this.I00ioIO = list;
/* 42 */            for (int i = 0; i < list2.size(); i++) {
/* 48 */                OoOOiO ooOOiO = (OoOOiO) list2.get(i);
/* 54 */                if (ooOOiO.getIndex() != i) {
/* 63 */                    StringBuilder sb = new StringBuilder();
/* 66 */                    sb.append(ooOOiO);
/* 69 */                    int index = ooOOiO.getIndex();
/* 75 */                    sb.append(" index is ");
/* 78 */                    sb.append(index);
/* 81 */                    sb.append(" but position is ");
/* 84 */                    sb.append(i);
/* 94 */                    throw new IllegalStateException(sb.toString());
                        }
                    }
/* 99 */            for (int i2 = 0; i2 < list3.size(); i2++) {
/* 105 */               Ooo00oi0O ooo00oi0O = (Ooo00oi0O) list3.get(i2);
/* 109 */               if (ooo00oi0O.I00ilO0 != i2) {
/* 118 */                   StringBuilder sb2 = new StringBuilder();
/* 121 */                   sb2.append(ooo00oi0O);
/* 124 */                   int i3 = ooo00oi0O.I00ilO0;
/* 128 */                   sb2.append("index is ");
/* 131 */                   sb2.append(i3);
/* 134 */                   sb2.append(" but position is ");
/* 137 */                   sb2.append(i2);
/* 147 */                   throw new IllegalStateException(sb2.toString());
                        }
                    }
                }

                public final IllliloOi I010o0o0oO(OoOilII0 ooOilII0) {
/* 2 */             if (ooOilII0 == null) {
/* 156 */               I00l0I0l0lO1(24);
/* 186 */               throw null;
                    }
/* 6 */             OoOiiO01illo ooOiiO01illo = ooOilII0.I00000oIO;
/* 8 */             Ii1Ool1 ii1Ool1I000lI = I000lI();
/* 12 */            O1oIIloii0 o1oIIloii0I001IO000 = I001IO000();
/* 16 */            IiOiOloo0 iiOiOloo0I000OiO = I000OiO();
/* 20 */            int iI000oI1ioi = I000oI1ioi();
/* 24 */            List listI00Iooi00oi = I00Iooi00oi();
/* 28 */            List listI00Ol1ll1 = I00Ol1ll1();
/* 32 */            O0ioOi0Oo1ii o0ioOi0Oo1ii = this.I00l0I0l0lO1;
/* 34 */            O0iIl1 o0iIl1I0001Ioi1lo = I0001Ioi1lo();
/* 39 */            if (ii1Ool1I000lI == null) {
/* 150 */               IllliloOi.I0000Il00O(1);
/* 153 */               throw null;
                    }
/* 41 */            if (o1oIIloii0I001IO000 == null) {
/* 146 */               IllliloOi.I0000Il00O(2);
/* 149 */               throw null;
                    }
/* 43 */            if (iiOiOloo0I000OiO == null) {
/* 141 */               IllliloOi.I0000Il00O(3);
/* 144 */               throw null;
                    }
/* 45 */            if (iI000oI1ioi == 0) {
/* 136 */               IllliloOi.I0000Il00O(4);
/* 139 */               throw null;
                    }
/* 47 */            if (listI00Iooi00oi == null) {
/* 131 */               IllliloOi.I0000Il00O(5);
/* 134 */               throw null;
                    }
/* 49 */            if (listI00Ol1ll1 == null) {
/* 126 */               IllliloOi.I0000Il00O(6);
/* 129 */               throw null;
                    }
/* 51 */            if (o0iIl1I0001Ioi1lo == null) {
/* 121 */               IllliloOi.I0000Il00O(7);
/* 124 */               throw null;
                    }
/* 53 */            IllliloOi illliloOi = new IllliloOi();
/* 56 */            illliloOi.I00olI = this;
/* 58 */            illliloOi.I00ilI0I1 = null;
/* 62 */            illliloOi.I00l0OO0IO = this.I00l0OO0IO;
/* 64 */            illliloOi.I00lli11 = true;
/* 67 */            illliloOi.I00lll10 = false;
/* 69 */            illliloOi.I00o0iI0io1 = false;
/* 71 */            illliloOi.I00o0l1o1o0 = false;
/* 75 */            illliloOi.I00o101lO = this.I00oII;
/* 77 */            illliloOi.I00oI0i = null;
/* 79 */            illliloOi.I00oII = null;
/* 83 */            illliloOi.I00oIiI10 = this.I00oIiI10;
/* 90 */            illliloOi.I00oO101o = new LinkedHashMap();
/* 92 */            illliloOi.I00oOio10iI1 = null;
/* 94 */            illliloOi.I00ol1 = false;
/* 96 */            illliloOi.I00iOIl = ooOiiO01illo;
/* 98 */            illliloOi.I00iiI = ii1Ool1I000lI;
/* 100 */           illliloOi.I00iiO = o1oIIloii0I001IO000;
/* 102 */           illliloOi.I00iio = iiOiOloo0I000OiO;
/* 104 */           illliloOi.I00ilO0 = iI000oI1ioi;
/* 106 */           illliloOi.I00io1l = listI00Iooi00oi;
/* 108 */           illliloOi.I00ioIO = listI00Ol1ll1;
/* 110 */           illliloOi.I00l0I0l0lO1 = o0ioOi0Oo1ii;
/* 112 */           illliloOi.I00li1OI = o0iIl1I0001Ioi1lo;
/* 114 */           illliloOi.I00ll1 = null;
/* 116 */           VarHandle.storeStoreFence();
/* 119 */           return illliloOi;
                }

                public void I010oio1OO0(boolean z) {
/* 1 */             this.I00oOio10iI1 = z;
                }

                public void I01101IOlO(boolean z) {
/* 1 */             this.I00ol1 = z;
                }

                public final void I01101olii(Ol0O0iI0l0O ol0O0iI0l0O) {
/* 1 */             if (ol0O0iI0l0O != null) {
/* 3 */                 this.I00io1l = ol0O0iI0l0O;
                    } else {
/* 8 */                 I00l0I0l0lO1(11);
/* 49 */                throw null;
                    }
                }

                @Override
                public final List getTypeParameters() {
/* 1 */             List list = this.I00ilI0I1;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 8 */             IoOOl0iOl1io.I000OOo1O("typeParameters == null for ", this);
/* 11 */            return null;
                }
            }
