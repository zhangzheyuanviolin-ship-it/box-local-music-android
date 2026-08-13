            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class I00lll10 extends OI000ilOol {
                public final OI1Iio0ii1 I00iOIl;
                public final O1I0II11i I00iiI;
                public final O1I0II11i I00iiO;
                public final O1I0II11i I00iio;

                public I00lll10(O1I0OloI o1I0OloI, OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             int i = 0;
/* 3 */             if (o1I0OloI == null) {
/* 70 */                I00oI0i(0);
/* 89 */                throw null;
                    }
/* 5 */             int i2 = 1;
/* 6 */             if (oI1Iio0ii1 == null) {
/* 66 */                I00oI0i(1);
/* 69 */                throw null;
                    }
/* 11 */            this.I00iOIl = oI1Iio0ii1;
/* 15 */            I00lli11 i00lli11 = new I00lli11(i);
/* 18 */            i00lli11.I00iiI = this;
/* 20 */            VarHandle.storeStoreFence();
/* 28 */            this.I00iiI = new O1I0II11i(o1I0OloI, i00lli11);
/* 32 */            I00lli11 i00lli112 = new I00lli11(i2);
/* 35 */            i00lli112.I00iiI = this;
/* 37 */            VarHandle.storeStoreFence();
/* 45 */            this.I00iiO = new O1I0II11i(o1I0OloI, i00lli112);
/* 50 */            I00lli11 i00lli113 = new I00lli11(2);
/* 53 */            i00lli113.I00iiI = this;
/* 55 */            VarHandle.storeStoreFence();
/* 63 */            this.I00iio = new O1I0II11i(o1I0OloI, i00lli113);
                }

                public static void I00oI0i(int i) {
/* 49 */            String str = (i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 78 */            Object[] objArr = new Object[(i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 9 || i == 12 || i == 14 || i == 16 || i == 17 || i == 19 || i == 20) ? 2 : 3];
                    switch (i) {
                        case 1:
/* 117 */                   objArr[0] = "name";
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 12:
                        case 14:
                        case 16:
                        case 17:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
/* 112 */                   objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                            break;
                        case 7:
                        case 13:
/* 109 */                   objArr[0] = "typeArguments";
                            break;
                        case 8:
                        case 11:
/* 104 */                   objArr[0] = "kotlinTypeRefiner";
                            break;
                        case 10:
                        case 15:
/* 99 */                    objArr[0] = "typeSubstitution";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 94 */                    objArr[0] = "substitutor";
                            break;
                        default:
/* 89 */                    objArr[0] = "storageManager";
                            break;
                    }
/* 125 */           if (i == 2) {
/* 190 */               objArr[1] = "getName";
                    } else if (i == 3) {
/* 185 */               objArr[1] = "getOriginal";
                    } else if (i == 4) {
/* 180 */               objArr[1] = "getUnsubstitutedInnerClassesScope";
                    } else if (i == 5) {
/* 175 */               objArr[1] = "getThisAsReceiverParameter";
                    } else if (i == 6) {
/* 170 */               objArr[1] = "getContextReceivers";
                    } else if (i == 9 || i == 12 || i == 14 || i == 16) {
/* 165 */               objArr[1] = "getMemberScope";
                    } else if (i == 17) {
/* 162 */               objArr[1] = "getUnsubstitutedMemberScope";
                    } else if (i == 19) {
/* 157 */               objArr[1] = "substitute";
                    } else if (i != 20) {
/* 149 */               objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                    } else {
/* 154 */               objArr[1] = "getDefaultType";
                    }
                    switch (i) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 12:
                        case 14:
                        case 16:
                        case 17:
                        case PoseLandmark.LEFT_INDEX:
                        case PoseLandmark.RIGHT_INDEX:
                            break;
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                        case 13:
                        case 15:
/* 203 */                   objArr[2] = "getMemberScope";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 200 */                   objArr[2] = "substitute";
                            break;
                        default:
/* 197 */                   objArr[2] = "<init>";
                            break;
                    }
/* 205 */           String str2 = String.format(str, objArr);
/* 209 */           if (i != 2 && i != 3 && i != 4 && i != 5 && i != 6 && i != 9 && i != 12 && i != 14 && i != 16 && i != 17 && i != 19 && i != 20) {
/* 244 */               throw new IllegalArgumentException(str2);
                    }
/* 244 */           throw new IllegalStateException(str2);
                }

                @Override
                public List I001i1O0Ol() {
/* 1 */             List list = Collections.EMPTY_LIST;
/* 3 */             if (list != null) {
/* 5 */                 return list;
                    }
/* 7 */             I00oI0i(6);
/* 29 */            throw null;
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I00II0Ol1O0l(this, obj);
                }

                @Override
                public final O1iil1I01o I00IoO0(OoOiiO01illo ooOiiO01illo) {
/* 5 */             IiOiOOIo.I000O01llI0(IiOiIO0i1Oil.I0000Il00O(this));
/* 10 */            O1iil1I01o o1iil1I01oI00OIl = I00OIl(ooOiiO01illo, O0iIoIOO0O0.I00000oIO);
/* 14 */            if (o1iil1I01oI00OIl != null) {
/* 16 */                return o1iil1I01oI00OIl;
                    }
/* 19 */            I00oI0i(16);
/* 49 */            throw null;
                }

                @Override
                public O1iil1I01o I00OIl(OoOiiO01illo ooOiiO01illo, O0iIoIOO0O0 o0iIoIOO0O0) {
/* 5 */             if (!ooOiiO01illo.I0000oI00()) {
/* 32 */                return new OliOiiiII(I00li1OI(o0iIoIOO0O0), new OoOilII0(ooOiiO01illo));
                    }
/* 7 */             O1iil1I01o o1iil1I01oI00li1OI = I00li1OI(o0iIoIOO0O0);
/* 11 */            if (o1iil1I01oI00li1OI != null) {
/* 13 */                return o1iil1I01oI00li1OI;
                    }
/* 16 */            I00oI0i(12);
/* 20 */            throw null;
                }

                @Override
                public final Ol0O0iI0l0O I00Ol10() {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) this.I00iiI.invoke();
/* 9 */             if (ol0O0iI0l0O != null) {
/* 11 */                return ol0O0iI0l0O;
                    }
/* 14 */            I00oI0i(20);
/* 29 */            throw null;
                }

                @Override
                public final O0ioOi0Oo1ii I00iiI() {
/* 7 */             O0ioOi0Oo1ii o0ioOi0Oo1ii = (O0ioOi0Oo1ii) this.I00iio.invoke();
/* 9 */             if (o0ioOi0Oo1ii != null) {
/* 11 */                return o0ioOi0Oo1ii;
                    }
/* 13 */            I00oI0i(5);
/* 29 */            throw null;
                }

                @Override
                public O1iil1I01o I00l0I0l0lO1() {
/* 7 */             O1iil1I01o o1iil1I01o = (O1iil1I01o) this.I00iiO.invoke();
/* 9 */             if (o1iil1I01o != null) {
/* 11 */                return o1iil1I01o;
                    }
/* 13 */            I00oI0i(4);
/* 29 */            throw null;
                }

                @Override
                public O1iil1I01o I00l0OO0IO() {
/* 5 */             IiOiOOIo.I000O01llI0(IiOiIO0i1Oil.I0000Il00O(this));
/* 10 */            O1iil1I01o o1iil1I01oI00li1OI = I00li1OI(O0iIoIOO0O0.I00000oIO);
/* 14 */            if (o1iil1I01oI00li1OI != null) {
/* 16 */                return o1iil1I01oI00li1OI;
                    }
/* 19 */            I00oI0i(17);
/* 29 */            throw null;
                }

                @Override
                public OI000ilOol I0000oI00(OoOilII0 ooOilII0) {
/* 1 */             if (ooOilII0 != null) {
                        return ooOilII0.I00000oIO.I0000oI00() ? this : new O0o1oiOIi(this, ooOilII0);
                    }
/* 20 */            I00oI0i(18);
/* 49 */            throw null;
                }

                @Override
                public final OI1Iio0ii1 getName() {
/* 1 */             OI1Iio0ii1 oI1Iio0ii1 = this.I00iOIl;
/* 3 */             if (oI1Iio0ii1 != null) {
/* 5 */                 return oI1Iio0ii1;
                    }
/* 7 */             I00oI0i(2);
/* 29 */            throw null;
                }

                @Override
/* 1 */         public final Ii1Ool1 I010i10l() {
/* 2 */             return this;
                }

                @Override
/* 28 */        public final IOIiO1lIl0l I010i10l() {
/* 29 */            return this;
                }

                @Override
/* 28 */        public final OI000ilOol I010i10l() {
/* 29 */            return this;
                }
            }
